package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMappointClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotMappointClusterStatesHoverOptions] = js.undefined
}
object PlotMappointClusterStatesOptions {
  
  inline def apply(): PlotMappointClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMappointClusterStatesOptions]
  }
  
  extension [Self <: PlotMappointClusterStatesOptions](x: Self) {
    
    inline def setHover(value: PlotMappointClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
