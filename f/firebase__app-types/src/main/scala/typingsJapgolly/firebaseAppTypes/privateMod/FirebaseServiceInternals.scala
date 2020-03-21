package typingsJapgolly.firebaseAppTypes.privateMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseServiceInternals extends js.Object {
  /**
    * Delete the service and free it's resources - called from
    * app.delete().
    */
  def delete(): js.Promise[Unit]
}

object FirebaseServiceInternals {
  @scala.inline
  def apply(delete: CallbackTo[js.Promise[Unit]]): FirebaseServiceInternals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.asInstanceOf[FirebaseServiceInternals]
  }
}

