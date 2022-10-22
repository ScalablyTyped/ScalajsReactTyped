package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.blueprintjsTable.anon.Truncated
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCellCellMod {
  
  @JSImport("@blueprintjs/table/lib/esm/cell/cell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/cell/cell", "Cell")
  @js.native
  open class Cell protected ()
    extends Component[ICellProps, js.Object, Any] {
    def this(props: ICellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICellProps, context: Any) = this()
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MCell(nextProps: ICellProps): Boolean = js.native
  }
  /* static members */
  object Cell {
    
    @JSImport("@blueprintjs/table/lib/esm/cell/cell", "Cell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/cell/cell", "Cell.defaultProps")
    @js.native
    def defaultProps: Truncated = js.native
    inline def defaultProps_=(x: Truncated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/cell/cell", "Cell.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def emptyCellRenderer(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyCellRenderer")().asInstanceOf[Element]
  
  type CellProps = ICellProps
  
  type CellRenderer = ICellRenderer
  
  trait ICellProps
    extends StObject
       with IIntentProps
       with IProps {
    
    /**
      * A ref handle to capture the outer div of this cell. Used internally.
      */
    var cellRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * The column index of the cell. If provided, this will be passed as an argument to any callbacks
      * when they are invoked.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, the cell will be rendered above overlay layers to enable mouse
      * interactions within the cell.
      *
      * @default false
      */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * An optional native tooltip that is displayed on hover.
      * If `true`, content will be replaced with a fixed-height skeleton.
      *
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback invoked when the cell is focused and a key is pressed down.
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Callback invoked when a character-key is pressed.
      */
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Callback invoked when the cell is focused and a key is released.
      */
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    /**
      * The row index of the cell. If provided, this will be passed as an argument to any callbacks
      * when they are invoked.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Allows for setting a tab index on the cell, so the cell can be browser-focusable.
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional native tooltip that is displayed on hover.
      */
    var tooltip: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the cell contents will be wrapped in a `div` with
      * styling that will prevent the content from overflowing the cell.
      *
      * @default true
      */
    var truncated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the cell contents will be wrapped in a `div` with
      * styling that will cause text to wrap, rather than displaying it on a single line.
      *
      * @default false
      */
    var wrapText: js.UndefOr[Boolean] = js.undefined
  }
  object ICellProps {
    
    inline def apply(): ICellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICellProps]
    }
    
    extension [Self <: ICellProps](x: Self) {
      
      inline def setCellRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "cellRef", value.asInstanceOf[js.Any])
      
      inline def setCellRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "cellRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setCellRefNull: Self = StObject.set(x, "cellRef", null)
      
      inline def setCellRefUndefined: Self = StObject.set(x, "cellRef", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
      
      inline def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
      
      inline def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
      
      inline def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
    }
  }
  
  type ICellRenderer = js.Function2[
    /* rowIndex */ Double, 
    /* columnIndex */ Double, 
    js.UndefOr[japgolly.scalajs.react.facade.React.Element]
  ]
}
