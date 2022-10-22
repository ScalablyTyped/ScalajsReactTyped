package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Replacement of hierarchical elements. */
trait XHierarchicalNameReplace
  extends StObject
     with XHierarchicalNameAccess {
  
  /** replaces the element at the specified name. */
  def replaceByHierarchicalName(aName: String, aElement: Any): Unit
}
object XHierarchicalNameReplace {
  
  inline def apply(
    acquire: Callback,
    getByHierarchicalName: String => Any,
    hasByHierarchicalName: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    replaceByHierarchicalName: (String, Any) => Callback
  ): XHierarchicalNameReplace = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, replaceByHierarchicalName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByHierarchicalName(t0, t1)).runNow()))
    __obj.asInstanceOf[XHierarchicalNameReplace]
  }
  
  extension [Self <: XHierarchicalNameReplace](x: Self) {
    
    inline def setReplaceByHierarchicalName(value: (String, Any) => Callback): Self = StObject.set(x, "replaceByHierarchicalName", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
