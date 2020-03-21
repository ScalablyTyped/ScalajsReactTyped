package typingsJapgolly.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record extends js.Object {
  /**
    * The last modified date of the client device.
    */
  var DeviceLastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The key for the record.
    */
  var Key: js.UndefOr[RecordKey] = js.native
  /**
    * The user/device that made the last change to this record.
    */
  var LastModifiedBy: js.UndefOr[String] = js.native
  /**
    * The date on which the record was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The server sync count for this record.
    */
  var SyncCount: js.UndefOr[Long] = js.native
  /**
    * The value for the record.
    */
  var Value: js.UndefOr[RecordValue] = js.native
}

object Record {
  @scala.inline
  def apply(
    DeviceLastModifiedDate: js.Date = null,
    Key: RecordKey = null,
    LastModifiedBy: String = null,
    LastModifiedDate: js.Date = null,
    SyncCount: Int | Double = null,
    Value: RecordValue = null
  ): Record = {
    val __obj = js.Dynamic.literal()
    if (DeviceLastModifiedDate != null) __obj.updateDynamic("DeviceLastModifiedDate")(DeviceLastModifiedDate.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (SyncCount != null) __obj.updateDynamic("SyncCount")(SyncCount.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
}

