package typingsJapgolly.tstl.isizeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISize extends js.Object {
  /**
    * Number of elements in the container.
    */
  def size(): Double
}

object ISize {
  @scala.inline
  def apply(size: CallbackTo[Double]): ISize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[ISize]
  }
}

