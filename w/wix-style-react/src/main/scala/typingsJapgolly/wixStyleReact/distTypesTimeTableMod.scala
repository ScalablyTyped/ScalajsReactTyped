package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.LabelOnClickPrefixIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeTableMod {
  
  @JSImport("wix-style-react/dist/types/TimeTable", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[TimeTableProps, js.Object, Any]
  
  type TimeTable = PureComponent[TimeTableProps, js.Object, Any]
  
  trait TimeTableChangeDetails extends StObject {
    
    var addedItemIndex: Double
    
    var addedToColumnIndex: Double
    
    var removedFromColumnIndex: Double
    
    var removedItemIndex: Double
  }
  object TimeTableChangeDetails {
    
    inline def apply(
      addedItemIndex: Double,
      addedToColumnIndex: Double,
      removedFromColumnIndex: Double,
      removedItemIndex: Double
    ): TimeTableChangeDetails = {
      val __obj = js.Dynamic.literal(addedItemIndex = addedItemIndex.asInstanceOf[js.Any], addedToColumnIndex = addedToColumnIndex.asInstanceOf[js.Any], removedFromColumnIndex = removedFromColumnIndex.asInstanceOf[js.Any], removedItemIndex = removedItemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTableChangeDetails]
    }
    
    extension [Self <: TimeTableChangeDetails](x: Self) {
      
      inline def setAddedItemIndex(value: Double): Self = StObject.set(x, "addedItemIndex", value.asInstanceOf[js.Any])
      
      inline def setAddedToColumnIndex(value: Double): Self = StObject.set(x, "addedToColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setRemovedFromColumnIndex(value: Double): Self = StObject.set(x, "removedFromColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setRemovedItemIndex(value: Double): Self = StObject.set(x, "removedItemIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeTableColumn extends StObject {
    
    var actions: js.UndefOr[js.Array[LabelOnClickPrefixIcon]] = js.undefined
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var droppable: js.UndefOr[Boolean] = js.undefined
    
    var items: js.Array[TimeTableItem]
    
    var subtitle: String
    
    var title: String
  }
  object TimeTableColumn {
    
    inline def apply(items: js.Array[TimeTableItem], subtitle: String, title: String): TimeTableColumn = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTableColumn]
    }
    
    extension [Self <: TimeTableColumn](x: Self) {
      
      inline def setActions(value: js.Array[LabelOnClickPrefixIcon]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: LabelOnClickPrefixIcon*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      inline def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      inline def setItems(value: js.Array[TimeTableItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: TimeTableItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type TimeTableContentRenderFunction = js.Function1[/* data */ TimeTableContentRenderFunctionData, Node]
  
  trait TimeTableContentRenderFunctionData extends StObject {
    
    var Item: FC[TimeTableItemProps]
    
    var disabled: Boolean
    
    var draggable: Boolean
  }
  object TimeTableContentRenderFunctionData {
    
    inline def apply(Item: FC[TimeTableItemProps], disabled: Boolean, draggable: Boolean): TimeTableContentRenderFunctionData = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTableContentRenderFunctionData]
    }
    
    extension [Self <: TimeTableContentRenderFunctionData](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setItem(value: FC[TimeTableItemProps]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.start
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.end
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.any
  */
  trait TimeTableInsertPosition extends StObject
  object TimeTableInsertPosition {
    
    inline def any: typingsJapgolly.wixStyleReact.wixStyleReactStrings.any = "any".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.any]
    
    inline def end: typingsJapgolly.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.end]
    
    inline def start: typingsJapgolly.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait TimeTableItem extends StObject {
    
    var content: Node | TimeTableContentRenderFunction
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
  }
  object TimeTableItem {
    
    inline def apply(): TimeTableItem = {
      val __obj = js.Dynamic.literal(content = null)
      __obj.asInstanceOf[TimeTableItem]
    }
    
    extension [Self <: TimeTableItem](x: Self) {
      
      inline def setContent(value: Node | TimeTableContentRenderFunction): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction1(value: /* data */ TimeTableContentRenderFunctionData => Node): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    }
  }
  
  trait TimeTableItemProps extends StObject {
    
    var disabled: Boolean
    
    var draggable: Boolean
  }
  object TimeTableItemProps {
    
    inline def apply(disabled: Boolean, draggable: Boolean): TimeTableItemProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTableItemProps]
    }
    
    extension [Self <: TimeTableItemProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeTableProps extends StObject {
    
    var addItemButtonLabel: js.UndefOr[Node] = js.undefined
    
    var columns: js.UndefOr[js.Array[TimeTableColumn]] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var insertPosition: js.UndefOr[TimeTableInsertPosition] = js.undefined
    
    var onAdd: js.UndefOr[js.Function1[/* columnIndex */ Double, Unit]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* columns */ js.Array[TimeTableColumn], /* details */ TimeTableChangeDetails, Unit]
      ] = js.undefined
  }
  object TimeTableProps {
    
    inline def apply(): TimeTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeTableProps]
    }
    
    extension [Self <: TimeTableProps](x: Self) {
      
      inline def setAddItemButtonLabel(value: VdomNode): Self = StObject.set(x, "addItemButtonLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAddItemButtonLabelNull: Self = StObject.set(x, "addItemButtonLabel", null)
      
      inline def setAddItemButtonLabelUndefined: Self = StObject.set(x, "addItemButtonLabel", js.undefined)
      
      inline def setAddItemButtonLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "addItemButtonLabel", js.Array(value*))
      
      inline def setAddItemButtonLabelVdomElement(value: VdomElement): Self = StObject.set(x, "addItemButtonLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColumns(value: js.Array[TimeTableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: TimeTableColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInsertPosition(value: TimeTableInsertPosition): Self = StObject.set(x, "insertPosition", value.asInstanceOf[js.Any])
      
      inline def setInsertPositionUndefined: Self = StObject.set(x, "insertPosition", js.undefined)
      
      inline def setOnAdd(value: /* columnIndex */ Double => Callback): Self = StObject.set(x, "onAdd", js.Any.fromFunction1((t0: /* columnIndex */ Double) => value(t0).runNow()))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnChange(value: (/* columns */ js.Array[TimeTableColumn], /* details */ TimeTableChangeDetails) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* columns */ js.Array[TimeTableColumn], t1: /* details */ TimeTableChangeDetails) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
