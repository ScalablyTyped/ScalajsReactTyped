package typingsJapgolly.egjsAxes

import org.scalajs.dom.MouseEvent
import typingsJapgolly.egjsAxes.anon.X
import typingsJapgolly.egjsAxes.declarationEventInputEventInputMod.EventInput
import typingsJapgolly.egjsAxes.declarationTypesMod.ActiveEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationEventInputMouseEventInputMod {
  
  @JSImport("@egjs/axes/declaration/eventInput/MouseEventInput", "MouseEventInput")
  @js.native
  open class MouseEventInput ()
    extends EventInput
       with ActiveEvent {
    
    /* protected */ def _getCenter(event: MouseEvent): X = js.native
    
    /* protected */ def _getMovement(event: MouseEvent): X = js.native
    
    /* protected */ def _getScale(): Double = js.native
    
    val end: js.Array[String] = js.native
    
    val move: js.Array[String] = js.native
    
    def onEventEnd(): Unit = js.native
    
    def onRelease(): Unit = js.native
    
    val start: js.Array[String] = js.native
  }
}
