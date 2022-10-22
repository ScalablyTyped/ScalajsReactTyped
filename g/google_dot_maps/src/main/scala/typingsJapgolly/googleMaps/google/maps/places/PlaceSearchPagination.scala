package typingsJapgolly.googleMaps.google.maps.places

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object used to fetch additional pages of Places results.
  */
trait PlaceSearchPagination extends StObject {
  
  /**
    * Indicates if further results are available. <code>true</code> when there
    * is an additional results page.
    */
  var hasNextPage: Boolean
  
  /**
    * Fetches the next page of results. Uses the same callback function that
    * was provided to the first search request.
    */
  def nextPage(): Unit
}
object PlaceSearchPagination {
  
  inline def apply(hasNextPage: Boolean, nextPage: Callback): PlaceSearchPagination = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], nextPage = nextPage.toJsFn)
    __obj.asInstanceOf[PlaceSearchPagination]
  }
  
  extension [Self <: PlaceSearchPagination](x: Self) {
    
    inline def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
    
    inline def setNextPage(value: Callback): Self = StObject.set(x, "nextPage", value.toJsFn)
  }
}
