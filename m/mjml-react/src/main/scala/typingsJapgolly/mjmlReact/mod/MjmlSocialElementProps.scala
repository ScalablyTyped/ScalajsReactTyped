package typingsJapgolly.mjmlReact.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.csstype.mod.Property.Color
import typingsJapgolly.mjmlReact.mjmlReactStrings.`facebook-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`google-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`linkedin-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`pinterest-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`tumblr-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`twitter-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`xing-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.dribbble
import typingsJapgolly.mjmlReact.mjmlReactStrings.facebook
import typingsJapgolly.mjmlReact.mjmlReactStrings.github
import typingsJapgolly.mjmlReact.mjmlReactStrings.google
import typingsJapgolly.mjmlReact.mjmlReactStrings.horizontal
import typingsJapgolly.mjmlReact.mjmlReactStrings.instagram
import typingsJapgolly.mjmlReact.mjmlReactStrings.linkedin
import typingsJapgolly.mjmlReact.mjmlReactStrings.ltr
import typingsJapgolly.mjmlReact.mjmlReactStrings.medium
import typingsJapgolly.mjmlReact.mjmlReactStrings.pinterest
import typingsJapgolly.mjmlReact.mjmlReactStrings.rtl
import typingsJapgolly.mjmlReact.mjmlReactStrings.snapchat
import typingsJapgolly.mjmlReact.mjmlReactStrings.soundcloud
import typingsJapgolly.mjmlReact.mjmlReactStrings.tumblr
import typingsJapgolly.mjmlReact.mjmlReactStrings.twitter
import typingsJapgolly.mjmlReact.mjmlReactStrings.vertical
import typingsJapgolly.mjmlReact.mjmlReactStrings.vimeo
import typingsJapgolly.mjmlReact.mjmlReactStrings.web
import typingsJapgolly.mjmlReact.mjmlReactStrings.xing
import typingsJapgolly.mjmlReact.mjmlReactStrings.youtube
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlSocialElementProps extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var alt: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var color: js.UndefOr[Color] = js.undefined
  
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[String | Double] = js.undefined
  
  var iconHeight: js.UndefOr[String] = js.undefined
  
  var iconPadding: js.UndefOr[String] = js.undefined
  
  var iconSize: js.UndefOr[String] = js.undefined
  
  var lineHeight: js.UndefOr[String | Double] = js.undefined
  
  var mode: js.UndefOr[vertical | horizontal] = js.undefined
  
  var name: js.UndefOr[
    facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
  ] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var textDecoration: js.UndefOr[String] = js.undefined
}
object MjmlSocialElementProps {
  
  inline def apply(): MjmlSocialElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlSocialElementProps]
  }
  
  extension [Self <: MjmlSocialElementProps](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: String | Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setIconHeight(value: String): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    inline def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    inline def setIconPadding(value: String): Self = StObject.set(x, "iconPadding", value.asInstanceOf[js.Any])
    
    inline def setIconPaddingUndefined: Self = StObject.set(x, "iconPadding", js.undefined)
    
    inline def setIconSize(value: String): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setLineHeight(value: String | Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setMode(value: vertical | horizontal): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(
      value: facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
