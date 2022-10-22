package typingsJapgolly.antd

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antd.anon.Instance
import typingsJapgolly.antd.libNotificationMod.ArgsProps
import typingsJapgolly.antd.libNotificationMod.NotificationInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNotificationHooksUseNotificationMod {
  
  @JSImport("antd/lib/notification/hooks/useNotification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    getNotificationInstance: js.Function2[/* args */ ArgsProps, /* callback */ js.Function1[/* info */ Instance, Unit], Unit],
    getRCNoticeProps: js.Function2[
      /* args */ ArgsProps, 
      /* prefixCls */ String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RCNoticeContent */ Any
    ]
  ): js.Function0[js.Tuple2[NotificationInstance, Element]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getNotificationInstance.asInstanceOf[js.Any], getRCNoticeProps.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Tuple2[NotificationInstance, Element]]]
}
