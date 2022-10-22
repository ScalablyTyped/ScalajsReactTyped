package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables a Windows Runtime component to provide access to an encapsulated stream. */
trait IRandomAccessStreamReference extends StObject {
  
  /**
    * Opens a stream for random access.
    * @return The asynchronous operation.
    */
  def openReadAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
}
object IRandomAccessStreamReference {
  
  inline def apply(openReadAsync: CallbackTo[IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]]): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = openReadAsync.toJsFn)
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
  
  extension [Self <: IRandomAccessStreamReference](x: Self) {
    
    inline def setOpenReadAsync(value: CallbackTo[IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]]): Self = StObject.set(x, "openReadAsync", value.toJsFn)
  }
}
