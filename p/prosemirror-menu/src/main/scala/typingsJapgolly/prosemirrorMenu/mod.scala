package typingsJapgolly.prosemirrorMenu

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.Node
import typingsJapgolly.prosemirrorMenu.anon.Content
import typingsJapgolly.prosemirrorMenu.anon.Dom
import typingsJapgolly.prosemirrorMenu.anon.DomUpdate
import typingsJapgolly.prosemirrorMenu.anon.Update
import typingsJapgolly.prosemirrorModel.mod.NodeType
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import typingsJapgolly.prosemirrorState.mod.Plugin
import typingsJapgolly.prosemirrorState.mod.Transaction
import typingsJapgolly.prosemirrorView.mod.EditorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prosemirror-menu", "Dropdown")
  @js.native
  open class Dropdown[S /* <: Schema[Any, Any] */] protected () extends StObject {
    /**
      * Create a dropdown wrapping the elements. Options may include
      * the following properties:
      *
      * **`label`**`: string`
      * : The label to show on the drop-down control.
      *
      * **`title`**`: string`
      * : Sets the
      * [`title`](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/title)
      * attribute given to the menu control.
      *
      * **`class`**`: string`
      * : When given, adds an extra CSS class to the menu control.
      *
      * **`css`**`: string`
      * : When given, adds an extra set of CSS styles to the menu control.
      */
    def this(content: js.Array[MenuElement[S]]) = this()
    def this(content: js.Array[MenuElement[S]], options: StringDictionary[Any]) = this()
    
    /**
      * Render the dropdown menu and sub-items.
      */
    def render(view: EditorView): Dom = js.native
  }
  
  @JSImport("prosemirror-menu", "DropdownSubmenu")
  @js.native
  open class DropdownSubmenu[S /* <: Schema[Any, Any] */] protected () extends StObject {
    /**
      * Creates a submenu for the given group of menu elements. The
      * following options are recognized:
      *
      * **`label`**`: string`
      * : The label to show on the submenu.
      */
    def this(content: js.Array[MenuElement[S]]) = this()
    def this(content: js.Array[MenuElement[S]], options: StringDictionary[Any]) = this()
    
    /**
      * Renders the submenu.
      */
    def render(view: EditorView): Update = js.native
  }
  
  @JSImport("prosemirror-menu", "MenuItem")
  @js.native
  open class MenuItem[S /* <: Schema[Any, Any] */] protected () extends StObject {
    def this(spec: MenuItemSpec[S]) = this()
    
    /**
      * Renders the icon according to its [display
      * spec](#menu.MenuItemSpec.display), and adds an event handler which
      * executes the command when the representation is clicked.
      */
    def render(view: EditorView): Update = js.native
    
    /**
      * The spec used to create the menu item.
      */
    var spec: MenuItemSpec[S] = js.native
  }
  
  inline def blockTypeItem[S /* <: Schema[Any, Any] */](nodeType: NodeType, options: StringDictionary[Any]): MenuItem[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("blockTypeItem")(nodeType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MenuItem[S]]
  
  @JSImport("prosemirror-menu", "joinUpItem")
  @js.native
  def joinUpItem: MenuItem[Any] = js.native
  inline def joinUpItem_=(x: MenuItem[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("joinUpItem")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-menu", "liftItem")
  @js.native
  def liftItem: MenuItem[Any] = js.native
  inline def liftItem_=(x: MenuItem[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("liftItem")(x.asInstanceOf[js.Any])
  
  inline def menuBar[S /* <: Schema[Any, Any] */](options: Content[S]): Plugin[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("menuBar")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin[S]]
  
  inline def redoItem(p: StringDictionary[Any]): MenuItem[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("redoItem")(p.asInstanceOf[js.Any]).asInstanceOf[MenuItem[Any]]
  
  inline def renderGrouped[S /* <: Schema[Any, Any] */](view: EditorView, content: js.Array[js.Array[MenuElement[S]]]): DomUpdate = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGrouped")(view.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[DomUpdate]
  
  @JSImport("prosemirror-menu", "selectParentNodeItem")
  @js.native
  def selectParentNodeItem: MenuItem[Any] = js.native
  inline def selectParentNodeItem_=(x: MenuItem[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectParentNodeItem")(x.asInstanceOf[js.Any])
  
  inline def undoItem(p: StringDictionary[Any]): MenuItem[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("undoItem")(p.asInstanceOf[js.Any]).asInstanceOf[MenuItem[Any]]
  
  inline def wrapItem[S /* <: Schema[Any, Any] */](nodeType: NodeType, options: StringDictionary[Any]): MenuItem[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapItem")(nodeType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MenuItem[S]]
  
  trait MenuElement[S /* <: Schema[Any, Any] */] extends StObject {
    
    /**
      * Render the element for display in the menu. Must return a DOM
      * element and a function that can be used to update the element to
      * a new state. The `update` function will return false if the
      * update hid the entire element.
      */
    def render(pm: EditorView): Update
  }
  object MenuElement {
    
    inline def apply[S /* <: Schema[Any, Any] */](render: EditorView => Update): MenuElement[S] = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[MenuElement[S]]
    }
    
    extension [Self <: MenuElement[?], S /* <: Schema[Any, Any] */](x: Self & MenuElement[S]) {
      
      inline def setRender(value: EditorView => Update): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  trait MenuItemSpec[S /* <: Schema[Any, Any] */] extends StObject {
    
    /**
      * A predicate function to determine whether the item is 'active' (for
      * example, the item for toggling the strong mark might be active then
      * the cursor is in strong text).
      */
    var active: js.UndefOr[(js.Function1[/* p */ EditorState, Boolean]) | Null] = js.undefined
    
    /**
      * Optionally adds a CSS class to the item's DOM representation.
      */
    var `class`: js.UndefOr[String] = js.undefined
    
    /**
      * Optionally adds a string of inline CSS to the item's DOM
      * representation.
      */
    var css: js.UndefOr[String] = js.undefined
    
    /**
      * Function that is used to determine if the item is enabled. If
      * given and returning false, the item will be given a disabled
      * styling.
      */
    var enable: js.UndefOr[(js.Function1[/* p */ EditorState, Boolean]) | Null] = js.undefined
    
    /**
      * Describes an icon to show for this item. The object may specify
      * an SVG icon, in which case its `path` property should be an [SVG
      * path
      * spec](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/d),
      * and `width` and `height` should provide the viewbox in which that
      * path exists. Alternatively, it may have a `text` property
      * specifying a string of text that makes up the icon, with an
      * optional `css` property giving additional CSS styling for the
      * text. _Or_ it may contain `dom` property containing a DOM node.
      */
    var icon: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
    
    /**
      * Makes the item show up as a text label. Mostly useful for items
      * wrapped in a [drop-down](#menu.Dropdown) or similar menu. The object
      * should have a `label` property providing the text to display.
      */
    var label: js.UndefOr[String | Null] = js.undefined
    
    /**
      * A function that renders the item. You must provide either this,
      * [`icon`](#menu.MenuItemSpec.icon), or [`label`](#MenuItemSpec.label).
      */
    var render: js.UndefOr[(js.Function1[/* p */ EditorView, Node]) | Null] = js.undefined
    
    /**
      * The function to execute when the menu item is activated.
      */
    def run(p1: EditorState, p2: js.Function1[/* p */ Transaction, Unit], p3: EditorView, p4: Event): Unit
    
    /**
      * Optional function that is used to determine whether the item is
      * appropriate at the moment. Deselected items will be hidden.
      */
    var select: js.UndefOr[(js.Function1[/* p */ EditorState, Boolean]) | Null] = js.undefined
    
    /**
      * Defines DOM title (mouseover) text for the item.
      */
    var title: js.UndefOr[String | (js.Function1[/* p */ EditorState, String]) | Null] = js.undefined
  }
  object MenuItemSpec {
    
    inline def apply[S /* <: Schema[Any, Any] */](run: (EditorState, js.Function1[/* p */ Transaction, Unit], EditorView, Event) => Callback): MenuItemSpec[S] = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction4((t0: EditorState, t1: js.Function1[/* p */ Transaction, Unit], t2: EditorView, t3: Event) => (run(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[MenuItemSpec[S]]
    }
    
    extension [Self <: MenuItemSpec[?], S /* <: Schema[Any, Any] */](x: Self & MenuItemSpec[S]) {
      
      inline def setActive(value: /* p */ EditorState => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction1(value))
      
      inline def setActiveNull: Self = StObject.set(x, "active", null)
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setEnable(value: /* p */ EditorState => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      inline def setEnableNull: Self = StObject.set(x, "enable", null)
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setIcon(value: StringDictionary[Any]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRender(value: /* p */ EditorView => Node): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderNull: Self = StObject.set(x, "render", null)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRun(value: (EditorState, js.Function1[/* p */ Transaction, Unit], EditorView, Event) => Callback): Self = StObject.set(x, "run", js.Any.fromFunction4((t0: EditorState, t1: js.Function1[/* p */ Transaction, Unit], t2: EditorView, t3: Event) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setSelect(value: /* p */ EditorState => Boolean): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectNull: Self = StObject.set(x, "select", null)
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTitle(value: String | (js.Function1[/* p */ EditorState, String])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: /* p */ EditorState => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
