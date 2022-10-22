package typingsJapgolly.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadDataConfig extends StObject {
  
  /**
    * The type of preloaded data. Only Synthea preloaded data is supported.
    */
  var PreloadDataType: typingsJapgolly.awsSdk.clientsHealthlakeMod.PreloadDataType
}
object PreloadDataConfig {
  
  inline def apply(PreloadDataType: PreloadDataType): PreloadDataConfig = {
    val __obj = js.Dynamic.literal(PreloadDataType = PreloadDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadDataConfig]
  }
  
  extension [Self <: PreloadDataConfig](x: Self) {
    
    inline def setPreloadDataType(value: PreloadDataType): Self = StObject.set(x, "PreloadDataType", value.asInstanceOf[js.Any])
  }
}
