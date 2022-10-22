package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCharactersLeft extends StObject {
  
  def setCharactersLeft(lengthLeft: Any): Unit
}
object SetCharactersLeft {
  
  inline def apply(setCharactersLeft: Any => Callback): SetCharactersLeft = {
    val __obj = js.Dynamic.literal(setCharactersLeft = js.Any.fromFunction1((t0: Any) => setCharactersLeft(t0).runNow()))
    __obj.asInstanceOf[SetCharactersLeft]
  }
  
  extension [Self <: SetCharactersLeft](x: Self) {
    
    inline def setSetCharactersLeft(value: Any => Callback): Self = StObject.set(x, "setCharactersLeft", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
