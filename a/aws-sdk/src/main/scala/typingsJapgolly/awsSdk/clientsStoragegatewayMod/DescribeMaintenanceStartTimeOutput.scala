package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceStartTimeOutput extends StObject {
  
  /**
    * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where 1 represents the first day of the month and 28 represents the last day of the month.
    */
  var DayOfMonth: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.DayOfMonth] = js.undefined
  
  /**
    * An ordinal number between 0 and 6 that represents the day of the week, where 0 represents Sunday and 6 represents Saturday. The day of week is in the time zone of the gateway.
    */
  var DayOfWeek: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.DayOfWeek] = js.undefined
  
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  
  /**
    * The hour component of the maintenance start time represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
    */
  var HourOfDay: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.HourOfDay] = js.undefined
  
  /**
    * The minute component of the maintenance start time represented as mm, where mm is the minute (0 to 59). The minute of the hour is in the time zone of the gateway.
    */
  var MinuteOfHour: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.MinuteOfHour] = js.undefined
  
  /**
    * A value that indicates the time zone that is set for the gateway. The start time and day of week specified should be in the time zone of the gateway.
    */
  var Timezone: js.UndefOr[GatewayTimezone] = js.undefined
}
object DescribeMaintenanceStartTimeOutput {
  
  inline def apply(): DescribeMaintenanceStartTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceStartTimeOutput]
  }
  
  extension [Self <: DescribeMaintenanceStartTimeOutput](x: Self) {
    
    inline def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "DayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "DayOfMonth", js.undefined)
    
    inline def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "DayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "DayOfWeek", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setHourOfDay(value: HourOfDay): Self = StObject.set(x, "HourOfDay", value.asInstanceOf[js.Any])
    
    inline def setHourOfDayUndefined: Self = StObject.set(x, "HourOfDay", js.undefined)
    
    inline def setMinuteOfHour(value: MinuteOfHour): Self = StObject.set(x, "MinuteOfHour", value.asInstanceOf[js.Any])
    
    inline def setMinuteOfHourUndefined: Self = StObject.set(x, "MinuteOfHour", js.undefined)
    
    inline def setTimezone(value: GatewayTimezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
  }
}
