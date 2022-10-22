package typingsJapgolly.azureSb.mod.Azure.ServiceBus.Results.Models

import typingsJapgolly.azureSb.anon.Author
import typingsJapgolly.azureSb.mod.Azure.ServiceBus.DateString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  var CreatedAt: DateString
  
  @JSName("_")
  var _underscore: Author
}
object Base {
  
  inline def apply(CreatedAt: DateString, _underscore: Author): Base = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  extension [Self <: Base](x: Self) {
    
    inline def setCreatedAt(value: DateString): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def set_underscore(value: Author): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
