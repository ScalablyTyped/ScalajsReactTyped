package typingsJapgolly.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how de-identification of a FHIR store should be handled.
  */
@js.native
trait SchemaFhirConfig extends js.Object {
  /**
    * Specifies FHIR paths to match and how to transform them. Any field that
    * is not matched by a FieldMetadata will be passed through to the output
    * dataset unmodified. All extensions are removed in the output.
    */
  var fieldMetadataList: js.UndefOr[js.Array[SchemaFieldMetadata]] = js.native
}

object SchemaFhirConfig {
  @scala.inline
  def apply(fieldMetadataList: js.Array[SchemaFieldMetadata] = null): SchemaFhirConfig = {
    val __obj = js.Dynamic.literal()
    if (fieldMetadataList != null) __obj.updateDynamic("fieldMetadataList")(fieldMetadataList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFhirConfig]
  }
}

