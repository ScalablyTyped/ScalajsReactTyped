package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicCore.mod.Side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonItemOptions extends StObject {
  
  def fireSwipeEvent(): js.Promise[Unit]
  
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: Side
}
object IonItemOptions {
  
  inline def apply(fireSwipeEvent: CallbackTo[js.Promise[Unit]], side: Side): IonItemOptions = {
    val __obj = js.Dynamic.literal(fireSwipeEvent = fireSwipeEvent.toJsFn, side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonItemOptions]
  }
  
  extension [Self <: IonItemOptions](x: Self) {
    
    inline def setFireSwipeEvent(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "fireSwipeEvent", value.toJsFn)
    
    inline def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
