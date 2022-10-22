package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintList extends StObject {
  
  def dispose(): Unit
  
  var hints: js.Array[InlayHint]
}
object InlayHintList {
  
  inline def apply(dispose: Callback, hints: js.Array[InlayHint]): InlayHintList = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, hints = hints.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlayHintList]
  }
  
  extension [Self <: InlayHintList](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setHints(value: js.Array[InlayHint]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsVarargs(value: InlayHint*): Self = StObject.set(x, "hints", js.Array(value*))
  }
}
