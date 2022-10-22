package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables a Windows Runtime component to provide sequential read access to an encapsulated stream. */
trait IInputStreamReference extends StObject {
  
  /**
    * Opens a stream for sequential read access.
    * @return The asynchronous operation.
    */
  def openSequentialReadAsync(): IPromiseWithIAsyncOperation[IInputStream]
}
object IInputStreamReference {
  
  inline def apply(openSequentialReadAsync: CallbackTo[IPromiseWithIAsyncOperation[IInputStream]]): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = openSequentialReadAsync.toJsFn)
    __obj.asInstanceOf[IInputStreamReference]
  }
  
  extension [Self <: IInputStreamReference](x: Self) {
    
    inline def setOpenSequentialReadAsync(value: CallbackTo[IPromiseWithIAsyncOperation[IInputStream]]): Self = StObject.set(x, "openSequentialReadAsync", value.toJsFn)
  }
}
