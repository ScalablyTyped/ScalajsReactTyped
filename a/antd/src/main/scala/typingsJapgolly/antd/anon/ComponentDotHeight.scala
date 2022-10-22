package typingsJapgolly.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDotHeight extends StObject {
  
  var component: DotHeight
  
  var global: js.Array[String]
}
object ComponentDotHeight {
  
  inline def apply(component: DotHeight, global: js.Array[String]): ComponentDotHeight = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDotHeight]
  }
  
  extension [Self <: ComponentDotHeight](x: Self) {
    
    inline def setComponent(value: DotHeight): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: js.Array[String]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: String*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
