package typingsJapgolly.oracleOraclejet.ojmoduleElementMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.AnonInsertNewView
import typingsJapgolly.oracleOraclejet.AnonIsInitial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleElementAnimation extends js.Object {
  def animate(context: AnonInsertNewView): js.Promise[_]
  def canAnimate(context: AnonIsInitial): Boolean
  def prepareAnimation(context: AnonIsInitial): js.Object
}

object ModuleElementAnimation {
  @scala.inline
  def apply(
    animate: AnonInsertNewView => CallbackTo[js.Promise[js.Any]],
    canAnimate: AnonIsInitial => CallbackTo[Boolean],
    prepareAnimation: AnonIsInitial => CallbackTo[js.Object]
  ): ModuleElementAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animate")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.AnonInsertNewView) => animate(t0).runNow()))
    __obj.updateDynamic("canAnimate")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.AnonIsInitial) => canAnimate(t0).runNow()))
    __obj.updateDynamic("prepareAnimation")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.AnonIsInitial) => prepareAnimation(t0).runNow()))
    __obj.asInstanceOf[ModuleElementAnimation]
  }
}

