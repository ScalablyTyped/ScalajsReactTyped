package typingsJapgolly.lovefield.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binder extends js.Object {
  def getIndex(): Double
}

object Binder {
  @scala.inline
  def apply(getIndex: CallbackTo[Double]): Binder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.asInstanceOf[Binder]
  }
}

