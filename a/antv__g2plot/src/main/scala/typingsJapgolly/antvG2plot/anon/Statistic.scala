package typingsJapgolly.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statistic extends StObject {
  
  var statistic: typingsJapgolly.antvG2plot.libTypesStatisticMod.Statistic
}
object Statistic {
  
  inline def apply(statistic: typingsJapgolly.antvG2plot.libTypesStatisticMod.Statistic): Statistic = {
    val __obj = js.Dynamic.literal(statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistic]
  }
  
  extension [Self <: Statistic](x: Self) {
    
    inline def setStatistic(value: typingsJapgolly.antvG2plot.libTypesStatisticMod.Statistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
  }
}
