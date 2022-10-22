package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreConfigInfo extends StObject {
  
  var configInfo: StringDictionary[Any]
}
object RestoreConfigInfo {
  
  inline def apply(configInfo: StringDictionary[Any]): RestoreConfigInfo = {
    val __obj = js.Dynamic.literal(configInfo = configInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreConfigInfo]
  }
  
  extension [Self <: RestoreConfigInfo](x: Self) {
    
    inline def setConfigInfo(value: StringDictionary[Any]): Self = StObject.set(x, "configInfo", value.asInstanceOf[js.Any])
  }
}
