package typingsJapgolly.suitescript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjSearchColumn used for column objects used to define search return columns.
  *
  * @classDescription search column.
  * @return {nlobjSearchColumn}
  * @constructor
  * @param {string} name column name.
  * @param {string} join internal ID for joined search where this column is defined
  * @param {string} summary
  *
  * @since 2007.0
  */
trait nlobjSearchColumn extends StObject {
  
  /**
    * return formula for this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    *
    * @since 2009.2
    * @return
    */
  def getFormula(): String
  
  /**
    * return the join id for this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    * @since 2008.1
    * @return
    */
  def getJoin(): String
  
  /**
    * return the label of this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    *
    * @since 2009.1
    * @return
    */
  def getLabel(): String
  
  /**
    * return the name of this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    * @since 2008.1
    * @return
    */
  def getName(): String
  
  /**
    * return the summary type (avg,group,sum,count) of this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    * @since 2008.1
    * @return
    */
  def getSummary(): String
  
  def setLabel(label: String): nlobjSearchColumn
  
  /**
    * return nlobjSearchColumn sorted in either ascending or descending order.
    * @return {nlobjSearchColumn}
    * @param {boolean} sort if not set, defaults to false, which returns column data in ascending order.
    *
    * @method
    * @memberOf nlobjSearchColumn
    *
    * @since 2010.1
    * @param order
    * @return
    */
  def setSort(order: Any): js.Function3[/* name */ String, /* join */ String, /* summary */ String, Unit]
}
object nlobjSearchColumn {
  
  inline def apply(
    getFormula: CallbackTo[String],
    getJoin: CallbackTo[String],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getSummary: CallbackTo[String],
    setLabel: String => nlobjSearchColumn,
    setSort: Any => js.Function3[/* name */ String, /* join */ String, /* summary */ String, Unit]
  ): nlobjSearchColumn = {
    val __obj = js.Dynamic.literal(getFormula = getFormula.toJsFn, getJoin = getJoin.toJsFn, getLabel = getLabel.toJsFn, getName = getName.toJsFn, getSummary = getSummary.toJsFn, setLabel = js.Any.fromFunction1(setLabel), setSort = js.Any.fromFunction1(setSort))
    __obj.asInstanceOf[nlobjSearchColumn]
  }
  
  extension [Self <: nlobjSearchColumn](x: Self) {
    
    inline def setGetFormula(value: CallbackTo[String]): Self = StObject.set(x, "getFormula", value.toJsFn)
    
    inline def setGetJoin(value: CallbackTo[String]): Self = StObject.set(x, "getJoin", value.toJsFn)
    
    inline def setGetLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLabel", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetSummary(value: CallbackTo[String]): Self = StObject.set(x, "getSummary", value.toJsFn)
    
    inline def setSetLabel(value: String => nlobjSearchColumn): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
    
    inline def setSetSort(value: Any => js.Function3[/* name */ String, /* join */ String, /* summary */ String, Unit]): Self = StObject.set(x, "setSort", js.Any.fromFunction1(value))
  }
}
