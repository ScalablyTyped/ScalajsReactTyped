package typingsJapgolly.tstl.iemptyMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmpty extends js.Object {
  /**
    * Test whether container is empty.
    */
  def empty(): Boolean
}

object IEmpty {
  @scala.inline
  def apply(empty: CallbackTo[Boolean]): IEmpty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.asInstanceOf[IEmpty]
  }
}

