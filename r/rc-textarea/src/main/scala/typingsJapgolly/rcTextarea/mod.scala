package typingsJapgolly.rcTextarea

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.rcTextarea.anon.Height
import typingsJapgolly.rcTextarea.anon.Value
import typingsJapgolly.rcTextarea.esResizableTextAreaMod.AutoSizeType
import typingsJapgolly.rcTextarea.esResizableTextAreaMod.ResizableTextAreaRef
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.TextareaHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-textarea", JSImport.Default)
  @js.native
  open class default protected () extends TextArea {
    def this(props: TextAreaProps) = this()
  }
  object default {
    
    @JSImport("rc-textarea", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromProps(nextProps: TextAreaProps): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any]).asInstanceOf[Value]
  }
  
  @JSImport("rc-textarea", "ResizableTextArea")
  @js.native
  val ResizableTextArea: ForwardRefExoticComponent[TextAreaProps & RefAttributes[ResizableTextAreaRef]] = js.native
  
  type HTMLTextareaProps = TextareaHTMLAttributes[HTMLTextAreaElement]
  
  @js.native
  trait TextArea extends Component[TextAreaProps, TextAreaState, Any] {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def handleChange(e: ReactEventFrom[HTMLTextAreaElement]): Unit = js.native
    
    def handleKeyDown(e: ReactKeyboardEventFrom[HTMLTextAreaElement]): Unit = js.native
    
    var resizableTextArea: ResizableTextAreaRef = js.native
    
    def saveTextArea(resizableTextArea: ResizableTextAreaRef): Unit = js.native
    
    def setValue(value: String): Unit = js.native
    def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
  }
  
  trait TextAreaProps
    extends StObject
       with TextareaHTMLAttributes[HTMLTextAreaElement] {
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.undefined
    
    var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    var onResize: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object TextAreaProps {
    
    inline def apply(): TextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaProps]
    }
    
    extension [Self <: TextAreaProps](x: Self) {
      
      inline def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setOnPressEnter(value: ReactKeyboardEventFrom[HTMLTextAreaElement & Element] => Callback): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
      
      inline def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      inline def setOnResize(value: /* size */ Height => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: /* size */ Height) => value(t0).runNow()))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  trait TextAreaState extends StObject {
    
    var value: Any
  }
  object TextAreaState {
    
    inline def apply(value: Any): TextAreaState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextAreaState]
    }
    
    extension [Self <: TextAreaState](x: Self) {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
