package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.blueprintjsTable.libEsmInteractionsResizeHandleMod.ResizeHandle
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHeadersHeaderCellMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/headerCell", "HeaderCell")
  @js.native
  open class HeaderCell protected () extends Component[IInternalHeaderCellProps, IHeaderCellState, Any] {
    def this(props: IInternalHeaderCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IInternalHeaderCellProps, context: Any) = this()
    
    def renderContextMenu(_event: ReactMouseEventFrom[HTMLElement]): js.UndefOr[Element] = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MHeaderCell(nextProps: IHeaderCellProps): Boolean = js.native
  }
  
  trait IHeaderCellProps
    extends StObject
       with IProps {
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * The index of the cell in the header. If provided, this will be passed as an argument to any
      * callbacks when they are invoked.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, will apply the active class to the header to indicate it is
      * part of an external operation.
      */
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the row/column `name` will be replaced with a fixed-height skeleton, and the
      * `resizeHandle` will not be rendered. If passing in additional children to this component, you
      * will also want to conditionally apply `Classes.SKELETON` where appropriate.
      *
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback that returns an element, like a `<Menu>`, which is displayed by right-clicking
      * anywhere in the header. The callback will receive the cell index if it was provided via
      * props.
      */
    var menuRenderer: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Element]] = js.undefined
    
    /**
      * The name displayed in the header of the row/column.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A `ReorderHandle` React component that allows users to drag-reorder the column header.
      */
    var reorderHandle: js.UndefOr[Element] = js.undefined
    
    /**
      * A `ResizeHandle` React component that allows users to drag-resize the header.
      */
    var resizeHandle: js.UndefOr[ResizeHandle] = js.undefined
    
    /**
      * CSS styles for the top level element.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object IHeaderCellProps {
    
    inline def apply(): IHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHeaderCellProps]
    }
    
    extension [Self <: IHeaderCellProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMenuRenderer(value: /* index */ js.UndefOr[Double] => Element): Self = StObject.set(x, "menuRenderer", js.Any.fromFunction1(value))
      
      inline def setMenuRendererUndefined: Self = StObject.set(x, "menuRenderer", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReorderHandle(value: VdomElement): Self = StObject.set(x, "reorderHandle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setReorderHandleUndefined: Self = StObject.set(x, "reorderHandle", js.undefined)
      
      inline def setResizeHandle(value: ResizeHandle): Self = StObject.set(x, "resizeHandle", value.asInstanceOf[js.Any])
      
      inline def setResizeHandleUndefined: Self = StObject.set(x, "resizeHandle", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait IHeaderCellState extends StObject {
    
    var isActive: Boolean
  }
  object IHeaderCellState {
    
    inline def apply(isActive: Boolean): IHeaderCellState = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHeaderCellState]
    }
    
    extension [Self <: IHeaderCellState](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
  
  trait IInternalHeaderCellProps
    extends StObject
       with IHeaderCellProps {
    
    /**
      * Specifies if the cell is selected.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
  }
  object IInternalHeaderCellProps {
    
    inline def apply(): IInternalHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInternalHeaderCellProps]
    }
    
    extension [Self <: IInternalHeaderCellProps](x: Self) {
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    }
  }
}
