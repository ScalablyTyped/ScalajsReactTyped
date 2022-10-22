package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizationClass extends StObject {
  
  /**
    * Enables optimization for fonts. This option requires internet access. `HTTPS_PROXY`
    * environment variable can be used to specify a proxy server.
    */
  var fonts: js.UndefOr[FontsUnion] = js.undefined
  
  /**
    * Enables optimization of the scripts output.
    */
  var scripts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables optimization of the styles output.
    */
  var styles: js.UndefOr[StylesUnion] = js.undefined
}
object OptimizationClass {
  
  inline def apply(): OptimizationClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizationClass]
  }
  
  extension [Self <: OptimizationClass](x: Self) {
    
    inline def setFonts(value: FontsUnion): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setStyles(value: StylesUnion): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
