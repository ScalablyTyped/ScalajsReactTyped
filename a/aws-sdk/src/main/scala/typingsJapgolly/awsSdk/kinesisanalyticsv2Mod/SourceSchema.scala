package typingsJapgolly.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSchema extends js.Object {
  /**
    * A list of RecordColumn objects. 
    */
  var RecordColumns: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.RecordColumns = js.native
  /**
    * Specifies the encoding of the records in the streaming source. For example, UTF-8.
    */
  var RecordEncoding: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.RecordEncoding] = js.native
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormat: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.RecordFormat = js.native
}

object SourceSchema {
  @scala.inline
  def apply(RecordColumns: RecordColumns, RecordFormat: RecordFormat, RecordEncoding: RecordEncoding = null): SourceSchema = {
    val __obj = js.Dynamic.literal(RecordColumns = RecordColumns.asInstanceOf[js.Any], RecordFormat = RecordFormat.asInstanceOf[js.Any])
    if (RecordEncoding != null) __obj.updateDynamic("RecordEncoding")(RecordEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSchema]
  }
}

