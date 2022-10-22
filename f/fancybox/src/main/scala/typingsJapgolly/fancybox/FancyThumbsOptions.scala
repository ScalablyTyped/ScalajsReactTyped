package typingsJapgolly.fancybox

import typingsJapgolly.fancybox.fancyboxStrings.x
import typingsJapgolly.fancybox.fancyboxStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyThumbsOptions extends StObject {
  
  /**
    * Display thumbnails on opening
    */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vertical (y) or horizontal (x) scrolling
    */
  var axis: js.UndefOr[x | y] = js.undefined
  
  /**
    * Hide thumbnail grid when closing animation starts
    */
  var hideOnClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[String] = js.undefined
}
object FancyThumbsOptions {
  
  inline def apply(): FancyThumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyThumbsOptions]
  }
  
  extension [Self <: FancyThumbsOptions](x: Self) {
    
    inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    inline def setAxis(value: typingsJapgolly.fancybox.fancyboxStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setHideOnClose(value: Boolean): Self = StObject.set(x, "hideOnClose", value.asInstanceOf[js.Any])
    
    inline def setHideOnCloseUndefined: Self = StObject.set(x, "hideOnClose", js.undefined)
    
    inline def setParentEl(value: String): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
    
    inline def setParentElUndefined: Self = StObject.set(x, "parentEl", js.undefined)
  }
}
