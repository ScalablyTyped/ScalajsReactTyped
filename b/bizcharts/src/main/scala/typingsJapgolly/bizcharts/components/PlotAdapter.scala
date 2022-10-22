package typingsJapgolly.bizcharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.bizcharts.libPlotsPlotAdapterMod.IAdapterProps
import typingsJapgolly.bizcharts.libPlotsPlotAdapterMod.IPlotCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlotAdapter {
  
  @JSImport("bizcharts", "PlotAdapter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def adapter(value: /* IOptions */ Any => IPlotCfg): this.type = set("adapter", js.Any.fromFunction1(value))
    
    inline def chartName(value: String): this.type = set("chartName", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PlotAdapter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IAdapterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
