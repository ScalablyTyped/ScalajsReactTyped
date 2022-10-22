package typingsJapgolly.antvG2plot.anon

import typingsJapgolly.antvG2plot.antvG2plotStrings.`tiny-area`
import typingsJapgolly.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsTinyAreaOption
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsTinyAreaOption
  
  val `type`: `tiny-area`
}
object OptionsPlotOptionsTinyAreaOption {
  
  inline def apply(options: PlotOptionsTinyAreaOption): OptionsPlotOptionsTinyAreaOption = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tiny-area")
    __obj.asInstanceOf[OptionsPlotOptionsTinyAreaOption]
  }
  
  extension [Self <: OptionsPlotOptionsTinyAreaOption](x: Self) {
    
    inline def setOptions(value: PlotOptionsTinyAreaOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: `tiny-area`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
