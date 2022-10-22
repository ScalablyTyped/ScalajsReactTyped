package typingsJapgolly.reactNativeCryptoJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode_ extends StObject {
  
  /**
    * Processes the data block at offset.
    *
    * @param words The data words to operate on.
    * @param offset The offset where the block starts.
    *
    * @example
    *
    *     mode.processBlock(data.words, offset);
    */
  def processBlock(words: js.Array[Double], offset: Double): Unit
}
object Mode_ {
  
  inline def apply(processBlock: (js.Array[Double], Double) => Callback): Mode_ = {
    val __obj = js.Dynamic.literal(processBlock = js.Any.fromFunction2((t0: js.Array[Double], t1: Double) => (processBlock(t0, t1)).runNow()))
    __obj.asInstanceOf[Mode_]
  }
  
  extension [Self <: Mode_](x: Self) {
    
    inline def setProcessBlock(value: (js.Array[Double], Double) => Callback): Self = StObject.set(x, "processBlock", js.Any.fromFunction2((t0: js.Array[Double], t1: Double) => (value(t0, t1)).runNow()))
  }
}
