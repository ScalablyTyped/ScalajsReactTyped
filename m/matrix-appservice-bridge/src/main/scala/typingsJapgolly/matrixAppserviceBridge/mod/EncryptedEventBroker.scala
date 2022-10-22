package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.matrixAppserviceBridge.anon.Flows
import typingsJapgolly.matrixAppserviceBridge.libComponentsEncryptionMod.ClientEncryptionStore
import typingsJapgolly.matrixAppserviceBridge.libComponentsEventTypesMod.WeakEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "EncryptedEventBroker")
@js.native
open class EncryptedEventBroker protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libComponentsEncryptionMod.EncryptedEventBroker {
  def this(
    membership: typingsJapgolly.matrixAppserviceBridge.libComponentsMembershipCacheMod.MembershipCache,
    asBot: typingsJapgolly.matrixAppserviceBridge.libComponentsAppServiceBotMod.AppServiceBot,
    onEvent: js.Function1[/* weakEvent */ WeakEvent, Unit],
    getIntent: js.Function1[
        /* userId */ String, 
        typingsJapgolly.matrixAppserviceBridge.libComponentsIntentMod.Intent
      ],
    store: ClientEncryptionStore
  ) = this()
}
/* static members */
object EncryptedEventBroker {
  
  @JSImport("matrix-appservice-bridge", "EncryptedEventBroker")
  @js.native
  val ^ : js.Any = js.native
  
  inline def supportsLoginFlow(loginFlows: Flows): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsLoginFlow")(loginFlows.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
