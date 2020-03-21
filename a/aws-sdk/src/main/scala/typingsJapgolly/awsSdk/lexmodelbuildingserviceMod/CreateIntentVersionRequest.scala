package typingsJapgolly.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIntentVersionRequest extends js.Object {
  /**
    * Checksum of the $LATEST version of the intent that should be used to create the new version. If you specify a checksum and the $LATEST version of the intent has a different checksum, Amazon Lex returns a PreconditionFailedException exception and doesn't publish a new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * The name of the intent that you want to create a new version of. The name is case sensitive. 
    */
  var name: IntentName = js.native
}

object CreateIntentVersionRequest {
  @scala.inline
  def apply(name: IntentName, checksum: String = null): CreateIntentVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntentVersionRequest]
  }
}

