package typingsJapgolly.aframe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofAnimationUtils extends js.Object {
  def arraySlice(array: js.Any, from: Double, to: Double): js.Any
  def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any
  def flattenJSON(jsonKeys: js.Array[String], times: js.Array[_], values: js.Array[_], valuePropertyName: String): Unit
  def getKeyFrameOrder(times: Double): js.Array[Double]
  def isTypedArray(`object`: js.Any): Boolean
  def sortedArray(values: js.Array[_], stride: Double, order: js.Array[Double]): js.Array[_]
}

object TypeofAnimationUtils {
  @scala.inline
  def apply(
    arraySlice: (js.Any, Double, Double) => CallbackTo[js.Any],
    convertArray: (js.Any, js.Any, Boolean) => CallbackTo[js.Any],
    flattenJSON: (js.Array[String], js.Array[js.Any], js.Array[js.Any], String) => Callback,
    getKeyFrameOrder: Double => CallbackTo[js.Array[Double]],
    isTypedArray: js.Any => CallbackTo[Boolean],
    sortedArray: (js.Array[js.Any], Double, js.Array[Double]) => CallbackTo[js.Array[js.Any]]
  ): TypeofAnimationUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arraySlice")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double, t2: scala.Double) => arraySlice(t0, t1, t2).runNow()))
    __obj.updateDynamic("convertArray")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: scala.Boolean) => convertArray(t0, t1, t2).runNow()))
    __obj.updateDynamic("flattenJSON")(js.Any.fromFunction4((t0: js.Array[java.lang.String], t1: js.Array[js.Any], t2: js.Array[js.Any], t3: java.lang.String) => flattenJSON(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getKeyFrameOrder")(js.Any.fromFunction1((t0: scala.Double) => getKeyFrameOrder(t0).runNow()))
    __obj.updateDynamic("isTypedArray")(js.Any.fromFunction1((t0: js.Any) => isTypedArray(t0).runNow()))
    __obj.updateDynamic("sortedArray")(js.Any.fromFunction3((t0: js.Array[js.Any], t1: scala.Double, t2: js.Array[scala.Double]) => sortedArray(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TypeofAnimationUtils]
  }
}

