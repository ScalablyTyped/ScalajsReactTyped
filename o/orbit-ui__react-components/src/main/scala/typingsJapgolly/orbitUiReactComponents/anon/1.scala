package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def onKeyDown(event: ReactKeyboardEventFrom[Element]): Unit
}
object `1` {
  
  inline def apply(onKeyDown: ReactKeyboardEventFrom[Element] => Callback): `1` = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element]) => onKeyDown(t0).runNow()))
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
  }
}
