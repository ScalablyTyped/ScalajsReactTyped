package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancreaterepository extends StObject {
  
  var can_create_repository: Boolean
}
object Cancreaterepository {
  
  inline def apply(can_create_repository: Boolean): Cancreaterepository = {
    val __obj = js.Dynamic.literal(can_create_repository = can_create_repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancreaterepository]
  }
  
  extension [Self <: Cancreaterepository](x: Self) {
    
    inline def setCan_create_repository(value: Boolean): Self = StObject.set(x, "can_create_repository", value.asInstanceOf[js.Any])
  }
}
