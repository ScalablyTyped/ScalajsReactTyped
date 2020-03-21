package typingsJapgolly.javascriptObfuscator.iobfuscatedcodeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptObfuscator.iinitializableMod.IInitializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObfuscatedCode
  extends IInitializable[js.Tuple2[String, String]] {
  /**
    * @return {string}
    */
  def getObfuscatedCode(): String
  /**
    * @return {string}
    */
  def getSourceMap(): String
}

object IObfuscatedCode {
  @scala.inline
  def apply(
    getObfuscatedCode: CallbackTo[String],
    getSourceMap: CallbackTo[String],
    initialize: js.Tuple2[String, String] => Callback
  ): IObfuscatedCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getObfuscatedCode")(getObfuscatedCode.toJsFn)
    __obj.updateDynamic("getSourceMap")(getSourceMap.toJsFn)
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: js.Tuple2[java.lang.String, java.lang.String]) => initialize(t0).runNow()))
    __obj.asInstanceOf[IObfuscatedCode]
  }
}

