package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameExpression
  extends StObject
     with Type_ {
  
  var name: String
  
  var `type`: typingsJapgolly.doctrine.doctrineStrings.NameExpression
}
object NameExpression {
  
  inline def apply(name: String): NameExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NameExpression")
    __obj.asInstanceOf[NameExpression]
  }
  
  extension [Self <: NameExpression](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.doctrine.doctrineStrings.NameExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
