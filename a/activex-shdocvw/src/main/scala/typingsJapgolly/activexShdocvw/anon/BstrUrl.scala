package typingsJapgolly.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BstrUrl extends StObject {
  
  var Cancel: Boolean
  
  val bstrUrl: String
  
  val bstrUrlContext: String
  
  val dwFlags: Double
  
  var ppDisp: Any
}
object BstrUrl {
  
  inline def apply(Cancel: Boolean, bstrUrl: String, bstrUrlContext: String, dwFlags: Double, ppDisp: Any): BstrUrl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], bstrUrl = bstrUrl.asInstanceOf[js.Any], bstrUrlContext = bstrUrlContext.asInstanceOf[js.Any], dwFlags = dwFlags.asInstanceOf[js.Any], ppDisp = ppDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrUrl]
  }
  
  extension [Self <: BstrUrl](x: Self) {
    
    inline def setBstrUrl(value: String): Self = StObject.set(x, "bstrUrl", value.asInstanceOf[js.Any])
    
    inline def setBstrUrlContext(value: String): Self = StObject.set(x, "bstrUrlContext", value.asInstanceOf[js.Any])
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setDwFlags(value: Double): Self = StObject.set(x, "dwFlags", value.asInstanceOf[js.Any])
    
    inline def setPpDisp(value: Any): Self = StObject.set(x, "ppDisp", value.asInstanceOf[js.Any])
  }
}
