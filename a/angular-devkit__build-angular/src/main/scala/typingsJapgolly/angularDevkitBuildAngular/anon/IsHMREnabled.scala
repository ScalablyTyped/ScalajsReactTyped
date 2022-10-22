package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.ScriptElement
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.StyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHMREnabled extends StObject {
  
  var isHMREnabled: js.UndefOr[Boolean] = js.undefined
  
  var scripts: js.Array[ScriptElement]
  
  var styles: js.Array[StyleElement]
}
object IsHMREnabled {
  
  inline def apply(scripts: js.Array[ScriptElement], styles: js.Array[StyleElement]): IsHMREnabled = {
    val __obj = js.Dynamic.literal(scripts = scripts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHMREnabled]
  }
  
  extension [Self <: IsHMREnabled](x: Self) {
    
    inline def setIsHMREnabled(value: Boolean): Self = StObject.set(x, "isHMREnabled", value.asInstanceOf[js.Any])
    
    inline def setIsHMREnabledUndefined: Self = StObject.set(x, "isHMREnabled", js.undefined)
    
    inline def setScripts(value: js.Array[ScriptElement]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsVarargs(value: ScriptElement*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setStyles(value: js.Array[StyleElement]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: StyleElement*): Self = StObject.set(x, "styles", js.Array(value*))
  }
}
