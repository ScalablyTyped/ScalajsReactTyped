package typingsJapgolly.testingLibraryUserEvent

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Blob
import org.scalajs.dom.DataTransfer
import org.scalajs.dom.Document
import typingsJapgolly.std.ClipboardItem
import typingsJapgolly.testingLibraryUserEvent.distTypesDocumentTrackValueMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsDataTransferClipboardMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/dataTransfer/Clipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachClipboardStubToView(window: Window & (/* globalThis */ Any)): ClipboardStubControlInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("attachClipboardStubToView")(window.asInstanceOf[js.Any]).asInstanceOf[ClipboardStubControlInstance]
  
  inline def createClipboardItem(window: Window & (/* globalThis */ Any), blobs: (Blob | String)*): ClipboardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createClipboardItem")(scala.List(window.asInstanceOf[js.Any]).`++`(blobs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ClipboardItem]
  
  inline def detachClipboardStubFromView(window: Window & (/* globalThis */ Any)): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachClipboardStubFromView")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def readDataTransferFromClipboard(document: Document): js.Promise[DataTransfer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDataTransferFromClipboard")(document.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataTransfer]]
  
  inline def resetClipboardStubOnView(window: Window & (/* globalThis */ Any)): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetClipboardStubOnView")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def writeDataTransferToClipboard(document: Document, clipboardData: DataTransfer): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDataTransferToClipboard")(document.asInstanceOf[js.Any], clipboardData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait ClipboardStubControlInstance extends StObject {
    
    def detachClipboardStub(): Unit
    
    def resetClipboardStub(): Unit
  }
  object ClipboardStubControlInstance {
    
    inline def apply(detachClipboardStub: Callback, resetClipboardStub: Callback): ClipboardStubControlInstance = {
      val __obj = js.Dynamic.literal(detachClipboardStub = detachClipboardStub.toJsFn, resetClipboardStub = resetClipboardStub.toJsFn)
      __obj.asInstanceOf[ClipboardStubControlInstance]
    }
    
    extension [Self <: ClipboardStubControlInstance](x: Self) {
      
      inline def setDetachClipboardStub(value: Callback): Self = StObject.set(x, "detachClipboardStub", value.toJsFn)
      
      inline def setResetClipboardStub(value: Callback): Self = StObject.set(x, "resetClipboardStub", value.toJsFn)
    }
  }
}
