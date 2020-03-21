package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a required data item
  */
trait DataRequirement extends Element {
  /**
    * Contains extended information for property 'mustSupport'.
    */
  var _mustSupport: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * What codes are expected
    */
  var codeFilter: js.UndefOr[js.Array[DataRequirementCodeFilter]] = js.undefined
  /**
    * What dates/date ranges are expected
    */
  var dateFilter: js.UndefOr[js.Array[DataRequirementDateFilter]] = js.undefined
  /**
    * Indicates that specific structure elements are referenced by the knowledge module
    */
  var mustSupport: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The profile of the required data
    */
  var profile: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * The type of the required data
    */
  var `type`: code
}

object DataRequirement {
  @scala.inline
  def apply(
    `type`: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _mustSupport: js.Array[Element] = null,
    _profile: js.Array[Element] = null,
    _type: Element = null,
    codeFilter: js.Array[DataRequirementCodeFilter] = null,
    dateFilter: js.Array[DataRequirementDateFilter] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    mustSupport: js.Array[String] = null,
    profile: js.Array[uri] = null
  ): DataRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_mustSupport != null) __obj.updateDynamic("_mustSupport")(_mustSupport.asInstanceOf[js.Any])
    if (_profile != null) __obj.updateDynamic("_profile")(_profile.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (codeFilter != null) __obj.updateDynamic("codeFilter")(codeFilter.asInstanceOf[js.Any])
    if (dateFilter != null) __obj.updateDynamic("dateFilter")(dateFilter.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mustSupport != null) __obj.updateDynamic("mustSupport")(mustSupport.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirement]
  }
}

