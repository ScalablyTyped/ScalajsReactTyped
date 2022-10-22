package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables an object to search in its content. */
trait XTextSearch
  extends StObject
     with XInterface {
  
  /**
    * search backward in the searchStr, starts at startPos and ends by endpos. The endpos must be lower then the startpos, because the function searches
    * backward! The result is returned in the {@link SearchResult} .
    */
  def searchBackward(searchStr: String, startPos: Double, endPos: Double): SearchResult
  
  /** search forward in the searchStr, starts at startPos and ends by endpos. The result is returned in the {@link SearchResult} . */
  def searchForward(searchStr: String, startPos: Double, endPos: Double): SearchResult
  
  /** set the options for the forward or backward search. */
  def setOptions(options: SearchOptions): Unit
}
object XTextSearch {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    searchBackward: (String, Double, Double) => SearchResult,
    searchForward: (String, Double, Double) => SearchResult,
    setOptions: SearchOptions => Callback
  ): XTextSearch = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, searchBackward = js.Any.fromFunction3(searchBackward), searchForward = js.Any.fromFunction3(searchForward), setOptions = js.Any.fromFunction1((t0: SearchOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[XTextSearch]
  }
  
  extension [Self <: XTextSearch](x: Self) {
    
    inline def setSearchBackward(value: (String, Double, Double) => SearchResult): Self = StObject.set(x, "searchBackward", js.Any.fromFunction3(value))
    
    inline def setSearchForward(value: (String, Double, Double) => SearchResult): Self = StObject.set(x, "searchForward", js.Any.fromFunction3(value))
    
    inline def setSetOptions(value: SearchOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: SearchOptions) => value(t0).runNow()))
  }
}
