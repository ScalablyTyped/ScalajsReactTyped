package typingsJapgolly.redisSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: Double | String
  
  var size: Double | String
}
object From {
  
  inline def apply(from: Double | String, size: Double | String): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
