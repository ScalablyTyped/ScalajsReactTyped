package typingsJapgolly.firebaseAppCheckCompat

import typingsJapgolly.firebaseAppCheck.mod.AppCheck
import typingsJapgolly.firebaseAppCheckTypes.mod.AppCheckTokenResult
import typingsJapgolly.firebaseAppCheckTypes.mod.FirebaseAppCheck
import typingsJapgolly.firebaseAppCompat.mod.FirebaseApp
import typingsJapgolly.firebaseUtil.mod.PartialObserver
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcServiceMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @firebase/app-compat.@firebase/app-compat._FirebaseService, '_delegate'> ]: @firebase/app-compat.@firebase/app-compat._FirebaseService[P]} */ @JSImport("@firebase/app-check-compat/dist/src/service", "AppCheckService")
  @js.native
  open class AppCheckService protected ()
    extends StObject
       with FirebaseAppCheck {
    def this(app: FirebaseApp) = this()
    
    var _delegate: js.UndefOr[AppCheck] = js.native
    
    @JSName("app")
    var app_AppCheckService: FirebaseApp = js.native
    
    def onTokenChanged(
      onNextOrObserver: PartialObserver[AppCheckTokenResult],
      onError: js.Function1[/* error */ js.Error, Unit]
    ): Unsubscribe = js.native
    def onTokenChanged(
      onNextOrObserver: PartialObserver[AppCheckTokenResult],
      onError: js.Function1[/* error */ js.Error, Unit],
      onCompletion: js.Function0[Unit]
    ): Unsubscribe = js.native
    def onTokenChanged(
      onNextOrObserver: PartialObserver[AppCheckTokenResult],
      onError: Unit,
      onCompletion: js.Function0[Unit]
    ): Unsubscribe = js.native
  }
}
