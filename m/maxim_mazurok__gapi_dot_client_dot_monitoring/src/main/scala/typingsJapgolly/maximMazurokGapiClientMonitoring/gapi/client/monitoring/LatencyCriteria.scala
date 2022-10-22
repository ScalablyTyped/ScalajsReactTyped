package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatencyCriteria extends StObject {
  
  /** Good service is defined to be the count of requests made to this service that return in no more than threshold. */
  var threshold: js.UndefOr[String] = js.undefined
}
object LatencyCriteria {
  
  inline def apply(): LatencyCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatencyCriteria]
  }
  
  extension [Self <: LatencyCriteria](x: Self) {
    
    inline def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
