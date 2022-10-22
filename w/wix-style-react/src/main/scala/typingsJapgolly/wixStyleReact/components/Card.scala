package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCardContentMod.ContentProps
import typingsJapgolly.wixStyleReact.distTypesCardHeaderMod.HeaderProps
import typingsJapgolly.wixStyleReact.distTypesCardMod.CardProps
import typingsJapgolly.wixStyleReact.distTypesCardSubheaderMod.SubheaderProps
import typingsJapgolly.wixStyleReact.distTypesDividerMod.DividerDirection
import typingsJapgolly.wixStyleReact.distTypesDividerMod.DividerProps
import typingsJapgolly.wixStyleReact.distTypesDividerMod.DividerSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  object Content {
    
    @JSImport("wix-style-react", "Card.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_ContentProps_1483963625[typingsJapgolly.wixStyleReact.mod.Card.Content] = new SharedBuilder_ContentProps_1483963625[typingsJapgolly.wixStyleReact.mod.Card.Content](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ContentProps): SharedBuilder_ContentProps_1483963625[typingsJapgolly.wixStyleReact.mod.Card.Content] = new SharedBuilder_ContentProps_1483963625[typingsJapgolly.wixStyleReact.mod.Card.Content](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Divider {
    
    @JSImport("wix-style-react", "Card.Divider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
      
      inline def direction(value: DividerDirection): this.type = set("direction", value.asInstanceOf[js.Any])
      
      inline def skin(value: DividerSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Divider.type): typingsJapgolly.wixStyleReact.components.Card.Divider.Builder = new typingsJapgolly.wixStyleReact.components.Card.Divider.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DividerProps): typingsJapgolly.wixStyleReact.components.Card.Divider.Builder = new typingsJapgolly.wixStyleReact.components.Card.Divider.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("wix-style-react", "Card.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_HeaderProps1894569066[typingsJapgolly.wixStyleReact.mod.Card.Header] = new SharedBuilder_HeaderProps1894569066[typingsJapgolly.wixStyleReact.mod.Card.Header](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HeaderProps): SharedBuilder_HeaderProps1894569066[typingsJapgolly.wixStyleReact.mod.Card.Header] = new SharedBuilder_HeaderProps1894569066[typingsJapgolly.wixStyleReact.mod.Card.Header](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Subheader {
    
    @JSImport("wix-style-react", "Card.Subheader")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Subheader.type): SharedBuilder_SubheaderProps2121917547[typingsJapgolly.wixStyleReact.mod.Card.Subheader] = new SharedBuilder_SubheaderProps2121917547[typingsJapgolly.wixStyleReact.mod.Card.Subheader](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SubheaderProps): SharedBuilder_SubheaderProps2121917547[typingsJapgolly.wixStyleReact.mod.Card.Subheader] = new SharedBuilder_SubheaderProps2121917547[typingsJapgolly.wixStyleReact.mod.Card.Subheader](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-style-react", "Card")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def controls(value: VdomNode): this.type = set("controls", value.rawNode.asInstanceOf[js.Any])
    
    inline def controlsNull: this.type = set("controls", null)
    
    inline def controlsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("controls", js.Array(value*))
    
    inline def controlsVdomElement(value: VdomElement): this.type = set("controls", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def hideOverflow(value: Boolean): this.type = set("hideOverflow", value.asInstanceOf[js.Any])
    
    inline def showShadow(value: Boolean): this.type = set("showShadow", value.asInstanceOf[js.Any])
    
    inline def stretchVertically(value: Boolean): this.type = set("stretchVertically", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
