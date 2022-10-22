package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOpenedEvent extends StObject {
  
  /**
    * Frame object.
    */
  var frame: Frame
}
object DocumentOpenedEvent {
  
  inline def apply(frame: Frame): DocumentOpenedEvent = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOpenedEvent]
  }
  
  extension [Self <: DocumentOpenedEvent](x: Self) {
    
    inline def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}
