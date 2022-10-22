package typingsJapgolly.onfidoActiveVideoCapture

import japgolly.scalajs.react.Callback
import typingsJapgolly.preact.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsAlertMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/Alert", "Alert")
  @js.native
  val Alert: FunctionComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var buttonLabel: String
    
    var message: String
    
    def onConfirm(): Unit
    
    var title: String
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(buttonLabel: String, message: String, onConfirm: Callback, title: String): Props = {
      val __obj = js.Dynamic.literal(buttonLabel = buttonLabel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onConfirm = onConfirm.toJsFn, title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOnConfirm(value: Callback): Self = StObject.set(x, "onConfirm", value.toJsFn)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
