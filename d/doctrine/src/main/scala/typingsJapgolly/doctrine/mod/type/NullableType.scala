package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableType
  extends StObject
     with Type_ {
  
  var expression: Type_
  
  var prefix: Boolean
  
  var `type`: typingsJapgolly.doctrine.doctrineStrings.NullableType
}
object NullableType {
  
  inline def apply(expression: Type_, prefix: Boolean): NullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableType")
    __obj.asInstanceOf[NullableType]
  }
  
  extension [Self <: NullableType](x: Self) {
    
    inline def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.doctrine.doctrineStrings.NullableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
