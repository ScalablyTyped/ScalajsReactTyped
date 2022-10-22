package typingsJapgolly.hmscoreReactNativeHmsPush

import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.default
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.high
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.low
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.max
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.min
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.none
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.unspecified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLocalNotificationImportanceMod {
  
  trait Importance extends StObject {
    
    var default: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.default
    
    var high: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.high
    
    var low: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.low
    
    var max: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.max
    
    var min: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.min
    
    var none: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.none
    
    var unspecified: typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.unspecified
  }
  object Importance {
    
    inline def apply(): Importance = {
      val __obj = js.Dynamic.literal(default = "default", high = "high", low = "low", max = "max", min = "min", none = "none", unspecified = "unspecified")
      __obj.asInstanceOf[Importance]
    }
    
    extension [Self <: Importance](x: Self) {
      
      inline def setDefault(value: default): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: high): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLow(value: low): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setMax(value: max): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: min): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      inline def setUnspecified(value: unspecified): Self = StObject.set(x, "unspecified", value.asInstanceOf[js.Any])
    }
  }
}
