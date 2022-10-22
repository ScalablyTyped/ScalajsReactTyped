package typingsJapgolly.cssTree.mod

import typingsJapgolly.cssTree.cssTreeStrings.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeFunction
  extends StObject
     with DSNode
     with DSNodeMultiplied {
  
  var name: String
  
  var `type`: Function
}
object DSNodeFunction {
  
  inline def apply(name: String): DSNodeFunction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Function")
    __obj.asInstanceOf[DSNodeFunction]
  }
  
  extension [Self <: DSNodeFunction](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
