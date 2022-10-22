package typingsJapgolly.minecraftScriptingTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinecraftTrigger extends StObject {
  
  var event: String
  
  var filters: MinecraftFilter
  
  var target: String
}
object MinecraftTrigger {
  
  inline def apply(event: String, filters: MinecraftFilter, target: String): MinecraftTrigger = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinecraftTrigger]
  }
  
  extension [Self <: MinecraftTrigger](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: MinecraftFilter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
