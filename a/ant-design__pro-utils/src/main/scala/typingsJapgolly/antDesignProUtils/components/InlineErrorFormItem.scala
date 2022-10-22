package typingsJapgolly.antDesignProUtils.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.default
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.popover
import typingsJapgolly.antDesignProUtils.esComponentsInlineErrorFormItemMod.InlineErrorFormItemProps
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.antdStrings.parallel
import typingsJapgolly.antd.libFormFormItemLabelMod.LabelTooltipType
import typingsJapgolly.antd.libFormFormItemMod.ChildrenType
import typingsJapgolly.antd.libFormFormItemMod.ValidateStatus
import typingsJapgolly.antd.libFormFormMod.RequiredMark
import typingsJapgolly.antd.libFormInterfaceMod.FormLabelAlign
import typingsJapgolly.antd.libGridColMod.ColProps
import typingsJapgolly.antd.libPopoverMod.PopoverProps
import typingsJapgolly.rcFieldForm.anon.Metadestroybooleanundefin
import typingsJapgolly.rcFieldForm.anon.Source
import typingsJapgolly.rcFieldForm.esFieldMod.ShouldUpdate
import typingsJapgolly.rcFieldForm.esInterfaceMod.EventArgs
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import typingsJapgolly.rcFieldForm.esInterfaceMod.Rule
import typingsJapgolly.rcFieldForm.esInterfaceMod.Store
import typingsJapgolly.rcFieldForm.esInterfaceMod.StoreValue
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlineErrorFormItem {
  
  @JSImport("@ant-design/pro-utils", "InlineErrorFormItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: ChildrenType[Any]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* form */ FormInstance[Any] => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def colon(value: Boolean): this.type = set("colon", value.asInstanceOf[js.Any])
    
    inline def dependencies(value: js.Array[NamePath]): this.type = set("dependencies", value.asInstanceOf[js.Any])
    
    inline def dependenciesVarargs(value: NamePath*): this.type = set("dependencies", js.Array(value*))
    
    inline def errorType(value: popover | default): this.type = set("errorType", value.asInstanceOf[js.Any])
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def fieldId(value: String): this.type = set("fieldId", value.asInstanceOf[js.Any])
    
    inline def fieldKey(value: Key | js.Array[Key]): this.type = set("fieldKey", value.asInstanceOf[js.Any])
    
    inline def fieldKeyVarargs(value: Key*): this.type = set("fieldKey", js.Array(value*))
    
    inline def getValueFromEvent(value: /* args */ EventArgs => StoreValue): this.type = set("getValueFromEvent", js.Any.fromFunction1(value))
    
    inline def getValueProps(value: /* value */ StoreValue => Record[String, Any]): this.type = set("getValueProps", js.Any.fromFunction1(value))
    
    inline def hasFeedback(value: Boolean): this.type = set("hasFeedback", value.asInstanceOf[js.Any])
    
    inline def help(value: VdomNode): this.type = set("help", value.rawNode.asInstanceOf[js.Any])
    
    inline def helpNull: this.type = set("help", null)
    
    inline def helpVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("help", js.Array(value*))
    
    inline def helpVdomElement(value: VdomElement): this.type = set("help", value.rawElement.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def initialValue(value: Any): this.type = set("initialValue", value.asInstanceOf[js.Any])
    
    inline def isList(value: Boolean): this.type = set("isList", value.asInstanceOf[js.Any])
    
    inline def isListField(value: Boolean): this.type = set("isListField", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelAlign(value: FormLabelAlign): this.type = set("labelAlign", value.asInstanceOf[js.Any])
    
    inline def labelCol(value: ColProps): this.type = set("labelCol", value.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def messageVariables(value: Record[String, String]): this.type = set("messageVariables", value.asInstanceOf[js.Any])
    
    inline def name(value: NamePath): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nameVarargs(value: (String | Double)*): this.type = set("name", js.Array(value*))
    
    inline def noStyle(value: Boolean): this.type = set("noStyle", value.asInstanceOf[js.Any])
    
    inline def normalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): this.type = set("normalize", js.Any.fromFunction3(value))
    
    inline def onMetaChange(value: /* meta */ Metadestroybooleanundefin => Callback): this.type = set("onMetaChange", js.Any.fromFunction1((t0: /* meta */ Metadestroybooleanundefin) => value(t0).runNow()))
    
    inline def onReset(value: Callback): this.type = set("onReset", value.toJsFn)
    
    inline def popoverProps(value: PopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def preserve(value: Boolean): this.type = set("preserve", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def requiredMark(value: RequiredMark): this.type = set("requiredMark", value.asInstanceOf[js.Any])
    
    inline def rules(value: js.Array[Rule]): this.type = set("rules", value.asInstanceOf[js.Any])
    
    inline def rulesVarargs(value: Rule*): this.type = set("rules", js.Array(value*))
    
    inline def shouldUpdate(value: ShouldUpdate[Any]): this.type = set("shouldUpdate", value.asInstanceOf[js.Any])
    
    inline def shouldUpdateFunction3(value: (Any, Any, /* info */ Source) => Boolean): this.type = set("shouldUpdate", js.Any.fromFunction3(value))
    
    inline def status(value: ValidateStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: LabelTooltipType): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def tooltipNull: this.type = set("tooltip", null)
    
    inline def tooltipVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tooltip", js.Array(value*))
    
    inline def tooltipVdomElement(value: VdomElement): this.type = set("tooltip", value.rawElement.asInstanceOf[js.Any])
    
    inline def trigger(value: String): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    inline def validateFirst(value: Boolean | parallel): this.type = set("validateFirst", value.asInstanceOf[js.Any])
    
    inline def validateStatus(value: ValidateStatus): this.type = set("validateStatus", value.asInstanceOf[js.Any])
    
    inline def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
    
    inline def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value*))
    
    inline def valuePropName(value: String): this.type = set("valuePropName", value.asInstanceOf[js.Any])
    
    inline def wrapperCol(value: ColProps): this.type = set("wrapperCol", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InlineErrorFormItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InlineErrorFormItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
