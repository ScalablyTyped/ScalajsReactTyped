package typingsJapgolly.reactGaugeChart.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactGaugeChart.mod.GaugeChartProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGaugeChart {
  
  @JSImport("react-gauge-chart", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animDelay(value: Double): this.type = set("animDelay", value.asInstanceOf[js.Any])
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def animateDuration(value: Double): this.type = set("animateDuration", value.asInstanceOf[js.Any])
    
    inline def arcPadding(value: Double): this.type = set("arcPadding", value.asInstanceOf[js.Any])
    
    inline def arcWidth(value: Double): this.type = set("arcWidth", value.asInstanceOf[js.Any])
    
    inline def arcsLength(value: js.Array[Double]): this.type = set("arcsLength", value.asInstanceOf[js.Any])
    
    inline def arcsLengthVarargs(value: Double*): this.type = set("arcsLength", js.Array(value*))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def cornerRadius(value: Double): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: String): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def formatTextValue(value: /* value */ String => String): this.type = set("formatTextValue", js.Any.fromFunction1(value))
    
    inline def hideText(value: Boolean): this.type = set("hideText", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def marginInPercent(value: Double): this.type = set("marginInPercent", value.asInstanceOf[js.Any])
    
    inline def needleBaseColor(value: String): this.type = set("needleBaseColor", value.asInstanceOf[js.Any])
    
    inline def needleColor(value: String): this.type = set("needleColor", value.asInstanceOf[js.Any])
    
    inline def nrOfLevels(value: Double): this.type = set("nrOfLevels", value.asInstanceOf[js.Any])
    
    inline def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactGaugeChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GaugeChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
