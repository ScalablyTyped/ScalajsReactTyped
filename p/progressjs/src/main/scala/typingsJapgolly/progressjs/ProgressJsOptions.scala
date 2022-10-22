package typingsJapgolly.progressjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressJsOptions extends StObject {
  
  /**
    * to consider CSS3 transitions in events
    */
  var considerTransition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * overlay mode makes an overlay layer in the target element
    */
  var overlayMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * progress bar theme
    */
  var theme: js.UndefOr[String] = js.undefined
}
object ProgressJsOptions {
  
  inline def apply(): ProgressJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressJsOptions]
  }
  
  extension [Self <: ProgressJsOptions](x: Self) {
    
    inline def setConsiderTransition(value: Boolean): Self = StObject.set(x, "considerTransition", value.asInstanceOf[js.Any])
    
    inline def setConsiderTransitionUndefined: Self = StObject.set(x, "considerTransition", js.undefined)
    
    inline def setOverlayMode(value: Boolean): Self = StObject.set(x, "overlayMode", value.asInstanceOf[js.Any])
    
    inline def setOverlayModeUndefined: Self = StObject.set(x, "overlayMode", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
