package typingsJapgolly.slateReact.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.slateReact.distHooksUseSlateSelectorMod.EditorChangeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEventListener extends StObject {
  
  def addEventListener(callback: EditorChangeHandler): js.Function0[Unit]
  
  def getSlate(): typingsJapgolly.slate.distInterfacesEditorMod.Editor
}
object AddEventListener {
  
  inline def apply(
    addEventListener: EditorChangeHandler => js.Function0[Unit],
    getSlate: CallbackTo[typingsJapgolly.slate.distInterfacesEditorMod.Editor]
  ): AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction1(addEventListener), getSlate = getSlate.toJsFn)
    __obj.asInstanceOf[AddEventListener]
  }
  
  extension [Self <: AddEventListener](x: Self) {
    
    inline def setAddEventListener(value: EditorChangeHandler => js.Function0[Unit]): Self = StObject.set(x, "addEventListener", js.Any.fromFunction1(value))
    
    inline def setGetSlate(value: CallbackTo[typingsJapgolly.slate.distInterfacesEditorMod.Editor]): Self = StObject.set(x, "getSlate", value.toJsFn)
  }
}
