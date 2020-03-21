package typingsJapgolly.unityWebapi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserPublic extends js.Object {
  def getUnityObject(version: Double): Unity
}

object BrowserPublic {
  @scala.inline
  def apply(getUnityObject: Double => CallbackTo[Unity]): BrowserPublic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUnityObject")(js.Any.fromFunction1((t0: scala.Double) => getUnityObject(t0).runNow()))
    __obj.asInstanceOf[BrowserPublic]
  }
}

