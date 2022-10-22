package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.treeTreeMod.TreeDragDropParams
import typingsJapgolly.primereact.treeTreeMod.TreeEventNodeParams
import typingsJapgolly.primereact.treeTreeMod.TreeExpandedKeysType
import typingsJapgolly.primereact.treeTreeMod.TreeExpandedParams
import typingsJapgolly.primereact.treeTreeMod.TreeFilterModeType
import typingsJapgolly.primereact.treeTreeMod.TreeFilterOptions
import typingsJapgolly.primereact.treeTreeMod.TreeFilterTemplateType
import typingsJapgolly.primereact.treeTreeMod.TreeFilterValueChangeParams
import typingsJapgolly.primereact.treeTreeMod.TreeFooterTemplateType
import typingsJapgolly.primereact.treeTreeMod.TreeHeaderTemplateOptions
import typingsJapgolly.primereact.treeTreeMod.TreeHeaderTemplateType
import typingsJapgolly.primereact.treeTreeMod.TreeNodeClickParams
import typingsJapgolly.primereact.treeTreeMod.TreeNodeDoubleClickParams
import typingsJapgolly.primereact.treeTreeMod.TreeNodeTemplateOptions
import typingsJapgolly.primereact.treeTreeMod.TreeNodeTemplateType
import typingsJapgolly.primereact.treeTreeMod.TreeProps
import typingsJapgolly.primereact.treeTreeMod.TreeSelectionKeys
import typingsJapgolly.primereact.treeTreeMod.TreeSelectionModeType
import typingsJapgolly.primereact.treeTreeMod.TreeSelectionParams
import typingsJapgolly.primereact.treeTreeMod.TreeTogglerTemplateOptions
import typingsJapgolly.primereact.treeTreeMod.TreeTogglerTemplateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tree {
  
  @JSImport("primereact", "Tree")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.Tree] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: js.Object): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def contextMenuSelectionKey(value: String): this.type = set("contextMenuSelectionKey", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dragdropScope(value: String): this.type = set("dragdropScope", value.asInstanceOf[js.Any])
    
    inline def expandedKeys(value: TreeExpandedKeysType): this.type = set("expandedKeys", value.asInstanceOf[js.Any])
    
    inline def filter(value: Boolean): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def filterBy(value: String): this.type = set("filterBy", value.asInstanceOf[js.Any])
    
    inline def filterLocale(value: String): this.type = set("filterLocale", value.asInstanceOf[js.Any])
    
    inline def filterMode(value: TreeFilterModeType): this.type = set("filterMode", value.asInstanceOf[js.Any])
    
    inline def filterPlaceholder(value: String): this.type = set("filterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def filterTemplate(value: TreeFilterTemplateType): this.type = set("filterTemplate", value.asInstanceOf[js.Any])
    
    inline def filterTemplateFunction1(value: /* options */ TreeFilterOptions => Node): this.type = set("filterTemplate", js.Any.fromFunction1(value))
    
    inline def filterTemplateNull: this.type = set("filterTemplate", null)
    
    inline def filterTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("filterTemplate", js.Array(value*))
    
    inline def filterTemplateVdomElement(value: VdomElement): this.type = set("filterTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def filterValue(value: String): this.type = set("filterValue", value.asInstanceOf[js.Any])
    
    inline def footer(value: TreeFooterTemplateType): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def footerFunction1(value: /* props */ TreeProps => Node): this.type = set("footer", js.Any.fromFunction1(value))
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def header(value: TreeHeaderTemplateType): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerFunction1(value: /* options */ TreeHeaderTemplateOptions => Node): this.type = set("header", js.Any.fromFunction1(value))
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def loadingIcon(value: String): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
    
    inline def metaKeySelection(value: Boolean): this.type = set("metaKeySelection", value.asInstanceOf[js.Any])
    
    inline def nodeTemplate(value: TreeNodeTemplateType): this.type = set("nodeTemplate", value.asInstanceOf[js.Any])
    
    inline def nodeTemplateFunction2(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, /* options */ TreeNodeTemplateOptions) => Node
    ): this.type = set("nodeTemplate", js.Any.fromFunction2(value))
    
    inline def nodeTemplateNull: this.type = set("nodeTemplate", null)
    
    inline def nodeTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nodeTemplate", js.Array(value*))
    
    inline def nodeTemplateVdomElement(value: VdomElement): this.type = set("nodeTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def onCollapse(value: /* e */ TreeEventNodeParams => Callback): this.type = set("onCollapse", js.Any.fromFunction1((t0: /* e */ TreeEventNodeParams) => value(t0).runNow()))
    
    inline def onContextMenu(value: /* e */ TreeEventNodeParams => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: /* e */ TreeEventNodeParams) => value(t0).runNow()))
    
    inline def onContextMenuSelectionChange(value: /* e */ TreeSelectionParams => Callback): this.type = set("onContextMenuSelectionChange", js.Any.fromFunction1((t0: /* e */ TreeSelectionParams) => value(t0).runNow()))
    
    inline def onDragDrop(value: /* e */ TreeDragDropParams => Callback): this.type = set("onDragDrop", js.Any.fromFunction1((t0: /* e */ TreeDragDropParams) => value(t0).runNow()))
    
    inline def onExpand(value: /* e */ TreeEventNodeParams => Callback): this.type = set("onExpand", js.Any.fromFunction1((t0: /* e */ TreeEventNodeParams) => value(t0).runNow()))
    
    inline def onFilterValueChange(value: /* e */ TreeFilterValueChangeParams => Callback): this.type = set("onFilterValueChange", js.Any.fromFunction1((t0: /* e */ TreeFilterValueChangeParams) => value(t0).runNow()))
    
    inline def onNodeClick(value: /* e */ TreeNodeClickParams => Callback): this.type = set("onNodeClick", js.Any.fromFunction1((t0: /* e */ TreeNodeClickParams) => value(t0).runNow()))
    
    inline def onNodeDoubleClick(value: /* e */ TreeNodeDoubleClickParams => Callback): this.type = set("onNodeDoubleClick", js.Any.fromFunction1((t0: /* e */ TreeNodeDoubleClickParams) => value(t0).runNow()))
    
    inline def onSelect(value: /* e */ TreeEventNodeParams => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* e */ TreeEventNodeParams) => value(t0).runNow()))
    
    inline def onSelectionChange(value: /* e */ TreeSelectionParams => Callback): this.type = set("onSelectionChange", js.Any.fromFunction1((t0: /* e */ TreeSelectionParams) => value(t0).runNow()))
    
    inline def onToggle(value: /* e */ TreeExpandedParams => Callback): this.type = set("onToggle", js.Any.fromFunction1((t0: /* e */ TreeExpandedParams) => value(t0).runNow()))
    
    inline def onUnselect(value: /* e */ TreeEventNodeParams => Callback): this.type = set("onUnselect", js.Any.fromFunction1((t0: /* e */ TreeEventNodeParams) => value(t0).runNow()))
    
    inline def propagateSelectionDown(value: Boolean): this.type = set("propagateSelectionDown", value.asInstanceOf[js.Any])
    
    inline def propagateSelectionUp(value: Boolean): this.type = set("propagateSelectionUp", value.asInstanceOf[js.Any])
    
    inline def selectionKeys(value: TreeSelectionKeys): this.type = set("selectionKeys", value.asInstanceOf[js.Any])
    
    inline def selectionKeysNull: this.type = set("selectionKeys", null)
    
    inline def selectionMode(value: TreeSelectionModeType): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def showHeader(value: Boolean): this.type = set("showHeader", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def togglerTemplate(value: TreeTogglerTemplateType): this.type = set("togglerTemplate", value.asInstanceOf[js.Any])
    
    inline def togglerTemplateFunction2(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, /* options */ TreeTogglerTemplateOptions) => Node
    ): this.type = set("togglerTemplate", js.Any.fromFunction2(value))
    
    inline def togglerTemplateNull: this.type = set("togglerTemplate", null)
    
    inline def togglerTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("togglerTemplate", js.Array(value*))
    
    inline def togglerTemplateVdomElement(value: VdomElement): this.type = set("togglerTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def value(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
        ]
    ): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any)*
    ): this.type = set("value", js.Array(value*))
  }
  
  implicit def make(companion: Tree.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TreeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
