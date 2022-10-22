package typingsJapgolly.mjmlReact.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.csstype.mod.Property.Border
import typingsJapgolly.csstype.mod.Property.BorderRadius
import typingsJapgolly.mjmlReact.mjmlReactStrings.hidden
import typingsJapgolly.mjmlReact.mjmlReactStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlCarouselProps extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var iconWidth: js.UndefOr[String] = js.undefined
  
  var leftIcon: js.UndefOr[String] = js.undefined
  
  var rightIcon: js.UndefOr[String] = js.undefined
  
  var tbBorder: js.UndefOr[Border[String | Double]] = js.undefined
  
  var tbBorderRadius: js.UndefOr[BorderRadius[String | Double]] = js.undefined
  
  var tbHoverBorderColor: js.UndefOr[String] = js.undefined
  
  var tbSelectedBorderColor: js.UndefOr[String] = js.undefined
  
  var tbWidth: js.UndefOr[String] = js.undefined
  
  var thumbnails: js.UndefOr[hidden | visible] = js.undefined
}
object MjmlCarouselProps {
  
  inline def apply(): MjmlCarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlCarouselProps]
  }
  
  extension [Self <: MjmlCarouselProps](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIconWidth(value: String): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    inline def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
    
    inline def setLeftIcon(value: String): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    inline def setRightIcon(value: String): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    
    inline def setTbBorder(value: Border[String | Double]): Self = StObject.set(x, "tbBorder", value.asInstanceOf[js.Any])
    
    inline def setTbBorderRadius(value: BorderRadius[String | Double]): Self = StObject.set(x, "tbBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setTbBorderRadiusUndefined: Self = StObject.set(x, "tbBorderRadius", js.undefined)
    
    inline def setTbBorderUndefined: Self = StObject.set(x, "tbBorder", js.undefined)
    
    inline def setTbHoverBorderColor(value: String): Self = StObject.set(x, "tbHoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setTbHoverBorderColorUndefined: Self = StObject.set(x, "tbHoverBorderColor", js.undefined)
    
    inline def setTbSelectedBorderColor(value: String): Self = StObject.set(x, "tbSelectedBorderColor", value.asInstanceOf[js.Any])
    
    inline def setTbSelectedBorderColorUndefined: Self = StObject.set(x, "tbSelectedBorderColor", js.undefined)
    
    inline def setTbWidth(value: String): Self = StObject.set(x, "tbWidth", value.asInstanceOf[js.Any])
    
    inline def setTbWidthUndefined: Self = StObject.set(x, "tbWidth", js.undefined)
    
    inline def setThumbnails(value: hidden | visible): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
  }
}
