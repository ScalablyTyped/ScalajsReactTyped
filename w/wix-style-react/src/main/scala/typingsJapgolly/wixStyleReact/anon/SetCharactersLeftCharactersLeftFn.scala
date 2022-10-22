package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wixStyleReact.distTypesFormFieldMod.CharactersLeftFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCharactersLeftCharactersLeftFn extends StObject {
  
  var setCharactersLeft: CharactersLeftFn
}
object SetCharactersLeftCharactersLeftFn {
  
  inline def apply(setCharactersLeft: /* lengthLeft */ Double => Callback): SetCharactersLeftCharactersLeftFn = {
    val __obj = js.Dynamic.literal(setCharactersLeft = js.Any.fromFunction1((t0: /* lengthLeft */ Double) => setCharactersLeft(t0).runNow()))
    __obj.asInstanceOf[SetCharactersLeftCharactersLeftFn]
  }
  
  extension [Self <: SetCharactersLeftCharactersLeftFn](x: Self) {
    
    inline def setSetCharactersLeft(value: /* lengthLeft */ Double => Callback): Self = StObject.set(x, "setCharactersLeft", js.Any.fromFunction1((t0: /* lengthLeft */ Double) => value(t0).runNow()))
  }
}
