package typingsJapgolly.chartJs.mod

import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tooltip
  extends StObject
     with Plugin[ChartType, AnyObject] {
  
  val positioners: TooltipPositionerMap
}
object Tooltip {
  
  @JSImport("chart.js", "Tooltip")
  @js.native
  val ^ : Tooltip = js.native
  
  extension [Self <: Tooltip](x: Self) {
    
    inline def setPositioners(value: TooltipPositionerMap): Self = StObject.set(x, "positioners", value.asInstanceOf[js.Any])
  }
}
