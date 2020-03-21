package typingsJapgolly.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationSchema extends js.Object {
  /**
    * Specifies the format of the records on the output stream.
    */
  var RecordFormatType: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.RecordFormatType = js.native
}

object DestinationSchema {
  @scala.inline
  def apply(RecordFormatType: RecordFormatType): DestinationSchema = {
    val __obj = js.Dynamic.literal(RecordFormatType = RecordFormatType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DestinationSchema]
  }
}

