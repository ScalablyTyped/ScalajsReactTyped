package typingsJapgolly.tizenTvWebapis.anon

import typingsJapgolly.tizenTvWebapis.tizenTvWebapisInts.`0`
import typingsJapgolly.tizenTvWebapis.tizenTvWebapisInts.`1`
import typingsJapgolly.tizenTvWebapis.tizenTvWebapisInts.`2`
import typingsJapgolly.tizenTvWebapis.tizenTvWebapisInts.`3`
import typingsJapgolly.tizenTvWebapis.tizenTvWebapisInts.`4`
import typingsJapgolly.tizenTvWebapis.tizenTvWebapisInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUTO extends StObject {
  
  /**
    * @version 1.0
    *
    * @since 2.3
    */
  var AUTO: `3`
  
  /**
    * Connected to wired or wireless IPv6 network through dynamic IP configuration
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var DYNAMIC: `2`
  
  /**
    * Connected to cellular network through fixed IP configuration
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var FIXED: `4`
  
  /**
    * No network IP mode configured
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var NONE: `0`
  
  /**
    * Connected to wired or wireless IPv4 network through static IP configuration
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var STATIC: `1`
  
  /**
    * No wired or wireless connection
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var UNKNOWN: `5`
}
object AUTO {
  
  inline def apply(): AUTO = {
    val __obj = js.Dynamic.literal(AUTO = 3, DYNAMIC = 2, FIXED = 4, NONE = 0, STATIC = 1, UNKNOWN = 5)
    __obj.asInstanceOf[AUTO]
  }
  
  extension [Self <: AUTO](x: Self) {
    
    inline def setAUTO(value: `3`): Self = StObject.set(x, "AUTO", value.asInstanceOf[js.Any])
    
    inline def setDYNAMIC(value: `2`): Self = StObject.set(x, "DYNAMIC", value.asInstanceOf[js.Any])
    
    inline def setFIXED(value: `4`): Self = StObject.set(x, "FIXED", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: `0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setSTATIC(value: `1`): Self = StObject.set(x, "STATIC", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN(value: `5`): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
  }
}
