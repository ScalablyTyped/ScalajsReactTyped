package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Records extends StObject {
  
  /**
    * Count records from table
    *
    * @return The length of the records Array
    */
  def count(): Double
  
  /**
    * Get initial recordset to populate table
    * if ajax, call ajaxUrl
    * otherwise, initialize from in-table records
    *
    * @return An Array with the records
    */
  def getFromTable(): js.Array[js.Object]
  
  /** Create and init the records */
  def init(): Unit
  
  /**
    * Check if ajax feature is enabled
    *
    * @return A boolean if ajax feature is enabled
    */
  def initOnLoad(): Boolean
  
  /**
    * Get the first and the last indexes based on current page and number of items per page
    *
    * @return An Array with the first index ([0]) and the last index ([1])
    */
  def pageBounds(): js.Array[Double]
  
  /** Update the records with the new page */
  def paginate(): Unit
  
  /** Reset the records */
  def resetOriginal(): Unit
  
  /**
    * Call the appropriated sort function
    *
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def sort(): Double
  
  /**
    * Merge ajax response json with cached data including (meta-data and records)
    *
    * @param data The new data
    */
  def updateFromJson(data: Any): Unit
}
object Records {
  
  inline def apply(
    count: CallbackTo[Double],
    getFromTable: CallbackTo[js.Array[js.Object]],
    init: Callback,
    initOnLoad: CallbackTo[Boolean],
    pageBounds: CallbackTo[js.Array[Double]],
    paginate: Callback,
    resetOriginal: Callback,
    sort: CallbackTo[Double],
    updateFromJson: Any => Callback
  ): Records = {
    val __obj = js.Dynamic.literal(count = count.toJsFn, getFromTable = getFromTable.toJsFn, init = init.toJsFn, initOnLoad = initOnLoad.toJsFn, pageBounds = pageBounds.toJsFn, paginate = paginate.toJsFn, resetOriginal = resetOriginal.toJsFn, sort = sort.toJsFn, updateFromJson = js.Any.fromFunction1((t0: Any) => updateFromJson(t0).runNow()))
    __obj.asInstanceOf[Records]
  }
  
  extension [Self <: Records](x: Self) {
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setGetFromTable(value: CallbackTo[js.Array[js.Object]]): Self = StObject.set(x, "getFromTable", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInitOnLoad(value: CallbackTo[Boolean]): Self = StObject.set(x, "initOnLoad", value.toJsFn)
    
    inline def setPageBounds(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "pageBounds", value.toJsFn)
    
    inline def setPaginate(value: Callback): Self = StObject.set(x, "paginate", value.toJsFn)
    
    inline def setResetOriginal(value: Callback): Self = StObject.set(x, "resetOriginal", value.toJsFn)
    
    inline def setSort(value: CallbackTo[Double]): Self = StObject.set(x, "sort", value.toJsFn)
    
    inline def setUpdateFromJson(value: Any => Callback): Self = StObject.set(x, "updateFromJson", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
