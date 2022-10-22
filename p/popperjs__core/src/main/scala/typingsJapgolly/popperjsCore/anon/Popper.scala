package typingsJapgolly.popperjsCore.anon

import typingsJapgolly.popperjsCore.libTypesMod.VisualViewport
import typingsJapgolly.popperjsCore.libTypesMod.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Popper extends StObject {
  
  var popper: js.Array[org.scalajs.dom.Element | Window | VisualViewport]
  
  var reference: js.Array[org.scalajs.dom.Element | Window | VisualViewport]
}
object Popper {
  
  inline def apply(
    popper: js.Array[org.scalajs.dom.Element | Window | VisualViewport],
    reference: js.Array[org.scalajs.dom.Element | Window | VisualViewport]
  ): Popper = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popper]
  }
  
  extension [Self <: Popper](x: Self) {
    
    inline def setPopper(value: js.Array[org.scalajs.dom.Element | Window | VisualViewport]): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperVarargs(value: (org.scalajs.dom.Element | Window | VisualViewport)*): Self = StObject.set(x, "popper", js.Array(value*))
    
    inline def setReference(value: js.Array[org.scalajs.dom.Element | Window | VisualViewport]): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceVarargs(value: (org.scalajs.dom.Element | Window | VisualViewport)*): Self = StObject.set(x, "reference", js.Array(value*))
  }
}
