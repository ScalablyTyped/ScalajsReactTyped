package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksContentMod.ContentProps
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksFooterMod.FooterProps
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksFootnoteMod.FootnoteProps
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksIllustrationMod.IllustrationProps
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutMod.BaseModalLayoutProps
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutMod.ModalTheme
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutMod.default
import typingsJapgolly.wixStyleReact.distTypesCommonMod.ScrollableContainerCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseModalLayout {
  
  object Content {
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Content")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def content(value: String | Node): this.type = set("content", value.asInstanceOf[js.Any])
      
      inline def contentNull: this.type = set("content", null)
      
      inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
      
      inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
      
      inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
      
      inline def hideBottomScrollDivider(value: Boolean): this.type = set("hideBottomScrollDivider", value.asInstanceOf[js.Any])
      
      inline def hideTopScrollDivider(value: Boolean): this.type = set("hideTopScrollDivider", value.asInstanceOf[js.Any])
      
      inline def overflowY(value: String): this.type = set("overflowY", value.asInstanceOf[js.Any])
      
      inline def scrollProps(value: ScrollableContainerCommonProps): this.type = set("scrollProps", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Content.type): typingsJapgolly.wixStyleReact.components.BaseModalLayout.Content.Builder = new typingsJapgolly.wixStyleReact.components.BaseModalLayout.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ContentProps): typingsJapgolly.wixStyleReact.components.BaseModalLayout.Content.Builder = new typingsJapgolly.wixStyleReact.components.BaseModalLayout.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Footer {
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Footer")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Footer.type): SharedBuilder_FooterProps220805238 = new SharedBuilder_FooterProps220805238(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: FooterProps): SharedBuilder_FooterProps220805238 = new SharedBuilder_FooterProps220805238(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Footnote {
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Footnote")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Footnote.type): SharedBuilder_FootnoteProps_127382635 = new SharedBuilder_FootnoteProps_127382635(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: FootnoteProps): SharedBuilder_FootnoteProps_127382635 = new SharedBuilder_FootnoteProps_127382635(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Illustration {
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Illustration")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Illustration.type): SharedBuilder_IllustrationProps_544252537 = new SharedBuilder_IllustrationProps_544252537(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: IllustrationProps): SharedBuilder_IllustrationProps_544252537 = new SharedBuilder_IllustrationProps_544252537(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def onCloseButtonClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCloseButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onHelpButtonClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onHelpButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def theme(value: ModalTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BaseModalLayout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BaseModalLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
