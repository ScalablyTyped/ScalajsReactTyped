package typingsJapgolly.reactSimpleCodeEditor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactSimpleCodeEditor.anon.Bottom
import typingsJapgolly.reactSimpleCodeEditor.anon.Capture
import typingsJapgolly.reactSimpleCodeEditor.anon.IgnoreTabKey
import typingsJapgolly.reactSimpleCodeEditor.anon.Recordtimestampnumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-simple-code-editor", JSImport.Default)
  @js.native
  open class default () extends Editor
  /* static members */
  object default {
    
    @JSImport("react-simple-code-editor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-simple-code-editor", "default.defaultProps")
    @js.native
    def defaultProps: IgnoreTabKey = js.native
    inline def defaultProps_=(x: IgnoreTabKey): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Editor extends Component[Props, State, Any] {
    
    /* private */ var _applyEdits: Any = js.native
    
    /* private */ var _getLines: Any = js.native
    
    /* private */ var _handleChange: Any = js.native
    
    /* private */ var _handleKeyDown: Any = js.native
    
    /* private */ var _history: Any = js.native
    
    /* private */ var _input: Any = js.native
    
    /* private */ var _recordChange: Any = js.native
    
    /* private */ var _recordCurrentState: Any = js.native
    
    /* private */ var _redoEdit: Any = js.native
    
    /* private */ var _undoEdit: Any = js.native
    
    /* private */ var _updateInput: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MEditor(): Unit = js.native
    
    def session: typingsJapgolly.reactSimpleCodeEditor.anon.History = js.native
    def session_=(session: typingsJapgolly.reactSimpleCodeEditor.anon.History): Unit = js.native
    
    @JSName("state")
    var state_Editor: Capture = js.native
  }
  
  trait History extends StObject {
    
    var offset: Double
    
    var stack: js.Array[Recordtimestampnumber]
  }
  object History {
    
    inline def apply(offset: Double, stack: js.Array[Recordtimestampnumber]): History = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[History]
    }
    
    extension [Self <: History](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[Recordtimestampnumber]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: Recordtimestampnumber*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
  
  type Padding[T] = T | Bottom[T]
  
  trait Props
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    def highlight(value: String): String | Node
    
    var ignoreTabKey: Boolean
    
    var insertSpaces: Boolean
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    @JSName("onBlur")
    var onBlur_Props: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.undefined
    
    @JSName("onClick")
    var onClick_Props: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.undefined
    
    @JSName("onFocus")
    var onFocus_Props: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.undefined
    
    @JSName("onKeyDown")
    var onKeyDown_Props: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    @JSName("onKeyUp")
    var onKeyUp_Props: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    def onValueChange(value: String): Unit
    
    var padding: Padding[Double | String]
    
    var preClassName: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var tabSize: Double
    
    var textareaClassName: js.UndefOr[String] = js.undefined
    
    var textareaId: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object Props {
    
    inline def apply(
      highlight: String => String | Node,
      ignoreTabKey: Boolean,
      insertSpaces: Boolean,
      onValueChange: String => Callback,
      padding: Padding[Double | String],
      tabSize: Double,
      value: String
    ): Props = {
      val __obj = js.Dynamic.literal(highlight = js.Any.fromFunction1(highlight), ignoreTabKey = ignoreTabKey.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], onValueChange = js.Any.fromFunction1((t0: String) => onValueChange(t0).runNow()), padding = padding.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHighlight(value: String => String | Node): Self = StObject.set(x, "highlight", js.Any.fromFunction1(value))
      
      inline def setIgnoreTabKey(value: Boolean): Self = StObject.set(x, "ignoreTabKey", value.asInstanceOf[js.Any])
      
      inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLTextAreaElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLTextAreaElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLTextAreaElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLTextAreaElement & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLTextAreaElement & Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnValueChange(value: String => Callback): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setPadding(value: Padding[Double | String]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPreClassName(value: String): Self = StObject.set(x, "preClassName", value.asInstanceOf[js.Any])
      
      inline def setPreClassNameUndefined: Self = StObject.set(x, "preClassName", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTextareaClassName(value: String): Self = StObject.set(x, "textareaClassName", value.asInstanceOf[js.Any])
      
      inline def setTextareaClassNameUndefined: Self = StObject.set(x, "textareaClassName", js.undefined)
      
      inline def setTextareaId(value: String): Self = StObject.set(x, "textareaId", value.asInstanceOf[js.Any])
      
      inline def setTextareaIdUndefined: Self = StObject.set(x, "textareaId", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Record extends StObject {
    
    var selectionEnd: Double
    
    var selectionStart: Double
    
    var value: String
  }
  object Record {
    
    inline def apply(selectionEnd: Double, selectionStart: Double, value: String): Record = {
      val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Record]
    }
    
    extension [Self <: Record](x: Self) {
      
      inline def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
      
      inline def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var capture: Boolean
  }
  object State {
    
    inline def apply(capture: Boolean): State = {
      val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    }
  }
}
