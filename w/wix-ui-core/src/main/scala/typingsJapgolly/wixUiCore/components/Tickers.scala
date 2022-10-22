package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerTickersMod.TickersProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tickers {
  
  @JSImport("wix-ui-core/dist/es/src/components/time-picker/Tickers", "Tickers")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerTickersMod.Tickers] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onDecrement(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): this.type = set("onDecrement", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
    
    inline def onIncrement(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): this.type = set("onIncrement", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
    
    inline def tickerDownIcon(value: VdomNode): this.type = set("tickerDownIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def tickerDownIconNull: this.type = set("tickerDownIcon", null)
    
    inline def tickerDownIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("tickerDownIcon", js.Array(value*))
    
    inline def tickerDownIconVdomElement(value: VdomElement): this.type = set("tickerDownIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def tickerUpIcon(value: VdomNode): this.type = set("tickerUpIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def tickerUpIconNull: this.type = set("tickerUpIcon", null)
    
    inline def tickerUpIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("tickerUpIcon", js.Array(value*))
    
    inline def tickerUpIconVdomElement(value: VdomElement): this.type = set("tickerUpIcon", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tickers.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TickersProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
