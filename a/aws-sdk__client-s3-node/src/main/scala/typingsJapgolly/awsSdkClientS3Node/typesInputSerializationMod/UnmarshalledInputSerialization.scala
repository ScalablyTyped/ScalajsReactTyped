package typingsJapgolly.awsSdkClientS3Node.typesInputSerializationMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BZIP2
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GZIP
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NONE
import typingsJapgolly.awsSdkClientS3Node.typesCsvinputMod.UnmarshalledCSVInput
import typingsJapgolly.awsSdkClientS3Node.typesJsoninputMod.UnmarshalledJSONInput
import typingsJapgolly.awsSdkClientS3Node.typesParquetInputMod.UnmarshalledParquetInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledInputSerialization extends InputSerialization {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  @JSName("CSV")
  var CSV_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledCSVInput] = js.undefined
  /**
    * <p>Specifies JSON as object's input serialization format.</p>
    */
  @JSName("JSON")
  var JSON_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledJSONInput] = js.undefined
  /**
    * <p>Specifies Parquet as object's input serialization format.</p>
    */
  @JSName("Parquet")
  var Parquet_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledParquetInput] = js.undefined
}

object UnmarshalledInputSerialization {
  @scala.inline
  def apply(
    CSV: UnmarshalledCSVInput = null,
    CompressionType: NONE | GZIP | BZIP2 | String = null,
    JSON: UnmarshalledJSONInput = null,
    Parquet: UnmarshalledParquetInput = null
  ): UnmarshalledInputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV.asInstanceOf[js.Any])
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON.asInstanceOf[js.Any])
    if (Parquet != null) __obj.updateDynamic("Parquet")(Parquet.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInputSerialization]
  }
}

