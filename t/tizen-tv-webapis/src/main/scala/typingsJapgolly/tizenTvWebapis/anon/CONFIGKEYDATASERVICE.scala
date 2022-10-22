package typingsJapgolly.tizenTvWebapis.anon

import typingsJapgolly.tizenTvWebapis.tizenTvWebapisInts.`0`
import typingsJapgolly.tizenTvWebapis.tizenTvWebapisInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CONFIGKEYDATASERVICE extends StObject {
  
  /**
    * Data service configuration, it can be setted as string ype with numbers
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  var CONFIG_KEY_DATA_SERVICE: `0`
  
  /**
    * Service country, readonly
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  var CONFIG_KEY_SERVICE_COUNTRY: `1`
}
object CONFIGKEYDATASERVICE {
  
  inline def apply(): CONFIGKEYDATASERVICE = {
    val __obj = js.Dynamic.literal(CONFIG_KEY_DATA_SERVICE = 0, CONFIG_KEY_SERVICE_COUNTRY = 1)
    __obj.asInstanceOf[CONFIGKEYDATASERVICE]
  }
  
  extension [Self <: CONFIGKEYDATASERVICE](x: Self) {
    
    inline def setCONFIG_KEY_DATA_SERVICE(value: `0`): Self = StObject.set(x, "CONFIG_KEY_DATA_SERVICE", value.asInstanceOf[js.Any])
    
    inline def setCONFIG_KEY_SERVICE_COUNTRY(value: `1`): Self = StObject.set(x, "CONFIG_KEY_SERVICE_COUNTRY", value.asInstanceOf[js.Any])
  }
}
