package typingsJapgolly.recharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.recharts.anon.PartialMargin
import typingsJapgolly.recharts.mod.BrushProps
import typingsJapgolly.recharts.mod.DataKey
import typingsJapgolly.recharts.mod.RechartsFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Brush {
  
  @JSImport("recharts", "Brush")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.recharts.mod.Brush] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataKey(value: DataKey): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    inline def dataKeyFunction1(value: /* dataObject */ Any => String | Double | (js.Tuple2[Double, Double]) | Null): this.type = set("dataKey", js.Any.fromFunction1(value))
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def endIndex(value: Double): this.type = set("endIndex", value.asInstanceOf[js.Any])
    
    inline def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def gap(value: Double): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def leaveTimeOut(value: Double): this.type = set("leaveTimeOut", value.asInstanceOf[js.Any])
    
    inline def onChange(value: RechartsFunction): this.type = set("onChange", value.asInstanceOf[js.Any])
    
    inline def padding(value: PartialMargin): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def startIndex(value: Double): this.type = set("startIndex", value.asInstanceOf[js.Any])
    
    inline def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def tickFormatter(value: /* value */ Any => Any): this.type = set("tickFormatter", js.Any.fromFunction1(value))
    
    inline def travellerWidth(value: Double): this.type = set("travellerWidth", value.asInstanceOf[js.Any])
    
    inline def updateId(value: String | Double): this.type = set("updateId", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Brush.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BrushProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
