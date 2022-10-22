package typingsJapgolly.mjmlReact.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.csstype.mod.Property.Color
import typingsJapgolly.mjmlReact.mjmlReactStrings.hamburger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlNavbarProps extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var hamburger: js.UndefOr[typingsJapgolly.mjmlReact.mjmlReactStrings.hamburger] = js.undefined
  
  var icoAlign: js.UndefOr[String] = js.undefined
  
  var icoClose: js.UndefOr[String] = js.undefined
  
  var icoColor: js.UndefOr[Color] = js.undefined
  
  var icoFontSize: js.UndefOr[String] = js.undefined
  
  var icoLineHeight: js.UndefOr[String] = js.undefined
  
  var icoOpen: js.UndefOr[String] = js.undefined
  
  var icoPadding: js.UndefOr[String] = js.undefined
  
  var icoPaddingBottom: js.UndefOr[String] = js.undefined
  
  var icoPaddingLeft: js.UndefOr[String] = js.undefined
  
  var icoPaddingRight: js.UndefOr[String] = js.undefined
  
  var icoPaddingTop: js.UndefOr[String] = js.undefined
  
  var icoTextDecoration: js.UndefOr[String] = js.undefined
  
  var icoTextTransform: js.UndefOr[String] = js.undefined
}
object MjmlNavbarProps {
  
  inline def apply(): MjmlNavbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlNavbarProps]
  }
  
  extension [Self <: MjmlNavbarProps](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHamburger(value: hamburger): Self = StObject.set(x, "hamburger", value.asInstanceOf[js.Any])
    
    inline def setHamburgerUndefined: Self = StObject.set(x, "hamburger", js.undefined)
    
    inline def setIcoAlign(value: String): Self = StObject.set(x, "icoAlign", value.asInstanceOf[js.Any])
    
    inline def setIcoAlignUndefined: Self = StObject.set(x, "icoAlign", js.undefined)
    
    inline def setIcoClose(value: String): Self = StObject.set(x, "icoClose", value.asInstanceOf[js.Any])
    
    inline def setIcoCloseUndefined: Self = StObject.set(x, "icoClose", js.undefined)
    
    inline def setIcoColor(value: Color): Self = StObject.set(x, "icoColor", value.asInstanceOf[js.Any])
    
    inline def setIcoColorUndefined: Self = StObject.set(x, "icoColor", js.undefined)
    
    inline def setIcoFontSize(value: String): Self = StObject.set(x, "icoFontSize", value.asInstanceOf[js.Any])
    
    inline def setIcoFontSizeUndefined: Self = StObject.set(x, "icoFontSize", js.undefined)
    
    inline def setIcoLineHeight(value: String): Self = StObject.set(x, "icoLineHeight", value.asInstanceOf[js.Any])
    
    inline def setIcoLineHeightUndefined: Self = StObject.set(x, "icoLineHeight", js.undefined)
    
    inline def setIcoOpen(value: String): Self = StObject.set(x, "icoOpen", value.asInstanceOf[js.Any])
    
    inline def setIcoOpenUndefined: Self = StObject.set(x, "icoOpen", js.undefined)
    
    inline def setIcoPadding(value: String): Self = StObject.set(x, "icoPadding", value.asInstanceOf[js.Any])
    
    inline def setIcoPaddingBottom(value: String): Self = StObject.set(x, "icoPaddingBottom", value.asInstanceOf[js.Any])
    
    inline def setIcoPaddingBottomUndefined: Self = StObject.set(x, "icoPaddingBottom", js.undefined)
    
    inline def setIcoPaddingLeft(value: String): Self = StObject.set(x, "icoPaddingLeft", value.asInstanceOf[js.Any])
    
    inline def setIcoPaddingLeftUndefined: Self = StObject.set(x, "icoPaddingLeft", js.undefined)
    
    inline def setIcoPaddingRight(value: String): Self = StObject.set(x, "icoPaddingRight", value.asInstanceOf[js.Any])
    
    inline def setIcoPaddingRightUndefined: Self = StObject.set(x, "icoPaddingRight", js.undefined)
    
    inline def setIcoPaddingTop(value: String): Self = StObject.set(x, "icoPaddingTop", value.asInstanceOf[js.Any])
    
    inline def setIcoPaddingTopUndefined: Self = StObject.set(x, "icoPaddingTop", js.undefined)
    
    inline def setIcoPaddingUndefined: Self = StObject.set(x, "icoPadding", js.undefined)
    
    inline def setIcoTextDecoration(value: String): Self = StObject.set(x, "icoTextDecoration", value.asInstanceOf[js.Any])
    
    inline def setIcoTextDecorationUndefined: Self = StObject.set(x, "icoTextDecoration", js.undefined)
    
    inline def setIcoTextTransform(value: String): Self = StObject.set(x, "icoTextTransform", value.asInstanceOf[js.Any])
    
    inline def setIcoTextTransformUndefined: Self = StObject.set(x, "icoTextTransform", js.undefined)
  }
}
