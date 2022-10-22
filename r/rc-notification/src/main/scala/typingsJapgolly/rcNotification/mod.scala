package typingsJapgolly.rcNotification

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcNotification.esNoticeMod.NoticeProps
import typingsJapgolly.rcNotification.esUseNotificationMod.NotificationAPI
import typingsJapgolly.rcNotification.esUseNotificationMod.NotificationConfig
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-notification", "Notice")
  @js.native
  val Notice: ForwardRefExoticComponent[NoticeProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def useNotification(): js.Tuple2[NotificationAPI, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNotification")().asInstanceOf[js.Tuple2[NotificationAPI, Element]]
  inline def useNotification(rootConfig: NotificationConfig): js.Tuple2[NotificationAPI, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNotification")(rootConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NotificationAPI, Element]]
}
