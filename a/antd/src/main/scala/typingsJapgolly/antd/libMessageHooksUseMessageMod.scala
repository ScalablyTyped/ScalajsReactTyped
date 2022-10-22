package typingsJapgolly.antd

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antd.anon.Instance
import typingsJapgolly.antd.libMessageMod.ArgsProps
import typingsJapgolly.antd.libMessageMod.MessageInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessageHooksUseMessageMod {
  
  @JSImport("antd/lib/message/hooks/useMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    getRcNotificationInstance: js.Function2[/* args */ ArgsProps, /* callback */ js.Function1[/* info */ Instance, Unit], Unit],
    getRCNoticeProps: js.Function2[
      /* args */ ArgsProps, 
      /* prefixCls */ String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RCNoticeContent */ Any
    ]
  ): js.Function0[js.Tuple2[MessageInstance, Element]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getRcNotificationInstance.asInstanceOf[js.Any], getRCNoticeProps.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Tuple2[MessageInstance, Element]]]
}
