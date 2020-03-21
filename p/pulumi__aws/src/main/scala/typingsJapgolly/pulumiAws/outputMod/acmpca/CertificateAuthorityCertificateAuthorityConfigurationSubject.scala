package typingsJapgolly.pulumiAws.outputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityCertificateAuthorityConfigurationSubject extends js.Object {
  /**
    * Fully qualified domain name (FQDN) associated with the certificate subject.
    */
  var commonName: js.UndefOr[String] = js.native
  /**
    * Two digit code that specifies the country in which the certificate subject located.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Disambiguating information for the certificate subject.
    */
  var distinguishedNameQualifier: js.UndefOr[String] = js.native
  /**
    * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third.
    */
  var generationQualifier: js.UndefOr[String] = js.native
  /**
    * First name.
    */
  var givenName: js.UndefOr[String] = js.native
  /**
    * Concatenation that typically contains the first letter of the `givenName`, the first letter of the middle name if one exists, and the first letter of the `surname`.
    */
  var initials: js.UndefOr[String] = js.native
  /**
    * The locality (such as a city or town) in which the certificate subject is located.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Legal name of the organization with which the certificate subject is affiliated.
    */
  var organization: js.UndefOr[String] = js.native
  /**
    * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated.
    */
  var organizationalUnit: js.UndefOr[String] = js.native
  /**
    * Typically a shortened version of a longer `givenName`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza.
    */
  var pseudonym: js.UndefOr[String] = js.native
  /**
    * State in which the subject of the certificate is located.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first.
    */
  var surname: js.UndefOr[String] = js.native
  /**
    * A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject.
    */
  var title: js.UndefOr[String] = js.native
}

object CertificateAuthorityCertificateAuthorityConfigurationSubject {
  @scala.inline
  def apply(
    commonName: String = null,
    country: String = null,
    distinguishedNameQualifier: String = null,
    generationQualifier: String = null,
    givenName: String = null,
    initials: String = null,
    locality: String = null,
    organization: String = null,
    organizationalUnit: String = null,
    pseudonym: String = null,
    state: String = null,
    surname: String = null,
    title: String = null
  ): CertificateAuthorityCertificateAuthorityConfigurationSubject = {
    val __obj = js.Dynamic.literal()
    if (commonName != null) __obj.updateDynamic("commonName")(commonName.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (distinguishedNameQualifier != null) __obj.updateDynamic("distinguishedNameQualifier")(distinguishedNameQualifier.asInstanceOf[js.Any])
    if (generationQualifier != null) __obj.updateDynamic("generationQualifier")(generationQualifier.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (initials != null) __obj.updateDynamic("initials")(initials.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (organizationalUnit != null) __obj.updateDynamic("organizationalUnit")(organizationalUnit.asInstanceOf[js.Any])
    if (pseudonym != null) __obj.updateDynamic("pseudonym")(pseudonym.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (surname != null) __obj.updateDynamic("surname")(surname.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityCertificateAuthorityConfigurationSubject]
  }
}

