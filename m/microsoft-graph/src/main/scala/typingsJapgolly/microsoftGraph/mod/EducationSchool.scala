package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationSchool extends EducationOrganization {
  // Address of the school.
  var address: js.UndefOr[PhysicalAddress] = js.undefined
  // Classes taught at the school. Nullable.
  var classes: js.UndefOr[js.Array[EducationClass]] = js.undefined
  // Entity who created the school.
  var createdBy: js.UndefOr[IdentitySet] = js.undefined
  // ID of school in syncing system.
  var externalId: js.UndefOr[String] = js.undefined
  // ID of principal in syncing system.
  var externalPrincipalId: js.UndefOr[String] = js.undefined
  var fax: js.UndefOr[String] = js.undefined
  // Highest grade taught.
  var highestGrade: js.UndefOr[String] = js.undefined
  // Lowest grade taught.
  var lowestGrade: js.UndefOr[String] = js.undefined
  // Phone number of school.
  var phone: js.UndefOr[String] = js.undefined
  // Email address of the principal.
  var principalEmail: js.UndefOr[String] = js.undefined
  // Name of the principal.
  var principalName: js.UndefOr[String] = js.undefined
  // School Number.
  var schoolNumber: js.UndefOr[String] = js.undefined
  // Users in the school. Nullable.
  var users: js.UndefOr[js.Array[EducationUser]] = js.undefined
}

object EducationSchool {
  @scala.inline
  def apply(
    address: PhysicalAddress = null,
    classes: js.Array[EducationClass] = null,
    createdBy: IdentitySet = null,
    description: String = null,
    displayName: String = null,
    externalId: String = null,
    externalPrincipalId: String = null,
    externalSource: EducationExternalSource = null,
    fax: String = null,
    highestGrade: String = null,
    id: String = null,
    lowestGrade: String = null,
    phone: String = null,
    principalEmail: String = null,
    principalName: String = null,
    schoolNumber: String = null,
    users: js.Array[EducationUser] = null
  ): EducationSchool = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (externalPrincipalId != null) __obj.updateDynamic("externalPrincipalId")(externalPrincipalId.asInstanceOf[js.Any])
    if (externalSource != null) __obj.updateDynamic("externalSource")(externalSource.asInstanceOf[js.Any])
    if (fax != null) __obj.updateDynamic("fax")(fax.asInstanceOf[js.Any])
    if (highestGrade != null) __obj.updateDynamic("highestGrade")(highestGrade.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lowestGrade != null) __obj.updateDynamic("lowestGrade")(lowestGrade.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (principalEmail != null) __obj.updateDynamic("principalEmail")(principalEmail.asInstanceOf[js.Any])
    if (principalName != null) __obj.updateDynamic("principalName")(principalName.asInstanceOf[js.Any])
    if (schoolNumber != null) __obj.updateDynamic("schoolNumber")(schoolNumber.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[EducationSchool]
  }
}

