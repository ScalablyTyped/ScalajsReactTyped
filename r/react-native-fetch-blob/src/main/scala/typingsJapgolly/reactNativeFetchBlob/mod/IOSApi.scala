package typingsJapgolly.reactNativeFetchBlob.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOSApi extends StObject {
  
  /**
    * Show options menu for interact with the file.
    * @param path This is a required field, the path to the document. The path should NOT contains any scheme prefix.
    */
  def openDocument(path: String): Unit
  
  /**
    * Open a file in {@link https://developer.apple.com/reference/uikit/uidocumentinteractioncontroller UIDocumentInteractionController},
    * this is the default document viewer of iOS, supports several kinds of files. On Android, there's an similar method {@link android.actionViewIntent}.
    * @param path This is a required field, the path to the document. The path should NOT contains any scheme prefix.
    */
  def previewDocument(path: String): Unit
}
object IOSApi {
  
  inline def apply(openDocument: String => Callback, previewDocument: String => Callback): IOSApi = {
    val __obj = js.Dynamic.literal(openDocument = js.Any.fromFunction1((t0: String) => openDocument(t0).runNow()), previewDocument = js.Any.fromFunction1((t0: String) => previewDocument(t0).runNow()))
    __obj.asInstanceOf[IOSApi]
  }
  
  extension [Self <: IOSApi](x: Self) {
    
    inline def setOpenDocument(value: String => Callback): Self = StObject.set(x, "openDocument", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setPreviewDocument(value: String => Callback): Self = StObject.set(x, "previewDocument", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
