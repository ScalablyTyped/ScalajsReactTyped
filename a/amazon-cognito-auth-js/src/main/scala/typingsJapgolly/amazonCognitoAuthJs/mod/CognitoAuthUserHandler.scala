package typingsJapgolly.amazonCognitoAuthJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoAuthUserHandler extends js.Object {
  def onFailure(err: js.Any): Unit
  def onSuccess(authSession: CognitoAuthSession): Unit
}

object CognitoAuthUserHandler {
  @scala.inline
  def apply(onFailure: js.Any => Callback, onSuccess: CognitoAuthSession => Callback): CognitoAuthUserHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: js.Any) => onFailure(t0).runNow()))
    __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: typingsJapgolly.amazonCognitoAuthJs.mod.CognitoAuthSession) => onSuccess(t0).runNow()))
    __obj.asInstanceOf[CognitoAuthUserHandler]
  }
}

