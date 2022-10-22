package typingsJapgolly.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattingApi {
  
  /**
    * Helper of Formatting API interface
    */
  object Types {
    
    /**
      * DateTime Field Behavior options
      * 0 - None - Unknown DateTime Behavior,
      * 1 - UserLocal - Respect user local time. Dates stored as UTC,
      * 3 - TimeZoneIndependent - Dates and time stored without conversion to UTC
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`3`
    */
    trait DateTimeFieldBehavior extends StObject
    object DateTimeFieldBehavior {
      
      inline def `0`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0` = 0.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`]
      
      inline def `1`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1` = 1.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`]
      
      inline def `3`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`3` = 3.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`3`]
    }
  }
}
