package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reusable hashing object and contains the result of a hashing operation. */
trait CryptographicHash extends StObject {
  
  /**
    * Appends a binary encoded string to the data stored in the CryptographicHash object.
    * @param data Data to append.
    */
  def append(data: IBuffer): Unit
  
  /**
    * Gets hashed data from the CryptographicHash object and resets the object.
    * @return Hashed data.
    */
  def getValueAndReset(): IBuffer
}
object CryptographicHash {
  
  inline def apply(append: IBuffer => Callback, getValueAndReset: CallbackTo[IBuffer]): CryptographicHash = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1((t0: IBuffer) => append(t0).runNow()), getValueAndReset = getValueAndReset.toJsFn)
    __obj.asInstanceOf[CryptographicHash]
  }
  
  extension [Self <: CryptographicHash](x: Self) {
    
    inline def setAppend(value: IBuffer => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: IBuffer) => value(t0).runNow()))
    
    inline def setGetValueAndReset(value: CallbackTo[IBuffer]): Self = StObject.set(x, "getValueAndReset", value.toJsFn)
  }
}
