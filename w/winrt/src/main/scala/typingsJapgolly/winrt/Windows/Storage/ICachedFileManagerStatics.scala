package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICachedFileManagerStatics extends StObject {
  
  def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus]
  
  def deferUpdates(file: IStorageFile): Unit
}
object ICachedFileManagerStatics {
  
  inline def apply(
    completeUpdatesAsync: IStorageFile => IAsyncOperation[FileUpdateStatus],
    deferUpdates: IStorageFile => Callback
  ): ICachedFileManagerStatics = {
    val __obj = js.Dynamic.literal(completeUpdatesAsync = js.Any.fromFunction1(completeUpdatesAsync), deferUpdates = js.Any.fromFunction1((t0: IStorageFile) => deferUpdates(t0).runNow()))
    __obj.asInstanceOf[ICachedFileManagerStatics]
  }
  
  extension [Self <: ICachedFileManagerStatics](x: Self) {
    
    inline def setCompleteUpdatesAsync(value: IStorageFile => IAsyncOperation[FileUpdateStatus]): Self = StObject.set(x, "completeUpdatesAsync", js.Any.fromFunction1(value))
    
    inline def setDeferUpdates(value: IStorageFile => Callback): Self = StObject.set(x, "deferUpdates", js.Any.fromFunction1((t0: IStorageFile) => value(t0).runNow()))
  }
}
