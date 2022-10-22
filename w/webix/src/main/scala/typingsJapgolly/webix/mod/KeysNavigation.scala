package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeysNavigation extends StObject {
  
  def moveSelection(direction: String): Unit
}
object KeysNavigation {
  
  @JSImport("webix", "KeysNavigation")
  @js.native
  val ^ : KeysNavigation = js.native
  
  extension [Self <: KeysNavigation](x: Self) {
    
    inline def setMoveSelection(value: String => Callback): Self = StObject.set(x, "moveSelection", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
