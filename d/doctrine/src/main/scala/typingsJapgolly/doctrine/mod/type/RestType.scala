package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestType
  extends StObject
     with Type_ {
  
  var expression: js.UndefOr[Type_] = js.undefined
  
  var `type`: typingsJapgolly.doctrine.doctrineStrings.RestType
}
object RestType {
  
  inline def apply(): RestType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RestType")
    __obj.asInstanceOf[RestType]
  }
  
  extension [Self <: RestType](x: Self) {
    
    inline def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setType(value: typingsJapgolly.doctrine.doctrineStrings.RestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
