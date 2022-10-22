package typingsJapgolly.webix.webix

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeysNavigation extends StObject {
  
  def moveSelection(direction: String): Unit
}
object KeysNavigation {
  
  inline def apply(moveSelection: String => Callback): KeysNavigation = {
    val __obj = js.Dynamic.literal(moveSelection = js.Any.fromFunction1((t0: String) => moveSelection(t0).runNow()))
    __obj.asInstanceOf[KeysNavigation]
  }
  
  extension [Self <: KeysNavigation](x: Self) {
    
    inline def setMoveSelection(value: String => Callback): Self = StObject.set(x, "moveSelection", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
