package typingsJapgolly.antd.libTableInterfaceMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableLocale extends StObject {
  
  var cancelSort: js.UndefOr[String] = js.undefined
  
  var collapse: js.UndefOr[String] = js.undefined
  
  var emptyText: js.UndefOr[Node | js.Function0[Node]] = js.undefined
  
  var expand: js.UndefOr[String] = js.undefined
  
  var filterCheckall: js.UndefOr[Node] = js.undefined
  
  var filterConfirm: js.UndefOr[Node] = js.undefined
  
  var filterEmptyText: js.UndefOr[Node] = js.undefined
  
  var filterReset: js.UndefOr[Node] = js.undefined
  
  var filterSearchPlaceholder: js.UndefOr[String] = js.undefined
  
  var filterTitle: js.UndefOr[String] = js.undefined
  
  var selectAll: js.UndefOr[Node] = js.undefined
  
  var selectInvert: js.UndefOr[Node] = js.undefined
  
  var selectNone: js.UndefOr[Node] = js.undefined
  
  var selectionAll: js.UndefOr[Node] = js.undefined
  
  var sortTitle: js.UndefOr[String] = js.undefined
  
  var triggerAsc: js.UndefOr[String] = js.undefined
  
  var triggerDesc: js.UndefOr[String] = js.undefined
}
object TableLocale {
  
  inline def apply(): TableLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableLocale]
  }
  
  extension [Self <: TableLocale](x: Self) {
    
    inline def setCancelSort(value: String): Self = StObject.set(x, "cancelSort", value.asInstanceOf[js.Any])
    
    inline def setCancelSortUndefined: Self = StObject.set(x, "cancelSort", js.undefined)
    
    inline def setCollapse(value: String): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setEmptyText(value: Node | js.Function0[Node]): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    
    inline def setEmptyTextCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "emptyText", value.toJsFn)
    
    inline def setEmptyTextNull: Self = StObject.set(x, "emptyText", null)
    
    inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
    
    inline def setEmptyTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyText", js.Array(value*))
    
    inline def setEmptyTextVdomElement(value: VdomElement): Self = StObject.set(x, "emptyText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFilterCheckall(value: VdomNode): Self = StObject.set(x, "filterCheckall", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFilterCheckallNull: Self = StObject.set(x, "filterCheckall", null)
    
    inline def setFilterCheckallUndefined: Self = StObject.set(x, "filterCheckall", js.undefined)
    
    inline def setFilterCheckallVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "filterCheckall", js.Array(value*))
    
    inline def setFilterCheckallVdomElement(value: VdomElement): Self = StObject.set(x, "filterCheckall", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterConfirm(value: VdomNode): Self = StObject.set(x, "filterConfirm", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFilterConfirmNull: Self = StObject.set(x, "filterConfirm", null)
    
    inline def setFilterConfirmUndefined: Self = StObject.set(x, "filterConfirm", js.undefined)
    
    inline def setFilterConfirmVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "filterConfirm", js.Array(value*))
    
    inline def setFilterConfirmVdomElement(value: VdomElement): Self = StObject.set(x, "filterConfirm", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterEmptyText(value: VdomNode): Self = StObject.set(x, "filterEmptyText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFilterEmptyTextNull: Self = StObject.set(x, "filterEmptyText", null)
    
    inline def setFilterEmptyTextUndefined: Self = StObject.set(x, "filterEmptyText", js.undefined)
    
    inline def setFilterEmptyTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "filterEmptyText", js.Array(value*))
    
    inline def setFilterEmptyTextVdomElement(value: VdomElement): Self = StObject.set(x, "filterEmptyText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterReset(value: VdomNode): Self = StObject.set(x, "filterReset", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFilterResetNull: Self = StObject.set(x, "filterReset", null)
    
    inline def setFilterResetUndefined: Self = StObject.set(x, "filterReset", js.undefined)
    
    inline def setFilterResetVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "filterReset", js.Array(value*))
    
    inline def setFilterResetVdomElement(value: VdomElement): Self = StObject.set(x, "filterReset", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterSearchPlaceholder(value: String): Self = StObject.set(x, "filterSearchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setFilterSearchPlaceholderUndefined: Self = StObject.set(x, "filterSearchPlaceholder", js.undefined)
    
    inline def setFilterTitle(value: String): Self = StObject.set(x, "filterTitle", value.asInstanceOf[js.Any])
    
    inline def setFilterTitleUndefined: Self = StObject.set(x, "filterTitle", js.undefined)
    
    inline def setSelectAll(value: VdomNode): Self = StObject.set(x, "selectAll", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSelectAllNull: Self = StObject.set(x, "selectAll", null)
    
    inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    inline def setSelectAllVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selectAll", js.Array(value*))
    
    inline def setSelectAllVdomElement(value: VdomElement): Self = StObject.set(x, "selectAll", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSelectInvert(value: VdomNode): Self = StObject.set(x, "selectInvert", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSelectInvertNull: Self = StObject.set(x, "selectInvert", null)
    
    inline def setSelectInvertUndefined: Self = StObject.set(x, "selectInvert", js.undefined)
    
    inline def setSelectInvertVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selectInvert", js.Array(value*))
    
    inline def setSelectInvertVdomElement(value: VdomElement): Self = StObject.set(x, "selectInvert", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSelectNone(value: VdomNode): Self = StObject.set(x, "selectNone", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSelectNoneNull: Self = StObject.set(x, "selectNone", null)
    
    inline def setSelectNoneUndefined: Self = StObject.set(x, "selectNone", js.undefined)
    
    inline def setSelectNoneVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selectNone", js.Array(value*))
    
    inline def setSelectNoneVdomElement(value: VdomElement): Self = StObject.set(x, "selectNone", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSelectionAll(value: VdomNode): Self = StObject.set(x, "selectionAll", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSelectionAllNull: Self = StObject.set(x, "selectionAll", null)
    
    inline def setSelectionAllUndefined: Self = StObject.set(x, "selectionAll", js.undefined)
    
    inline def setSelectionAllVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selectionAll", js.Array(value*))
    
    inline def setSelectionAllVdomElement(value: VdomElement): Self = StObject.set(x, "selectionAll", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSortTitle(value: String): Self = StObject.set(x, "sortTitle", value.asInstanceOf[js.Any])
    
    inline def setSortTitleUndefined: Self = StObject.set(x, "sortTitle", js.undefined)
    
    inline def setTriggerAsc(value: String): Self = StObject.set(x, "triggerAsc", value.asInstanceOf[js.Any])
    
    inline def setTriggerAscUndefined: Self = StObject.set(x, "triggerAsc", js.undefined)
    
    inline def setTriggerDesc(value: String): Self = StObject.set(x, "triggerDesc", value.asInstanceOf[js.Any])
    
    inline def setTriggerDescUndefined: Self = StObject.set(x, "triggerDesc", js.undefined)
  }
}
