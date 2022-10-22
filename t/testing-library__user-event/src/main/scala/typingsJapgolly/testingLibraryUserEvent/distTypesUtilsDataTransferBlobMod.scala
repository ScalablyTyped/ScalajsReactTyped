package typingsJapgolly.testingLibraryUserEvent

import org.scalajs.dom.Blob
import typingsJapgolly.testingLibraryUserEvent.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsDataTransferBlobMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/dataTransfer/Blob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readBlobText(blob: Blob, FileReader: Instantiable): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readBlobText")(blob.asInstanceOf[js.Any], FileReader.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
