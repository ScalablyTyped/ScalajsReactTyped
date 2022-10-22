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
  * provides access to the DDE link results.
  * @see com.sun.star.sheet.DDELink
  * @since OOo 3.0
  */
trait XDDELinkResults
  extends StObject
     with XInterface {
  
  /**
    * returns the DDE link results.
    * @returns the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row.
    */
  val Results: SafeArray[SafeArray[Any]]
  
  /**
    * returns the DDE link results.
    * @returns the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row.
    */
  def getResults(): SafeArray[SafeArray[Any]]
  
  /**
    * sets the DDE link results.
    * @param aResults the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row. If the oute
    */
  def setResults(aResults: SeqEquiv[SeqEquiv[Any]]): Unit
}
object XDDELinkResults {
  
  inline def apply(
    Results: SafeArray[SafeArray[Any]],
    acquire: Callback,
    getResults: CallbackTo[SafeArray[SafeArray[Any]]],
    queryInterface: `type` => Any,
    release: Callback,
    setResults: SeqEquiv[SeqEquiv[Any]] => Callback
  ): XDDELinkResults = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], acquire = acquire.toJsFn, getResults = getResults.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setResults = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Any]]) => setResults(t0).runNow()))
    __obj.asInstanceOf[XDDELinkResults]
  }
  
  extension [Self <: XDDELinkResults](x: Self) {
    
    inline def setGetResults(value: CallbackTo[SafeArray[SafeArray[Any]]]): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setResults(value: SafeArray[SafeArray[Any]]): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setSetResults(value: SeqEquiv[SeqEquiv[Any]] => Callback): Self = StObject.set(x, "setResults", js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Any]]) => value(t0).runNow()))
  }
}
