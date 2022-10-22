package typingsJapgolly.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateToMiniProgramOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  要打开的小程序 appId
  var appId: String
  
  //  要打开的小程序版本。仅在当前小程序为开发版或体验版时此参数有效。如果当前小程序是正式版，则打开的小程序必定是正式版。
  var envVersion: js.UndefOr[typingsJapgolly.weappApi.mod.wx.envVersion] = js.undefined
  
  //  需要传递给目标小程序的数据，目标小程序可在 App.onLaunch，App.onShow 中获取到这份数据。
  var extraData: js.UndefOr[js.Object] = js.undefined
  
  //  打开的页面路径，如果为空则打开首页
  var path: js.UndefOr[String] = js.undefined
}
object NavigateToMiniProgramOptions {
  
  inline def apply(appId: String): NavigateToMiniProgramOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToMiniProgramOptions]
  }
  
  extension [Self <: NavigateToMiniProgramOptions](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setEnvVersion(value: envVersion): Self = StObject.set(x, "envVersion", value.asInstanceOf[js.Any])
    
    inline def setEnvVersionUndefined: Self = StObject.set(x, "envVersion", js.undefined)
    
    inline def setExtraData(value: js.Object): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
