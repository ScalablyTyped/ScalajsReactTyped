package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRequestOptions extends StObject {
  
  var proxy: js.UndefOr[String] = js.undefined
  
  var ssl: js.UndefOr[SSLConfig] = js.undefined
}
object CreateRequestOptions {
  
  inline def apply(): CreateRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRequestOptions]
  }
  
  extension [Self <: CreateRequestOptions](x: Self) {
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setSsl(value: SSLConfig): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
  }
}
