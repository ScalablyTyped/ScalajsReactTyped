package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.CharacterCounter, 'destroy'> */
trait PickCharacterCounterdestr extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
}
object PickCharacterCounterdestr {
  
  inline def apply(destroy: Callback): PickCharacterCounterdestr = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[PickCharacterCounterdestr]
  }
  
  extension [Self <: PickCharacterCounterdestr](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
