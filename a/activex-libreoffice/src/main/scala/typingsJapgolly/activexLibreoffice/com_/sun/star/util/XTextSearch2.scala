package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables an object to search in its content. */
trait XTextSearch2
  extends StObject
     with XTextSearch {
  
  /** set the options for the forward or backward search. */
  def setOptions2(options: SearchOptions2): Unit
}
object XTextSearch2 {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    searchBackward: (String, Double, Double) => SearchResult,
    searchForward: (String, Double, Double) => SearchResult,
    setOptions: SearchOptions => Callback,
    setOptions2: SearchOptions2 => Callback
  ): XTextSearch2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, searchBackward = js.Any.fromFunction3(searchBackward), searchForward = js.Any.fromFunction3(searchForward), setOptions = js.Any.fromFunction1((t0: SearchOptions) => setOptions(t0).runNow()), setOptions2 = js.Any.fromFunction1((t0: SearchOptions2) => setOptions2(t0).runNow()))
    __obj.asInstanceOf[XTextSearch2]
  }
  
  extension [Self <: XTextSearch2](x: Self) {
    
    inline def setSetOptions2(value: SearchOptions2 => Callback): Self = StObject.set(x, "setOptions2", js.Any.fromFunction1((t0: SearchOptions2) => value(t0).runNow()))
  }
}
