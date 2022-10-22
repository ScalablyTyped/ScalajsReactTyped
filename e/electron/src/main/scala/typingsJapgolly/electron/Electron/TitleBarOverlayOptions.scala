package typingsJapgolly.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleBarOverlayOptions extends StObject {
  
  /**
    * The CSS color of the Window Controls Overlay when enabled.
    *
    * @platform win32
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The height of the title bar and Window Controls Overlay in pixels.
    *
    * @platform win32
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The CSS color of the symbols on the Window Controls Overlay when enabled.
    *
    * @platform win32
    */
  var symbolColor: js.UndefOr[String] = js.undefined
}
object TitleBarOverlayOptions {
  
  inline def apply(): TitleBarOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleBarOverlayOptions]
  }
  
  extension [Self <: TitleBarOverlayOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSymbolColor(value: String): Self = StObject.set(x, "symbolColor", value.asInstanceOf[js.Any])
    
    inline def setSymbolColorUndefined: Self = StObject.set(x, "symbolColor", js.undefined)
  }
}
