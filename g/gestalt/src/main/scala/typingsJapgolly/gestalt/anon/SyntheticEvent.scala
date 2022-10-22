package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntheticEvent extends StObject {
  
  var syntheticEvent: ReactEventFrom[HTMLInputElement]
  
  var value: String
}
object SyntheticEvent {
  
  inline def apply(syntheticEvent: ReactEventFrom[HTMLInputElement], value: String): SyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticEvent]
  }
  
  extension [Self <: SyntheticEvent](x: Self) {
    
    inline def setSyntheticEvent(value: ReactEventFrom[HTMLInputElement]): Self = StObject.set(x, "syntheticEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
