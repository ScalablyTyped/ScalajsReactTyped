package typingsJapgolly.egjsAxes

import org.scalajs.dom.PointerEvent
import typingsJapgolly.egjsAxes.anon.X
import typingsJapgolly.egjsAxes.declarationEventInputEventInputMod.EventInput
import typingsJapgolly.egjsAxes.declarationTypesMod.ActiveEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationEventInputPointerEventInputMod {
  
  @JSImport("@egjs/axes/declaration/eventInput/PointerEventInput", "PointerEventInput")
  @js.native
  open class PointerEventInput ()
    extends EventInput
       with ActiveEvent {
    
    /* private */ var _firstInputs: Any = js.native
    
    /* protected */ def _getCenter(event: PointerEvent): X = js.native
    
    /* protected */ def _getMovement(event: PointerEvent): X = js.native
    
    /* protected */ def _getScale(): Double = js.native
    
    /* private */ var _recentInputs: Any = js.native
    
    /* private */ var _removePointerEvent: Any = js.native
    
    /* private */ var _updatePointerEvent: Any = js.native
    
    val end: js.Array[String] = js.native
    
    def getTouches(): Double = js.native
    
    val move: js.Array[String] = js.native
    
    def onRelease(): Unit = js.native
    
    val start: js.Array[String] = js.native
  }
}
