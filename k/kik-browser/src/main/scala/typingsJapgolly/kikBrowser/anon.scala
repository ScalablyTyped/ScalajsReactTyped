package typingsJapgolly.kikBrowser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kikBrowser.kikBrowserStrings.free
import typingsJapgolly.kikBrowser.kikBrowserStrings.landscape
import typingsJapgolly.kikBrowser.kikBrowserStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Back extends StObject {
    
    def back(callback: js.Function0[Boolean | Unit]): Unit = js.native
    
    var background: Boolean = js.native
    
    def backlightTimeout(timeout: Boolean): Unit = js.native
    
    def getOrientationLock(): String = js.native
    
    def off(property: String, callback: js.Function0[Unit]): Unit = js.native
    
    def on(property: String, callback: js.Function0[Unit]): Unit = js.native
    
    def once(property: String, callback: js.Function0[Unit]): Unit = js.native
    
    def setOrientationLock(lock: free | landscape | portrait): Unit = js.native
    def setOrientationLock(lock: String): Unit = js.native
    
    def statusBar(show: Boolean): Unit = js.native
    
    def trigger(property: String): Unit = js.native
    def trigger(property: String, data: Any): Unit = js.native
    
    def unbindBack(callback: js.Function0[Boolean | Unit]): Unit = js.native
  }
  
  trait Browser extends StObject {
    
    var browser: Name
    
    var os: Name
    
    var version: Name
  }
  object Browser {
    
    inline def apply(browser: Name, os: Name, version: Name): Browser = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    extension [Self <: Browser](x: Self) {
      
      inline def setBrowser(value: Name): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setOs(value: Name): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Name): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(url: String, data: Any, callback: js.Function1[/* response */ Any, Unit]): Unit = js.native
    
    def reply(data: Any): Unit = js.native
  }
  
  @js.native
  trait EnableGoogleAnalytics extends StObject {
    
    def enableGoogleAnalytics(): Unit = js.native
    def enableGoogleAnalytics(trackingId: String, domain: String): Unit = js.native
    def enableGoogleAnalytics(trackingId: String, domain: String, oldApi: Boolean): Unit = js.native
  }
  
  @js.native
  trait Get extends StObject {
    
    def get(callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
    def get(options: KikGetOptions, callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
    
    def getFromCamera(callbacks: KikGetFromCameraCallbacks): Unit = js.native
    def getFromCamera(options: KikGetFromCameraOptions, callbacks: KikGetFromCameraCallbacks): Unit = js.native
    
    def getFromGallery(callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
    def getFromGallery(options: KikGetOptions, callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
    
    def saveToGallery(url: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = js.native
  }
  
  trait Hide extends StObject {
    
    def hide(): Unit
    
    def isEnabled(): Boolean
    
    def show(): Unit
  }
  object Hide {
    
    inline def apply(hide: Callback, isEnabled: CallbackTo[Boolean], show: Callback): Hide = {
      val __obj = js.Dynamic.literal(hide = hide.toJsFn, isEnabled = isEnabled.toJsFn, show = show.toJsFn)
      __obj.asInstanceOf[Hide]
    }
    
    extension [Self <: Hide](x: Self) {
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var version: String
  }
  object Name {
    
    inline def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Platform extends StObject {
    
    var platform: Browser
  }
  object Platform {
    
    inline def apply(platform: Browser): Platform = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Platform]
    }
    
    extension [Self <: Platform](x: Self) {
      
      inline def setPlatform(value: Browser): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait Username extends StObject {
    
    var username: String
  }
  object Username {
    
    inline def apply(username: String): Username = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Username]
    }
    
    extension [Self <: Username](x: Self) {
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
