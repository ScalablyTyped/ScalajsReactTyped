package typingsJapgolly.cordovaPluginAppVersion

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GetAppName extends StObject {
    
    def getAppName(): js.Promise[String]
    
    def getPackageName(): js.Promise[String]
    
    def getVersionCode(): js.Promise[String]
    
    def getVersionNumber(): js.Promise[String]
  }
  object GetAppName {
    
    inline def apply(
      getAppName: CallbackTo[js.Promise[String]],
      getPackageName: CallbackTo[js.Promise[String]],
      getVersionCode: CallbackTo[js.Promise[String]],
      getVersionNumber: CallbackTo[js.Promise[String]]
    ): GetAppName = {
      val __obj = js.Dynamic.literal(getAppName = getAppName.toJsFn, getPackageName = getPackageName.toJsFn, getVersionCode = getVersionCode.toJsFn, getVersionNumber = getVersionNumber.toJsFn)
      __obj.asInstanceOf[GetAppName]
    }
    
    extension [Self <: GetAppName](x: Self) {
      
      inline def setGetAppName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAppName", value.toJsFn)
      
      inline def setGetPackageName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPackageName", value.toJsFn)
      
      inline def setGetVersionCode(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getVersionCode", value.toJsFn)
      
      inline def setGetVersionNumber(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getVersionNumber", value.toJsFn)
    }
  }
}
