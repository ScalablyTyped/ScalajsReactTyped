package typingsJapgolly.primereact.treeTreeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var contentClassName: js.UndefOr[String] = js.undefined
  
  var contentStyle: js.UndefOr[js.Object] = js.undefined
  
  var contextMenuSelectionKey: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var dragdropScope: js.UndefOr[String] = js.undefined
  
  var expandedKeys: js.UndefOr[TreeExpandedKeysType] = js.undefined
  
  var filter: js.UndefOr[Boolean] = js.undefined
  
  var filterBy: js.UndefOr[String] = js.undefined
  
  var filterLocale: js.UndefOr[String] = js.undefined
  
  var filterMode: js.UndefOr[TreeFilterModeType] = js.undefined
  
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  
  var filterTemplate: js.UndefOr[TreeFilterTemplateType] = js.undefined
  
  var filterValue: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[TreeFooterTemplateType] = js.undefined
  
  var header: js.UndefOr[TreeHeaderTemplateType] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var loadingIcon: js.UndefOr[String] = js.undefined
  
  var metaKeySelection: js.UndefOr[Boolean] = js.undefined
  
  var nodeTemplate: js.UndefOr[TreeNodeTemplateType] = js.undefined
  
  var onCollapse: js.UndefOr[js.Function1[/* e */ TreeEventNodeParams, Unit]] = js.undefined
  
  var onContextMenu: js.UndefOr[js.Function1[/* e */ TreeEventNodeParams, Unit]] = js.undefined
  
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ TreeSelectionParams, Unit]] = js.undefined
  
  var onDragDrop: js.UndefOr[js.Function1[/* e */ TreeDragDropParams, Unit]] = js.undefined
  
  var onExpand: js.UndefOr[js.Function1[/* e */ TreeEventNodeParams, Unit]] = js.undefined
  
  var onFilterValueChange: js.UndefOr[js.Function1[/* e */ TreeFilterValueChangeParams, Unit]] = js.undefined
  
  var onNodeClick: js.UndefOr[js.Function1[/* e */ TreeNodeClickParams, Unit]] = js.undefined
  
  var onNodeDoubleClick: js.UndefOr[js.Function1[/* e */ TreeNodeDoubleClickParams, Unit]] = js.undefined
  
  var onSelect: js.UndefOr[js.Function1[/* e */ TreeEventNodeParams, Unit]] = js.undefined
  
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ TreeSelectionParams, Unit]] = js.undefined
  
  var onToggle: js.UndefOr[js.Function1[/* e */ TreeExpandedParams, Unit]] = js.undefined
  
  var onUnselect: js.UndefOr[js.Function1[/* e */ TreeEventNodeParams, Unit]] = js.undefined
  
  var propagateSelectionDown: js.UndefOr[Boolean] = js.undefined
  
  var propagateSelectionUp: js.UndefOr[Boolean] = js.undefined
  
  var selectionKeys: js.UndefOr[TreeSelectionKeys] = js.undefined
  
  var selectionMode: js.UndefOr[TreeSelectionModeType] = js.undefined
  
  var showHeader: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[js.Object] = js.undefined
  
  var togglerTemplate: js.UndefOr[TreeTogglerTemplateType] = js.undefined
  
  var value: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
    ]
  ] = js.undefined
}
object TreeProps {
  
