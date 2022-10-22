package typingsJapgolly.rcSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSelect.libBaseSelectMod.CustomTagProps
import typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType
import typingsJapgolly.rcSelect.libBaseSelectMod.Mode
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.rcSelect.libSelectorMod.RefSelectorProps
import typingsJapgolly.rcSelect.libSelectorMod.SelectorProps
import typingsJapgolly.rcSelect.rcSelectStrings.responsive
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Selector {
  
  inline def apply(
    activeValue: String,
    id: String,
    inputElement: VdomElement,
    mode: Mode,
    onRemove: DisplayValueType => Callback,
    onSearch: (String, Boolean, Boolean) => Boolean,
    onToggleOpen: js.UndefOr[Boolean] => Callback,
    open: Boolean,
    prefixCls: String,
    searchValue: String,
    values: js.Array[DisplayValueType]
  ): Builder = {
    val __props = js.Dynamic.literal(activeValue = activeValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.rawElement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onRemove = js.Any.fromFunction1((t0: DisplayValueType) => onRemove(t0).runNow()), onSearch = js.Any.fromFunction3(onSearch), onToggleOpen = js.Any.fromFunction1((t0: js.UndefOr[Boolean]) => onToggleOpen(t0).runNow()), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectorProps & RefAttributes[RefSelectorProps]]))
  }
  
  @JSImport("rc-select/lib/Selector", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[RefSelectorProps] {
    
    inline def activeDescendantId(value: String): this.type = set("activeDescendantId", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def choiceTransitionName(value: String): this.type = set("choiceTransitionName", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def domRef(value: Ref[HTMLDivElement]): this.type = set("domRef", value.asInstanceOf[js.Any])
    
    inline def domRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("domRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def domRefNull: this.type = set("domRef", null)
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def maxTagCount(value: Double | responsive): this.type = set("maxTagCount", value.asInstanceOf[js.Any])
    
    inline def maxTagPlaceholder(value: Node | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], Node])): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    
    inline def maxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[DisplayValueType] => Node): this.type = set("maxTagPlaceholder", js.Any.fromFunction1(value))
    
    inline def maxTagPlaceholderNull: this.type = set("maxTagPlaceholder", null)
    
    inline def maxTagPlaceholderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("maxTagPlaceholder", js.Array(value*))
    
    inline def maxTagPlaceholderVdomElement(value: VdomElement): this.type = set("maxTagPlaceholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxTagTextLength(value: Double): this.type = set("maxTagTextLength", value.asInstanceOf[js.Any])
    
    inline def onInputKeyDown(
      value: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onInputKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSearchSubmit(value: /* searchText */ String => Callback): this.type = set("onSearchSubmit", js.Any.fromFunction1((t0: /* searchText */ String) => value(t0).runNow()))
    
    inline def placeholder(value: VdomNode): this.type = set("placeholder", value.rawNode.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def removeIcon(value: RenderNode): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    inline def removeIconFunction1(value: /* props */ Any => Node): this.type = set("removeIcon", js.Any.fromFunction1(value))
    
    inline def removeIconNull: this.type = set("removeIcon", null)
    
    inline def removeIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("removeIcon", js.Array(value*))
    
    inline def removeIconVdomElement(value: VdomElement): this.type = set("removeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tagRender(value: /* props */ CustomTagProps => Element): this.type = set("tagRender", js.Any.fromFunction1(value))
    
    inline def tokenWithEnter(value: Boolean): this.type = set("tokenWithEnter", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectorProps & RefAttributes[RefSelectorProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
