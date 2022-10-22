package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsPlaceholderPlaceholderHeaderMod.PlaceholderHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsPlaceholderPlaceholderImageMod.PlaceholderImageProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsPlaceholderPlaceholderLineMod.PlaceholderLineProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsPlaceholderPlaceholderMod.PlaceholderProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsPlaceholderPlaceholderParagraphMod.PlaceholderParagraphProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Placeholder {
  
  object Header {
    
    @JSImport("semantic-ui-react", "Placeholder.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_PlaceholderHeaderProps_1465511122 = new SharedBuilder_PlaceholderHeaderProps_1465511122(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PlaceholderHeaderProps): SharedBuilder_PlaceholderHeaderProps_1465511122 = new SharedBuilder_PlaceholderHeaderProps_1465511122(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Image {
    
    @JSImport("semantic-ui-react", "Placeholder.Image")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Image.type): SharedBuilder_PlaceholderImageProps_1022145557 = new SharedBuilder_PlaceholderImageProps_1022145557(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PlaceholderImageProps): SharedBuilder_PlaceholderImageProps_1022145557 = new SharedBuilder_PlaceholderImageProps_1022145557(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Line {
    
    @JSImport("semantic-ui-react", "Placeholder.Line")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Line.type): SharedBuilder_PlaceholderLineProps128929151 = new SharedBuilder_PlaceholderLineProps128929151(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PlaceholderLineProps): SharedBuilder_PlaceholderLineProps128929151 = new SharedBuilder_PlaceholderLineProps128929151(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Paragraph {
    
    @JSImport("semantic-ui-react", "Placeholder.Paragraph")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Paragraph.type): SharedBuilder_PlaceholderParagraphProps_63202718 = new SharedBuilder_PlaceholderParagraphProps_63202718(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PlaceholderParagraphProps): SharedBuilder_PlaceholderParagraphProps_63202718 = new SharedBuilder_PlaceholderParagraphProps_63202718(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Placeholder")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Placeholder.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PlaceholderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
