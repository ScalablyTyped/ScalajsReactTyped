package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStreamRequest extends js.Object {
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
}

object DeleteStreamRequest {
  @scala.inline
  def apply(streamId: StreamId): DeleteStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteStreamRequest]
  }
}

