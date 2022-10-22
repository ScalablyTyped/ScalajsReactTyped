package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsHeaderHeaderContentMod.HeaderContentProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsHeaderHeaderMod.HeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsHeaderHeaderSubheaderMod.HeaderSubheaderProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.medium
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  object Content {
    
    @JSImport("semantic-ui-react", "Header.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_HeaderContentProps_525501621 = new SharedBuilder_HeaderContentProps_525501621(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HeaderContentProps): SharedBuilder_HeaderContentProps_525501621 = new SharedBuilder_HeaderContentProps_525501621(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Subheader {
    
    @JSImport("semantic-ui-react", "Header.Subheader")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Subheader.type): SharedBuilder_HeaderSubheaderProps1061802056 = new SharedBuilder_HeaderSubheaderProps1061802056(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HeaderSubheaderProps): SharedBuilder_HeaderSubheaderProps1061802056 = new SharedBuilder_HeaderSubheaderProps1061802056(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Header")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def attached(value: Boolean | top | bottom): this.type = set("attached", value.asInstanceOf[js.Any])
    
    inline def block(value: Boolean): this.type = set("block", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dividing(value: Boolean): this.type = set("dividing", value.asInstanceOf[js.Any])
    
    inline def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
    
    inline def icon(value: Any): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def image(value: Any): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def size(value: tiny | small | medium | large | huge): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def sub(value: Boolean): this.type = set("sub", value.asInstanceOf[js.Any])
    
    inline def subheader(value: Any): this.type = set("subheader", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: SemanticTEXTALIGNMENTS): this.type = set("textAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Header.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
