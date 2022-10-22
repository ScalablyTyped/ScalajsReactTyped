package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputStreamReference extends StObject {
  
  def openSequentialReadAsync(): IAsyncOperation[IInputStream]
}
object IInputStreamReference {
  
  inline def apply(openSequentialReadAsync: CallbackTo[IAsyncOperation[IInputStream]]): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = openSequentialReadAsync.toJsFn)
    __obj.asInstanceOf[IInputStreamReference]
  }
  
  extension [Self <: IInputStreamReference](x: Self) {
    
    inline def setOpenSequentialReadAsync(value: CallbackTo[IAsyncOperation[IInputStream]]): Self = StObject.set(x, "openSequentialReadAsync", value.toJsFn)
  }
}
