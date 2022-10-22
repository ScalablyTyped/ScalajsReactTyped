package typingsJapgolly.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptionsAccessEntityObject
  extends StObject
     with _RouteOptionsAccessObject {
  
  var entity: AccessEntity
}
object RouteOptionsAccessEntityObject {
  
  inline def apply(entity: AccessEntity): RouteOptionsAccessEntityObject = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsAccessEntityObject]
  }
  
  extension [Self <: RouteOptionsAccessEntityObject](x: Self) {
    
    inline def setEntity(value: AccessEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
  }
}
