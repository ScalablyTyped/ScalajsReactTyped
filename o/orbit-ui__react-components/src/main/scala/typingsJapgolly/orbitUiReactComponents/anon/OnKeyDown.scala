package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.KeyboardEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyDown extends StObject {
  
  var onKeyDown: KeyboardEventHandler[Element]
}
object OnKeyDown {
  
  inline def apply(onKeyDown: ReactKeyboardEventFrom[Element & Element] => Callback): OnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => onKeyDown(t0).runNow()))
    __obj.asInstanceOf[OnKeyDown]
  }
  
  extension [Self <: OnKeyDown](x: Self) {
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
  }
}
