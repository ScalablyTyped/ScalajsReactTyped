package typingsJapgolly.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracingOptions extends StObject {
  
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var screenshots: js.UndefOr[Boolean] = js.undefined
}
object TracingOptions {
  
  inline def apply(): TracingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingOptions]
  }
  
  extension [Self <: TracingOptions](x: Self) {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setScreenshots(value: Boolean): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    inline def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
  }
}
