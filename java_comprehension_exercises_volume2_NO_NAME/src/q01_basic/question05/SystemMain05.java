package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		Nonmember nonMember = new Nonmember("Sato Kensuke");
		Member member4 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		members[0] = nonMember;
		members[1] = member4;

		System.out.println("---SHOW MEMBERS--- ");
		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM---");
		for (AbstMember abstMember : members) {
			abstMember.buyItem();
		}
	}

}
