package typingsJapgolly.firebaseAuth

import japgolly.scalajs.react.Callback
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.firebaseAuth.anon.InAppBrowser31
import typingsJapgolly.firebaseAuth.anon.PackageName
import typingsJapgolly.firebaseAuth.anon.Subscribe
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcPlatformCordovaPluginsMod {
  
  @JSImport("@firebase/auth/dist/rn/src/platform_cordova/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _cordovaWindow(): CordovaWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("_cordovaWindow")().asInstanceOf[CordovaWindow]
  
  @js.native
  trait CordovaWindow
    extends StObject
       with Window {
    
    var BuildInfo: PackageName = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var cordova: InAppBrowser31 = js.native
    
    def handleOpenURL(url: String): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var universalLinks: Subscribe = js.native
  }
  
  trait InAppBrowserRef extends StObject {
    
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object InAppBrowserRef {
    
    inline def apply(): InAppBrowserRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InAppBrowserRef]
    }
    
    extension [Self <: InAppBrowserRef](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    }
  }
}
