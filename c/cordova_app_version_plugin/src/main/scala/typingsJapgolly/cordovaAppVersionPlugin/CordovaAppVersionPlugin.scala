package typingsJapgolly.cordovaAppVersionPlugin

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Keep the type global namespace clean by using a module
  */
object CordovaAppVersionPlugin {
  
  trait CordovaAppVersionPlugin extends StObject {
    
    /**
      * App version from config.xml's version (e.g. <widget id="my.app.id" version="1.5.0">)
      * @example window.cordova.plugins.version.getAppVersion() // e.g: "1.5.0"
      */
    def getAppVersion(): String
  }
  object CordovaAppVersionPlugin {
    
    inline def apply(getAppVersion: CallbackTo[String]): typingsJapgolly.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin = {
      val __obj = js.Dynamic.literal(getAppVersion = getAppVersion.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin]
    }
    
    extension [Self <: typingsJapgolly.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin](x: Self) {
      
      inline def setGetAppVersion(value: CallbackTo[String]): Self = StObject.set(x, "getAppVersion", value.toJsFn)
    }
  }
}
