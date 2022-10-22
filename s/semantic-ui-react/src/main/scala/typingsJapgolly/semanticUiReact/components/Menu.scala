package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMenuMenuHeaderMod.MenuHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMenuMenuMenuMod.MenuMenuProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMenuMenuMod.MenuProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.labeled
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  object Header {
    
    @JSImport("semantic-ui-react", "Menu.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_MenuHeaderProps_1907345856[typingsJapgolly.semanticUiReact.mod.Menu.Header] = new SharedBuilder_MenuHeaderProps_1907345856[typingsJapgolly.semanticUiReact.mod.Menu.Header](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MenuHeaderProps): SharedBuilder_MenuHeaderProps_1907345856[typingsJapgolly.semanticUiReact.mod.Menu.Header] = new SharedBuilder_MenuHeaderProps_1907345856[typingsJapgolly.semanticUiReact.mod.Menu.Header](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Item {
    
    @JSImport("semantic-ui-react", "Menu.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_MenuItemProps_665487455[typingsJapgolly.semanticUiReact.mod.Menu.Item] = new SharedBuilder_MenuItemProps_665487455[typingsJapgolly.semanticUiReact.mod.Menu.Item](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MenuItemProps): SharedBuilder_MenuItemProps_665487455[typingsJapgolly.semanticUiReact.mod.Menu.Item] = new SharedBuilder_MenuItemProps_665487455[typingsJapgolly.semanticUiReact.mod.Menu.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Menu {
    
    @JSImport("semantic-ui-react", "Menu.Menu")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Menu.type): SharedBuilder_MenuMenuProps_1836140870 = new SharedBuilder_MenuMenuProps_1836140870(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MenuMenuProps): SharedBuilder_MenuMenuProps_1836140870 = new SharedBuilder_MenuMenuProps_1836140870(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  @JSImport("semantic-ui-react", "Menu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Menu] {
    
    inline def activeIndex(value: Double | String): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def attached(value: Boolean | bottom | top): this.type = set("attached", value.asInstanceOf[js.Any])
    
    inline def borderless(value: Boolean): this.type = set("borderless", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def defaultActiveIndex(value: Double | String): this.type = set("defaultActiveIndex", value.asInstanceOf[js.Any])
    
    inline def fixed(value: left | right | bottom | top): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def floated(value: Boolean | right): this.type = set("floated", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def icon(value: Boolean | labeled): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def items(value: SemanticShorthandCollection[MenuItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: SemanticShorthandItem[MenuItemProps]*): this.type = set("items", js.Array(value*))
    
    inline def onItemClick(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ MenuItemProps) => Callback): this.type = set("onItemClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ MenuItemProps) => (value(t0, t1)).runNow()))
    
    inline def pagination(value: Boolean): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def pointing(value: Boolean): this.type = set("pointing", value.asInstanceOf[js.Any])
    
    inline def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    
    inline def size(value: mini | tiny | small | large | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def stackable(value: Boolean): this.type = set("stackable", value.asInstanceOf[js.Any])
    
    inline def tabular(value: Boolean | right): this.type = set("tabular", value.asInstanceOf[js.Any])
    
    inline def text(value: Boolean): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    
    inline def widths(value: SemanticWIDTHS): this.type = set("widths", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Menu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
