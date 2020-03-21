package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWrapperMethods extends js.Object {
  def destroy(): Unit
}

object MouseWrapperMethods {
  @scala.inline
  def apply(destroy: Callback): MouseWrapperMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[MouseWrapperMethods]
  }
}

