package typingsJapgolly.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityTypeName extends StObject {
  
  var entityTypeName: String
}
object EntityTypeName {
  
  inline def apply(entityTypeName: String): EntityTypeName = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityTypeName]
  }
  
  extension [Self <: EntityTypeName](x: Self) {
    
    inline def setEntityTypeName(value: String): Self = StObject.set(x, "entityTypeName", value.asInstanceOf[js.Any])
  }
}
