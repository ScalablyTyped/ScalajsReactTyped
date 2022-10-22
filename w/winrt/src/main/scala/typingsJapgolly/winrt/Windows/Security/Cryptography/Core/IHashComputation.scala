package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashComputation extends StObject {
  
  def append(data: IBuffer): Unit
  
  def getValueAndReset(): IBuffer
}
object IHashComputation {
  
  inline def apply(append: IBuffer => Callback, getValueAndReset: CallbackTo[IBuffer]): IHashComputation = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1((t0: IBuffer) => append(t0).runNow()), getValueAndReset = getValueAndReset.toJsFn)
    __obj.asInstanceOf[IHashComputation]
  }
  
  extension [Self <: IHashComputation](x: Self) {
    
    inline def setAppend(value: IBuffer => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: IBuffer) => value(t0).runNow()))
    
    inline def setGetValueAndReset(value: CallbackTo[IBuffer]): Self = StObject.set(x, "getValueAndReset", value.toJsFn)
  }
}
