package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StylesClass extends StObject {
  
  /**
    * Extract and inline critical CSS definitions to improve first paint time.
    */
  var inlineCritical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Minify CSS definitions by removing extraneous whitespace and comments, merging
    * identifiers and minimizing values.
    */
  var minify: js.UndefOr[Boolean] = js.undefined
}
object StylesClass {
  
  inline def apply(): StylesClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylesClass]
  }
  
  extension [Self <: StylesClass](x: Self) {
    
    inline def setInlineCritical(value: Boolean): Self = StObject.set(x, "inlineCritical", value.asInstanceOf[js.Any])
    
    inline def setInlineCriticalUndefined: Self = StObject.set(x, "inlineCritical", js.undefined)
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
  }
}
