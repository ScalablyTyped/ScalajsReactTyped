package typingsJapgolly.awsSdkClientS3Node.typesOutputSerializationMod

import typingsJapgolly.awsSdkClientS3Node.typesCsvoutputMod.CSVOutput
import typingsJapgolly.awsSdkClientS3Node.typesJsonoutputMod.JSONOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of CSV-encoded Select results.</p>
    */
  var CSV: js.UndefOr[CSVOutput] = js.undefined
  /**
    * <p>Specifies JSON as request's output serialization format.</p>
    */
  var JSON: js.UndefOr[JSONOutput] = js.undefined
}

object OutputSerialization {
  @scala.inline
  def apply(CSV: CSVOutput = null, JSON: JSONOutput = null): OutputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSerialization]
  }
}

