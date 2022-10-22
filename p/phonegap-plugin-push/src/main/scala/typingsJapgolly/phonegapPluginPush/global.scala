package typingsJapgolly.phonegapPluginPush

import typingsJapgolly.phonegapPluginPush.PhonegapPluginPush.InitOptions
import typingsJapgolly.phonegapPluginPush.PhonegapPluginPush.PushNotificationStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("PushNotification")
  @js.native
  open class PushNotification protected ()
    extends StObject
       with typingsJapgolly.phonegapPluginPush.PhonegapPluginPush.PushNotification {
    def this(options: InitOptions) = this()
  }
  @JSGlobal("PushNotification")
  @js.native
  def PushNotification: PushNotificationStatic = js.native
  inline def PushNotification_=(x: PushNotificationStatic): Unit = js.Dynamic.global.updateDynamic("PushNotification")(x.asInstanceOf[js.Any])
}
