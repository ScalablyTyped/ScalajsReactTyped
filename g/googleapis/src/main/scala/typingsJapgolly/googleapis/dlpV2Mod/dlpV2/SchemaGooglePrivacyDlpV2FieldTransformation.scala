package typingsJapgolly.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The transformation to apply to the field.
  */
@js.native
trait SchemaGooglePrivacyDlpV2FieldTransformation extends js.Object {
  /**
    * Only apply the transformation if the condition evaluates to true for the
    * given `RecordCondition`. The conditions are allowed to reference fields
    * that are not used in the actual transformation. [optional]  Example Use
    * Cases:  - Apply a different bucket transformation to an age column if the
    * zip code column for the same record is within a specific range. - Redact
    * a field if the date of birth field is greater than 85.
    */
  var condition: js.UndefOr[SchemaGooglePrivacyDlpV2RecordCondition] = js.native
  /**
    * Input field(s) to apply the transformation to. [required]
    */
  var fields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  /**
    * Treat the contents of the field as free text, and selectively transform
    * content that matches an `InfoType`.
    */
  var infoTypeTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2InfoTypeTransformations] = js.native
  /**
    * Apply the transformation to the entire field.
    */
  var primitiveTransformation: js.UndefOr[SchemaGooglePrivacyDlpV2PrimitiveTransformation] = js.native
}

object SchemaGooglePrivacyDlpV2FieldTransformation {
  @scala.inline
  def apply(
    condition: SchemaGooglePrivacyDlpV2RecordCondition = null,
    fields: js.Array[SchemaGooglePrivacyDlpV2FieldId] = null,
    infoTypeTransformations: SchemaGooglePrivacyDlpV2InfoTypeTransformations = null,
    primitiveTransformation: SchemaGooglePrivacyDlpV2PrimitiveTransformation = null
  ): SchemaGooglePrivacyDlpV2FieldTransformation = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (infoTypeTransformations != null) __obj.updateDynamic("infoTypeTransformations")(infoTypeTransformations.asInstanceOf[js.Any])
    if (primitiveTransformation != null) __obj.updateDynamic("primitiveTransformation")(primitiveTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FieldTransformation]
  }
}

