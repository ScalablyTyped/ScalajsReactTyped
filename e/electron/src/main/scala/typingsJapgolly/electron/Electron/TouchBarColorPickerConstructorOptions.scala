package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarColorPickerConstructorOptions extends StObject {
  
  /**
    * Array of hex color strings to appear as possible colors to select.
    */
  var availableColors: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Function to call when a color is selected.
    */
  var change: js.UndefOr[js.Function1[/* color */ String, Unit]] = js.undefined
  
  /**
    * The selected hex color in the picker, i.e `#ABCDEF`.
    */
  var selectedColor: js.UndefOr[String] = js.undefined
}
object TouchBarColorPickerConstructorOptions {
  
  inline def apply(): TouchBarColorPickerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarColorPickerConstructorOptions]
  }
  
  extension [Self <: TouchBarColorPickerConstructorOptions](x: Self) {
    
    inline def setAvailableColors(value: js.Array[String]): Self = StObject.set(x, "availableColors", value.asInstanceOf[js.Any])
    
    inline def setAvailableColorsUndefined: Self = StObject.set(x, "availableColors", js.undefined)
    
    inline def setAvailableColorsVarargs(value: String*): Self = StObject.set(x, "availableColors", js.Array(value*))
    
    inline def setChange(value: /* color */ String => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* color */ String) => value(t0).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
  }
}
