package domain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Bob
 *
 */
public class BehandelCode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code, aantalSessies;
	private String behandelingNaam;
	private double sessieDuur, tariefBehandeling;
	private ArrayList<Behandeling> behandelingen;
	
	/**
	 * @param code
	 * @param aantalSessies
	 * @param behandelingNaam
	 * @param sessieDuur
	 * @param tariefBehandeling
	 */
	public BehandelCode(int code, int aantalSessies, String behandelingNaam,
			double sessieDuur, double tariefBehandeling) {
		this.code = code;
		this.aantalSessies = aantalSessies;
		this.behandelingNaam = behandelingNaam;
		this.sessieDuur = sessieDuur;
		this.tariefBehandeling = tariefBehandeling;
	}

	/**
	 * @param code
	 * @param aantalSessies
	 * @param behandelingNaam
	 * @param sessieDuur
	 * @param tariefBehandeling
	 * @param behandelingen
	 */
	public BehandelCode(int code, int aantalSessies, String behandelingNaam,
			double sessieDuur, double tariefBehandeling,
			ArrayList<Behandeling> behandelingen) {
		this(code, aantalSessies, behandelingNaam, sessieDuur, tariefBehandeling);
		this.behandelingen = behandelingen;
	}

	/**
	 * @return
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return
	 */
	public int getAantalSessies() {
		return aantalSessies;
	}

	/**
	 * @param aantalSessies
	 */
	public void setAantalSessies(int aantalSessies) {
		this.aantalSessies = aantalSessies;
	}

	/**
	 * @return
	 */
	public String getBehandelingNaam() {
		return behandelingNaam;
	}

	/**
	 * @param behandelingNaam
	 */
	public void setBehandelingNaam(String behandelingNaam) {
		this.behandelingNaam = behandelingNaam;
	}

	/**
	 * @return
	 */
	public double getSessieDuur() {
		return sessieDuur;
	}

	/**
	 * @param sessieDuur
	 */
	public void setSessieDuur(double sessieDuur) {
		this.sessieDuur = sessieDuur;
	}

	/**
	 * @return
	 */
	public double getTariefBehandeling() {
		return tariefBehandeling;
	}

	/**
	 * @param tariefBehandeling
	 */
	public void setTariefBehandeling(double tariefBehandeling) {
		this.tariefBehandeling = tariefBehandeling;
	}

	/**
	 * @return
	 */
	public ArrayList<Behandeling> getBehandelingen() {
		return behandelingen;
	}

	/**
	 * @param behandelingen
	 */
	public void setBehandelingen(ArrayList<Behandeling> behandelingen) {
		this.behandelingen = behandelingen;
	}
	
	public String toString() {
		return "BehandelCode:\n"
			+ "-- Code: " + this.code + "\n"
			+ "-- Naam: " + this.behandelingNaam + "\n"
			+ "-- Sessie aantal: " + this.aantalSessies + "\n"
			+ "-- Sessie duur: " + this.sessieDuur + "\n"
			+ "-- Tarief: " + this.tariefBehandeling;
	}
	
}
