package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OFF_PEAK
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PEAK
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SHOULDER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SHOULDER1
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SHOULDER2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOfUse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Description of the rate
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name of the rate
    */
  var displayName: String
  
  /**
    * Array of controlled load rates in order of usage volume
    */
  var rates: js.Array[MeasureUnit]
  
  /**
    * Array of times of use
    */
  var timeOfUse: js.Array[StartTime]
  
  /**
    * The type of usage that the rate applies to
    */
  var `type`: PEAK | OFF_PEAK | SHOULDER | SHOULDER1 | SHOULDER2
}
object TimeOfUse {
  
  inline def apply(
    displayName: String,
    rates: js.Array[MeasureUnit],
    timeOfUse: js.Array[StartTime],
    `type`: PEAK | OFF_PEAK | SHOULDER | SHOULDER1 | SHOULDER2
  ): TimeOfUse = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any], timeOfUse = timeOfUse.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeOfUse]
  }
  
  extension [Self <: TimeOfUse](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setRates(value: js.Array[MeasureUnit]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setRatesVarargs(value: MeasureUnit*): Self = StObject.set(x, "rates", js.Array(value*))
    
    inline def setTimeOfUse(value: js.Array[StartTime]): Self = StObject.set(x, "timeOfUse", value.asInstanceOf[js.Any])
    
    inline def setTimeOfUseVarargs(value: StartTime*): Self = StObject.set(x, "timeOfUse", js.Array(value*))
    
    inline def setType(value: PEAK | OFF_PEAK | SHOULDER | SHOULDER1 | SHOULDER2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
