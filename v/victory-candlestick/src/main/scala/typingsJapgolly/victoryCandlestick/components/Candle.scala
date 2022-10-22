package typingsJapgolly.victoryCandlestick.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryCandlestick.esMod.CandleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Candle {
  
  @JSImport("victory-candlestick/es", "Candle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryCandlestick.esMod.Candle] {
    
    inline def candleRatio(value: Double): this.type = set("candleRatio", value.asInstanceOf[js.Any])
    
    inline def candleWidth(value: Double | js.Function): this.type = set("candleWidth", value.asInstanceOf[js.Any])
    
    inline def close(value: Double): this.type = set("close", value.asInstanceOf[js.Any])
    
    inline def datum(value: Any): this.type = set("datum", value.asInstanceOf[js.Any])
    
    inline def groupComponent(value: VdomElement): this.type = set("groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def high(value: Double): this.type = set("high", value.asInstanceOf[js.Any])
    
    inline def lineComponent(value: VdomElement): this.type = set("lineComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def low(value: Double): this.type = set("low", value.asInstanceOf[js.Any])
    
    inline def open(value: Double): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def rectComponent(value: VdomElement): this.type = set("rectComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def wickStrokeWidth(value: Double): this.type = set("wickStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Candle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CandleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
