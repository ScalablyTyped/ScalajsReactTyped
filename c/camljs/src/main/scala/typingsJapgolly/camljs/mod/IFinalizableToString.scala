package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalizableToString extends js.Object {
  /** Get the resulting CAML query as string */
  def ToString(): String
}

object IFinalizableToString {
  @scala.inline
  def apply(ToString: CallbackTo[String]): IFinalizableToString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ToString")(ToString.toJsFn)
    __obj.asInstanceOf[IFinalizableToString]
  }
}

