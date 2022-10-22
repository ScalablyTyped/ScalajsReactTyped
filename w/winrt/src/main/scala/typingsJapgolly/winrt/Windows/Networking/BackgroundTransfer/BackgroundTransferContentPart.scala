package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundTransferContentPart
  extends StObject
     with IBackgroundTransferContentPart
object BackgroundTransferContentPart {
  
  inline def apply(
    setFile: IStorageFile => Callback,
    setHeader: (String, String) => Callback,
    setText: String => Callback
  ): BackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal(setFile = js.Any.fromFunction1((t0: IStorageFile) => setFile(t0).runNow()), setHeader = js.Any.fromFunction2((t0: String, t1: String) => (setHeader(t0, t1)).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()))
    __obj.asInstanceOf[BackgroundTransferContentPart]
  }
}
