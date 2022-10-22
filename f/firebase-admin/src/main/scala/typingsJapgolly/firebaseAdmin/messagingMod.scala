package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object messagingMod {
  
  @JSImport("firebase-admin/messaging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/messaging", "Messaging")
  @js.native
  open class Messaging ()
    extends typingsJapgolly.firebaseAdmin.libMessagingMod.Messaging
  
  inline def getMessaging(): typingsJapgolly.firebaseAdmin.libMessagingMessagingMod.Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")().asInstanceOf[typingsJapgolly.firebaseAdmin.libMessagingMessagingMod.Messaging]
  inline def getMessaging(app: App): typingsJapgolly.firebaseAdmin.libMessagingMessagingMod.Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libMessagingMessagingMod.Messaging]
}