  inline def apply(): TreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeProps]
  }
  
  extension [Self <: TreeProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
    
    inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
    
    inline def setContentStyle(value: js.Object): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setContextMenuSelectionKey(value: String): Self = StObject.set(x, "contextMenuSelectionKey", value.asInstanceOf[js.Any])
    
    inline def setContextMenuSelectionKeyUndefined: Self = StObject.set(x, "contextMenuSelectionKey", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDragdropScope(value: String): Self = StObject.set(x, "dragdropScope", value.asInstanceOf[js.Any])
    
    inline def setDragdropScopeUndefined: Self = StObject.set(x, "dragdropScope", js.undefined)
    
    inline def setExpandedKeys(value: TreeExpandedKeysType): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
    
    inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterBy(value: String): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
    
    inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    inline def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
    
    inline def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
    
    inline def setFilterMode(value: TreeFilterModeType): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
    
    inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
    
    inline def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
    
    inline def setFilterTemplate(value: TreeFilterTemplateType): Self = StObject.set(x, "filterTemplate", value.asInstanceOf[js.Any])
    
    inline def setFilterTemplateFunction1(value: /* options */ TreeFilterOptions => Node): Self = StObject.set(x, "filterTemplate", js.Any.fromFunction1(value))
    
    inline def setFilterTemplateNull: Self = StObject.set(x, "filterTemplate", null)
    
    inline def setFilterTemplateUndefined: Self = StObject.set(x, "filterTemplate", js.undefined)
    
    inline def setFilterTemplateVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "filterTemplate", js.Array(value*))
    
    inline def setFilterTemplateVdomElement(value: VdomElement): Self = StObject.set(x, "filterTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    
    inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
    
    inline def setFooter(value: TreeFooterTemplateType): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterFunction1(value: /* props */ TreeProps => Node): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
    
    inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHeader(value: TreeHeaderTemplateType): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderFunction1(value: /* options */ TreeHeaderTemplateOptions => Node): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingIcon(value: String): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
    
    inline def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
    
    inline def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
    
    inline def setNodeTemplate(value: TreeNodeTemplateType): Self = StObject.set(x, "nodeTemplate", value.asInstanceOf[js.Any])
    
    inline def setNodeTemplateFunction2(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, /* options */ TreeNodeTemplateOptions) => Node
    ): Self = StObject.set(x, "nodeTemplate", js.Any.fromFunction2(value))
    
    inline def setNodeTemplateNull: Self = StObject.set(x, "nodeTemplate", null)
    
    inline def setNodeTemplateUndefined: Self = StObject.set(x, "nodeTemplate", js.undefined)
    
    inline def setNodeTemplateVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "nodeTemplate", js.Array(value*))
    
    inline def setNodeTemplateVdomElement(value: VdomElement): Self = StObject.set(x, "nodeTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnCollapse(value: /* e */ TreeEventNodeParams => Callback): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1((t0: /* e */ TreeEventNodeParams) => value(t0).runNow()))
    
    inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
    
    inline def setOnContextMenu(value: /* e */ TreeEventNodeParams => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: /* e */ TreeEventNodeParams) => value(t0).runNow()))
    
    inline def setOnContextMenuSelectionChange(value: /* e */ TreeSelectionParams => Callback): Self = StObject.set(x, "onContextMenuSelectionChange", js.Any.fromFunction1((t0: /* e */ TreeSelectionParams) => value(t0).runNow()))
    
    inline def setOnContextMenuSelectionChangeUndefined: Self = StObject.set(x, "onContextMenuSelectionChange", js.undefined)
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnDragDrop(value: /* e */ TreeDragDropParams => Callback): Self = StObject.set(x, "onDragDrop", js.Any.fromFunction1((t0: /* e */ TreeDragDropParams) => value(t0).runNow()))
    
    inline def setOnDragDropUndefined: Self = StObject.set(x, "onDragDrop", js.undefined)
    
    inline def setOnExpand(value: /* e */ TreeEventNodeParams => Callback): Self = StObject.set(x, "onExpand", js.Any.fromFunction1((t0: /* e */ TreeEventNodeParams) => value(t0).runNow()))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    inline def setOnFilterValueChange(value: /* e */ TreeFilterValueChangeParams => Callback): Self = StObject.set(x, "onFilterValueChange", js.Any.fromFunction1((t0: /* e */ TreeFilterValueChangeParams) => value(t0).runNow()))
    
    inline def setOnFilterValueChangeUndefined: Self = StObject.set(x, "onFilterValueChange", js.undefined)
    
    inline def setOnNodeClick(value: /* e */ TreeNodeClickParams => Callback): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction1((t0: /* e */ TreeNodeClickParams) => value(t0).runNow()))
    
    inline def setOnNodeClickUndefined: Self = StObject.set(x, "onNodeClick", js.undefined)
    
    inline def setOnNodeDoubleClick(value: /* e */ TreeNodeDoubleClickParams => Callback): Self = StObject.set(x, "onNodeDoubleClick", js.Any.fromFunction1((t0: /* e */ TreeNodeDoubleClickParams) => value(t0).runNow()))
    
    inline def setOnNodeDoubleClickUndefined: Self = StObject.set(x, "onNodeDoubleClick", js.undefined)
    
    inline def setOnSelect(value: /* e */ TreeEventNodeParams => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* e */ TreeEventNodeParams) => value(t0).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnSelectionChange(value: /* e */ TreeSelectionParams => Callback): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1((t0: /* e */ TreeSelectionParams) => value(t0).runNow()))
    
    inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
    
    inline def setOnToggle(value: /* e */ TreeExpandedParams => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction1((t0: /* e */ TreeExpandedParams) => value(t0).runNow()))
    
    inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    
    inline def setOnUnselect(value: /* e */ TreeEventNodeParams => Callback): Self = StObject.set(x, "onUnselect", js.Any.fromFunction1((t0: /* e */ TreeEventNodeParams) => value(t0).runNow()))
    
    inline def setOnUnselectUndefined: Self = StObject.set(x, "onUnselect", js.undefined)
    
    inline def setPropagateSelectionDown(value: Boolean): Self = StObject.set(x, "propagateSelectionDown", value.asInstanceOf[js.Any])
    
    inline def setPropagateSelectionDownUndefined: Self = StObject.set(x, "propagateSelectionDown", js.undefined)
    
    inline def setPropagateSelectionUp(value: Boolean): Self = StObject.set(x, "propagateSelectionUp", value.asInstanceOf[js.Any])
    
    inline def setPropagateSelectionUpUndefined: Self = StObject.set(x, "propagateSelectionUp", js.undefined)
    
    inline def setSelectionKeys(value: TreeSelectionKeys): Self = StObject.set(x, "selectionKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectionKeysNull: Self = StObject.set(x, "selectionKeys", null)
    
    inline def setSelectionKeysUndefined: Self = StObject.set(x, "selectionKeys", js.undefined)
    
    inline def setSelectionMode(value: TreeSelectionModeType): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
    
    inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTogglerTemplate(value: TreeTogglerTemplateType): Self = StObject.set(x, "togglerTemplate", value.asInstanceOf[js.Any])
    
    inline def setTogglerTemplateFunction2(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, /* options */ TreeTogglerTemplateOptions) => Node
    ): Self = StObject.set(x, "togglerTemplate", js.Any.fromFunction2(value))
    
    inline def setTogglerTemplateNull: Self = StObject.set(x, "togglerTemplate", null)
    
    inline def setTogglerTemplateUndefined: Self = StObject.set(x, "togglerTemplate", js.undefined)
    
    inline def setTogglerTemplateVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "togglerTemplate", js.Array(value*))
    
    inline def setTogglerTemplateVdomElement(value: VdomElement): Self = StObject.set(x, "togglerTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def setValue(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
        ]
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any)*
    ): Self = StObject.set(x, "value", js.Array(value*))
  }
}
