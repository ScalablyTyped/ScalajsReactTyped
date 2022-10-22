package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonItemSlidingCustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonItemSliding extends StObject {
  
  /**
    * If `true`, the user cannot interact with the sliding item.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Emitted when the sliding position changes.
    */
  var onIonDrag: js.UndefOr[js.Function1[/* event */ IonItemSlidingCustomEvent[Any], Unit]] = js.undefined
}
object IonItemSliding {
  
  inline def apply(): IonItemSliding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonItemSliding]
  }
  
  extension [Self <: IonItemSliding](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnIonDrag(value: /* event */ IonItemSlidingCustomEvent[Any] => Callback): Self = StObject.set(x, "onIonDrag", js.Any.fromFunction1((t0: /* event */ IonItemSlidingCustomEvent[Any]) => value(t0).runNow()))
    
    inline def setOnIonDragUndefined: Self = StObject.set(x, "onIonDrag", js.undefined)
  }
}
