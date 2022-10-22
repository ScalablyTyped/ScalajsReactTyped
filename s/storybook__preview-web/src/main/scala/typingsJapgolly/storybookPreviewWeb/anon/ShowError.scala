package typingsJapgolly.storybookPreviewWeb.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowError extends StObject {
  
  def showError(err: Description): Unit
  
  def showException(err: js.Error): Unit
  
  def showMain(): Unit
}
object ShowError {
  
  inline def apply(showError: Description => Callback, showException: js.Error => Callback, showMain: Callback): ShowError = {
    val __obj = js.Dynamic.literal(showError = js.Any.fromFunction1((t0: Description) => showError(t0).runNow()), showException = js.Any.fromFunction1((t0: js.Error) => showException(t0).runNow()), showMain = showMain.toJsFn)
    __obj.asInstanceOf[ShowError]
  }
  
  extension [Self <: ShowError](x: Self) {
    
    inline def setShowError(value: Description => Callback): Self = StObject.set(x, "showError", js.Any.fromFunction1((t0: Description) => value(t0).runNow()))
    
    inline def setShowException(value: js.Error => Callback): Self = StObject.set(x, "showException", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setShowMain(value: Callback): Self = StObject.set(x, "showMain", value.toJsFn)
  }
}
