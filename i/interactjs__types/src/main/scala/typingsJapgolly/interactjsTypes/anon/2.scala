package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreInteractEventMod.InteractEvent
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.resume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[T /* <: ActionName | Null */] extends StObject {
  
  var iEvent: js.UndefOr[InteractEvent[T, resume]] = js.undefined
}
object `2` {
  
  inline def apply[T /* <: ActionName | Null */](): `2`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[T]]
  }
  
  extension [Self <: `2`[?], T /* <: ActionName | Null */](x: Self & `2`[T]) {
    
    inline def setIEvent(value: InteractEvent[T, resume]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
  }
}
