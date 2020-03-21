package typingsJapgolly.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateObjectResponse extends js.Object {
  /**
    * The identifier that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typingsJapgolly.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}

object CreateObjectResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null): CreateObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateObjectResponse]
  }
}

