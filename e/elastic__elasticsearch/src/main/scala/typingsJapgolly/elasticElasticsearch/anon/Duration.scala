package typingsJapgolly.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var expires_in: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var max_model_memory: js.UndefOr[String] = js.undefined
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setExpires_in(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
    
    inline def setMax_model_memory(value: String): Self = StObject.set(x, "max_model_memory", value.asInstanceOf[js.Any])
    
    inline def setMax_model_memoryUndefined: Self = StObject.set(x, "max_model_memory", js.undefined)
  }
}
