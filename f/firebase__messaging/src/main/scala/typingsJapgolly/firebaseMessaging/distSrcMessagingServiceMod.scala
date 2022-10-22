package typingsJapgolly.firebaseMessaging

import org.scalajs.dom.ServiceWorkerRegistration
import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseMessaging.distSrcInterfacesInternalDependenciesMod.FirebaseInternalDependencies
import typingsJapgolly.firebaseMessaging.distSrcInterfacesLoggingTypesMod.LogEvent
import typingsJapgolly.firebaseMessaging.distSrcInterfacesPublicTypesMod.MessagePayload
import typingsJapgolly.firebaseUtil.mod.NextFn
import typingsJapgolly.firebaseUtil.mod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessagingServiceMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @JSImport("@firebase/messaging/dist/src/messaging-service", "MessagingService")
  @js.native
  open class MessagingService protected () extends StObject {
    def this(
      app: FirebaseApp,
      installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any,
      analyticsProvider: Provider[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ Any
          ]
    ) = this()
    
    def _delete(): js.Promise[Unit] = js.native
    
    val app: FirebaseApp = js.native
    
    var deliveryMetricsExportedToBigQueryEnabled: Boolean = js.native
    
    val firebaseDependencies: FirebaseInternalDependencies = js.native
    
    var isLogServiceStarted: Boolean = js.native
    
    var logEvents: js.Array[LogEvent] = js.native
    
    var onBackgroundMessageHandler: NextFn[MessagePayload] | Observer[MessagePayload] | Null = js.native
    
    var onMessageHandler: NextFn[MessagePayload] | Observer[MessagePayload] | Null = js.native
    
    var swRegistration: js.UndefOr[ServiceWorkerRegistration] = js.native
    
    var vapidKey: js.UndefOr[String] = js.native
  }
}
