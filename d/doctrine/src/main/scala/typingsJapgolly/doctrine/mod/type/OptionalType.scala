package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalType
  extends StObject
     with Type_ {
  
  var expression: Type_
  
  var `type`: typingsJapgolly.doctrine.doctrineStrings.OptionalType
}
object OptionalType {
  
  inline def apply(expression: Type_): OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalType")
    __obj.asInstanceOf[OptionalType]
  }
  
  extension [Self <: OptionalType](x: Self) {
    
    inline def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.doctrine.doctrineStrings.OptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
