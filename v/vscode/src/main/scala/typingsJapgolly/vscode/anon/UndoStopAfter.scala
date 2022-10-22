package typingsJapgolly.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndoStopAfter extends StObject {
  
  val undoStopAfter: Boolean
  
  val undoStopBefore: Boolean
}
object UndoStopAfter {
  
  inline def apply(undoStopAfter: Boolean, undoStopBefore: Boolean): UndoStopAfter = {
    val __obj = js.Dynamic.literal(undoStopAfter = undoStopAfter.asInstanceOf[js.Any], undoStopBefore = undoStopBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoStopAfter]
  }
  
  extension [Self <: UndoStopAfter](x: Self) {
    
    inline def setUndoStopAfter(value: Boolean): Self = StObject.set(x, "undoStopAfter", value.asInstanceOf[js.Any])
    
    inline def setUndoStopBefore(value: Boolean): Self = StObject.set(x, "undoStopBefore", value.asInstanceOf[js.Any])
  }
}
