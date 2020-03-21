package typingsJapgolly.glReact

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDst extends js.Object {
  def dst(): Unit
  def src(): Unit
}

object AnonDst {
  @scala.inline
  def apply(dst: Callback, src: Callback): AnonDst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dst")(dst.toJsFn)
    __obj.updateDynamic("src")(src.toJsFn)
    __obj.asInstanceOf[AnonDst]
  }
}

