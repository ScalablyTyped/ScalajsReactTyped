package typingsJapgolly.lowdb.mod.lodashAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringChain extends js.Object {
  def write(): String with js.Promise[String]
}

object StringChain {
  @scala.inline
  def apply(write: CallbackTo[String with js.Promise[String]]): StringChain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(write.toJsFn)
    __obj.asInstanceOf[StringChain]
  }
}

