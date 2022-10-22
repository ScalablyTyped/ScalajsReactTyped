package typingsJapgolly.yandexMaps.anon

import typingsJapgolly.yandexMaps.mod.IClassConstructor
import typingsJapgolly.yandexMaps.mod.ISelectableControlLayout
import typingsJapgolly.yandexMaps.yandexMapsStrings.left
import typingsJapgolly.yandexMaps.yandexMapsStrings.none
import typingsJapgolly.yandexMaps.yandexMapsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined yandex-maps.yandex-maps.control.IBaseButtonParametersOptions & {  collapseOnBlur :boolean | undefined,   expandOnClick :boolean | undefined,   popupFloat :'left' | 'right' | undefined} */
trait IBaseButtonParametersOptiAdjustMapMargin extends StObject {
  
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  
  var collapseOnBlur: js.UndefOr[Boolean] = js.undefined
  
  var expandOnClick: js.UndefOr[Boolean] = js.undefined
  
  var float: js.UndefOr[none | left | right] = js.undefined
  
  var floatIndex: js.UndefOr[Double] = js.undefined
  
  var layout: js.UndefOr[IClassConstructor[ISelectableControlLayout] | String] = js.undefined
  
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  
  var popupFloat: js.UndefOr[left | right] = js.undefined
  
  var position: js.UndefOr[Bottom] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IBaseButtonParametersOptiAdjustMapMargin {
  
  inline def apply(): IBaseButtonParametersOptiAdjustMapMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseButtonParametersOptiAdjustMapMargin]
  }
  
  extension [Self <: IBaseButtonParametersOptiAdjustMapMargin](x: Self) {
    
    inline def setAdjustMapMargin(value: Boolean): Self = StObject.set(x, "adjustMapMargin", value.asInstanceOf[js.Any])
    
    inline def setAdjustMapMarginUndefined: Self = StObject.set(x, "adjustMapMargin", js.undefined)
    
    inline def setCollapseOnBlur(value: Boolean): Self = StObject.set(x, "collapseOnBlur", value.asInstanceOf[js.Any])
    
    inline def setCollapseOnBlurUndefined: Self = StObject.set(x, "collapseOnBlur", js.undefined)
    
    inline def setExpandOnClick(value: Boolean): Self = StObject.set(x, "expandOnClick", value.asInstanceOf[js.Any])
    
    inline def setExpandOnClickUndefined: Self = StObject.set(x, "expandOnClick", js.undefined)
    
    inline def setFloat(value: none | left | right): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setFloatIndex(value: Double): Self = StObject.set(x, "floatIndex", value.asInstanceOf[js.Any])
    
    inline def setFloatIndexUndefined: Self = StObject.set(x, "floatIndex", js.undefined)
    
    inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    inline def setLayout(value: IClassConstructor[ISelectableControlLayout] | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxWidth(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMaxWidthVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "maxWidth", js.Array(value*))
    
    inline def setPopupFloat(value: left | right): Self = StObject.set(x, "popupFloat", value.asInstanceOf[js.Any])
    
    inline def setPopupFloatUndefined: Self = StObject.set(x, "popupFloat", js.undefined)
    
    inline def setPosition(value: Bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
