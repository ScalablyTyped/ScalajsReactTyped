package typingsJapgolly.recharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.recharts.mod.DataKey
import typingsJapgolly.recharts.mod.RechartsFunction
import typingsJapgolly.recharts.mod.ScaleType
import typingsJapgolly.recharts.mod.ZAxisProps
import typingsJapgolly.recharts.rechartsStrings.category
import typingsJapgolly.recharts.rechartsStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZAxis {
  
  @JSImport("recharts", "ZAxis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.recharts.mod.ZAxis] {
    
    inline def dataKey(value: DataKey): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    inline def dataKeyFunction1(value: /* dataObject */ Any => String | Double | (js.Tuple2[Double, Double]) | Null): this.type = set("dataKey", js.Any.fromFunction1(value))
    
    inline def name(value: String | Double): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def range(value: js.Array[Double]): this.type = set("range", value.asInstanceOf[js.Any])
    
    inline def rangeVarargs(value: Double*): this.type = set("range", js.Array(value*))
    
    inline def scale(value: ScaleType | RechartsFunction): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def `type`(value: number | category): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def unit(value: String | Double): this.type = set("unit", value.asInstanceOf[js.Any])
    
    inline def zAxisId(value: String | Double): this.type = set("zAxisId", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ZAxis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ZAxisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
