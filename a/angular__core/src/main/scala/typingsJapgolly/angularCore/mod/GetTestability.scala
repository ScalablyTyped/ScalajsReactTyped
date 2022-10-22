package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTestability extends StObject {
  
  def addToWindow(registry: TestabilityRegistry): Unit
  
  def findTestabilityInTree(registry: TestabilityRegistry, elem: Any, findInAncestors: Boolean): Testability | Null
}
object GetTestability {
  
  inline def apply(
    addToWindow: TestabilityRegistry => Callback,
    findTestabilityInTree: (TestabilityRegistry, Any, Boolean) => Testability | Null
  ): GetTestability = {
    val __obj = js.Dynamic.literal(addToWindow = js.Any.fromFunction1((t0: TestabilityRegistry) => addToWindow(t0).runNow()), findTestabilityInTree = js.Any.fromFunction3(findTestabilityInTree))
    __obj.asInstanceOf[GetTestability]
  }
  
  extension [Self <: GetTestability](x: Self) {
    
    inline def setAddToWindow(value: TestabilityRegistry => Callback): Self = StObject.set(x, "addToWindow", js.Any.fromFunction1((t0: TestabilityRegistry) => value(t0).runNow()))
    
    inline def setFindTestabilityInTree(value: (TestabilityRegistry, Any, Boolean) => Testability | Null): Self = StObject.set(x, "findTestabilityInTree", js.Any.fromFunction3(value))
  }
}
