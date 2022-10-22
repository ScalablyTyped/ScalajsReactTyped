package typingsJapgolly.cypress.anon

import typingsJapgolly.cypress.JQuery.Tween
import typingsJapgolly.cypress.JQuery._PropHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[TElement]
  extends StObject
     with _PropHook[TElement] {
  
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def get(tween: Tween[TElement]): Any
}
object `1` {
  
  inline def apply[TElement](get: Tween[TElement] => Any): `1`[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[`1`[TElement]]
  }
  
  extension [Self <: `1`[?], TElement](x: Self & `1`[TElement]) {
    
    inline def setGet(value: Tween[TElement] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
