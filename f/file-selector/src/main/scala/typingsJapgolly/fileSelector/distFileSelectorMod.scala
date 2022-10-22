package typingsJapgolly.fileSelector

import org.scalajs.dom.Event
import typingsJapgolly.fileSelector.distFileMod.FileWithPath
import typingsJapgolly.std.DataTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFileSelectorMod {
  
  @JSImport("file-selector/dist/file-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromEvent(evt: Event): js.Promise[js.Array[FileWithPath | DataTransferItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileWithPath | DataTransferItem]]]
  inline def fromEvent(evt: Any): js.Promise[js.Array[FileWithPath | DataTransferItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileWithPath | DataTransferItem]]]
}
