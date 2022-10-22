package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWindowEvents
  extends StObject
     with IEvents {
  
  var OnCloseWindow: js.UndefOr[js.Function0[Boolean]] = js.undefined
}
object IWindowEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Callback): IWindowEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1((t0: Double) => Unregister(t0).runNow()))
    __obj.asInstanceOf[IWindowEvents]
  }
  
  extension [Self <: IWindowEvents](x: Self) {
    
    inline def setOnCloseWindow(value: CallbackTo[Boolean]): Self = StObject.set(x, "OnCloseWindow", value.toJsFn)
    
    inline def setOnCloseWindowUndefined: Self = StObject.set(x, "OnCloseWindow", js.undefined)
  }
}
