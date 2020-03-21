package typingsJapgolly.angularStrap.mgcrea.ngStrap.affix

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAffix extends js.Object {
  def checkPosition(): Unit
  def checkPositionWithEventLoop(): Unit
  def destroy(): Unit
  def init(): Unit
}

object IAffix {
  @scala.inline
  def apply(checkPosition: Callback, checkPositionWithEventLoop: Callback, destroy: Callback, init: Callback): IAffix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkPosition")(checkPosition.toJsFn)
    __obj.updateDynamic("checkPositionWithEventLoop")(checkPositionWithEventLoop.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.asInstanceOf[IAffix]
  }
}

