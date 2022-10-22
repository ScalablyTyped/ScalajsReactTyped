package typingsJapgolly.dockerode.mod

import org.scalajs.dom.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventsOptions extends StObject {
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  
  var filters: js.UndefOr[String | typingsJapgolly.dockerode.anon.Config] = js.undefined
  
  var since: js.UndefOr[Double] = js.undefined
  
  var until: js.UndefOr[Double] = js.undefined
}
object GetEventsOptions {
  
  inline def apply(): GetEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventsOptions]
  }
  
  extension [Self <: GetEventsOptions](x: Self) {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setFilters(value: String | typingsJapgolly.dockerode.anon.Config): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    
    inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
  }
}
