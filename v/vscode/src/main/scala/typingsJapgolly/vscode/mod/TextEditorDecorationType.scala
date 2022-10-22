package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditorDecorationType extends StObject {
  
  /**
    * Remove this decoration type and all decorations on all text editors using it.
    */
  def dispose(): Unit
  
  /**
    * Internal representation of the handle.
    */
  val key: String
}
object TextEditorDecorationType {
  
  inline def apply(dispose: Callback, key: String): TextEditorDecorationType = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorDecorationType]
  }
  
  extension [Self <: TextEditorDecorationType](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
