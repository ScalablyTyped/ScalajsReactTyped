package typingsJapgolly.awsSdkClientS3Node.typesRecordsEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordsEvent extends js.Object {
  /**
    * <p>The byte array of partial, one or more result records.</p>
    */
  var Payload: js.UndefOr[
    scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | String
  ] = js.undefined
}

object RecordsEvent {
  @scala.inline
  def apply(
    Payload: scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | String = null
  ): RecordsEvent = {
    val __obj = js.Dynamic.literal()
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordsEvent]
  }
}

