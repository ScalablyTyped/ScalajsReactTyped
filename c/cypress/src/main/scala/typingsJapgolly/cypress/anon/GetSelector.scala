package typingsJapgolly.cypress.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.cypress.JQuery
import typingsJapgolly.cypress.JQuery.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSelector extends StObject {
  
  def defaults(options: PartialSelectorPlayground): Unit
  
  def getSelector($el: JQuery[HTMLElement]): Selector
}
object GetSelector {
  
  inline def apply(defaults: PartialSelectorPlayground => Callback, getSelector: JQuery[HTMLElement] => Selector): GetSelector = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1((t0: PartialSelectorPlayground) => defaults(t0).runNow()), getSelector = js.Any.fromFunction1(getSelector))
    __obj.asInstanceOf[GetSelector]
  }
  
  extension [Self <: GetSelector](x: Self) {
    
    inline def setDefaults(value: PartialSelectorPlayground => Callback): Self = StObject.set(x, "defaults", js.Any.fromFunction1((t0: PartialSelectorPlayground) => value(t0).runNow()))
    
    inline def setGetSelector(value: JQuery[HTMLElement] => Selector): Self = StObject.set(x, "getSelector", js.Any.fromFunction1(value))
  }
}
