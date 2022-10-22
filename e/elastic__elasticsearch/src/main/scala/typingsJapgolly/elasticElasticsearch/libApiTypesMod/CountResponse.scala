package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountResponse extends StObject {
  
  var _shards: ShardStatistics
  
  var count: long
}
object CountResponse {
  
  inline def apply(_shards: ShardStatistics, count: long): CountResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountResponse]
  }
  
  extension [Self <: CountResponse](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
