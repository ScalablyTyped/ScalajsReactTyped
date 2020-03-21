package typingsJapgolly.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom information type provided by the user. Used to find domain-specific
  * sensitive information configurable to the data in question.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CustomInfoType extends js.Object {
  /**
    * Set of detection rules to apply to all findings of this CustomInfoType.
    * Rules are applied in order that they are specified. Not supported for the
    * `surrogate_type` CustomInfoType.
    */
  var detectionRules: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DetectionRule]] = js.native
  /**
    * A list of phrases to detect as a CustomInfoType.
    */
  var dictionary: js.UndefOr[SchemaGooglePrivacyDlpV2Dictionary] = js.native
  /**
    * If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding
    * to be returned. It still can be used for rules matching.
    */
  var exclusionType: js.UndefOr[String] = js.native
  /**
    * CustomInfoType can either be a new infoType, or an extension of built-in
    * infoType, when the name matches one of existing infoTypes and that
    * infoType is specified in `InspectContent.info_types` field. Specifying
    * the latter adds findings to the one detected by the system. If built-in
    * info type is not specified in `InspectContent.info_types` list then the
    * name is treated as a custom info type.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  /**
    * Likelihood to return for this CustomInfoType. This base value can be
    * altered by a detection rule if the finding meets the criteria specified
    * by the rule. Defaults to `VERY_LIKELY` if not specified.
    */
  var likelihood: js.UndefOr[String] = js.native
  /**
    * Regular expression based CustomInfoType.
    */
  var regex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.native
  /**
    * Load an existing `StoredInfoType` resource for use in
    * `InspectDataSource`. Not currently supported in `InspectContent`.
    */
  var storedType: js.UndefOr[SchemaGooglePrivacyDlpV2StoredType] = js.native
  /**
    * Message for detecting output from deidentification transformations that
    * support reversing.
    */
  var surrogateType: js.UndefOr[SchemaGooglePrivacyDlpV2SurrogateType] = js.native
}

object SchemaGooglePrivacyDlpV2CustomInfoType {
  @scala.inline
  def apply(
    detectionRules: js.Array[SchemaGooglePrivacyDlpV2DetectionRule] = null,
    dictionary: SchemaGooglePrivacyDlpV2Dictionary = null,
    exclusionType: String = null,
    infoType: SchemaGooglePrivacyDlpV2InfoType = null,
    likelihood: String = null,
    regex: SchemaGooglePrivacyDlpV2Regex = null,
    storedType: SchemaGooglePrivacyDlpV2StoredType = null,
    surrogateType: SchemaGooglePrivacyDlpV2SurrogateType = null
  ): SchemaGooglePrivacyDlpV2CustomInfoType = {
    val __obj = js.Dynamic.literal()
    if (detectionRules != null) __obj.updateDynamic("detectionRules")(detectionRules.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (exclusionType != null) __obj.updateDynamic("exclusionType")(exclusionType.asInstanceOf[js.Any])
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    if (likelihood != null) __obj.updateDynamic("likelihood")(likelihood.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (storedType != null) __obj.updateDynamic("storedType")(storedType.asInstanceOf[js.Any])
    if (surrogateType != null) __obj.updateDynamic("surrogateType")(surrogateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CustomInfoType]
  }
}

