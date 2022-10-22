package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.anon.Y1
import typingsJapgolly.antDesignPro.anon.Y2
import typingsJapgolly.antDesignPro.libChartsTimelineChartMod.ITimelineChartProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimelineChart {
  
  inline def apply(data: js.Array[Y1], titleMap: Y2): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], titleMap = titleMap.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITimelineChartProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts", "TimelineChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.libChartsMod.TimelineChart] {
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def padding(value: js.Tuple4[Double, Double, Double, Double]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITimelineChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
