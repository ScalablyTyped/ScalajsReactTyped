package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ComponentsDataChartMod.GranularityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Granularity extends StObject {
  
  var granularity: js.UndefOr[GranularityType] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
}
object Granularity {
  
  inline def apply(): Granularity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Granularity]
  }
  
  extension [Self <: Granularity](x: Self) {
    
    inline def setGranularity(value: GranularityType): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
