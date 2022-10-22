package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the possibility to load information offered by a {@link XContentAccess} for several rows of a {@link ContentResultSet} with a single function
  * call.
  */
trait XFetchProviderForContentAccess
  extends StObject
     with XInterface {
  
  /**
    * returns the content identifier strings of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns contains a sequence of anys. Each of these anys contains a string.
    */
  def fetchContentIdentifierStrings(nRowStartPosition: Double, nRowCount: Double, bDirection: Boolean): FetchResult
  
  /**
    * returns the XContentIdentifiers of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns contains a sequence of anys. Each of these anys contains an {@link XContentIdentifier} .
    */
  def fetchContentIdentifiers(nRowStartPosition: Double, nRowCount: Double, bDirection: Boolean): FetchResult
  
  /**
    * returns the {@link XContent} s of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns contains a sequence of anys. Each of these anys contains an {@link XContent} .
    */
  def fetchContents(nRowStartPosition: Double, nRowCount: Double, bDirection: Boolean): FetchResult
}
object XFetchProviderForContentAccess {
  
  inline def apply(
    acquire: Callback,
    fetchContentIdentifierStrings: (Double, Double, Boolean) => FetchResult,
    fetchContentIdentifiers: (Double, Double, Boolean) => FetchResult,
    fetchContents: (Double, Double, Boolean) => FetchResult,
    queryInterface: `type` => Any,
    release: Callback
  ): XFetchProviderForContentAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, fetchContentIdentifierStrings = js.Any.fromFunction3(fetchContentIdentifierStrings), fetchContentIdentifiers = js.Any.fromFunction3(fetchContentIdentifiers), fetchContents = js.Any.fromFunction3(fetchContents), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFetchProviderForContentAccess]
  }
  
  extension [Self <: XFetchProviderForContentAccess](x: Self) {
    
    inline def setFetchContentIdentifierStrings(value: (Double, Double, Boolean) => FetchResult): Self = StObject.set(x, "fetchContentIdentifierStrings", js.Any.fromFunction3(value))
    
    inline def setFetchContentIdentifiers(value: (Double, Double, Boolean) => FetchResult): Self = StObject.set(x, "fetchContentIdentifiers", js.Any.fromFunction3(value))
    
    inline def setFetchContents(value: (Double, Double, Boolean) => FetchResult): Self = StObject.set(x, "fetchContents", js.Any.fromFunction3(value))
  }
}
