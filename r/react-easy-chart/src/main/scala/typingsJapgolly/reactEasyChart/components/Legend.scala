package typingsJapgolly.reactEasyChart.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactEasyChart.anon.Color
import typingsJapgolly.reactEasyChart.mod.LegendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Legend {
  
  inline def apply(data: js.Array[Any], dataId: String): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataId = dataId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LegendProps]))
  }
  
  @JSImport("react-easy-chart", "Legend")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactEasyChart.mod.Legend] {
    
    inline def config(value: js.Array[Color]): this.type = set("config", value.asInstanceOf[js.Any])
    
    inline def configVarargs(value: Color*): this.type = set("config", js.Array(value*))
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
