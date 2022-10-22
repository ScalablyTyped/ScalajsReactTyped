package typingsJapgolly.testingLibraryUserEvent

import org.scalajs.dom.Blob
import org.scalajs.dom.DataTransfer
import org.scalajs.dom.File
import typingsJapgolly.std.DataTransferItem
import typingsJapgolly.testingLibraryUserEvent.distTypesDocumentTrackValueMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsDataTransferDataTransferMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/dataTransfer/DataTransfer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDataTransfer(window: Window & (/* globalThis */ Any)): DataTransfer = ^.asInstanceOf[js.Dynamic].applyDynamic("createDataTransfer")(window.asInstanceOf[js.Any]).asInstanceOf[DataTransfer]
  inline def createDataTransfer(window: Window & (/* globalThis */ Any), files: js.Array[File]): DataTransfer = (^.asInstanceOf[js.Dynamic].applyDynamic("createDataTransfer")(window.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[DataTransfer]
  
  inline def getBlobFromDataTransferItem(window: Window & (/* globalThis */ Any), item: DataTransferItem): Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlobFromDataTransferItem")(window.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Blob]
}
