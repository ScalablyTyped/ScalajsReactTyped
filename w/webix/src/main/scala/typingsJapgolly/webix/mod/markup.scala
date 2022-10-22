package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait markup extends StObject {
  
  var attribute: Any
  
  var dataTag: Any
  
  def init(node: String, target: String): baseview
  
  var namespace: Any
  
  def parse(data: Any, datatype: String): Unit
}
object markup {
  
  @JSImport("webix", "markup")
  @js.native
  val ^ : typingsJapgolly.webix.webix.markup = js.native
  
  extension [Self <: markup](x: Self) {
    
    inline def setAttribute(value: Any): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setDataTag(value: Any): Self = StObject.set(x, "dataTag", value.asInstanceOf[js.Any])
    
    inline def setInit(value: (String, String) => baseview): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    inline def setNamespace(value: Any): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setParse(value: (Any, String) => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
  }
}
