package typingsJapgolly.monk.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectID extends js.Object {
  def toHexString(): String
}

object IObjectID {
  @scala.inline
  def apply(toHexString: CallbackTo[String]): IObjectID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toHexString")(toHexString.toJsFn)
    __obj.asInstanceOf[IObjectID]
  }
}

