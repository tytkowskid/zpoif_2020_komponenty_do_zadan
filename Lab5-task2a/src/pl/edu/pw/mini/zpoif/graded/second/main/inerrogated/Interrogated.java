package pl.edu.pw.mini.zpoif.graded.second.main.inerrogated;

public abstract class Interrogated {
	public void interrogateMe(){
		String className = getClass().getSimpleName();
		System.out.printf("Jestem przesluchiwany %s %s", className, toString());


	};
	public static class Witness extends Interrogated{

		String name;
		String surname;

		public Witness(String name, String surname){
			this.name = name;
			this.surname = surname;
		}



		@Override
		public String toString() {
			return name + " " + surname;
		}
	}

	public static class	Suspect extends Interrogated{

		String name;
		String surname;

		public Suspect(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}

		@Override
		public String toString() {
			class hideSurname{
				public String hide(String name,String surname){
					return name + " " + surname.charAt(0) + ".";
				}
			}

			return new hideSurname().hide(name,surname);
		}
	}

	public static class SecretAgent extends Interrogated{

		String nickname;

		public SecretAgent(String nickname){
			this.nickname = nickname;
		}

		@Override
		public String toString() {
			return nickname;
		}
	}
}
