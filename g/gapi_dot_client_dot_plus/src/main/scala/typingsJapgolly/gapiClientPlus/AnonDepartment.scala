package typingsJapgolly.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDepartment extends js.Object {
  /** The department within the organization. Deprecated. */
  var department: js.UndefOr[String] = js.undefined
  /** A short description of the person's role in this organization. Deprecated. */
  var description: js.UndefOr[String] = js.undefined
  /** The date that the person left this organization. */
  var endDate: js.UndefOr[String] = js.undefined
  /** The location of this organization. Deprecated. */
  var location: js.UndefOr[String] = js.undefined
  /** The name of the organization. */
  var name: js.UndefOr[String] = js.undefined
  /** If "true", indicates this organization is the person's primary one, which is typically interpreted as the current one. */
  var primary: js.UndefOr[Boolean] = js.undefined
  /** The date that the person joined this organization. */
  var startDate: js.UndefOr[String] = js.undefined
  /** The person's job title or role within the organization. */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The type of organization. Possible values include, but are not limited to, the following values:
    * - "work" - Work.
    * - "school" - School.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonDepartment {
  @scala.inline
  def apply(
    department: String = null,
    description: String = null,
    endDate: String = null,
    location: String = null,
    name: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    startDate: String = null,
    title: String = null,
    `type`: String = null
  ): AnonDepartment = {
    val __obj = js.Dynamic.literal()
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDepartment]
  }
}

