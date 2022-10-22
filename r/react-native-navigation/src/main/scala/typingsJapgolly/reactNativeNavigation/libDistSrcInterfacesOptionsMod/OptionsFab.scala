package typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNativeNavigation.reactNativeNavigationStrings.left
import typingsJapgolly.reactNativeNavigation.reactNativeNavigationStrings.mini
import typingsJapgolly.reactNativeNavigation.reactNativeNavigationStrings.regular
import typingsJapgolly.reactNativeNavigation.reactNativeNavigationStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsFab extends StObject {
  
  var alignHorizontally: js.UndefOr[left | right] = js.undefined
  
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  var clickColor: js.UndefOr[Color] = js.undefined
  
  var hideOnScroll: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[ImageResource] = js.undefined
  
  var iconColor: js.UndefOr[Color] = js.undefined
  
  var id: String
  
  var rippleColor: js.UndefOr[Color] = js.undefined
  
  var size: js.UndefOr[mini | regular] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object OptionsFab {
  
  inline def apply(id: String): OptionsFab = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsFab]
  }
  
  extension [Self <: OptionsFab](x: Self) {
    
    inline def setAlignHorizontally(value: left | right): Self = StObject.set(x, "alignHorizontally", value.asInstanceOf[js.Any])
    
    inline def setAlignHorizontallyUndefined: Self = StObject.set(x, "alignHorizontally", js.undefined)
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setClickColor(value: Color): Self = StObject.set(x, "clickColor", value.asInstanceOf[js.Any])
    
    inline def setClickColorNull: Self = StObject.set(x, "clickColor", null)
    
    inline def setClickColorUndefined: Self = StObject.set(x, "clickColor", js.undefined)
    
    inline def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
    
    inline def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
    
    inline def setIcon(value: ImageResource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconColor(value: Color): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorNull: Self = StObject.set(x, "iconColor", null)
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRippleColor(value: Color): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    inline def setRippleColorNull: Self = StObject.set(x, "rippleColor", null)
    
    inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    inline def setSize(value: mini | regular): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
