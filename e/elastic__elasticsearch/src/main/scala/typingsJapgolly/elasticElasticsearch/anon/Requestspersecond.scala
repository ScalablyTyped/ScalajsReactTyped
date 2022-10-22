package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requestspersecond extends StObject {
  
  var requests_per_second: js.UndefOr[float] = js.undefined
  
  var timeout: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
}
object Requestspersecond {
  
  inline def apply(): Requestspersecond = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requestspersecond]
  }
  
  extension [Self <: Requestspersecond](x: Self) {
    
    inline def setRequests_per_second(value: float): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    inline def setRequests_per_secondUndefined: Self = StObject.set(x, "requests_per_second", js.undefined)
    
    inline def setTimeout(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
