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
trait ReportRowIterator extends StObject {
  
  /** Returns true if the report has more rows. */
  def hasNext(): Boolean
  
  /** Returns the next row in the report. */
  def next(): ReportRow
}
object ReportRowIterator {
  
  inline def apply(hasNext: CallbackTo[Boolean], next: CallbackTo[ReportRow]): ReportRowIterator = {
    val __obj = js.Dynamic.literal(hasNext = hasNext.toJsFn, next = next.toJsFn)
    __obj.asInstanceOf[ReportRowIterator]
  }
  
  extension [Self <: ReportRowIterator](x: Self) {
    
    inline def setHasNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNext", value.toJsFn)
    
    inline def setNext(value: CallbackTo[ReportRow]): Self = StObject.set(x, "next", value.toJsFn)
  }
}
