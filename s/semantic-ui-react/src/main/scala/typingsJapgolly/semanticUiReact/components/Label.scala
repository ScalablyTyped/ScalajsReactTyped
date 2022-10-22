package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsLabelLabelDetailMod.LabelDetailProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsLabelLabelGroupMod.LabelGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsLabelLabelMod.LabelProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticSIZES
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom left`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom right`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top left`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top right`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.above
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.below
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Label {
  
  object Detail {
    
    @JSImport("semantic-ui-react", "Label.Detail")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Detail.type): SharedBuilder_LabelDetailProps2014604576 = new SharedBuilder_LabelDetailProps2014604576(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: LabelDetailProps): SharedBuilder_LabelDetailProps2014604576 = new SharedBuilder_LabelDetailProps2014604576(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Group {
    
    @JSImport("semantic-ui-react", "Label.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_LabelGroupProps490632779 = new SharedBuilder_LabelGroupProps490632779(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: LabelGroupProps): SharedBuilder_LabelGroupProps490632779 = new SharedBuilder_LabelGroupProps490632779(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Label")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def attached(value: top | bottom | (`top right`) | (`top left`) | (`bottom left`) | (`bottom right`)): this.type = set("attached", value.asInstanceOf[js.Any])
    
    inline def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    
    inline def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def corner(value: Boolean | left | right): this.type = set("corner", value.asInstanceOf[js.Any])
    
    inline def detail(value: SemanticShorthandItem[LabelDetailProps]): this.type = set("detail", value.asInstanceOf[js.Any])
    
    inline def detailFunction3(
      value: (/* component */ ElementType, LabelDetailProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("detail", js.Any.fromFunction3(value))
    
    inline def detailNull: this.type = set("detail", null)
    
    inline def detailVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("detail", js.Array(value*))
    
    inline def detailVdomElement(value: VdomElement): this.type = set("detail", value.rawElement.asInstanceOf[js.Any])
    
    inline def empty(value: Any): this.type = set("empty", value.asInstanceOf[js.Any])
    
    inline def floating(value: Boolean): this.type = set("floating", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconFunction3(
      value: (/* component */ ElementType, IconProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def image(value: Any): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ LabelProps) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ LabelProps) => (value(t0, t1)).runNow()))
    
    inline def onRemove(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ LabelProps) => Callback): this.type = set("onRemove", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ LabelProps) => (value(t0, t1)).runNow()))
    
    inline def pointing(value: Boolean | above | below | left | right): this.type = set("pointing", value.asInstanceOf[js.Any])
    
    inline def prompt(value: Boolean): this.type = set("prompt", value.asInstanceOf[js.Any])
    
    inline def removeIcon(value: SemanticShorthandItem[IconProps]): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    inline def removeIconFunction3(
      value: (/* component */ ElementType, IconProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("removeIcon", js.Any.fromFunction3(value))
    
    inline def removeIconNull: this.type = set("removeIcon", null)
    
    inline def removeIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("removeIcon", js.Array(value*))
    
    inline def removeIconVdomElement(value: VdomElement): this.type = set("removeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def ribbon(value: Boolean | right): this.type = set("ribbon", value.asInstanceOf[js.Any])
    
    inline def size(value: SemanticSIZES): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def tag(value: Boolean): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Label.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
