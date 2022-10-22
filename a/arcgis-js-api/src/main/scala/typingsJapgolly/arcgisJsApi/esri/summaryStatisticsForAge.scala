package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for generating statistics for the age of features in a layer based on a given start time and end time.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html)
  */
trait summaryStatisticsForAge extends StObject {
  
  /**
    * Returns an object containing various statistics describing an age value (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  def summaryStatisticsForAge(params: summaryStatisticsForAgeSummaryStatisticsForAgeParams): js.Promise[SummaryStatisticsResult]
}
object summaryStatisticsForAge {
  
  inline def apply(
    summaryStatisticsForAge: summaryStatisticsForAgeSummaryStatisticsForAgeParams => js.Promise[SummaryStatisticsResult]
  ): summaryStatisticsForAge = {
    val __obj = js.Dynamic.literal(summaryStatisticsForAge = js.Any.fromFunction1(summaryStatisticsForAge))
    __obj.asInstanceOf[summaryStatisticsForAge]
  }
  
  extension [Self <: summaryStatisticsForAge](x: Self) {
    
    inline def setSummaryStatisticsForAge(value: summaryStatisticsForAgeSummaryStatisticsForAgeParams => js.Promise[SummaryStatisticsResult]): Self = StObject.set(x, "summaryStatisticsForAge", js.Any.fromFunction1(value))
  }
}
