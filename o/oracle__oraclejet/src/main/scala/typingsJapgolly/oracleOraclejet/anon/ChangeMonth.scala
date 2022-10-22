package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings._empty
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.image
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.number
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.numberOfMonths
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.select
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectable
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.today
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeMonth extends StObject {
  
  var changeMonth: select | none
  
  var changeYear: select | none
  
  var currentMonthPos: Double
  
  var daysOutsideMonth: hidden | visible | selectable
  
  var footerLayout: _empty | today
  
  var numberOfMonths: Double
  
  var showOn: focus | image
  
  var stepBigMonths: Double
  
  var stepMonths: numberOfMonths | Double
  
  var weekDisplay: number | none
  
  var yearRange: String
}
object ChangeMonth {
  
  inline def apply(
    changeMonth: select | none,
    changeYear: select | none,
    currentMonthPos: Double,
    daysOutsideMonth: hidden | visible | selectable,
    footerLayout: _empty | today,
    numberOfMonths: Double,
    showOn: focus | image,
    stepBigMonths: Double,
    stepMonths: numberOfMonths | Double,
    weekDisplay: number | none,
    yearRange: String
  ): ChangeMonth = {
    val __obj = js.Dynamic.literal(changeMonth = changeMonth.asInstanceOf[js.Any], changeYear = changeYear.asInstanceOf[js.Any], currentMonthPos = currentMonthPos.asInstanceOf[js.Any], daysOutsideMonth = daysOutsideMonth.asInstanceOf[js.Any], footerLayout = footerLayout.asInstanceOf[js.Any], numberOfMonths = numberOfMonths.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], stepBigMonths = stepBigMonths.asInstanceOf[js.Any], stepMonths = stepMonths.asInstanceOf[js.Any], weekDisplay = weekDisplay.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMonth]
  }
  
  extension [Self <: ChangeMonth](x: Self) {
    
    inline def setChangeMonth(value: select | none): Self = StObject.set(x, "changeMonth", value.asInstanceOf[js.Any])
    
    inline def setChangeYear(value: select | none): Self = StObject.set(x, "changeYear", value.asInstanceOf[js.Any])
    
    inline def setCurrentMonthPos(value: Double): Self = StObject.set(x, "currentMonthPos", value.asInstanceOf[js.Any])
    
    inline def setDaysOutsideMonth(value: hidden | visible | selectable): Self = StObject.set(x, "daysOutsideMonth", value.asInstanceOf[js.Any])
    
    inline def setFooterLayout(value: _empty | today): Self = StObject.set(x, "footerLayout", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def setShowOn(value: focus | image): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    inline def setStepBigMonths(value: Double): Self = StObject.set(x, "stepBigMonths", value.asInstanceOf[js.Any])
    
    inline def setStepMonths(value: numberOfMonths | Double): Self = StObject.set(x, "stepMonths", value.asInstanceOf[js.Any])
    
    inline def setWeekDisplay(value: number | none): Self = StObject.set(x, "weekDisplay", value.asInstanceOf[js.Any])
    
    inline def setYearRange(value: String): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
  }
}
