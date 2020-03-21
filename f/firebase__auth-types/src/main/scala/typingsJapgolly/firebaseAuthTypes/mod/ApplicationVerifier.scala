package typingsJapgolly.firebaseAuthTypes.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationVerifier extends js.Object {
  var `type`: String
  def verify(): js.Promise[String]
}

object ApplicationVerifier {
  @scala.inline
  def apply(`type`: String, verify: CallbackTo[js.Promise[String]]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("verify")(verify.toJsFn)
    __obj.asInstanceOf[ApplicationVerifier]
  }
}

