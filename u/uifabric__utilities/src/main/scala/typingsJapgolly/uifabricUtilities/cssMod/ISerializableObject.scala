package typingsJapgolly.uifabricUtilities.cssMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializableObject extends js.Object {
  @JSName("toString")
  var toString_FISerializableObject: js.UndefOr[js.Function0[String]] = js.undefined
}

object ISerializableObject {
  @scala.inline
  def apply(toString: js.UndefOr[CallbackTo[String]] = js.undefined): ISerializableObject = {
    val __obj = js.Dynamic.literal()
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    __obj.asInstanceOf[ISerializableObject]
  }
}

