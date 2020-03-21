package typingsJapgolly.juiCore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UICollection extends js.Object {
  def destroy(): Unit
}

object UICollection {
  @scala.inline
  def apply(destroy: Callback): UICollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[UICollection]
  }
}

