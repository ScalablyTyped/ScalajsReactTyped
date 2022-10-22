package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseMessaging.distSrcInterfacesPublicTypesMod.Messaging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiSetDeliveryMetricsExportedToBigQueryEnabledMod {
  
  @JSImport("@firebase/messaging/dist/src/api/setDeliveryMetricsExportedToBigQueryEnabled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setDeliveryMetricsExportedToBigQueryEnabled(messaging: Messaging, enable: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setDeliveryMetricsExportedToBigQueryEnabled")(messaging.asInstanceOf[js.Any], enable.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
