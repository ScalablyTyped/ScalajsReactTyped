package typingsJapgolly.iput

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iput", JSImport.Default)
  @js.native
  open class default () extends IPut
  
  @js.native
  trait IPut extends Component[IputProp, IputState, Any] {
    
    def handleChange(e: ReactEventFrom[HTMLInputElement], i: Double): Unit = js.native
    
    def handleKeyDown(e: ReactKeyboardEventFrom[HTMLInputElement], i: Double): Unit = js.native
    
    def handlePaste(e: ReactClipboardEventFrom[HTMLInputElement], i: Double): Unit = js.native
    
    def onPropsChange(): Unit = js.native
  }
  
  trait IputProp extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var isError: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  }
  object IputProp {
    
    inline def apply(): IputProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IputProp]
    }
    
    extension [Self <: IputProp](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultValue(value: String | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setIsError(value: CallbackTo[Boolean]): Self = StObject.set(x, "isError", value.toJsFn)
      
      inline def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  trait IputState extends StObject {
    
    var value: js.Array[String]
  }
  object IputState {
    
    inline def apply(value: js.Array[String]): IputState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IputState]
    }
    
    extension [Self <: IputState](x: Self) {
      
      inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
