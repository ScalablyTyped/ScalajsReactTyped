package typingsJapgolly.pixiSpine.PIXI.spine.core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Updatable extends js.Object {
  def isActive(): Boolean
  def update(): Unit
}

object Updatable {
  @scala.inline
  def apply(isActive: CallbackTo[Boolean], update: Callback): Updatable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isActive")(isActive.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[Updatable]
  }
}

