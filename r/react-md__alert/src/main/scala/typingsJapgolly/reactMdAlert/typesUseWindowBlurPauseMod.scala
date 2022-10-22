package typingsJapgolly.reactMdAlert

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseWindowBlurPauseMod {
  
  @JSImport("@react-md/alert/types/useWindowBlurPause", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useWindowBlurPause(hasStartTimerStopTimerVisibleMessageDisabled: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowBlurPause")(hasStartTimerStopTimerVisibleMessageDisabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[Message] = js.undefined
    
    def startTimer(): Unit
    
    def stopTimer(): Unit
    
    var visible: Boolean
  }
  object Options {
    
    inline def apply(startTimer: Callback, stopTimer: Callback, visible: Boolean): Options = {
      val __obj = js.Dynamic.literal(startTimer = startTimer.toJsFn, stopTimer = stopTimer.toJsFn, visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStartTimer(value: Callback): Self = StObject.set(x, "startTimer", value.toJsFn)
      
      inline def setStopTimer(value: Callback): Self = StObject.set(x, "stopTimer", value.toJsFn)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
