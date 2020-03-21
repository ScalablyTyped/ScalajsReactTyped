package typingsJapgolly.dwt

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * interface for a base64 result
  */
trait Base64Result extends js.Object {
  def getData(offset: Double, length: Double): String
  def getLength(): Double
  def getMD5(): String
}

object Base64Result {
  @scala.inline
  def apply(
    getData: (Double, Double) => CallbackTo[String],
    getLength: CallbackTo[Double],
    getMD5: CallbackTo[String]
  ): Base64Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getData")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getData(t0, t1).runNow()))
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getMD5")(getMD5.toJsFn)
    __obj.asInstanceOf[Base64Result]
  }
}

