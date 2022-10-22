package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.wixStyleReact.distTypesAvatarMod.AvatarProps
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

object Avatar {
  
  @JSImport("wix-style-react", "Avatar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: A1 | A2 | A3 | A4 | A5 | A6): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def customIndication(value: VdomNode): this.type = set("customIndication", value.rawNode.asInstanceOf[js.Any])
    
    inline def customIndicationNull: this.type = set("customIndication", null)
    
    inline def customIndicationVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("customIndication", js.Array(value*))
    
    inline def customIndicationVdomElement(value: VdomElement): this.type = set("customIndication", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def imgProps(value: ImgHTMLAttributes[HTMLImageElement]): this.type = set("imgProps", value.asInstanceOf[js.Any])
    
    inline def indication(value: VdomNode): this.type = set("indication", value.rawNode.asInstanceOf[js.Any])
    
    inline def indicationNull: this.type = set("indication", null)
    
    inline def indicationVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("indication", js.Array(value*))
    
    inline def indicationVdomElement(value: VdomElement): this.type = set("indication", value.rawElement.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
    
    inline def onIndicationClick(value: Callback): this.type = set("onIndicationClick", value.toJsFn)
    
    inline def placeholder(value: VdomNode): this.type = set("placeholder", value.rawNode.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def presence(value: online | offline | busy): this.type = set("presence", value.asInstanceOf[js.Any])
    
    inline def shape(value: circle | square): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def showIndicationOnHover(value: Boolean): this.type = set("showIndicationOnHover", value.asInstanceOf[js.Any])
    
    inline def size(value: size90 | size72 | size60 | size48 | size36 | size30 | size24 | size18): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Avatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AvatarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
