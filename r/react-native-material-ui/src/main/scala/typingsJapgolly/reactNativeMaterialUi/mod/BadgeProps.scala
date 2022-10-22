package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeMaterialUi.anon.StrokeContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeProps extends StObject {
  
  var accent: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Element] = js.undefined
  
  var icon: js.UndefOr[String | typingsJapgolly.reactNativeMaterialUi.anon.Color] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var stroke: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StrokeContainer] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object BadgeProps {
  
  inline def apply(): BadgeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeProps]
  }
  
  extension [Self <: BadgeProps](x: Self) {
    
    inline def setAccent(value: Boolean): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setIcon(value: String | typingsJapgolly.reactNativeMaterialUi.anon.Color): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStroke(value: Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStyle(value: StrokeContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
