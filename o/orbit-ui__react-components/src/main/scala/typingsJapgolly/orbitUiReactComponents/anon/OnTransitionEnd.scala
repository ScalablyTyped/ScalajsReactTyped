package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnTransitionEnd extends StObject {
  
  var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object OnTransitionEnd {
  
  inline def apply(): OnTransitionEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnTransitionEnd]
  }
  
  extension [Self <: OnTransitionEnd](x: Self) {
    
    inline def setOnTransitionEnd(value: Callback): Self = StObject.set(x, "onTransitionEnd", value.toJsFn)
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
  }
}
