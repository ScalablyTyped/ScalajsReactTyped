package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object eventarcMod {
  
  @JSImport("firebase-admin/eventarc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/eventarc", "Channel")
  @js.native
  open class Channel ()
    extends typingsJapgolly.firebaseAdmin.libEventarcMod.Channel
  
  @JSImport("firebase-admin/eventarc", "Eventarc")
  @js.native
  open class Eventarc ()
    extends typingsJapgolly.firebaseAdmin.libEventarcMod.Eventarc
  
  inline def getEventarc(): typingsJapgolly.firebaseAdmin.libEventarcEventarcMod.Eventarc = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventarc")().asInstanceOf[typingsJapgolly.firebaseAdmin.libEventarcEventarcMod.Eventarc]
  inline def getEventarc(app: App): typingsJapgolly.firebaseAdmin.libEventarcEventarcMod.Eventarc = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventarc")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libEventarcEventarcMod.Eventarc]
}
