package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Insertion and removal of hierarchical elements. */
trait XHierarchicalNameContainer
  extends StObject
     with XHierarchicalNameReplace {
  
  /** inserts the element at the specified name. */
  def insertByHierarchicalName(aName: String, aElement: Any): Unit
  
  /** removes the element at the specified name. */
  def removeByHierarchicalName(Name: String): Unit
}
object XHierarchicalNameContainer {
  
  inline def apply(
    acquire: Callback,
    getByHierarchicalName: String => Any,
    hasByHierarchicalName: String => Boolean,
    insertByHierarchicalName: (String, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByHierarchicalName: String => Callback,
    replaceByHierarchicalName: (String, Any) => Callback
  ): XHierarchicalNameContainer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), insertByHierarchicalName = js.Any.fromFunction2((t0: String, t1: Any) => (insertByHierarchicalName(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByHierarchicalName = js.Any.fromFunction1((t0: String) => removeByHierarchicalName(t0).runNow()), replaceByHierarchicalName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByHierarchicalName(t0, t1)).runNow()))
    __obj.asInstanceOf[XHierarchicalNameContainer]
  }
  
  extension [Self <: XHierarchicalNameContainer](x: Self) {
    
    inline def setInsertByHierarchicalName(value: (String, Any) => Callback): Self = StObject.set(x, "insertByHierarchicalName", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setRemoveByHierarchicalName(value: String => Callback): Self = StObject.set(x, "removeByHierarchicalName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
