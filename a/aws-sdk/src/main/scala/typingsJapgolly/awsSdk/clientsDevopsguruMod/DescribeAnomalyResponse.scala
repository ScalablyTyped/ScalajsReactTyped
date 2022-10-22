package typingsJapgolly.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnomalyResponse extends StObject {
  
  /**
    *  A ProactiveAnomaly object that represents the requested anomaly. 
    */
  var ProactiveAnomaly: js.UndefOr[typingsJapgolly.awsSdk.clientsDevopsguruMod.ProactiveAnomaly] = js.undefined
  
  /**
    *  A ReactiveAnomaly object that represents the requested anomaly. 
    */
  var ReactiveAnomaly: js.UndefOr[typingsJapgolly.awsSdk.clientsDevopsguruMod.ReactiveAnomaly] = js.undefined
}
object DescribeAnomalyResponse {
  
  inline def apply(): DescribeAnomalyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAnomalyResponse]
  }
  
  extension [Self <: DescribeAnomalyResponse](x: Self) {
    
    inline def setProactiveAnomaly(value: ProactiveAnomaly): Self = StObject.set(x, "ProactiveAnomaly", value.asInstanceOf[js.Any])
    
    inline def setProactiveAnomalyUndefined: Self = StObject.set(x, "ProactiveAnomaly", js.undefined)
    
    inline def setReactiveAnomaly(value: ReactiveAnomaly): Self = StObject.set(x, "ReactiveAnomaly", value.asInstanceOf[js.Any])
    
    inline def setReactiveAnomalyUndefined: Self = StObject.set(x, "ReactiveAnomaly", js.undefined)
  }
}
