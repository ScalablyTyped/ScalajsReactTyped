package typingsJapgolly.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePresetRequest extends js.Object {
  /**
    * The identifier of the preset for which you want to get detailed information.
    */
  var Id: typingsJapgolly.awsSdk.elastictranscoderMod.Id = js.native
}

object DeletePresetRequest {
  @scala.inline
  def apply(Id: Id): DeletePresetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePresetRequest]
  }
}

