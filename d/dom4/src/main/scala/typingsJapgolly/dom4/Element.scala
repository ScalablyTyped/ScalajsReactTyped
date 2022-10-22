package typingsJapgolly.dom4

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLCollection
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element
  extends StObject
     with ParentNode {
  
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  def closest(selectors: String): Element | Null
  
  /**
    * Returns true if matching selectors against element’s root yields element, and false otherwise.
    */
  def matches(selectors: String): Boolean
}
object Element {
  
  inline def apply(
    append: /* repeated */ Node | String => Callback,
    children: HTMLCollection[Any],
    closest: String => Element | Null,
    matches: String => Boolean,
    prepend: /* repeated */ Node | String => Callback
  ): Element = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1((t0: /* repeated */ Node | String) => append(t0).runNow()), children = children.asInstanceOf[js.Any], closest = js.Any.fromFunction1(closest), matches = js.Any.fromFunction1(matches), prepend = js.Any.fromFunction1((t0: /* repeated */ Node | String) => prepend(t0).runNow()))
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setClosest(value: String => Element | Null): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
    
    inline def setMatches(value: String => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
  }
}
