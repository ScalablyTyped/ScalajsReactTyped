package typingsJapgolly.rmcInputNumber

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rmcInputNumber.anon.FocusOnUpDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-input-number", JSImport.Default)
  @js.native
  open class default () extends InputNumber
  /* static members */
  object default {
    
    @JSImport("rmc-input-number", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-input-number", "default.defaultProps")
    @js.native
    def defaultProps: FocusOnUpDown = js.native
    inline def defaultProps_=(x: FocusOnUpDown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait InputNumber
    extends typingsJapgolly.rmcInputNumber.libBaseMod.default[PropsType, StateType] {
    
    @JSName("componentDidMount")
    def componentDidMount_MInputNumber(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInputNumber(): Unit = js.native
    
    @JSName("componentWillUpdate")
    def componentWillUpdate_MInputNumber(): Unit = js.native
    
    var end: Any = js.native
    
    def focus(): Unit = js.native
    
    def formatWrapper(num: Any): Any = js.native
    
    def getRatio(e: Any): Double = js.native
    
    var input: Any = js.native
    
    def setInput(input: Any): Unit = js.native
    
    var start: Any = js.native
  }
  
  trait PropsType
    extends StObject
       with typingsJapgolly.rmcInputNumber.libBaseMod.PropsType {
    
    var className: js.UndefOr[Any] = js.undefined
    
    var downHandler: js.UndefOr[Node] = js.undefined
    
    var focusOnUpDown: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[js.Function1[/* v */ Any, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var upHandler: js.UndefOr[Node] = js.undefined
  }
  object PropsType {
    
    inline def apply(): PropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDownHandler(value: VdomNode): Self = StObject.set(x, "downHandler", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDownHandlerNull: Self = StObject.set(x, "downHandler", null)
      
      inline def setDownHandlerUndefined: Self = StObject.set(x, "downHandler", js.undefined)
      
      inline def setDownHandlerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "downHandler", js.Array(value*))
      
      inline def setDownHandlerVdomElement(value: VdomElement): Self = StObject.set(x, "downHandler", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFocusOnUpDown(value: Boolean): Self = StObject.set(x, "focusOnUpDown", value.asInstanceOf[js.Any])
      
      inline def setFocusOnUpDownUndefined: Self = StObject.set(x, "focusOnUpDown", js.undefined)
      
      inline def setFormatter(value: /* v */ Any => Callback): Self = StObject.set(x, "formatter", js.Any.fromFunction1((t0: /* v */ Any) => value(t0).runNow()))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setUpHandler(value: VdomNode): Self = StObject.set(x, "upHandler", value.rawNode.asInstanceOf[js.Any])
      
      inline def setUpHandlerNull: Self = StObject.set(x, "upHandler", null)
      
      inline def setUpHandlerUndefined: Self = StObject.set(x, "upHandler", js.undefined)
      
      inline def setUpHandlerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "upHandler", js.Array(value*))
      
      inline def setUpHandlerVdomElement(value: VdomElement): Self = StObject.set(x, "upHandler", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type StateType = typingsJapgolly.rmcInputNumber.libBaseMod.StateType
}
