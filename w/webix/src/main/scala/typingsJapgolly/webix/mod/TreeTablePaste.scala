package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTablePaste extends StObject {
  
  def insert(data: js.Array[Any]): Unit
}
object TreeTablePaste {
  
  @JSImport("webix", "TreeTablePaste")
  @js.native
  val ^ : TreeTablePaste = js.native
  
  extension [Self <: TreeTablePaste](x: Self) {
    
    inline def setInsert(value: js.Array[Any] => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
  }
}
