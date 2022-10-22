package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListContentMod.ListContentProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListDescriptionMod.ListDescriptionProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListHeaderMod.ListHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListIconMod.ListIconProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListItemMod.ListItemProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListListMod.ListListProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListMod.ListProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticSIZES
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  object Content {
    
    @JSImport("semantic-ui-react", "List.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_ListContentProps263480470 = new SharedBuilder_ListContentProps263480470(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListContentProps): SharedBuilder_ListContentProps263480470 = new SharedBuilder_ListContentProps263480470(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Description {
    
    @JSImport("semantic-ui-react", "List.Description")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Description.type): SharedBuilder_ListDescriptionProps_1472215284 = new SharedBuilder_ListDescriptionProps_1472215284(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListDescriptionProps): SharedBuilder_ListDescriptionProps_1472215284 = new SharedBuilder_ListDescriptionProps_1472215284(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("semantic-ui-react", "List.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_ListHeaderProps1204678537 = new SharedBuilder_ListHeaderProps1204678537(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListHeaderProps): SharedBuilder_ListHeaderProps1204678537 = new SharedBuilder_ListHeaderProps1204678537(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Icon {
    
    @JSImport("semantic-ui-react", "List.Icon")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Icon.type): SharedBuilder_ListIconProps1510837280 = new SharedBuilder_ListIconProps1510837280(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListIconProps): SharedBuilder_ListIconProps1510837280 = new SharedBuilder_ListIconProps1510837280(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Item {
    
    @JSImport("semantic-ui-react", "List.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_ListItemProps_1291039995 = new SharedBuilder_ListItemProps_1291039995(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListItemProps): SharedBuilder_ListItemProps_1291039995 = new SharedBuilder_ListItemProps_1291039995(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object List {
    
    @JSImport("semantic-ui-react", "List.List")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: List.type): SharedBuilder_ListListProps_1805365981 = new SharedBuilder_ListListProps_1805365981(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListListProps): SharedBuilder_ListListProps_1805365981 = new SharedBuilder_ListListProps_1805365981(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  @JSImport("semantic-ui-react", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def bulleted(value: Boolean): this.type = set("bulleted", value.asInstanceOf[js.Any])
    
    inline def celled(value: Boolean): this.type = set("celled", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def divided(value: Boolean): this.type = set("divided", value.asInstanceOf[js.Any])
    
    inline def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def items(value: SemanticShorthandCollection[ListItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: SemanticShorthandItem[ListItemProps]*): this.type = set("items", js.Array(value*))
    
    inline def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
    
    inline def onItemClick(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ListItemProps) => Callback): this.type = set("onItemClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ ListItemProps) => (value(t0, t1)).runNow()))
    
    inline def ordered(value: Boolean): this.type = set("ordered", value.asInstanceOf[js.Any])
    
    inline def relaxed(value: Boolean | very): this.type = set("relaxed", value.asInstanceOf[js.Any])
    
    inline def selection(value: Boolean): this.type = set("selection", value.asInstanceOf[js.Any])
    
    inline def size(value: SemanticSIZES): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: List.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
