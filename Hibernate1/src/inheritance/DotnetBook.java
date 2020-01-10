package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="DOTNET")
public class DotnetBook extends Book{
	private int cds;

	public int getCds() {
		return cds;
	}

	public void setCds(int cds) {
		this.cds = cds;
	}
	

}
