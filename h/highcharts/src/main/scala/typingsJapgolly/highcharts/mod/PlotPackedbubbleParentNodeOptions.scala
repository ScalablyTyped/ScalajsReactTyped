package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPackedbubbleParentNodeOptions extends StObject {
  
  /**
    * (Highcharts) Allow this series' parent nodes to be selected by clicking
    * on the graph.
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.undefined
}
object PlotPackedbubbleParentNodeOptions {
  
  inline def apply(): PlotPackedbubbleParentNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleParentNodeOptions]
  }
  
  extension [Self <: PlotPackedbubbleParentNodeOptions](x: Self) {
    
    inline def setAllowPointSelect(value: Boolean): Self = StObject.set(x, "allowPointSelect", value.asInstanceOf[js.Any])
    
    inline def setAllowPointSelectUndefined: Self = StObject.set(x, "allowPointSelect", js.undefined)
  }
}
