package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.grommet.anon.AutoClose
import typingsJapgolly.grommet.es6ComponentsAnchorMod.AnchorType
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsNotificationMod {
  
  @JSImport("grommet/es6/components/Notification", "Notification")
  @js.native
  val Notification: FC[NotificationProps] = js.native
  
  trait NotificationProps extends StObject {
    
    var actions: js.UndefOr[js.Array[AnchorType]] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String | Node] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var status: js.UndefOr[StatusType] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var toast: js.UndefOr[Boolean | AutoClose] = js.undefined
  }
  object NotificationProps {
    
    inline def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    extension [Self <: NotificationProps](x: Self) {
      
      inline def setActions(value: js.Array[AnchorType]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: AnchorType*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setMessage(value: String | Node): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "message", js.Array(value*))
      
      inline def setMessageVdomElement(value: VdomElement): Self = StObject.set(x, "message", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClose(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setStatus(value: StatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToast(value: Boolean | AutoClose): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
      
      inline def setToastUndefined: Self = StObject.set(x, "toast", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grommet.grommetStrings.critical
    - typingsJapgolly.grommet.grommetStrings.warning
    - typingsJapgolly.grommet.grommetStrings.normal
    - typingsJapgolly.grommet.grommetStrings.info
    - typingsJapgolly.grommet.grommetStrings.unknown
  */
  trait StatusType extends StObject
  object StatusType {
    
    inline def critical: typingsJapgolly.grommet.grommetStrings.critical = "critical".asInstanceOf[typingsJapgolly.grommet.grommetStrings.critical]
    
    inline def info: typingsJapgolly.grommet.grommetStrings.info = "info".asInstanceOf[typingsJapgolly.grommet.grommetStrings.info]
    
    inline def normal: typingsJapgolly.grommet.grommetStrings.normal = "normal".asInstanceOf[typingsJapgolly.grommet.grommetStrings.normal]
    
    inline def unknown: typingsJapgolly.grommet.grommetStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.grommet.grommetStrings.unknown]
    
    inline def warning: typingsJapgolly.grommet.grommetStrings.warning = "warning".asInstanceOf[typingsJapgolly.grommet.grommetStrings.warning]
  }
}
