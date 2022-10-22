package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyTemplate extends StObject {
  
  @JSName("apply")
  def apply(dependency: Dependency, source: ReplaceSource, templateContext: DependencyTemplateContext): Unit
}
object DependencyTemplate {
  
  inline def apply(apply: (Dependency, ReplaceSource, DependencyTemplateContext) => Callback): DependencyTemplate = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3((t0: Dependency, t1: ReplaceSource, t2: DependencyTemplateContext) => (apply(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[DependencyTemplate]
  }
  
  extension [Self <: DependencyTemplate](x: Self) {
    
    inline def setApply(value: (Dependency, ReplaceSource, DependencyTemplateContext) => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction3((t0: Dependency, t1: ReplaceSource, t2: DependencyTemplateContext) => (value(t0, t1, t2)).runNow()))
  }
}
