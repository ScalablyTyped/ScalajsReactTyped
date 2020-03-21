package typingsJapgolly.unityWebapi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait External extends js.Object {
  def getUnityObject(version: Double): Unity
}

object External {
  @scala.inline
  def apply(getUnityObject: Double => CallbackTo[Unity]): External = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUnityObject")(js.Any.fromFunction1((t0: scala.Double) => getUnityObject(t0).runNow()))
    __obj.asInstanceOf[External]
  }
}

