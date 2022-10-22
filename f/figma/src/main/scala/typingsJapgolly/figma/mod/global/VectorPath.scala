package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorPath extends StObject {
  
  val data: String
  
  val windingRule: WindingRule | NONE
}
object VectorPath {
  
  inline def apply(data: String, windingRule: WindingRule | NONE): VectorPath = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorPath]
  }
  
  extension [Self <: VectorPath](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setWindingRule(value: WindingRule | NONE): Self = StObject.set(x, "windingRule", value.asInstanceOf[js.Any])
  }
}
