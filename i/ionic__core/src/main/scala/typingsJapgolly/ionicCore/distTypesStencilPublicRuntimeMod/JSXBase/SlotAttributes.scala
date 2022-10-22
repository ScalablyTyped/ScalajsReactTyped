package typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.JSXBase

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.JSXAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotAttributes
  extends StObject
     with JSXAttributes[Element] {
  
  var name: js.UndefOr[String] = js.undefined
  
  var onSlotchange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
}
object SlotAttributes {
  
  inline def apply(): SlotAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotAttributes]
  }
  
  extension [Self <: SlotAttributes](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnSlotchange(value: /* event */ Event => Callback): Self = StObject.set(x, "onSlotchange", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def setOnSlotchangeUndefined: Self = StObject.set(x, "onSlotchange", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
  }
}
