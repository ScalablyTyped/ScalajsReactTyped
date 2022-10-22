package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceApp extends StObject {
  
  var sourceApp: js.UndefOr[String] = js.undefined
  
  var url: String
}
object SourceApp {
  
  inline def apply(url: String): SourceApp = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceApp]
  }
  
  extension [Self <: SourceApp](x: Self) {
    
    inline def setSourceApp(value: String): Self = StObject.set(x, "sourceApp", value.asInstanceOf[js.Any])
    
    inline def setSourceAppUndefined: Self = StObject.set(x, "sourceApp", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
