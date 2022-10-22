package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextSnapshot extends StObject {
  
  def read(): String | Null
}
object ITextSnapshot {
  
  inline def apply(read: CallbackTo[String | Null]): ITextSnapshot = {
    val __obj = js.Dynamic.literal(read = read.toJsFn)
    __obj.asInstanceOf[ITextSnapshot]
  }
  
  extension [Self <: ITextSnapshot](x: Self) {
    
    inline def setRead(value: CallbackTo[String | Null]): Self = StObject.set(x, "read", value.toJsFn)
  }
}
