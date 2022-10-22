package typingsJapgolly.jquery.anon

import typingsJapgolly.jquery.JQuery.Tween
import typingsJapgolly.jquery.JQuery._PropHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get[TElement]
  extends StObject
     with _PropHook[TElement] {
  
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def get(tween: Tween[TElement]): Any
}
object Get {
  
  inline def apply[TElement](get: Tween[TElement] => Any): Get[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Get[TElement]]
  }
  
  extension [Self <: Get[?], TElement](x: Self & Get[TElement]) {
    
    inline def setGet(value: Tween[TElement] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
