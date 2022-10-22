package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an iterator of report rows.
  *
  * Typical usage:
  *
  *      var rows = report.rows();
  *      while (rows.hasNext()) {
  *        var row = rows.next();
  *      }
  */
trait SearchRowIterator extends StObject {
  
  /** Returns true if the search has more rows. */
  def hasNext(): Boolean
  
  /**
    * Returns the next row in the search.
    *
    * Search rows are returned as plain Javascript objects. Individual requested fields can be accessed by accessing the nested field.
    *
    *
    *      var rows = AdsApp.search(
    *          'SELECT search_term_view.search_term, metrics.ctr ' +
    *          'FROM   search_term_view ' +
    *          'WHERE  segments.date BETWEEN "2013-01-01" AND "2013-03-01"');
    *
    *      while (rows.hasNext()) {
    *        var row = rows.next();
    *        var searchTerm = row['search_term_view'];
    *        var query = searchTerm['search_term'];
    *        var ctr = row['metrics']['ctr'];
    *      }
    */
  def next(): Any
}
object SearchRowIterator {
  
  inline def apply(hasNext: CallbackTo[Boolean], next: CallbackTo[Any]): SearchRowIterator = {
    val __obj = js.Dynamic.literal(hasNext = hasNext.toJsFn, next = next.toJsFn)
    __obj.asInstanceOf[SearchRowIterator]
  }
  
  extension [Self <: SearchRowIterator](x: Self) {
    
    inline def setHasNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNext", value.toJsFn)
    
    inline def setNext(value: CallbackTo[Any]): Self = StObject.set(x, "next", value.toJsFn)
  }
}
