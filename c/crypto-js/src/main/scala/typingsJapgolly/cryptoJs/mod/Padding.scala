package typingsJapgolly.cryptoJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Padding strategy.
  */
trait Padding extends StObject {
  
  /**
    * Pads data using the algorithm defined in PKCS #5/7.
    *
    * @param data The data to pad.
    * @param blockSize The multiple that the data should be padded to.
    *
    * @example
    *
    *     CryptoJS.pad.Pkcs7.pad(wordArray, 4);
    */
  def pad(data: WordArray, blockSize: Double): Unit
  
  /**
    * Unpads data that had been padded using the algorithm defined in PKCS #5/7.
    *
    * @param data The data to unpad.
    *
    * @example
    *
    *     CryptoJS.pad.Pkcs7.unpad(wordArray);
    */
  def unpad(data: WordArray): Unit
}
object Padding {
  
  inline def apply(pad: (WordArray, Double) => Callback, unpad: WordArray => Callback): Padding = {
    val __obj = js.Dynamic.literal(pad = js.Any.fromFunction2((t0: WordArray, t1: Double) => (pad(t0, t1)).runNow()), unpad = js.Any.fromFunction1((t0: WordArray) => unpad(t0).runNow()))
    __obj.asInstanceOf[Padding]
  }
  
  extension [Self <: Padding](x: Self) {
    
    inline def setPad(value: (WordArray, Double) => Callback): Self = StObject.set(x, "pad", js.Any.fromFunction2((t0: WordArray, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUnpad(value: WordArray => Callback): Self = StObject.set(x, "unpad", js.Any.fromFunction1((t0: WordArray) => value(t0).runNow()))
  }
}
