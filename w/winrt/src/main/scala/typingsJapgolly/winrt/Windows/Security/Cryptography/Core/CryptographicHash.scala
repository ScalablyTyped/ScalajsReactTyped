package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptographicHash
  extends StObject
     with IHashComputation
object CryptographicHash {
  
  inline def apply(append: IBuffer => Callback, getValueAndReset: CallbackTo[IBuffer]): CryptographicHash = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1((t0: IBuffer) => append(t0).runNow()), getValueAndReset = getValueAndReset.toJsFn)
    __obj.asInstanceOf[CryptographicHash]
  }
}
