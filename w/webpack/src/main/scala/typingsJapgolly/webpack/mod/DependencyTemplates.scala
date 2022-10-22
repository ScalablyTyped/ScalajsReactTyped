package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyTemplates extends StObject {
  
  def get(dependency: DependencyConstructor): DependencyTemplate
  
  def getHash(): String
  
  def set(dependency: DependencyConstructor, dependencyTemplate: DependencyTemplate): Unit
  
  def updateHash(part: String): Unit
}
object DependencyTemplates {
  
  inline def apply(
    get: DependencyConstructor => DependencyTemplate,
    getHash: CallbackTo[String],
    set: (DependencyConstructor, DependencyTemplate) => Callback,
    updateHash: String => Callback
  ): DependencyTemplates = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getHash = getHash.toJsFn, set = js.Any.fromFunction2((t0: DependencyConstructor, t1: DependencyTemplate) => (set(t0, t1)).runNow()), updateHash = js.Any.fromFunction1((t0: String) => updateHash(t0).runNow()))
    __obj.asInstanceOf[DependencyTemplates]
  }
  
  extension [Self <: DependencyTemplates](x: Self) {
    
    inline def setGet(value: DependencyConstructor => DependencyTemplate): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetHash(value: CallbackTo[String]): Self = StObject.set(x, "getHash", value.toJsFn)
    
    inline def setSet(value: (DependencyConstructor, DependencyTemplate) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: DependencyConstructor, t1: DependencyTemplate) => (value(t0, t1)).runNow()))
    
    inline def setUpdateHash(value: String => Callback): Self = StObject.set(x, "updateHash", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
