package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseMessaging.distEsmSrcInterfacesPublicTypesMod.MessagePayload
import typingsJapgolly.firebaseMessaging.distEsmSrcInterfacesPublicTypesMod.Messaging
import typingsJapgolly.firebaseUtil.mod.NextFn
import typingsJapgolly.firebaseUtil.mod.Observer
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcIndexDotswMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/index.sw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def experimentalSetDeliveryMetricsExportedToBigQueryEnabled(messaging: Messaging, enable: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("experimentalSetDeliveryMetricsExportedToBigQueryEnabled")(messaging.asInstanceOf[js.Any], enable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getMessaging(): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")().asInstanceOf[Messaging]
  inline def getMessaging(app: FirebaseApp): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
  
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
  
  inline def onBackgroundMessage(messaging: Messaging, nextOrObserver: NextFn[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onBackgroundMessage(messaging: Messaging, nextOrObserver: Observer[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `messaging-sw`: Messaging
    }
    object NameServiceMapping {
      
      inline def apply(`messaging-sw`: Messaging): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("messaging-sw")(`messaging-sw`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setMessaging-sw`(value: Messaging): Self = StObject.set(x, "messaging-sw", value.asInstanceOf[js.Any])
      }
    }
  }
}
