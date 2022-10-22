package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.Index
import typingsJapgolly.baseui.anon.LabelKey
import typingsJapgolly.baseui.anon.Option
import typingsJapgolly.baseui.selectSelectComponentMod.default
import typingsJapgolly.baseui.selectTypesMod.ControlRef
import typingsJapgolly.baseui.selectTypesMod.OnChangeParams
import typingsJapgolly.baseui.selectTypesMod.Options
import typingsJapgolly.baseui.selectTypesMod.SelectOverrides
import typingsJapgolly.baseui.selectTypesMod.SelectProps
import typingsJapgolly.baseui.selectTypesMod.Size
import typingsJapgolly.baseui.selectTypesMod.Type
import typingsJapgolly.baseui.selectTypesMod.Value
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectComponent {
  
  @JSImport("baseui/select/select-component", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-describedbyNull`: this.type = set("aria-describedby", null)
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessageNull`: this.type = set("aria-errormessage", null)
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelNull`: this.type = set("aria-label", null)
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledbyNull`: this.type = set("aria-labelledby", null)
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def backspaceClearsInputValue(value: Boolean): this.type = set("backspaceClearsInputValue", value.asInstanceOf[js.Any])
    
    inline def backspaceRemoves(value: Boolean): this.type = set("backspaceRemoves", value.asInstanceOf[js.Any])
    
    inline def clearable(value: Boolean): this.type = set("clearable", value.asInstanceOf[js.Any])
    
    inline def closeOnSelect(value: Boolean): this.type = set("closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def controlRef(value: ControlRef): this.type = set("controlRef", value.asInstanceOf[js.Any])
    
    inline def creatable(value: Boolean): this.type = set("creatable", value.asInstanceOf[js.Any])
    
    inline def deleteRemoves(value: Boolean): this.type = set("deleteRemoves", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def escapeClearsValue(value: Boolean): this.type = set("escapeClearsValue", value.asInstanceOf[js.Any])
    
    inline def filterOptions(
      value: (/* options */ Value, /* filterValue */ String, /* excludeOptions */ js.UndefOr[Value | Null], /* a */ LabelKey) => Value
    ): this.type = set("filterOptions", js.Any.fromFunction4(value))
    
    inline def filterOptionsNull: this.type = set("filterOptions", null)
    
    inline def filterOutSelected(value: Boolean): this.type = set("filterOutSelected", value.asInstanceOf[js.Any])
    
    inline def getOptionLabel(value: /* a */ Option => Node): this.type = set("getOptionLabel", js.Any.fromFunction1(value))
    
    inline def getOptionLabelNull: this.type = set("getOptionLabel", null)
    
    inline def getValueLabel(value: /* a */ Index => Node): this.type = set("getValueLabel", js.Any.fromFunction1(value))
    
    inline def getValueLabelNull: this.type = set("getValueLabel", null)
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def ignoreCase(value: Boolean): this.type = set("ignoreCase", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: Ref[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: HTMLInputElement | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def labelKey(value: String): this.type = set("labelKey", value.asInstanceOf[js.Any])
    
    inline def maxDropdownHeight(value: String): this.type = set("maxDropdownHeight", value.asInstanceOf[js.Any])
    
    inline def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    inline def multi(value: Boolean): this.type = set("multi", value.asInstanceOf[js.Any])
    
    inline def noResultsMsg(value: VdomNode): this.type = set("noResultsMsg", value.rawNode.asInstanceOf[js.Any])
    
    inline def noResultsMsgNull: this.type = set("noResultsMsg", null)
    
    inline def noResultsMsgVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("noResultsMsg", js.Array(value*))
    
    inline def noResultsMsgVdomElement(value: VdomElement): this.type = set("noResultsMsg", value.rawElement.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ ReactFocusEventFrom[org.scalajs.dom.Element] | MouseEvent => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onBlurResetsInput(value: Boolean): this.type = set("onBlurResetsInput", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* params */ OnChangeParams => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onClose(value: CallbackTo[Any]): this.type = set("onClose", value.toJsFn)
    
    inline def onCloseNull: this.type = set("onClose", null)
    
    inline def onCloseResetsInput(value: Boolean): this.type = set("onCloseResetsInput", value.asInstanceOf[js.Any])
    
    inline def onFocus(value: /* e */ ReactEventFrom[HTMLElement] => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onInputChange(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onInputChange", js.Any.fromFunction1(value))
    
    inline def onOpen(value: CallbackTo[Any]): this.type = set("onOpen", value.toJsFn)
    
    inline def onOpenNull: this.type = set("onOpen", null)
    
    inline def onSelectResetsInput(value: Boolean): this.type = set("onSelectResetsInput", value.asInstanceOf[js.Any])
    
    inline def openOnClick(value: Boolean): this.type = set("openOnClick", value.asInstanceOf[js.Any])
    
    inline def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsNull: this.type = set("options", null)
    
    inline def optionsVarargs(value: typingsJapgolly.baseui.selectTypesMod.Option*): this.type = set("options", js.Array(value*))
    
    inline def overrides(value: SelectOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: VdomNode): this.type = set("placeholder", value.rawNode.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def searchable(value: Boolean): this.type = set("searchable", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def startOpen(value: Boolean): this.type = set("startOpen", value.asInstanceOf[js.Any])
    
    inline def `type`(value: Type): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: Value): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueComponent(value: ComponentType[Any]): this.type = set("valueComponent", value.asInstanceOf[js.Any])
    
    inline def valueKey(value: String): this.type = set("valueKey", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: typingsJapgolly.baseui.selectTypesMod.Option*): this.type = set("value", js.Array(value*))
  }
  
  implicit def make(companion: SelectComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
