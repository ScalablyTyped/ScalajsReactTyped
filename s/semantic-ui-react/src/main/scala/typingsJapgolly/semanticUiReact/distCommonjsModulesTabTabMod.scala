package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.FC
import typingsJapgolly.semanticUiReact.anon.MenuItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesTabTabPaneMod.TabPaneProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesTabTabMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab/Tab", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[TabProps, js.Object, Any] {
    def this(props: TabProps) = this()
    def this(props: TabProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab/Tab", JSImport.Default)
  @js.native
  val default: TabComponent = js.native
  
  trait StrictTabProps extends StObject {
    
    /** Index of the currently active tab. */
    var activeIndex: js.UndefOr[Double | String] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** The initial activeIndex. */
    var defaultActiveIndex: js.UndefOr[Double | String] = js.undefined
    
    /** Shorthand props for the Grid. */
    var grid: js.UndefOr[Any] = js.undefined
    
    /** Shorthand props for the Menu. */
    var menu: js.UndefOr[Any] = js.undefined
    
    /** Align vertical menu */
    var menuPosition: js.UndefOr[left | right] = js.undefined
    
    /**
      * Called on tab change.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - The proposed new Tab.Pane.
      * @param {object} data.activeIndex - The new proposed activeIndex.
      * @param {object} data.panes - Props of the new proposed active pane.
      */
    var onTabChange: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ TabProps, Unit]
      ] = js.undefined
    
    /**
      * Array of objects describing each Menu.Item and Tab.Pane:
      * {
      *   menuItem: 'Home',
      *   render: () => <Tab.Pane>Welcome!</Tab.Pane>,
      * }
      * or
      * {
      *   menuItem: 'Home',
      *   pane: 'Welcome',
      * }
      */
    var panes: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    /** A Tab can render only active pane. */
    var renderActiveOnly: js.UndefOr[Boolean] = js.undefined
  }
  object StrictTabProps {
    
    inline def apply(): StrictTabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTabProps]
    }
    
    extension [Self <: StrictTabProps](x: Self) {
      
      inline def setActiveIndex(value: Double | String): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setDefaultActiveIndex(value: Double | String): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setMenu(value: Any): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuPosition(value: left | right): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      inline def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setOnTabChange(value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ TabProps) => Callback): Self = StObject.set(x, "onTabChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ TabProps) => (value(t0, t1)).runNow()))
      
      inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      inline def setPanes(value: js.Array[MenuItem]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
      
      inline def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
      
      inline def setPanesVarargs(value: MenuItem*): Self = StObject.set(x, "panes", js.Array(value*))
      
      inline def setRenderActiveOnly(value: Boolean): Self = StObject.set(x, "renderActiveOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderActiveOnlyUndefined: Self = StObject.set(x, "renderActiveOnly", js.undefined)
    }
  }
  
  @js.native
  trait TabComponent
    extends StObject
       with ComponentClass[TabProps, js.Object] {
    
    var Pane: FC[TabPaneProps] = js.native
  }
  
  trait TabProps
    extends StObject
       with StrictTabProps
       with /* key */ StringDictionary[Any]
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
  }
  
  type _To = TabComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesTabTabMod.foo` */
  override def _to: TabComponent = default
}
