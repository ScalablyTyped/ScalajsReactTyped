package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableSelectorEditableRowEditableRowDotdriverMod {
  
  trait EditableRowDriver
    extends StObject
       with BaseDriver {
    
    def clickApprove(): Unit
    
    def clickCancel(): Unit
    
    def getText(): String
    
    def isApproveDisabled(): Boolean
    
    def isInputFocused(): Boolean
    
    def keyDown(keyCode: Double): Unit
    
    def setText(text: String): Unit
  }
  object EditableRowDriver {
    
    inline def apply(
      clickApprove: Callback,
      clickCancel: Callback,
      exists: CallbackTo[Boolean],
      getText: CallbackTo[String],
      isApproveDisabled: CallbackTo[Boolean],
      isInputFocused: CallbackTo[Boolean],
      keyDown: Double => Callback,
      setText: String => Callback
    ): EditableRowDriver = {
      val __obj = js.Dynamic.literal(clickApprove = clickApprove.toJsFn, clickCancel = clickCancel.toJsFn, exists = exists.toJsFn, getText = getText.toJsFn, isApproveDisabled = isApproveDisabled.toJsFn, isInputFocused = isInputFocused.toJsFn, keyDown = js.Any.fromFunction1((t0: Double) => keyDown(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()))
      __obj.asInstanceOf[EditableRowDriver]
    }
    
    extension [Self <: EditableRowDriver](x: Self) {
      
      inline def setClickApprove(value: Callback): Self = StObject.set(x, "clickApprove", value.toJsFn)
      
      inline def setClickCancel(value: Callback): Self = StObject.set(x, "clickCancel", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setIsApproveDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isApproveDisabled", value.toJsFn)
      
      inline def setIsInputFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInputFocused", value.toJsFn)
      
      inline def setKeyDown(value: Double => Callback): Self = StObject.set(x, "keyDown", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
