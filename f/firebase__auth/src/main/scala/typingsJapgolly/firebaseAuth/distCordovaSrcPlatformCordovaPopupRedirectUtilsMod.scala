package typingsJapgolly.firebaseAuth

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseAuth.distCordovaSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distCordovaSrcModelPopupRedirectMod.AuthEvent
import typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.AuthProvider
import typingsJapgolly.firebaseAuth.distCordovaSrcPlatformCordovaPluginsMod.InAppBrowserRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcPlatformCordovaPopupRedirectUtilsMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/platform_cordova/popup_redirect/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkCordovaConfiguration(auth: AuthInternal): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_checkCordovaConfiguration")(auth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def generateHandlerUrl(auth: AuthInternal, event: AuthEvent, provider: AuthProvider): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_generateHandlerUrl")(auth.asInstanceOf[js.Any], event.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def performRedirect(handlerUrl: String): js.Promise[InAppBrowserRef | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("_performRedirect")(handlerUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InAppBrowserRef | Null]]
  
  inline def validateOrigin(auth: AuthInternal): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_validateOrigin")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def waitForAppResume(auth: AuthInternal, eventListener: PassiveAuthEventListener): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_waitForAppResume")(auth.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForAppResume(auth: AuthInternal, eventListener: PassiveAuthEventListener, iabRef: InAppBrowserRef): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_waitForAppResume")(auth.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any], iabRef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait PassiveAuthEventListener extends StObject {
    
    def addPassiveListener(cb: js.Function0[Unit]): Unit
    
    def removePassiveListener(cb: js.Function0[Unit]): Unit
  }
  object PassiveAuthEventListener {
    
    inline def apply(
      addPassiveListener: js.Function0[Unit] => Callback,
      removePassiveListener: js.Function0[Unit] => Callback
    ): PassiveAuthEventListener = {
      val __obj = js.Dynamic.literal(addPassiveListener = js.Any.fromFunction1((t0: js.Function0[Unit]) => addPassiveListener(t0).runNow()), removePassiveListener = js.Any.fromFunction1((t0: js.Function0[Unit]) => removePassiveListener(t0).runNow()))
      __obj.asInstanceOf[PassiveAuthEventListener]
    }
    
    extension [Self <: PassiveAuthEventListener](x: Self) {
      
      inline def setAddPassiveListener(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "addPassiveListener", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setRemovePassiveListener(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "removePassiveListener", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    }
  }
}
