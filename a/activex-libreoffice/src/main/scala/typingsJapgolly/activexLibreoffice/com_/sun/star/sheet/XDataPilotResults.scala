package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a table of results of a data pilot source.
  *
  * These results are used to fill the data area of a data pilot table.
  * @see com.sun.star.sheet.DataPilotSource
  * @see com.sun.star.sheet.XDataPilotMemberResults
  */
trait XDataPilotResults
  extends StObject
     with XInterface {
  
  /**
    * returns the result array.
    *
    * The outer sequence contains the value rows. The inner sequences contain the values for one row.
    */
  val Results: SafeArray[SafeArray[DataResult]]
  
  def getFilteredResults(aFilters: SeqEquiv[DataPilotFieldFilter]): SafeArray[Double]
  
  /**
    * returns the result array.
    *
    * The outer sequence contains the value rows. The inner sequences contain the values for one row.
    */
  def getResults(): SafeArray[SafeArray[DataResult]]
}
object XDataPilotResults {
  
  inline def apply(
    Results: SafeArray[SafeArray[DataResult]],
    acquire: Callback,
    getFilteredResults: SeqEquiv[DataPilotFieldFilter] => SafeArray[Double],
    getResults: CallbackTo[SafeArray[SafeArray[DataResult]]],
    queryInterface: `type` => Any,
    release: Callback
  ): XDataPilotResults = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFilteredResults = js.Any.fromFunction1(getFilteredResults), getResults = getResults.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataPilotResults]
  }
  
  extension [Self <: XDataPilotResults](x: Self) {
    
    inline def setGetFilteredResults(value: SeqEquiv[DataPilotFieldFilter] => SafeArray[Double]): Self = StObject.set(x, "getFilteredResults", js.Any.fromFunction1(value))
    
    inline def setGetResults(value: CallbackTo[SafeArray[SafeArray[DataResult]]]): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setResults(value: SafeArray[SafeArray[DataResult]]): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
  }
}
