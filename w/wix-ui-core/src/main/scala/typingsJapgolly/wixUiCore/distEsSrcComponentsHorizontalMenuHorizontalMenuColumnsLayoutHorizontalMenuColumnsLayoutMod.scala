package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FC
import typingsJapgolly.wixUiCore.anon.ColumnsNumber
import typingsJapgolly.wixUiCore.anon.PickPickHorizontalMenuCol
import typingsJapgolly.wixUiCore.anon.Styles
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuContextMod.HorizontalMenuContextValue
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuItemHorizontalMenuItemContextMod.HorizontalMenuItemContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod extends Shortcut {
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", JSImport.Default)
  @js.native
  val default: FC[PickPickHorizontalMenuCol] = js.native
  
  @js.native
  sealed trait ColumnsAlignment extends StObject
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", "ColumnsAlignment")
  @js.native
  object ColumnsAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ColumnsAlignment & String] = js.native
    
    @js.native
    sealed trait Center
      extends StObject
         with ColumnsAlignment
    /* "center" */ val Center: typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment.Center & String = js.native
    
    @js.native
    sealed trait Justify
      extends StObject
         with ColumnsAlignment
    /* "justify" */ val Justify: typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment.Justify & String = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with ColumnsAlignment
    /* "left" */ val Left: typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment.Left & String = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with ColumnsAlignment
    /* "right" */ val Right: typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment.Right & String = js.native
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", "HorizontalMenuColumnsLayout")
  @js.native
  open class HorizontalMenuColumnsLayout protected () extends Component[HorizontalMenuColumnsLayoutProps, HorizontalMenuColumnsLayoutState, Any] {
    def this(props: HorizontalMenuColumnsLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HorizontalMenuColumnsLayoutProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MHorizontalMenuColumnsLayout(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MHorizontalMenuColumnsLayout(prevProps: HorizontalMenuColumnsLayoutProps): Unit = js.native
    
    var layoutRef: RefHandle[HTMLDivElement] = js.native
    
    def recalculatePositions(): Unit = js.native
    
    @JSName("state")
    var state_HorizontalMenuColumnsLayout: Styles = js.native
  }
  /* static members */
  object HorizontalMenuColumnsLayout {
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", "HorizontalMenuColumnsLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", "HorizontalMenuColumnsLayout.defaultProps")
    @js.native
    def defaultProps: ColumnsNumber = js.native
    inline def defaultProps_=(x: ColumnsNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", "HorizontalMenuColumnsLayout.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait HorizontalMenuColumnsLayoutProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[Double] = js.undefined
    
    var columns: js.UndefOr[Double] = js.undefined
    
    var columnsAlignment: js.UndefOr[ColumnsAlignment] = js.undefined
    
    var maxOverflowWidth: js.UndefOr[Double] = js.undefined
    
    var menuContext: HorizontalMenuContextValue
    
    var menuItemContext: HorizontalMenuItemContextValue
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object HorizontalMenuColumnsLayoutProps {
    
    inline def apply(menuContext: HorizontalMenuContextValue, menuItemContext: HorizontalMenuItemContextValue): HorizontalMenuColumnsLayoutProps = {
      val __obj = js.Dynamic.literal(menuContext = menuContext.asInstanceOf[js.Any], menuItemContext = menuItemContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuColumnsLayoutProps]
    }
    
    extension [Self <: HorizontalMenuColumnsLayoutProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumnGap(value: Double): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsAlignment(value: ColumnsAlignment): Self = StObject.set(x, "columnsAlignment", value.asInstanceOf[js.Any])
      
      inline def setColumnsAlignmentUndefined: Self = StObject.set(x, "columnsAlignment", js.undefined)
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setMaxOverflowWidth(value: Double): Self = StObject.set(x, "maxOverflowWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxOverflowWidthUndefined: Self = StObject.set(x, "maxOverflowWidth", js.undefined)
      
      inline def setMenuContext(value: HorizontalMenuContextValue): Self = StObject.set(x, "menuContext", value.asInstanceOf[js.Any])
      
      inline def setMenuItemContext(value: HorizontalMenuItemContextValue): Self = StObject.set(x, "menuItemContext", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait HorizontalMenuColumnsLayoutState extends StObject {
    
    var styles: CSSProperties
  }
  object HorizontalMenuColumnsLayoutState {
    
    inline def apply(styles: CSSProperties): HorizontalMenuColumnsLayoutState = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuColumnsLayoutState]
    }
    
    extension [Self <: HorizontalMenuColumnsLayoutState](x: Self) {
      
      inline def setStyles(value: CSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[PickPickHorizontalMenuCol]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcComponentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.foo` */
  override def _to: FC[PickPickHorizontalMenuCol] = default
}
