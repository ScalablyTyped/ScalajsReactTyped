package typingsJapgolly.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageBuilderStreamingURLRequest extends js.Object {
  /**
    * The name of the image builder.
    */
  var Name: String = js.native
  /**
    * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 3600 seconds.
    */
  var Validity: js.UndefOr[Long] = js.native
}

object CreateImageBuilderStreamingURLRequest {
  @scala.inline
  def apply(Name: String, Validity: Int | Double = null): CreateImageBuilderStreamingURLRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Validity != null) __obj.updateDynamic("Validity")(Validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageBuilderStreamingURLRequest]
  }
}

