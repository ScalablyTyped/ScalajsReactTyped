package typingsJapgolly.inboxsdk.mod.Lists

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListsInstance extends StObject {
  
  def getSelectedThreadRowViews(): js.Array[ThreadRowView]
  
  def registerThreadRowViewHandler(handler: js.Function1[/* threadRowView */ ThreadRowView, Any]): js.Function0[Unit]
  
  def registerThreadRowViewSelectionHandler(handler: js.Function0[Any]): js.Function0[Unit]
}
object ListsInstance {
  
  inline def apply(
    getSelectedThreadRowViews: CallbackTo[js.Array[ThreadRowView]],
    registerThreadRowViewHandler: js.Function1[/* threadRowView */ ThreadRowView, Any] => js.Function0[Unit],
    registerThreadRowViewSelectionHandler: js.Function0[Any] => js.Function0[Unit]
  ): ListsInstance = {
    val __obj = js.Dynamic.literal(getSelectedThreadRowViews = getSelectedThreadRowViews.toJsFn, registerThreadRowViewHandler = js.Any.fromFunction1(registerThreadRowViewHandler), registerThreadRowViewSelectionHandler = js.Any.fromFunction1(registerThreadRowViewSelectionHandler))
    __obj.asInstanceOf[ListsInstance]
  }
  
  extension [Self <: ListsInstance](x: Self) {
    
    inline def setGetSelectedThreadRowViews(value: CallbackTo[js.Array[ThreadRowView]]): Self = StObject.set(x, "getSelectedThreadRowViews", value.toJsFn)
    
    inline def setRegisterThreadRowViewHandler(value: js.Function1[/* threadRowView */ ThreadRowView, Any] => js.Function0[Unit]): Self = StObject.set(x, "registerThreadRowViewHandler", js.Any.fromFunction1(value))
    
    inline def setRegisterThreadRowViewSelectionHandler(value: js.Function0[Any] => js.Function0[Unit]): Self = StObject.set(x, "registerThreadRowViewSelectionHandler", js.Any.fromFunction1(value))
  }
}
