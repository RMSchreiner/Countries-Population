package Countries;

public class Countries {

		private String countries;
		private int pop;

		public Countries(String countries, int pop) {
			this.countries = countries;
			this.pop = pop;
		}

		public Countries() {
		}

		public String getCountries() {
			return countries;
		}

		public void setCountries(String countries) {
			this.countries = countries;
		}

		public int getPop() {
			return pop;
		}

		public void setPop(int pop) {
			this.pop = pop;
		}

		@Override
		public String toString() {
			return "Country " + countries + "    Population " + pop + "";
		}

	}

