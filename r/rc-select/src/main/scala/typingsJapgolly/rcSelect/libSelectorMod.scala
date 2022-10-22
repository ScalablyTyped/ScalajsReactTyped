package typingsJapgolly.rcSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.rcSelect.libBaseSelectMod.CustomTagProps
import typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType
import typingsJapgolly.rcSelect.libBaseSelectMod.Mode
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.rcSelect.rcSelectStrings.responsive
import typingsJapgolly.rcVirtualList.esListMod.ScrollConfig
import typingsJapgolly.rcVirtualList.esListMod.ScrollTo
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SelectorProps & RefAttributes[RefSelectorProps]] = js.native
  
  trait InnerSelectorProps extends StObject {
    
    var activeDescendantId: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var inputRef: Ref[HTMLInputElement | HTMLTextAreaElement]
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var mode: Mode
    
    var onInputChange: ChangeEventHandler[HTMLInputElement | HTMLTextAreaElement]
    
    var onInputCompositionEnd: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement]
    
    var onInputCompositionStart: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement]
    
    var onInputKeyDown: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement]
    
    var onInputMouseDown: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement]
    
    var onInputPaste: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement]
    
    var open: Boolean
    
    var placeholder: js.UndefOr[Node] = js.undefined
    
    var prefixCls: String
    
    var searchValue: String
    
    var showSearch: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var values: js.Array[DisplayValueType]
  }
  object InnerSelectorProps {
    
    inline def apply(
      id: String,
      mode: Mode,
      onInputChange: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
      onInputCompositionEnd: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
      onInputCompositionStart: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
      onInputKeyDown: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
      onInputMouseDown: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
      onInputPaste: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
      open: Boolean,
      prefixCls: String,
      searchValue: String,
      values: js.Array[DisplayValueType]
    ): InnerSelectorProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1((t0: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputChange(t0).runNow()), onInputCompositionEnd = js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputCompositionEnd(t0).runNow()), onInputCompositionStart = js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputCompositionStart(t0).runNow()), onInputKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputKeyDown(t0).runNow()), onInputMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputMouseDown(t0).runNow()), onInputPaste = js.Any.fromFunction1((t0: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputPaste(t0).runNow()), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], inputRef = null)
      __obj.asInstanceOf[InnerSelectorProps]
    }
    
    extension [Self <: InnerSelectorProps](x: Self) {
      
      inline def setActiveDescendantId(value: String): Self = StObject.set(x, "activeDescendantId", value.asInstanceOf[js.Any])
      
      inline def setActiveDescendantIdUndefined: Self = StObject.set(x, "activeDescendantId", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInputRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: (HTMLInputElement | HTMLTextAreaElement) | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: (HTMLInputElement | HTMLTextAreaElement) | Null) => value(t0).runNow()))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOnInputChange(value: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => value(t0).runNow()))
      
      inline def setOnInputCompositionEnd(value: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback): Self = StObject.set(x, "onInputCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => value(t0).runNow()))
      
      inline def setOnInputCompositionStart(value: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback): Self = StObject.set(x, "onInputCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => value(t0).runNow()))
      
      inline def setOnInputKeyDown(value: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback): Self = StObject.set(x, "onInputKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => value(t0).runNow()))
      
      inline def setOnInputMouseDown(value: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback): Self = StObject.set(x, "onInputMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => value(t0).runNow()))
      
      inline def setOnInputPaste(value: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback): Self = StObject.set(x, "onInputPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => value(t0).runNow()))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: VdomNode): Self = StObject.set(x, "placeholder", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setPlaceholderVdomElement(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      inline def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      inline def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setValues(value: js.Array[DisplayValueType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: DisplayValueType*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RefSelectorProps extends StObject {
    
    def blur(): Unit
    
    def focus(): Unit
    
    var scrollTo: js.UndefOr[ScrollTo] = js.undefined
  }
  object RefSelectorProps {
    
    inline def apply(blur: Callback, focus: Callback): RefSelectorProps = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, focus = focus.toJsFn)
      __obj.asInstanceOf[RefSelectorProps]
    }
    
    extension [Self <: RefSelectorProps](x: Self) {
      
      inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setScrollTo(value: /* arg */ Double | ScrollConfig => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1((t0: /* arg */ Double | ScrollConfig) => value(t0).runNow()))
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    }
  }
  
  @js.native
  trait SelectorProps extends StObject {
    
    var activeDescendantId: js.UndefOr[String] = js.native
    
    var activeValue: String = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var choiceTransitionName: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * @private get real dom for trigger align.
      * This may be removed after React provides replacement of `findDOMNode`
      */
    var domRef: Ref[HTMLDivElement] = js.native
    
    var id: String = js.native
    
    var inputElement: typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var maxTagCount: js.UndefOr[Double | responsive] = js.native
    
    var maxTagPlaceholder: js.UndefOr[Node | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], Node])] = js.native
    
    var maxTagTextLength: js.UndefOr[Double] = js.native
    
    var mode: Mode = js.native
    
    var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.native
    
    def onRemove(value: DisplayValueType): Unit = js.native
    
    /** `onSearch` returns go next step boolean to check if need do toggle open */
    def onSearch(searchText: String, fromTyping: Boolean, isCompositing: Boolean): Boolean = js.native
    
    var onSearchSubmit: js.UndefOr[js.Function1[/* searchText */ String, Unit]] = js.native
    
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
    
    var open: Boolean = js.native
    
    var placeholder: js.UndefOr[Node] = js.native
    
    var prefixCls: String = js.native
    
    var removeIcon: js.UndefOr[RenderNode] = js.native
    
    var searchValue: String = js.native
    
    var showSearch: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var tagRender: js.UndefOr[
        js.Function1[/* props */ CustomTagProps, japgolly.scalajs.react.facade.React.Element]
      ] = js.native
    
    /** Check if `tokenSeparators` contains `\n` or `\r\n` */
    var tokenWithEnter: js.UndefOr[Boolean] = js.native
    
    /** Display in the Selector value, it's not same as `value` prop */
    var values: js.Array[DisplayValueType] = js.native
  }
  
  type _To = ForwardRefExoticComponent[SelectorProps & RefAttributes[RefSelectorProps]]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectorMod.foo` */
  override def _to: ForwardRefExoticComponent[SelectorProps & RefAttributes[RefSelectorProps]] = default
}
