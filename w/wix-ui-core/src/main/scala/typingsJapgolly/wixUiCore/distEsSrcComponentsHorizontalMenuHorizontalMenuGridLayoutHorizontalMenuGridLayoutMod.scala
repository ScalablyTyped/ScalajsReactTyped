package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FC
import typingsJapgolly.wixUiCore.anon.PickPickHorizontalMenuGri
import typingsJapgolly.wixUiCore.anon.Styles
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuContextMod.HorizontalMenuContextValue
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuItemHorizontalMenuItemContextMod.HorizontalMenuItemContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsHorizontalMenuHorizontalMenuGridLayoutHorizontalMenuGridLayoutMod extends Shortcut {
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-grid-layout/HorizontalMenuGridLayout", JSImport.Default)
  @js.native
  val default: FC[PickPickHorizontalMenuGri] = js.native
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-grid-layout/HorizontalMenuGridLayout", "HorizontalMenuGridLayout")
  @js.native
  open class HorizontalMenuGridLayout protected () extends Component[HorizontalMenuGridLayoutProps, HorizontalMenuGridLayoutState, Any] {
    def this(props: HorizontalMenuGridLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HorizontalMenuGridLayoutProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MHorizontalMenuGridLayout(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MHorizontalMenuGridLayout(prevProps: HorizontalMenuGridLayoutProps): Unit = js.native
    
    var layoutRef: RefHandle[HTMLDivElement] = js.native
    
    def recalculatePositions(): Unit = js.native
    
    @JSName("state")
    var state_HorizontalMenuGridLayout: Styles = js.native
  }
  /* static members */
  object HorizontalMenuGridLayout {
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-grid-layout/HorizontalMenuGridLayout", "HorizontalMenuGridLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-grid-layout/HorizontalMenuGridLayout", "HorizontalMenuGridLayout.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait HorizontalMenuGridLayoutProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var maxOverflowWidth: js.UndefOr[Double] = js.undefined
    
    var menuContext: HorizontalMenuContextValue
    
    var menuItemContext: HorizontalMenuItemContextValue
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object HorizontalMenuGridLayoutProps {
    
    inline def apply(menuContext: HorizontalMenuContextValue, menuItemContext: HorizontalMenuItemContextValue): HorizontalMenuGridLayoutProps = {
      val __obj = js.Dynamic.literal(menuContext = menuContext.asInstanceOf[js.Any], menuItemContext = menuItemContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuGridLayoutProps]
    }
    
    extension [Self <: HorizontalMenuGridLayoutProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMaxOverflowWidth(value: Double): Self = StObject.set(x, "maxOverflowWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxOverflowWidthUndefined: Self = StObject.set(x, "maxOverflowWidth", js.undefined)
      
      inline def setMenuContext(value: HorizontalMenuContextValue): Self = StObject.set(x, "menuContext", value.asInstanceOf[js.Any])
      
      inline def setMenuItemContext(value: HorizontalMenuItemContextValue): Self = StObject.set(x, "menuItemContext", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait HorizontalMenuGridLayoutState extends StObject {
    
    var styles: CSSProperties
  }
  object HorizontalMenuGridLayoutState {
    
    inline def apply(styles: CSSProperties): HorizontalMenuGridLayoutState = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuGridLayoutState]
    }
    
    extension [Self <: HorizontalMenuGridLayoutState](x: Self) {
      
      inline def setStyles(value: CSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[PickPickHorizontalMenuGri]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcComponentsHorizontalMenuHorizontalMenuGridLayoutHorizontalMenuGridLayoutMod.foo` */
  override def _to: FC[PickPickHorizontalMenuGri] = default
}
