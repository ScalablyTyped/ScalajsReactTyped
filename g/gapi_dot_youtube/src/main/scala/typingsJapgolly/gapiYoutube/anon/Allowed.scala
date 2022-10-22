package typingsJapgolly.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowed extends StObject {
  
  /**
    * A list of region codes that identify countries where the video is viewable. If this property is present and a country is not listed in its value, then the video is blocked from appearing in that country. If this property is present and contains an empty list, the video is blocked in all countries.
    */
  var allowed: js.Array[String]
  
  /**
    * A list of region codes that identify countries where the video is blocked. If this property is present and a country is not listed in its value, then the video is viewable in that country. If this property is present and contains an empty list, the video is viewable in all countries.
    */
  var blocked: js.Array[String]
}
object Allowed {
  
  inline def apply(allowed: js.Array[String], blocked: js.Array[String]): Allowed = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowed]
  }
  
  extension [Self <: Allowed](x: Self) {
    
    inline def setAllowed(value: js.Array[String]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setAllowedVarargs(value: String*): Self = StObject.set(x, "allowed", js.Array(value*))
    
    inline def setBlocked(value: js.Array[String]): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedVarargs(value: String*): Self = StObject.set(x, "blocked", js.Array(value*))
  }
}
