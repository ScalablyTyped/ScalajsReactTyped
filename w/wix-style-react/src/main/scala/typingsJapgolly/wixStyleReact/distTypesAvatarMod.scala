package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.A1
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.A2
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.A3
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.A4
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.A5
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.A6
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.busy
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.offline
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.online
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.size18
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.size24
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.size30
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.size36
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.size48
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.size60
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.size72
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.size90
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/Avatar", JSImport.Default)
  @js.native
  val default: FC[AvatarProps] = js.native
  
  trait AvatarProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[A1 | A2 | A3 | A4 | A5 | A6] = js.undefined
    
    var customIndication: js.UndefOr[Node] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var imgProps: js.UndefOr[ImgHTMLAttributes[HTMLImageElement]] = js.undefined
    
    var indication: js.UndefOr[Node] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onIndicationClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placeholder: js.UndefOr[Node] = js.undefined
    
    var presence: js.UndefOr[online | offline | busy] = js.undefined
    
    var shape: js.UndefOr[circle | square] = js.undefined
    
    var showIndicationOnHover: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[size90 | size72 | size60 | size48 | size36 | size30 | size24 | size18] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object AvatarProps {
    
    inline def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    extension [Self <: AvatarProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: A1 | A2 | A3 | A4 | A5 | A6): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCustomIndication(value: VdomNode): Self = StObject.set(x, "customIndication", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCustomIndicationNull: Self = StObject.set(x, "customIndication", null)
      
      inline def setCustomIndicationUndefined: Self = StObject.set(x, "customIndication", js.undefined)
      
      inline def setCustomIndicationVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "customIndication", js.Array(value*))
      
      inline def setCustomIndicationVdomElement(value: VdomElement): Self = StObject.set(x, "customIndication", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setImgProps(value: ImgHTMLAttributes[HTMLImageElement]): Self = StObject.set(x, "imgProps", value.asInstanceOf[js.Any])
      
      inline def setImgPropsUndefined: Self = StObject.set(x, "imgProps", js.undefined)
      
      inline def setIndication(value: VdomNode): Self = StObject.set(x, "indication", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIndicationNull: Self = StObject.set(x, "indication", null)
      
      inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
      
      inline def setIndicationVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "indication", js.Array(value*))
      
      inline def setIndicationVdomElement(value: VdomElement): Self = StObject.set(x, "indication", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnIndicationClick(value: Callback): Self = StObject.set(x, "onIndicationClick", value.toJsFn)
      
      inline def setOnIndicationClickUndefined: Self = StObject.set(x, "onIndicationClick", js.undefined)
      
      inline def setPlaceholder(value: VdomNode): Self = StObject.set(x, "placeholder", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setPlaceholderVdomElement(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPresence(value: online | offline | busy): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
      
      inline def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
      
      inline def setShape(value: circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShowIndicationOnHover(value: Boolean): Self = StObject.set(x, "showIndicationOnHover", value.asInstanceOf[js.Any])
      
      inline def setShowIndicationOnHoverUndefined: Self = StObject.set(x, "showIndicationOnHover", js.undefined)
      
      inline def setSize(value: size90 | size72 | size60 | size48 | size36 | size30 | size24 | size18): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FC[AvatarProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesAvatarMod.foo` */
  override def _to: FC[AvatarProps] = default
}
