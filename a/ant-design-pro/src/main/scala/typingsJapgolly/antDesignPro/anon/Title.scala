package typingsJapgolly.antDesignPro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var href: js.UndefOr[String] = js.undefined
  
  var title: String | Double
}
object Title {
  
  inline def apply(title: String | Double): Title = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setTitle(value: String | Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
