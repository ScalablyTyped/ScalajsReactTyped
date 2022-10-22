package typingsJapgolly.jquery.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQuery.Tween
import typingsJapgolly.jquery.JQuery._PropHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set[TElement]
  extends StObject
     with _PropHook[TElement] {
  
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def set(tween: Tween[TElement]): Unit
}
object Set {
  
  inline def apply[TElement](set: Tween[TElement] => Callback): Set[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1((t0: Tween[TElement]) => set(t0).runNow()))
    __obj.asInstanceOf[Set[TElement]]
  }
  
  extension [Self <: Set[?], TElement](x: Self & Set[TElement]) {
    
    inline def setSet(value: Tween[TElement] => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Tween[TElement]) => value(t0).runNow()))
  }
}
