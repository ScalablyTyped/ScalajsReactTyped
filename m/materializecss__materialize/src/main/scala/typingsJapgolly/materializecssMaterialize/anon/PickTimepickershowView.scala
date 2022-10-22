package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.materializecssMaterialize.M.Views
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Timepicker, 'showView'> */
trait PickTimepickershowView extends StObject {
  
  def showView(view: Views): Unit
  @JSName("showView")
  var showView_Original: js.Function1[/* view */ Views, Unit]
}
object PickTimepickershowView {
  
  inline def apply(showView: /* view */ Views => Callback): PickTimepickershowView = {
    val __obj = js.Dynamic.literal(showView = js.Any.fromFunction1((t0: /* view */ Views) => showView(t0).runNow()))
    __obj.asInstanceOf[PickTimepickershowView]
  }
  
  extension [Self <: PickTimepickershowView](x: Self) {
    
    inline def setShowView(value: /* view */ Views => Callback): Self = StObject.set(x, "showView", js.Any.fromFunction1((t0: /* view */ Views) => value(t0).runNow()))
  }
}
