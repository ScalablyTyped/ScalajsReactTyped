package typingsJapgolly.recharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.recharts.anon.ErrorVal
import typingsJapgolly.recharts.mod.DataKey
import typingsJapgolly.recharts.mod.ErrorBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorBar {
  
  inline def apply(dataKey: DataKey): Builder = {
    val __props = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ErrorBarProps]))
  }
  
  @JSImport("recharts", "ErrorBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.recharts.mod.ErrorBar] {
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataPointFormatter(value: (/* entry */ Any, /* dataKey */ DataKey) => ErrorVal): this.type = set("dataPointFormatter", js.Any.fromFunction2(value))
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def layout(value: String): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def xAxis(value: js.Object): this.type = set("xAxis", value.asInstanceOf[js.Any])
    
    inline def yAxis(value: js.Object): this.type = set("yAxis", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ErrorBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
