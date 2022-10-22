package typingsJapgolly.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait onLaunchOptions extends StObject {
  
  /** 启动小程序的路径 */
  var path: String
  
  /** 启动小程序的query参数 */
  var query: js.Object
  
  /** 来源信息。从另一个小程序、公众号或App进入小程序时返回。范泽返回{} */
  var referrerInfo: typingsJapgolly.weappApi.mod.wx.referrerInfo
  
  /** 启动小程序的场景值 */
  var scene: Double
  
  var shareTicket: String
}
object onLaunchOptions {
  
  inline def apply(path: String, query: js.Object, referrerInfo: referrerInfo, scene: Double, shareTicket: String): onLaunchOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[onLaunchOptions]
  }
  
  extension [Self <: onLaunchOptions](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReferrerInfo(value: referrerInfo): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
    
    inline def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
  }
}
