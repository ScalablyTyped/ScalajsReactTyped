package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a custom document used by a {@linkcode CustomEditorProvider}.
  *
  * Custom documents are only used within a given `CustomEditorProvider`. The lifecycle of a `CustomDocument` is
  * managed by the editor. When no more references remain to a `CustomDocument`, it is disposed of.
  */
trait CustomDocument extends StObject {
  
  /**
    * Dispose of the custom document.
    *
    * This is invoked by the editor when there are no more references to a given `CustomDocument` (for example when
    * all editors associated with the document have been closed.)
    */
  def dispose(): Unit
  
  /**
    * The associated uri for this document.
    */
  val uri: Uri
}
object CustomDocument {
  
  inline def apply(dispose: Callback, uri: Uri): CustomDocument = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocument]
  }
  
  extension [Self <: CustomDocument](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
