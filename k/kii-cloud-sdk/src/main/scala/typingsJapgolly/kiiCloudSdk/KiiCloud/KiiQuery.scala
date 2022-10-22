package typingsJapgolly.kiiCloudSdk.KiiCloud

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiQuery object
  */
trait KiiQuery extends StObject {
  
  /**
    * Get the limit of the current query
    *
    */
  def getLimit(): Double
  
  /**
    * Set the limit of the given query
    *
    * @param value The desired limit. Must be an integer > 0
    *
    * @throws InvalidLimitException
    */
  def setLimit(value: Double): Unit
  
  /**
    * Set the query to sort by a field in ascending order
    *
    * If a sort has already been set, it will be overwritten.
    *
    * @param field The key that should be used to sort
    */
  def sortByAsc(field: String): Unit
  
  /**
    * Set the query to sort by a field in descending order
    *
    * If a sort has already been set, it will be overwritten.
    *
    * @param field The key that should be used to sort
    */
  def sortByDesc(field: String): Unit
}
object KiiQuery {
  
  inline def apply(
    getLimit: CallbackTo[Double],
    setLimit: Double => Callback,
    sortByAsc: String => Callback,
    sortByDesc: String => Callback
  ): KiiQuery = {
    val __obj = js.Dynamic.literal(getLimit = getLimit.toJsFn, setLimit = js.Any.fromFunction1((t0: Double) => setLimit(t0).runNow()), sortByAsc = js.Any.fromFunction1((t0: String) => sortByAsc(t0).runNow()), sortByDesc = js.Any.fromFunction1((t0: String) => sortByDesc(t0).runNow()))
    __obj.asInstanceOf[KiiQuery]
  }
  
  extension [Self <: KiiQuery](x: Self) {
    
    inline def setGetLimit(value: CallbackTo[Double]): Self = StObject.set(x, "getLimit", value.toJsFn)
    
    inline def setSetLimit(value: Double => Callback): Self = StObject.set(x, "setLimit", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSortByAsc(value: String => Callback): Self = StObject.set(x, "sortByAsc", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSortByDesc(value: String => Callback): Self = StObject.set(x, "sortByDesc", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
