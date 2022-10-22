package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRandomAccessStreamReference extends StObject {
  
  def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType]
}
object IRandomAccessStreamReference {
  
  inline def apply(openReadAsync: CallbackTo[IAsyncOperation[IRandomAccessStreamWithContentType]]): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = openReadAsync.toJsFn)
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
  
  extension [Self <: IRandomAccessStreamReference](x: Self) {
    
    inline def setOpenReadAsync(value: CallbackTo[IAsyncOperation[IRandomAccessStreamWithContentType]]): Self = StObject.set(x, "openReadAsync", value.toJsFn)
  }
}
