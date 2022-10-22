package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapClass extends StObject {
  
  /**
    * Output source maps used for error reporting tools.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output source maps for all scripts.
    */
  var scripts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output source maps for all styles.
    */
  var styles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Resolve vendor packages source maps.
    */
  var vendor: js.UndefOr[Boolean] = js.undefined
}
object SourceMapClass {
  
  inline def apply(): SourceMapClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMapClass]
  }
  
  extension [Self <: SourceMapClass](x: Self) {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setStyles(value: Boolean): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setVendor(value: Boolean): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
