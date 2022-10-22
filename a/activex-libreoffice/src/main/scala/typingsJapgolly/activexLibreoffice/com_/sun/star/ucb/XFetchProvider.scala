package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the possibility to get the contents of the columns of several rows of a {@link ContentResultSet} with a single function call. */
trait XFetchProvider
  extends StObject
     with XInterface {
  
  /**
    * returns the contents of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns contains a sequence of anys. Each of these anys contains a sequence of anys.
    */
  def fetch(nRowStartPosition: Double, nRowCount: Double, bDirection: Boolean): FetchResult
}
object XFetchProvider {
  
  inline def apply(
    acquire: Callback,
    fetch: (Double, Double, Boolean) => FetchResult,
    queryInterface: `type` => Any,
    release: Callback
  ): XFetchProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, fetch = js.Any.fromFunction3(fetch), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFetchProvider]
  }
  
  extension [Self <: XFetchProvider](x: Self) {
    
    inline def setFetch(value: (Double, Double, Boolean) => FetchResult): Self = StObject.set(x, "fetch", js.Any.fromFunction3(value))
  }
}
