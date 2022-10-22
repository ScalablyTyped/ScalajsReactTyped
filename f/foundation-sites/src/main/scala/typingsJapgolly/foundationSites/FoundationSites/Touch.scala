package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Touch extends StObject {
  
  def init(event: js.Object): Unit
  
  def setupSpotSwipe(event: js.Object): Unit
  
  def setupTouchHandler(event: js.Object): Unit
}
object Touch {
  
  inline def apply(
    init: js.Object => Callback,
    setupSpotSwipe: js.Object => Callback,
    setupTouchHandler: js.Object => Callback
  ): Touch = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1((t0: js.Object) => init(t0).runNow()), setupSpotSwipe = js.Any.fromFunction1((t0: js.Object) => setupSpotSwipe(t0).runNow()), setupTouchHandler = js.Any.fromFunction1((t0: js.Object) => setupTouchHandler(t0).runNow()))
    __obj.asInstanceOf[Touch]
  }
  
  extension [Self <: Touch](x: Self) {
    
    inline def setInit(value: js.Object => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSetupSpotSwipe(value: js.Object => Callback): Self = StObject.set(x, "setupSpotSwipe", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSetupTouchHandler(value: js.Object => Callback): Self = StObject.set(x, "setupTouchHandler", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
