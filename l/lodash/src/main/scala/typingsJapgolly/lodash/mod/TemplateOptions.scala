package typingsJapgolly.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateOptions
  extends StObject
     with TemplateSettings {
  
  /**
    * @see _.sourceURL
    */
  var sourceURL: js.UndefOr[java.lang.String] = js.undefined
}
object TemplateOptions {
  
  inline def apply(): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions]
  }
  
  extension [Self <: TemplateOptions](x: Self) {
    
    inline def setSourceURL(value: java.lang.String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    inline def setSourceURLUndefined: Self = StObject.set(x, "sourceURL", js.undefined)
  }
}
