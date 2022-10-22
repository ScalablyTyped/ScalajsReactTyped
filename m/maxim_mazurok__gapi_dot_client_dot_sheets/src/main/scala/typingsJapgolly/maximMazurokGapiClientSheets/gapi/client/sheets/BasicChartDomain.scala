package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicChartDomain extends StObject {
  
  /** The data of the domain. For example, if charting stock prices over time, this is the data representing the dates. */
  var domain: js.UndefOr[ChartData] = js.undefined
  
  /** True to reverse the order of the domain values (horizontal axis). */
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object BasicChartDomain {
  
  inline def apply(): BasicChartDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicChartDomain]
  }
  
  extension [Self <: BasicChartDomain](x: Self) {
    
    inline def setDomain(value: ChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
