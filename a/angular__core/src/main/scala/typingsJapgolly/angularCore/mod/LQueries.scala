package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * lQueries represent a collection of individual LQuery objects tracked in a given view.
  */
trait LQueries extends StObject {
  
  /**
    * A method called when a new embedded view is created. As a result a set of LQueries applicable
    * for a new embedded view is instantiated (cloned) from the declaration view.
    * @param tView
    */
  def createEmbeddedView(tView: TView): LQueries | Null
  
  /**
    * A method called when an embedded view is detached from a container. As a result all impacted
    * `LQuery` objects (and associated `QueryList`) are marked as dirty.
    * @param tView
    */
  def detachView(tView: TView): Unit
  
  /**
    * A method called when an embedded view is inserted into a container. As a result all impacted
    * `LQuery` objects (and associated `QueryList`) are marked as dirty.
    * @param tView
    */
  def insertView(tView: TView): Unit
  
  /**
    * A collection of queries tracked in a given view.
    */
  var queries: js.Array[LQuery[Any]]
}
object LQueries {
  
  inline def apply(
    createEmbeddedView: TView => LQueries | Null,
    detachView: TView => Callback,
    insertView: TView => Callback,
    queries: js.Array[LQuery[Any]]
  ): LQueries = {
    val __obj = js.Dynamic.literal(createEmbeddedView = js.Any.fromFunction1(createEmbeddedView), detachView = js.Any.fromFunction1((t0: TView) => detachView(t0).runNow()), insertView = js.Any.fromFunction1((t0: TView) => insertView(t0).runNow()), queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[LQueries]
  }
  
  extension [Self <: LQueries](x: Self) {
    
    inline def setCreateEmbeddedView(value: TView => LQueries | Null): Self = StObject.set(x, "createEmbeddedView", js.Any.fromFunction1(value))
    
    inline def setDetachView(value: TView => Callback): Self = StObject.set(x, "detachView", js.Any.fromFunction1((t0: TView) => value(t0).runNow()))
    
    inline def setInsertView(value: TView => Callback): Self = StObject.set(x, "insertView", js.Any.fromFunction1((t0: TView) => value(t0).runNow()))
    
    inline def setQueries(value: js.Array[LQuery[Any]]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: LQuery[Any]*): Self = StObject.set(x, "queries", js.Array(value*))
  }
}
