package typingsJapgolly.atom.anon

import org.scalajs.dom.EventTarget
import typingsJapgolly.atom.srcOtherTypesMod.CommandEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidDispatch[TargetType /* <: EventTarget */] extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  def didDispatch(event: CommandEvent[TargetType]): Unit | js.Promise[Unit]
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var hiddenInCommandPalette: js.UndefOr[Boolean] = js.undefined
}
object DidDispatch {
  
  inline def apply[TargetType /* <: EventTarget */](didDispatch: CommandEvent[TargetType] => Unit | js.Promise[Unit]): DidDispatch[TargetType] = {
    val __obj = js.Dynamic.literal(didDispatch = js.Any.fromFunction1(didDispatch))
    __obj.asInstanceOf[DidDispatch[TargetType]]
  }
  
  extension [Self <: DidDispatch[?], TargetType /* <: EventTarget */](x: Self & DidDispatch[TargetType]) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDidDispatch(value: CommandEvent[TargetType] => Unit | js.Promise[Unit]): Self = StObject.set(x, "didDispatch", js.Any.fromFunction1(value))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHiddenInCommandPalette(value: Boolean): Self = StObject.set(x, "hiddenInCommandPalette", value.asInstanceOf[js.Any])
    
    inline def setHiddenInCommandPaletteUndefined: Self = StObject.set(x, "hiddenInCommandPalette", js.undefined)
  }
}
