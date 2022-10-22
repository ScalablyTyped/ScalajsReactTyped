package typingsJapgolly.weappApi.mod.wx

import typingsJapgolly.weappApi.weappApiStrings.`2g`
import typingsJapgolly.weappApi.weappApiStrings.`3g`
import typingsJapgolly.weappApi.weappApiStrings.`4g`
import typingsJapgolly.weappApi.weappApiStrings.wifi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkTypeData extends StObject {
  
  /** 返回网络类型2g，3g，4g，wifi */
  var networkType: `2g` | `3g` | `4g` | wifi
}
object NetworkTypeData {
  
  inline def apply(networkType: `2g` | `3g` | `4g` | wifi): NetworkTypeData = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkTypeData]
  }
  
  extension [Self <: NetworkTypeData](x: Self) {
    
    inline def setNetworkType(value: `2g` | `3g` | `4g` | wifi): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
