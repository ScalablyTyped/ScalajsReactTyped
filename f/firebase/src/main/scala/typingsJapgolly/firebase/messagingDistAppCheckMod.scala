package typingsJapgolly.firebase

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAppCheck.mod.AppCheck
import typingsJapgolly.firebaseAppCheck.mod.AppCheckOptions
import typingsJapgolly.firebaseAppCheck.mod.AppCheckTokenResult
import typingsJapgolly.firebaseAppCheck.mod.CustomProviderOptions
import typingsJapgolly.firebaseUtil.mod.PartialObserver
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagingDistAppCheckMod {
  
  @JSImport("firebase/messaging/dist/app-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/messaging/dist/app-check", "CustomProvider")
  @js.native
  open class CustomProvider protected ()
    extends typingsJapgolly.firebaseAppCheck.mod.CustomProvider {
    def this(_customProviderOptions: CustomProviderOptions) = this()
  }
  
  @JSImport("firebase/messaging/dist/app-check", "ReCaptchaEnterpriseProvider")
  @js.native
  open class ReCaptchaEnterpriseProvider protected ()
    extends typingsJapgolly.firebaseAppCheck.mod.ReCaptchaEnterpriseProvider {
    /**
      * Create a ReCaptchaEnterpriseProvider instance.
      * @param siteKey - reCAPTCHA Enterprise score-based site key.
      */
    def this(_siteKey: String) = this()
  }
  
  @JSImport("firebase/messaging/dist/app-check", "ReCaptchaV3Provider")
  @js.native
  open class ReCaptchaV3Provider protected ()
    extends typingsJapgolly.firebaseAppCheck.mod.ReCaptchaV3Provider {
    /**
      * Create a ReCaptchaV3Provider instance.
      * @param siteKey - ReCAPTCHA V3 siteKey.
      */
    def this(_siteKey: String) = this()
  }
  
  inline def getToken(appCheckInstance: AppCheck): js.Promise[AppCheckTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(appCheckInstance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AppCheckTokenResult]]
  inline def getToken(appCheckInstance: AppCheck, forceRefresh: Boolean): js.Promise[AppCheckTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(appCheckInstance.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AppCheckTokenResult]]
  
  inline def initializeAppCheck(app: Unit, options: AppCheckOptions): AppCheck = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAppCheck")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AppCheck]
  inline def initializeAppCheck(app: FirebaseApp, options: AppCheckOptions): AppCheck = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAppCheck")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AppCheck]
  
  inline def onTokenChanged(appCheckInstance: AppCheck, observer: PartialObserver[AppCheckTokenResult]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(appCheckInstance: AppCheck, onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(
    appCheckInstance: AppCheck,
    onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(
    appCheckInstance: AppCheck,
    onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(
    appCheckInstance: AppCheck,
    onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def setTokenAutoRefreshEnabled(appCheckInstance: AppCheck, isTokenAutoRefreshEnabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokenAutoRefreshEnabled")(appCheckInstance.asInstanceOf[js.Any], isTokenAutoRefreshEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
