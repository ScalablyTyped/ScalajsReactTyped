package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceServer extends StObject {
  
  /* standard dom */
  var credential: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.undefined
  
  /* standard dom */
  var urls: java.lang.String | js.Array[java.lang.String]
  
  /* standard dom */
  var username: js.UndefOr[java.lang.String] = js.undefined
}
object RTCIceServer {
  
  inline def apply(urls: java.lang.String | js.Array[java.lang.String]): RTCIceServer = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceServer]
  }
  
  extension [Self <: RTCIceServer](x: Self) {
    
    inline def setCredential(value: java.lang.String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialType(value: RTCIceCredentialType): Self = StObject.set(x, "credentialType", value.asInstanceOf[js.Any])
    
    inline def setCredentialTypeUndefined: Self = StObject.set(x, "credentialType", js.undefined)
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setUrls(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: java.lang.String*): Self = StObject.set(x, "urls", js.Array(value*))
    
    inline def setUsername(value: java.lang.String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
