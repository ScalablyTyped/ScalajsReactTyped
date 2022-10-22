package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsTimePickerTickersMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/time-picker/Tickers", "Tickers")
  @js.native
  open class Tickers protected ()
    extends PureComponent[TickersProps, js.Object, Any] {
    def this(props: TickersProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TickersProps, context: Any) = this()
    
    def handleDecrement(e: Any): Unit = js.native
    
    def handleIncrement(e: Any): Unit = js.native
  }
  
  trait TickersProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** set buttons as disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** decrement handler */
    var onDecrement: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /** increment handler */
    var onIncrement: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /** down ticker icon */
    var tickerDownIcon: js.UndefOr[Node] = js.undefined
    
    /** up ticker icon */
    var tickerUpIcon: js.UndefOr[Node] = js.undefined
  }
  object TickersProps {
    
    inline def apply(): TickersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TickersProps]
    }
    
    extension [Self <: TickersProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnDecrement(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onDecrement", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnDecrementUndefined: Self = StObject.set(x, "onDecrement", js.undefined)
      
      inline def setOnIncrement(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onIncrement", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnIncrementUndefined: Self = StObject.set(x, "onIncrement", js.undefined)
      
      inline def setTickerDownIcon(value: VdomNode): Self = StObject.set(x, "tickerDownIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTickerDownIconNull: Self = StObject.set(x, "tickerDownIcon", null)
      
      inline def setTickerDownIconUndefined: Self = StObject.set(x, "tickerDownIcon", js.undefined)
      
      inline def setTickerDownIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "tickerDownIcon", js.Array(value*))
      
      inline def setTickerDownIconVdomElement(value: VdomElement): Self = StObject.set(x, "tickerDownIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTickerUpIcon(value: VdomNode): Self = StObject.set(x, "tickerUpIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTickerUpIconNull: Self = StObject.set(x, "tickerUpIcon", null)
      
      inline def setTickerUpIconUndefined: Self = StObject.set(x, "tickerUpIcon", js.undefined)
      
      inline def setTickerUpIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "tickerUpIcon", js.Array(value*))
      
      inline def setTickerUpIconVdomElement(value: VdomElement): Self = StObject.set(x, "tickerUpIcon", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
