package typingsJapgolly.reactNavigationCore.anon

import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.EventMapBase
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.Keyof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeEventName[EventName /* <: Keyof[EventMap] */, EventMap /* <: EventMapBase */] extends StObject {
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: EventName
}
object TypeEventName {
  
  inline def apply[EventName /* <: Keyof[EventMap] */, EventMap /* <: EventMapBase */](`type`: EventName): TypeEventName[EventName, EventMap] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeEventName[EventName, EventMap]]
  }
  
  extension [Self <: TypeEventName[?, ?], EventName /* <: Keyof[EventMap] */, EventMap /* <: EventMapBase */](x: Self & (TypeEventName[EventName, EventMap])) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
