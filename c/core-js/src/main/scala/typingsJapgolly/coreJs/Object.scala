package typingsJapgolly.coreJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap
}

object Object {
  @scala.inline
  def apply(getOwnPropertyDescriptors: js.Any => CallbackTo[PropertyDescriptorMap]): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getOwnPropertyDescriptors")(js.Any.fromFunction1((t0: js.Any) => getOwnPropertyDescriptors(t0).runNow()))
    __obj.asInstanceOf[Object]
  }
}

