package typingsJapgolly.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var _id: String | Double
  
  var stats: Created
}
object Id {
  
  inline def apply(_id: String | Double, stats: Created): Id = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setStats(value: Created): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def set_id(value: String | Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
