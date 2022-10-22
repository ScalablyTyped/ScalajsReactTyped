package typingsJapgolly.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxAge extends StObject {
  
  /**
    * Specifies the number (in seconds) for the preview session to last for.
    * The given number will be converted to an integer by rounding down.
    * By default, no maximum age is set and the preview session finishes
    * when the client shuts down (browser is closed).
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the path for the preview session to work under. By default,
    * the path is considered the "default path", i.e., any pages under "/".
    */
  var path: js.UndefOr[String] = js.undefined
}
object MaxAge {
  
  inline def apply(): MaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxAge]
  }
  
  extension [Self <: MaxAge](x: Self) {
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
