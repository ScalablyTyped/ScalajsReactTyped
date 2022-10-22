package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTransferContentPart extends StObject {
  
  def setFile(value: IStorageFile): Unit
  
  def setHeader(headerName: String, headerValue: String): Unit
  
  def setText(value: String): Unit
}
object IBackgroundTransferContentPart {
  
  inline def apply(
    setFile: IStorageFile => Callback,
    setHeader: (String, String) => Callback,
    setText: String => Callback
  ): IBackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal(setFile = js.Any.fromFunction1((t0: IStorageFile) => setFile(t0).runNow()), setHeader = js.Any.fromFunction2((t0: String, t1: String) => (setHeader(t0, t1)).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()))
    __obj.asInstanceOf[IBackgroundTransferContentPart]
  }
  
  extension [Self <: IBackgroundTransferContentPart](x: Self) {
    
    inline def setSetFile(value: IStorageFile => Callback): Self = StObject.set(x, "setFile", js.Any.fromFunction1((t0: IStorageFile) => value(t0).runNow()))
    
    inline def setSetHeader(value: (String, String) => Callback): Self = StObject.set(x, "setHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
