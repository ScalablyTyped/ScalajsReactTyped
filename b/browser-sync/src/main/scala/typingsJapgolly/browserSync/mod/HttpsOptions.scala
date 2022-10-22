package typingsJapgolly.browserSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpsOptions extends StObject {
  
  var cert: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
}
object HttpsOptions {
  
  inline def apply(): HttpsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpsOptions]
  }
  
  extension [Self <: HttpsOptions](x: Self) {
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
