package typingsJapgolly.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareControlOptions
  extends StObject
     with ControlOptions {
  
  var url: js.UndefOr[String] = js.undefined
}
object ShareControlOptions {
  
  inline def apply(): ShareControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareControlOptions]
  }
  
  extension [Self <: ShareControlOptions](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
