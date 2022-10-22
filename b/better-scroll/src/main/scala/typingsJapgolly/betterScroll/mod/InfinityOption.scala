package typingsJapgolly.betterScroll.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfinityOption extends StObject {
  
  def createTombstone(): Element
  
  def fetch(count: Double): Unit
  
  def render(item: Any, div: Element): Element
}
object InfinityOption {
  
  inline def apply(createTombstone: CallbackTo[Element], fetch: Double => Callback, render: (Any, Element) => Element): InfinityOption = {
    val __obj = js.Dynamic.literal(createTombstone = createTombstone.toJsFn, fetch = js.Any.fromFunction1((t0: Double) => fetch(t0).runNow()), render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[InfinityOption]
  }
  
  extension [Self <: InfinityOption](x: Self) {
    
    inline def setCreateTombstone(value: CallbackTo[Element]): Self = StObject.set(x, "createTombstone", value.toJsFn)
    
    inline def setFetch(value: Double => Callback): Self = StObject.set(x, "fetch", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRender(value: (Any, Element) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
  }
}
