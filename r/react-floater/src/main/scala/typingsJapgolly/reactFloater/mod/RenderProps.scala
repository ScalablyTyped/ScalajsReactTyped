package typingsJapgolly.reactFloater.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  def closeFn(): Unit
}

object RenderProps {
  @scala.inline
  def apply(closeFn: Callback): RenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeFn")(closeFn.toJsFn)
    __obj.asInstanceOf[RenderProps]
  }
}

