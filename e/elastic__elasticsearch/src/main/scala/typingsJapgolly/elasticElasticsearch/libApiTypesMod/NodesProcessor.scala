package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesProcessor extends StObject {
  
  var count: js.UndefOr[long] = js.undefined
  
  var current: js.UndefOr[long] = js.undefined
  
  var failed: js.UndefOr[long] = js.undefined
  
  var time_in_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
}
object NodesProcessor {
  
  inline def apply(): NodesProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesProcessor]
  }
  
  extension [Self <: NodesProcessor](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCurrent(value: long): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setFailed(value: long): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setTime_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTime_in_millisUndefined: Self = StObject.set(x, "time_in_millis", js.undefined)
  }
}
