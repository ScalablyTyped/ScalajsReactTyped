package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DAY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DAYS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.FRI
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.KVA
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.KVAR
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.KVARH
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.KW
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.KWH
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.METER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MON
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MONTH
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PUBLIC_HOLIDAYS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SAT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SUN
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TARIFF_PERIOD
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.THU
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TUE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.WED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargePeriod
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The charge amount per  measure unit exclusive of GST
    */
  var amount: String
  
  /**
    * Charge period for the demand tariff
    */
  var chargePeriod: DAY | MONTH | TARIFF_PERIOD
  
  /**
    * The days that the demand tariff applies to
    */
  var days: js.UndefOr[js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]] = js.undefined
  
  /**
    * Description of the charge
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name of the charge
    */
  var displayName: String
  
  /**
    * End of the period
    */
  var endTime: String
  
  /**
    * Maximum demand for this demand tariff in kW.  If present, must be higher than the value of the minDemand field
    */
  var maxDemand: js.UndefOr[String] = js.undefined
  
  /**
    * The measurement unit of charge amount. Assumed to be KWH if absent
    */
  var measureUnit: js.UndefOr[KWH | KVA | KVAR | KVARH | KW | DAYS | METER | MONTH] = js.undefined
  
  /**
    * Application period for the demand tariff
    */
  var measurementPeriod: DAY | MONTH | TARIFF_PERIOD
  
  /**
    * Minimum demand for this demand tariff in kW.  If absent then 0 is assumed
    */
  var minDemand: js.UndefOr[String] = js.undefined
  
  /**
    * Start of the period
    */
  var startTime: String
}
object ChargePeriod {
  
  inline def apply(
    amount: String,
    chargePeriod: DAY | MONTH | TARIFF_PERIOD,
    displayName: String,
    endTime: String,
    measurementPeriod: DAY | MONTH | TARIFF_PERIOD,
    startTime: String
  ): ChargePeriod = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], chargePeriod = chargePeriod.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], measurementPeriod = measurementPeriod.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargePeriod]
  }
  
  extension [Self <: ChargePeriod](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setChargePeriod(value: DAY | MONTH | TARIFF_PERIOD): Self = StObject.set(x, "chargePeriod", value.asInstanceOf[js.Any])
    
    inline def setDays(value: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setDaysVarargs(value: (SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS)*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setMaxDemand(value: String): Self = StObject.set(x, "maxDemand", value.asInstanceOf[js.Any])
    
    inline def setMaxDemandUndefined: Self = StObject.set(x, "maxDemand", js.undefined)
    
    inline def setMeasureUnit(value: KWH | KVA | KVAR | KVARH | KW | DAYS | METER | MONTH): Self = StObject.set(x, "measureUnit", value.asInstanceOf[js.Any])
    
    inline def setMeasureUnitUndefined: Self = StObject.set(x, "measureUnit", js.undefined)
    
    inline def setMeasurementPeriod(value: DAY | MONTH | TARIFF_PERIOD): Self = StObject.set(x, "measurementPeriod", value.asInstanceOf[js.Any])
    
    inline def setMinDemand(value: String): Self = StObject.set(x, "minDemand", value.asInstanceOf[js.Any])
    
    inline def setMinDemandUndefined: Self = StObject.set(x, "minDemand", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
