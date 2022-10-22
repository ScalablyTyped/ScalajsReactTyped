package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.picklistPicklistMod.PickListChangeParams
import typingsJapgolly.primereact.picklistPicklistMod.PickListEventParams
import typingsJapgolly.primereact.picklistPicklistMod.PickListFilterTemplateOptions
import typingsJapgolly.primereact.picklistPicklistMod.PickListFilterTemplateType
import typingsJapgolly.primereact.picklistPicklistMod.PickListItemTemplateType
import typingsJapgolly.primereact.picklistPicklistMod.PickListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickList {
  
  @JSImport("primereact", "PickList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.PickList] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataKey(value: String): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    inline def filterBy(value: String): this.type = set("filterBy", value.asInstanceOf[js.Any])
    
    inline def filterLocale(value: String): this.type = set("filterLocale", value.asInstanceOf[js.Any])
    
    inline def filterMatchMode(value: String): this.type = set("filterMatchMode", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def itemTemplate(value: PickListItemTemplateType): this.type = set("itemTemplate", value.asInstanceOf[js.Any])
    
    inline def itemTemplateFunction1(value: /* item */ Any => Node): this.type = set("itemTemplate", js.Any.fromFunction1(value))
    
    inline def itemTemplateNull: this.type = set("itemTemplate", null)
    
    inline def itemTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("itemTemplate", js.Array(value*))
    
    inline def itemTemplateVdomElement(value: VdomElement): this.type = set("itemTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def metaKeySelection(value: Boolean): this.type = set("metaKeySelection", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* e */ PickListChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ PickListChangeParams) => value(t0).runNow()))
    
    inline def onMoveAllToSource(value: /* e */ PickListEventParams => Callback): this.type = set("onMoveAllToSource", js.Any.fromFunction1((t0: /* e */ PickListEventParams) => value(t0).runNow()))
    
    inline def onMoveAllToTarget(value: /* e */ PickListEventParams => Callback): this.type = set("onMoveAllToTarget", js.Any.fromFunction1((t0: /* e */ PickListEventParams) => value(t0).runNow()))
    
    inline def onMoveToSource(value: /* e */ PickListEventParams => Callback): this.type = set("onMoveToSource", js.Any.fromFunction1((t0: /* e */ PickListEventParams) => value(t0).runNow()))
    
    inline def onMoveToTarget(value: /* e */ PickListEventParams => Callback): this.type = set("onMoveToTarget", js.Any.fromFunction1((t0: /* e */ PickListEventParams) => value(t0).runNow()))
    
    inline def onSourceFilterChange(value: /* e */ PickListEventParams => Callback): this.type = set("onSourceFilterChange", js.Any.fromFunction1((t0: /* e */ PickListEventParams) => value(t0).runNow()))
    
    inline def onSourceSelectionChange(value: /* e */ PickListEventParams => Callback): this.type = set("onSourceSelectionChange", js.Any.fromFunction1((t0: /* e */ PickListEventParams) => value(t0).runNow()))
    
    inline def onTargetFilterChange(value: /* e */ PickListEventParams => Callback): this.type = set("onTargetFilterChange", js.Any.fromFunction1((t0: /* e */ PickListEventParams) => value(t0).runNow()))
    
    inline def onTargetSelectionChange(value: /* e */ PickListEventParams => Callback): this.type = set("onTargetSelectionChange", js.Any.fromFunction1((t0: /* e */ PickListEventParams) => value(t0).runNow()))
    
    inline def showSourceControls(value: Boolean): this.type = set("showSourceControls", value.asInstanceOf[js.Any])
    
    inline def showSourceFilter(value: Boolean): this.type = set("showSourceFilter", value.asInstanceOf[js.Any])
    
    inline def showTargetControls(value: Boolean): this.type = set("showTargetControls", value.asInstanceOf[js.Any])
    
    inline def showTargetFilter(value: Boolean): this.type = set("showTargetFilter", value.asInstanceOf[js.Any])
    
    inline def source(value: js.Array[Any]): this.type = set("source", value.asInstanceOf[js.Any])
    
    inline def sourceFilterPlaceholder(value: String): this.type = set("sourceFilterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def sourceFilterTemplate(value: PickListFilterTemplateType): this.type = set("sourceFilterTemplate", value.asInstanceOf[js.Any])
    
    inline def sourceFilterTemplateFunction1(value: /* options */ PickListFilterTemplateOptions => Node): this.type = set("sourceFilterTemplate", js.Any.fromFunction1(value))
    
    inline def sourceFilterTemplateNull: this.type = set("sourceFilterTemplate", null)
    
    inline def sourceFilterTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sourceFilterTemplate", js.Array(value*))
    
    inline def sourceFilterTemplateVdomElement(value: VdomElement): this.type = set("sourceFilterTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def sourceFilterValue(value: String): this.type = set("sourceFilterValue", value.asInstanceOf[js.Any])
    
    inline def sourceHeader(value: VdomNode): this.type = set("sourceHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def sourceHeaderNull: this.type = set("sourceHeader", null)
    
    inline def sourceHeaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sourceHeader", js.Array(value*))
    
    inline def sourceHeaderVdomElement(value: VdomElement): this.type = set("sourceHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def sourceItemTemplate(value: PickListItemTemplateType): this.type = set("sourceItemTemplate", value.asInstanceOf[js.Any])
    
    inline def sourceItemTemplateFunction1(value: /* item */ Any => Node): this.type = set("sourceItemTemplate", js.Any.fromFunction1(value))
    
    inline def sourceItemTemplateNull: this.type = set("sourceItemTemplate", null)
    
    inline def sourceItemTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sourceItemTemplate", js.Array(value*))
    
    inline def sourceItemTemplateVdomElement(value: VdomElement): this.type = set("sourceItemTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def sourceSelection(value: Any): this.type = set("sourceSelection", value.asInstanceOf[js.Any])
    
    inline def sourceStyle(value: js.Object): this.type = set("sourceStyle", value.asInstanceOf[js.Any])
    
    inline def sourceVarargs(value: Any*): this.type = set("source", js.Array(value*))
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def target(value: js.Array[Any]): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def targetFilterPlaceholder(value: String): this.type = set("targetFilterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def targetFilterTemplate(value: PickListFilterTemplateType): this.type = set("targetFilterTemplate", value.asInstanceOf[js.Any])
    
    inline def targetFilterTemplateFunction1(value: /* options */ PickListFilterTemplateOptions => Node): this.type = set("targetFilterTemplate", js.Any.fromFunction1(value))
    
    inline def targetFilterTemplateNull: this.type = set("targetFilterTemplate", null)
    
    inline def targetFilterTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("targetFilterTemplate", js.Array(value*))
    
    inline def targetFilterTemplateVdomElement(value: VdomElement): this.type = set("targetFilterTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def targetFilterValue(value: String): this.type = set("targetFilterValue", value.asInstanceOf[js.Any])
    
    inline def targetHeader(value: VdomNode): this.type = set("targetHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def targetHeaderNull: this.type = set("targetHeader", null)
    
    inline def targetHeaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("targetHeader", js.Array(value*))
    
    inline def targetHeaderVdomElement(value: VdomElement): this.type = set("targetHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def targetItemTemplate(value: PickListItemTemplateType): this.type = set("targetItemTemplate", value.asInstanceOf[js.Any])
    
    inline def targetItemTemplateFunction1(value: /* item */ Any => Node): this.type = set("targetItemTemplate", js.Any.fromFunction1(value))
    
    inline def targetItemTemplateNull: this.type = set("targetItemTemplate", null)
    
    inline def targetItemTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("targetItemTemplate", js.Array(value*))
    
    inline def targetItemTemplateVdomElement(value: VdomElement): this.type = set("targetItemTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def targetSelection(value: Any): this.type = set("targetSelection", value.asInstanceOf[js.Any])
    
    inline def targetStyle(value: js.Object): this.type = set("targetStyle", value.asInstanceOf[js.Any])
    
    inline def targetVarargs(value: Any*): this.type = set("target", js.Array(value*))
  }
  
  implicit def make(companion: PickList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
