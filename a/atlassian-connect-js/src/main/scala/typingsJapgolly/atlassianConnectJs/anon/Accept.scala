package typingsJapgolly.atlassianConnectJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accept extends StObject {
  
  var Accept: String
  
  var `If-Match`: String
  
  var `If-None-Match`: String
}
object Accept {
  
  inline def apply(Accept: String, `If-Match`: String, `If-None-Match`: String): Accept = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any])
    __obj.updateDynamic("If-Match")(`If-Match`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-None-Match")(`If-None-Match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  
  extension [Self <: Accept](x: Self) {
    
    inline def setAccept(value: String): Self = StObject.set(x, "Accept", value.asInstanceOf[js.Any])
    
    inline def `setIf-Match`(value: String): Self = StObject.set(x, "If-Match", value.asInstanceOf[js.Any])
    
    inline def `setIf-None-Match`(value: String): Self = StObject.set(x, "If-None-Match", value.asInstanceOf[js.Any])
  }
}
