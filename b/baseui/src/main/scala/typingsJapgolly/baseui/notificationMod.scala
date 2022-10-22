package typingsJapgolly.baseui

import typingsJapgolly.baseui.notificationNotificationMod.default
import typingsJapgolly.baseui.toastTypesMod.ToastPropsShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  /* Inlined std.Readonly<{ readonly info :'info',  readonly positive :'positive',  readonly warning :'warning',  readonly negative :'negative'}> */
  object KIND {
    
    @JSImport("baseui/notification", "KIND.info")
    @js.native
    val info: typingsJapgolly.baseui.baseuiStrings.info = js.native
    
    @JSImport("baseui/notification", "KIND.negative")
    @js.native
    val negative: typingsJapgolly.baseui.baseuiStrings.negative = js.native
    
    @JSImport("baseui/notification", "KIND.positive")
    @js.native
    val positive: typingsJapgolly.baseui.baseuiStrings.positive = js.native
    
    @JSImport("baseui/notification", "KIND.warning")
    @js.native
    val warning: typingsJapgolly.baseui.baseuiStrings.warning = js.native
  }
  
  @JSImport("baseui/notification", "Notification")
  @js.native
  open class Notification () extends default
  /* static members */
  object Notification {
    
    @JSImport("baseui/notification", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/notification", "Notification.defaultProps")
    @js.native
    def defaultProps: ToastPropsShape = js.native
    inline def defaultProps_=(x: ToastPropsShape): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
