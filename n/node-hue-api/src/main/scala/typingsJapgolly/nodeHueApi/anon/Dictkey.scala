package typingsJapgolly.nodeHueApi.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Double | String] {
  
  var lastupdated: String
}
object Dictkey {
  
  inline def apply(lastupdated: String): Dictkey = {
    val __obj = js.Dynamic.literal(lastupdated = lastupdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setLastupdated(value: String): Self = StObject.set(x, "lastupdated", value.asInstanceOf[js.Any])
  }
}
