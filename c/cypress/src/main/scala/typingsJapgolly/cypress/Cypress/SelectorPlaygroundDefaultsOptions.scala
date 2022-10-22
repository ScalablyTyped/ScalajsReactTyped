package typingsJapgolly.cypress.Cypress

import org.scalajs.dom.HTMLElement
import typingsJapgolly.cypress.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorPlaygroundDefaultsOptions extends StObject {
  
  def onElement($el: JQuery[HTMLElement]): js.UndefOr[String | Null]
  
  var selectorPriority: js.Array[String]
}
object SelectorPlaygroundDefaultsOptions {
  
  inline def apply(onElement: JQuery[HTMLElement] => js.UndefOr[String | Null], selectorPriority: js.Array[String]): SelectorPlaygroundDefaultsOptions = {
    val __obj = js.Dynamic.literal(onElement = js.Any.fromFunction1(onElement), selectorPriority = selectorPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorPlaygroundDefaultsOptions]
  }
  
  extension [Self <: SelectorPlaygroundDefaultsOptions](x: Self) {
    
    inline def setOnElement(value: JQuery[HTMLElement] => js.UndefOr[String | Null]): Self = StObject.set(x, "onElement", js.Any.fromFunction1(value))
    
    inline def setSelectorPriority(value: js.Array[String]): Self = StObject.set(x, "selectorPriority", value.asInstanceOf[js.Any])
    
    inline def setSelectorPriorityVarargs(value: String*): Self = StObject.set(x, "selectorPriority", js.Array(value*))
  }
}
