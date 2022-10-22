package typingsJapgolly.hmscoreReactNativeHmsPush

import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.custom_time
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.day
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.hour
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.minute
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLocalNotificationRepeatTypeMod {
  
  trait RepeatType extends StObject {
    
    var customTime: custom_time
    
    var day: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.day
    
    var hour: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.hour
    
    var minute: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.minute
    
    var week: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.week
  }
  object RepeatType {
    
    inline def apply(): RepeatType = {
      val __obj = js.Dynamic.literal(customTime = "custom_time", day = "day", hour = "hour", minute = "minute", week = "week")
      __obj.asInstanceOf[RepeatType]
    }
    
    extension [Self <: RepeatType](x: Self) {
      
      inline def setCustomTime(value: custom_time): Self = StObject.set(x, "customTime", value.asInstanceOf[js.Any])
      
      inline def setDay(value: day): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setHour(value: hour): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: minute): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setWeek(value: week): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    }
  }
}
