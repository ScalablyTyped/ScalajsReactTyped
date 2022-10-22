package typingsJapgolly.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarConstructorOptions extends StObject {
  
  var escapeItem: js.UndefOr[
    TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer | Null
  ] = js.undefined
  
  var items: js.UndefOr[
    js.Array[
      TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer
    ]
  ] = js.undefined
}
object TouchBarConstructorOptions {
  
  inline def apply(): TouchBarConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarConstructorOptions]
  }
  
  extension [Self <: TouchBarConstructorOptions](x: Self) {
    
    inline def setEscapeItem(
      value: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer
    ): Self = StObject.set(x, "escapeItem", value.asInstanceOf[js.Any])
    
    inline def setEscapeItemNull: Self = StObject.set(x, "escapeItem", null)
    
    inline def setEscapeItemUndefined: Self = StObject.set(x, "escapeItem", js.undefined)
    
    inline def setItems(
      value: js.Array[
          TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(
      value: (TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer)*
    ): Self = StObject.set(x, "items", js.Array(value*))
  }
}
