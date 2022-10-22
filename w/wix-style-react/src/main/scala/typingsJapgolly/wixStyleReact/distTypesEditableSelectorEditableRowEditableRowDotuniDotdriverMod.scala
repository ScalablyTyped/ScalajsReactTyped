package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableSelectorEditableRowEditableRowDotuniDotdriverMod {
  
  trait EditableRowUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickApprove(): js.Promise[Unit]
    
    def clickCancel(): js.Promise[Unit]
    
    def getText(): js.Promise[String]
    
    def isApproveDisabled(): js.Promise[Boolean]
    
    def isInputFocused(): js.Promise[Boolean]
    
    def keyDown(keyCode: Double): js.Promise[Unit]
    
    def setText(text: String): js.Promise[Unit]
  }
  object EditableRowUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickApprove: CallbackTo[js.Promise[Unit]],
      clickCancel: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getText: CallbackTo[js.Promise[String]],
      isApproveDisabled: CallbackTo[js.Promise[Boolean]],
      isInputFocused: CallbackTo[js.Promise[Boolean]],
      keyDown: Double => js.Promise[Unit],
      setText: String => js.Promise[Unit]
    ): EditableRowUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickApprove = clickApprove.toJsFn, clickCancel = clickCancel.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getText = getText.toJsFn, isApproveDisabled = isApproveDisabled.toJsFn, isInputFocused = isInputFocused.toJsFn, keyDown = js.Any.fromFunction1(keyDown), setText = js.Any.fromFunction1(setText))
      __obj.asInstanceOf[EditableRowUniDriver]
    }
    
    extension [Self <: EditableRowUniDriver](x: Self) {
      
      inline def setClickApprove(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickApprove", value.toJsFn)
      
      inline def setClickCancel(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickCancel", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setIsApproveDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isApproveDisabled", value.toJsFn)
      
      inline def setIsInputFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isInputFocused", value.toJsFn)
      
      inline def setKeyDown(value: Double => js.Promise[Unit]): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
      
      inline def setSetText(value: String => js.Promise[Unit]): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    }
  }
}
