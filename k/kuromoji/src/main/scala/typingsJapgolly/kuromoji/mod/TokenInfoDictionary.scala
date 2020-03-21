package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfoDictionary extends js.Object {
  def addMapping(source: Double, target: Double): Unit
  def buildDictionary(entries: js.Array[js.Array[_]]): NumberDictionary[String]
  def getFeatures(token_info_id_str: String): String
  def loadDictionary(array_buffer: scala.scalajs.js.typedarray.Uint8Array): TokenInfoDictionary
  def loadPosVector(array_buffer: scala.scalajs.js.typedarray.Uint8Array): TokenInfoDictionary
  def loadTargetMap(array_buffer: scala.scalajs.js.typedarray.Uint8Array): TokenInfoDictionary
  def put(left_id: Double, right_id: Double, word_cost: Double, surface_form: String, feature: String): Double
  def targetMapToBuffer(): scala.scalajs.js.typedarray.Uint8Array
}

object TokenInfoDictionary {
  @scala.inline
  def apply(
    addMapping: (Double, Double) => Callback,
    buildDictionary: js.Array[js.Array[js.Any]] => CallbackTo[NumberDictionary[String]],
    getFeatures: String => CallbackTo[String],
    loadDictionary: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[TokenInfoDictionary],
    loadPosVector: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[TokenInfoDictionary],
    loadTargetMap: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[TokenInfoDictionary],
    put: (Double, Double, Double, String, String) => CallbackTo[Double],
    targetMapToBuffer: CallbackTo[scala.scalajs.js.typedarray.Uint8Array]
  ): TokenInfoDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addMapping")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => addMapping(t0, t1).runNow()))
    __obj.updateDynamic("buildDictionary")(js.Any.fromFunction1((t0: js.Array[js.Array[js.Any]]) => buildDictionary(t0).runNow()))
    __obj.updateDynamic("getFeatures")(js.Any.fromFunction1((t0: java.lang.String) => getFeatures(t0).runNow()))
    __obj.updateDynamic("loadDictionary")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => loadDictionary(t0).runNow()))
    __obj.updateDynamic("loadPosVector")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => loadPosVector(t0).runNow()))
    __obj.updateDynamic("loadTargetMap")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => loadTargetMap(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: java.lang.String, t4: java.lang.String) => put(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("targetMapToBuffer")(targetMapToBuffer.toJsFn)
    __obj.asInstanceOf[TokenInfoDictionary]
  }
}

