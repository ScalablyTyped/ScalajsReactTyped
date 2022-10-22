package typingsJapgolly.next.anon

import typingsJapgolly.next.distServerWebNextUrlMod.NextURL
import typingsJapgolly.next.distServerWebSpecExtensionCookiesMod.NextCookies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookies extends StObject {
  
  var cookies: NextCookies
  
  var geo: js.UndefOr[City] = js.undefined
  
  var ip: js.UndefOr[String] = js.undefined
  
  var url: NextURL
}
object Cookies {
  
  inline def apply(cookies: NextCookies, url: NextURL): Cookies = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookies]
  }
  
  extension [Self <: Cookies](x: Self) {
    
    inline def setCookies(value: NextCookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setGeo(value: City): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setUrl(value: NextURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
