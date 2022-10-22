package typingsJapgolly.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesQuietTimeMod {
  
  trait QuietTime extends StObject {
    
    /**
      * The time at which quiet time should end. The value that you specify has to be in HH:mm format, where HH is the hour in 24-hour format (with a leading zero, if applicable), and mm is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
      */
    var End: js.UndefOr[String] = js.undefined
    
    /**
      * The time at which quiet time should begin. The value that you specify has to be in HH:mm format, where HH is the hour in 24-hour format (with a leading zero, if applicable), and mm is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
      */
    var Start: js.UndefOr[String] = js.undefined
  }
  object QuietTime {
    
    inline def apply(): QuietTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuietTime]
    }
    
    extension [Self <: QuietTime](x: Self) {
      
      inline def setEnd(value: String): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
    }
  }
  
  type UnmarshalledQuietTime = QuietTime
}
