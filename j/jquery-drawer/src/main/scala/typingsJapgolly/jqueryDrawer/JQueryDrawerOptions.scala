package typingsJapgolly.jqueryDrawer

import typingsJapgolly.iscroll.IScrollOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryDrawerOptions extends StObject {
  
  var `class`: js.UndefOr[JQueryDrawerClassOptions] = js.undefined
  
  var iscroll: js.UndefOr[IScrollOptions] = js.undefined
  
  var showOverlay: js.UndefOr[Boolean] = js.undefined
}
object JQueryDrawerOptions {
  
  inline def apply(): JQueryDrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryDrawerOptions]
  }
  
  extension [Self <: JQueryDrawerOptions](x: Self) {
    
    inline def setClass(value: JQueryDrawerClassOptions): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setIscroll(value: IScrollOptions): Self = StObject.set(x, "iscroll", value.asInstanceOf[js.Any])
    
    inline def setIscrollUndefined: Self = StObject.set(x, "iscroll", js.undefined)
    
    inline def setShowOverlay(value: Boolean): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
    
    inline def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
  }
}
