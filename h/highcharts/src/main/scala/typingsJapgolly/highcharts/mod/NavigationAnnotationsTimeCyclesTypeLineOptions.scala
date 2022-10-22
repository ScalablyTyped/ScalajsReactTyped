package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationAnnotationsTimeCyclesTypeLineOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
}
object NavigationAnnotationsTimeCyclesTypeLineOptions {
  
  inline def apply(): NavigationAnnotationsTimeCyclesTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsTimeCyclesTypeLineOptions]
  }
  
  extension [Self <: NavigationAnnotationsTimeCyclesTypeLineOptions](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
