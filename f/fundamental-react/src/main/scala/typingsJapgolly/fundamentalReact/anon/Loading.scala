package typingsJapgolly.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loading extends StObject {
  
  var loading: js.UndefOr[String] = js.undefined
}
object Loading {
  
  inline def apply(): Loading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loading]
  }
  
  extension [Self <: Loading](x: Self) {
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
