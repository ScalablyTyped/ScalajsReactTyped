package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the state of a command.
  */
trait CommandState[T]
  extends StObject
     with SimpleCommandState {
  
  /**
    * Specifies a command value.
    */
  var value: T
}
object CommandState {
  
  inline def apply[T](enabled: Boolean, value: T, visible: Boolean): CommandState[T] = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandState[T]]
  }
  
  extension [Self <: CommandState[?], T](x: Self & CommandState[T]) {
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
