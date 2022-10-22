package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLensList extends StObject {
  
  def dispose(): Unit
  
  var lenses: js.Array[CodeLens]
}
object CodeLensList {
  
  inline def apply(dispose: Callback, lenses: js.Array[CodeLens]): CodeLensList = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, lenses = lenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLensList]
  }
  
  extension [Self <: CodeLensList](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setLenses(value: js.Array[CodeLens]): Self = StObject.set(x, "lenses", value.asInstanceOf[js.Any])
    
    inline def setLensesVarargs(value: CodeLens*): Self = StObject.set(x, "lenses", js.Array(value*))
  }
}
