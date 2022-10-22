package typingsJapgolly.webix.webix

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTablePaste extends StObject {
  
  def insert(data: js.Array[Any]): Unit
}
object TreeTablePaste {
  
  inline def apply(insert: js.Array[Any] => Callback): TreeTablePaste = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1((t0: js.Array[Any]) => insert(t0).runNow()))
    __obj.asInstanceOf[TreeTablePaste]
  }
  
  extension [Self <: TreeTablePaste](x: Self) {
    
    inline def setInsert(value: js.Array[Any] => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
  }
}
