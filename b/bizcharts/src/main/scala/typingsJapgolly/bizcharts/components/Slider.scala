package typingsJapgolly.bizcharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.libInterfaceMod.Datum
import typingsJapgolly.bizcharts.libComponentsSliderMod.ISliderProps
import typingsJapgolly.bizcharts.libComponentsSliderMod.TrendCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("bizcharts", "Slider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def backgroundStyle(value: Any): this.type = set("backgroundStyle", value.asInstanceOf[js.Any])
    
    inline def end(value: Double): this.type = set("end", value.asInstanceOf[js.Any])
    
    inline def foregroundStyle(value: Any): this.type = set("foregroundStyle", value.asInstanceOf[js.Any])
    
    inline def formatter(value: (/* val */ Any, /* datum */ Datum, /* idx */ Double) => Any): this.type = set("formatter", js.Any.fromFunction3(value))
    
    inline def handlerStyle(value: Any): this.type = set("handlerStyle", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def maxLimit(value: Double): this.type = set("maxLimit", value.asInstanceOf[js.Any])
    
    inline def minLimit(value: Double): this.type = set("minLimit", value.asInstanceOf[js.Any])
    
    inline def padding(value: js.Array[Double]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingVarargs(value: Double*): this.type = set("padding", js.Array(value*))
    
    inline def start(value: Double): this.type = set("start", value.asInstanceOf[js.Any])
    
    inline def textStyle(value: Any): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def trendCfg(value: TrendCfg): this.type = set("trendCfg", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ISliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
