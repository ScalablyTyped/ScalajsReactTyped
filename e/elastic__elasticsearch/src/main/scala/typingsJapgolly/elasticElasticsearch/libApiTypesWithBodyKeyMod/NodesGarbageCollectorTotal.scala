package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesGarbageCollectorTotal extends StObject {
  
  var collection_count: js.UndefOr[long] = js.undefined
  
  var collection_time: js.UndefOr[String] = js.undefined
  
  var collection_time_in_millis: js.UndefOr[long] = js.undefined
}
object NodesGarbageCollectorTotal {
  
  inline def apply(): NodesGarbageCollectorTotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesGarbageCollectorTotal]
  }
  
  extension [Self <: NodesGarbageCollectorTotal](x: Self) {
    
    inline def setCollection_count(value: long): Self = StObject.set(x, "collection_count", value.asInstanceOf[js.Any])
    
    inline def setCollection_countUndefined: Self = StObject.set(x, "collection_count", js.undefined)
    
    inline def setCollection_time(value: String): Self = StObject.set(x, "collection_time", value.asInstanceOf[js.Any])
    
    inline def setCollection_timeUndefined: Self = StObject.set(x, "collection_time", js.undefined)
    
    inline def setCollection_time_in_millis(value: long): Self = StObject.set(x, "collection_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setCollection_time_in_millisUndefined: Self = StObject.set(x, "collection_time_in_millis", js.undefined)
  }
}
