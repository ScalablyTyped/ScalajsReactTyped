package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TQueries represent a collection of individual TQuery objects tracked in a given view. Most of the
  * methods on this interface are simple proxy methods to the corresponding functionality on TQuery.
  */
trait TQueries extends StObject {
  
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `elementEnd` on each and every TQuery.
    * @param tNode
    */
  def elementEnd(tNode: TNode): Unit
  
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `elementStart` on each and every TQuery.
    * @param tView
    * @param tNode
    */
  def elementStart(tView: TView, tNode: TNode): Unit
  
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `embeddedTView` on each and every TQuery.
    * @param tNode
    */
  def embeddedTView(tNode: TNode): TQueries | Null
  
  /**
    * Returns a TQuery instance for at the given index  in the queries array.
    * @param index
    */
  def getByIndex(index: Double): TQuery
  
  /**
    * Returns the number of queries tracked in a given view.
    */
  var length: Double
  
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `template` on each and every TQuery.
    * @param tView
    * @param tNode
    */
  def template(tView: TView, tNode: TNode): Unit
  
  /**
    * Adds a new TQuery to a collection of queries tracked in a given view.
    * @param tQuery
    */
  def track(tQuery: TQuery): Unit
}
object TQueries {
  
  inline def apply(
    elementEnd: TNode => Callback,
    elementStart: (TView, TNode) => Callback,
    embeddedTView: TNode => TQueries | Null,
    getByIndex: Double => TQuery,
    length: Double,
    template: (TView, TNode) => Callback,
    track: TQuery => Callback
  ): TQueries = {
    val __obj = js.Dynamic.literal(elementEnd = js.Any.fromFunction1((t0: TNode) => elementEnd(t0).runNow()), elementStart = js.Any.fromFunction2((t0: TView, t1: TNode) => (elementStart(t0, t1)).runNow()), embeddedTView = js.Any.fromFunction1(embeddedTView), getByIndex = js.Any.fromFunction1(getByIndex), length = length.asInstanceOf[js.Any], template = js.Any.fromFunction2((t0: TView, t1: TNode) => (template(t0, t1)).runNow()), track = js.Any.fromFunction1((t0: TQuery) => track(t0).runNow()))
    __obj.asInstanceOf[TQueries]
  }
  
  extension [Self <: TQueries](x: Self) {
    
    inline def setElementEnd(value: TNode => Callback): Self = StObject.set(x, "elementEnd", js.Any.fromFunction1((t0: TNode) => value(t0).runNow()))
    
    inline def setElementStart(value: (TView, TNode) => Callback): Self = StObject.set(x, "elementStart", js.Any.fromFunction2((t0: TView, t1: TNode) => (value(t0, t1)).runNow()))
    
    inline def setEmbeddedTView(value: TNode => TQueries | Null): Self = StObject.set(x, "embeddedTView", js.Any.fromFunction1(value))
    
    inline def setGetByIndex(value: Double => TQuery): Self = StObject.set(x, "getByIndex", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: (TView, TNode) => Callback): Self = StObject.set(x, "template", js.Any.fromFunction2((t0: TView, t1: TNode) => (value(t0, t1)).runNow()))
    
    inline def setTrack(value: TQuery => Callback): Self = StObject.set(x, "track", js.Any.fromFunction1((t0: TQuery) => value(t0).runNow()))
  }
}
