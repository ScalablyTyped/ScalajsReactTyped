package typingsJapgolly.googleapis.plusV1Mod.plusV1

import typingsJapgolly.googleapis.AnonCoverInfo
import typingsJapgolly.googleapis.AnonDepartment
import typingsJapgolly.googleapis.AnonFormatted
import typingsJapgolly.googleapis.AnonIsDefault
import typingsJapgolly.googleapis.AnonLabelType
import typingsJapgolly.googleapis.AnonMin
import typingsJapgolly.googleapis.AnonPrimary
import typingsJapgolly.googleapis.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPerson extends js.Object {
  /**
    * A short biography for this person.
    */
  var aboutMe: js.UndefOr[String] = js.native
  /**
    * The age range of the person. Valid ranges are 17 or younger, 18 to 20,
    * and 21 or older. Age is determined from the user&#39;s birthday using
    * Western age reckoning.
    */
  var ageRange: js.UndefOr[AnonMin] = js.native
  /**
    * The person&#39;s date of birth, represented as YYYY-MM-DD.
    */
  var birthday: js.UndefOr[String] = js.native
  /**
    * The &quot;bragging rights&quot; line of this person.
    */
  var braggingRights: js.UndefOr[String] = js.native
  /**
    * For followers who are visible, the number of people who have added this
    * person or page to a circle.
    */
  var circledByCount: js.UndefOr[Double] = js.native
  /**
    * The cover photo content.
    */
  var cover: js.UndefOr[AnonCoverInfo] = js.native
  /**
    * (this field is not currently used)
    */
  var currentLocation: js.UndefOr[String] = js.native
  /**
    * The name of this person, which is suitable for display.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The hosted domain name for the user&#39;s Google Apps account. For
    * instance, example.com. The plus.profile.emails.read or email scope is
    * needed to get this domain name.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * A list of email addresses that this person has, including their Google
    * account email address, and the public verified email addresses on their
    * Google+ profile. The plus.profile.emails.read scope is needed to retrieve
    * these email addresses, or the email scope can be used to retrieve just
    * the Google account email address.
    */
  var emails: js.UndefOr[js.Array[AnonValue]] = js.native
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The person&#39;s gender. Possible values include, but are not limited to,
    * the following values:   - &quot;male&quot; - Male gender.  -
    * &quot;female&quot; - Female gender.  - &quot;other&quot; - Other.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * The ID of this person.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The representation of the person&#39;s profile photo.
    */
  var image: js.UndefOr[AnonIsDefault] = js.native
  /**
    * Whether this user has signed up for Google+.
    */
  var isPlusUser: js.UndefOr[Boolean] = js.native
  /**
    * Identifies this resource as a person. Value: &quot;plus#person&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The user&#39;s preferred language for rendering.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * An object representation of the individual components of a person&#39;s
    * name.
    */
  var name: js.UndefOr[AnonFormatted] = js.native
  /**
    * The nickname of this person.
    */
  var nickname: js.UndefOr[String] = js.native
  /**
    * Type of person within Google+. Possible values include, but are not
    * limited to, the following values:   - &quot;person&quot; - represents an
    * actual person.  - &quot;page&quot; - represents a page.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The occupation of this person.
    */
  var occupation: js.UndefOr[String] = js.native
  /**
    * A list of current or past organizations with which this person is
    * associated.
    */
  var organizations: js.UndefOr[js.Array[AnonDepartment]] = js.native
  /**
    * A list of places where this person has lived.
    */
  var placesLived: js.UndefOr[js.Array[AnonPrimary]] = js.native
  /**
    * If a Google+ Page, the number of people who have +1&#39;d this page.
    */
  var plusOneCount: js.UndefOr[Double] = js.native
  /**
    * The person&#39;s relationship status. Possible values include, but are
    * not limited to, the following values:   - &quot;single&quot; - Person is
    * single.  - &quot;in_a_relationship&quot; - Person is in a relationship.
    * - &quot;engaged&quot; - Person is engaged.  - &quot;married&quot; -
    * Person is married.  - &quot;its_complicated&quot; - The relationship is
    * complicated.  - &quot;open_relationship&quot; - Person is in an open
    * relationship.  - &quot;widowed&quot; - Person is widowed.  -
    * &quot;in_domestic_partnership&quot; - Person is in a domestic
    * partnership.  - &quot;in_civil_union&quot; - Person is in a civil union.
    */
  var relationshipStatus: js.UndefOr[String] = js.native
  /**
    * The person&#39;s skills.
    */
  var skills: js.UndefOr[String] = js.native
  /**
    * The brief description (tagline) of this person.
    */
  var tagline: js.UndefOr[String] = js.native
  /**
    * The URL of this person&#39;s profile.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * A list of URLs for this person.
    */
  var urls: js.UndefOr[js.Array[AnonLabelType]] = js.native
  /**
    * Whether the person or Google+ Page has been verified.
    */
  var verified: js.UndefOr[Boolean] = js.native
}

object SchemaPerson {
  @scala.inline
  def apply(
    aboutMe: String = null,
    ageRange: AnonMin = null,
    birthday: String = null,
    braggingRights: String = null,
    circledByCount: Int | Double = null,
    cover: AnonCoverInfo = null,
    currentLocation: String = null,
    displayName: String = null,
    domain: String = null,
    emails: js.Array[AnonValue] = null,
    etag: String = null,
    gender: String = null,
    id: String = null,
    image: AnonIsDefault = null,
    isPlusUser: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    language: String = null,
    name: AnonFormatted = null,
    nickname: String = null,
    objectType: String = null,
    occupation: String = null,
    organizations: js.Array[AnonDepartment] = null,
    placesLived: js.Array[AnonPrimary] = null,
    plusOneCount: Int | Double = null,
    relationshipStatus: String = null,
    skills: String = null,
    tagline: String = null,
    url: String = null,
    urls: js.Array[AnonLabelType] = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    if (aboutMe != null) __obj.updateDynamic("aboutMe")(aboutMe.asInstanceOf[js.Any])
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange.asInstanceOf[js.Any])
    if (birthday != null) __obj.updateDynamic("birthday")(birthday.asInstanceOf[js.Any])
    if (braggingRights != null) __obj.updateDynamic("braggingRights")(braggingRights.asInstanceOf[js.Any])
    if (circledByCount != null) __obj.updateDynamic("circledByCount")(circledByCount.asInstanceOf[js.Any])
    if (cover != null) __obj.updateDynamic("cover")(cover.asInstanceOf[js.Any])
    if (currentLocation != null) __obj.updateDynamic("currentLocation")(currentLocation.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlusUser)) __obj.updateDynamic("isPlusUser")(isPlusUser.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (occupation != null) __obj.updateDynamic("occupation")(occupation.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    if (placesLived != null) __obj.updateDynamic("placesLived")(placesLived.asInstanceOf[js.Any])
    if (plusOneCount != null) __obj.updateDynamic("plusOneCount")(plusOneCount.asInstanceOf[js.Any])
    if (relationshipStatus != null) __obj.updateDynamic("relationshipStatus")(relationshipStatus.asInstanceOf[js.Any])
    if (skills != null) __obj.updateDynamic("skills")(skills.asInstanceOf[js.Any])
    if (tagline != null) __obj.updateDynamic("tagline")(tagline.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPerson]
  }
}

