package typingsJapgolly.handsontable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.shortcutsContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutsManagerMod {
  
  trait ShortcutManager extends StObject {
    
    def addContext(contextName: String): Context
    
    def destroy(): Unit
    
    def getActiveContextName(): String
    
    def getContext(contextName: String): js.UndefOr[Context]
    
    def isCtrlPressed(): Boolean
    
    def setActiveContextName(contextName: String): Unit
  }
  object ShortcutManager {
    
    inline def apply(
      addContext: String => Context,
      destroy: Callback,
      getActiveContextName: CallbackTo[String],
      getContext: String => js.UndefOr[Context],
      isCtrlPressed: CallbackTo[Boolean],
      setActiveContextName: String => Callback
    ): ShortcutManager = {
      val __obj = js.Dynamic.literal(addContext = js.Any.fromFunction1(addContext), destroy = destroy.toJsFn, getActiveContextName = getActiveContextName.toJsFn, getContext = js.Any.fromFunction1(getContext), isCtrlPressed = isCtrlPressed.toJsFn, setActiveContextName = js.Any.fromFunction1((t0: String) => setActiveContextName(t0).runNow()))
      __obj.asInstanceOf[ShortcutManager]
    }
    
    extension [Self <: ShortcutManager](x: Self) {
      
      inline def setAddContext(value: String => Context): Self = StObject.set(x, "addContext", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetActiveContextName(value: CallbackTo[String]): Self = StObject.set(x, "getActiveContextName", value.toJsFn)
      
      inline def setGetContext(value: String => js.UndefOr[Context]): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
      
      inline def setIsCtrlPressed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCtrlPressed", value.toJsFn)
      
      inline def setSetActiveContextName(value: String => Callback): Self = StObject.set(x, "setActiveContextName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
