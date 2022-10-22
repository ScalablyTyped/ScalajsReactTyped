package typingsJapgolly.tengitsui.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableEditorRef extends StObject {
  
  def getErrors(): js.Array[Any]
  
  def getValue(): js.Array[Any]
}
object TableEditorRef {
  
  inline def apply(getErrors: CallbackTo[js.Array[Any]], getValue: CallbackTo[js.Array[Any]]): TableEditorRef = {
    val __obj = js.Dynamic.literal(getErrors = getErrors.toJsFn, getValue = getValue.toJsFn)
    __obj.asInstanceOf[TableEditorRef]
  }
  
  extension [Self <: TableEditorRef](x: Self) {
    
    inline def setGetErrors(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getErrors", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getValue", value.toJsFn)
  }
}
