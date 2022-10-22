package typingsJapgolly.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricWindow extends StObject {
  
  /**
    * The tumbling time interval window.
    */
  var tumbling: js.UndefOr[TumblingWindow] = js.undefined
}
object MetricWindow {
  
  inline def apply(): MetricWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricWindow]
  }
  
  extension [Self <: MetricWindow](x: Self) {
    
    inline def setTumbling(value: TumblingWindow): Self = StObject.set(x, "tumbling", value.asInstanceOf[js.Any])
    
    inline def setTumblingUndefined: Self = StObject.set(x, "tumbling", js.undefined)
  }
}
