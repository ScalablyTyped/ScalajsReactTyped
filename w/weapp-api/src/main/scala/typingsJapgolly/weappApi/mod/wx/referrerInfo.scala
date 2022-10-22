package typingsJapgolly.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait referrerInfo extends StObject {
  
  /** 来源小程序、公众号或 App 的 appId */
  var appId: String
  
  /** 来源小程序传过来的数据，scene=1037或1038时支持 */
  var extraData: js.Object
}
object referrerInfo {
  
  inline def apply(appId: String, extraData: js.Object): referrerInfo = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any])
    __obj.asInstanceOf[referrerInfo]
  }
  
  extension [Self <: referrerInfo](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setExtraData(value: js.Object): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
  }
}
