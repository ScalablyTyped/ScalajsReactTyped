package typingsJapgolly.winrtUwp.Windows.Services.Store

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a paged request to retrieve details about products that can be purchased from within the current app. */
trait StoreProductPagedQueryResult extends StObject {
  
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError
  
  /**
    * Returns the next page of results. To determine if there are more pages of results, use the HasMoreResults property.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductPagedQueryResult object that provides the next page of results.
    */
  def getNextAsync(): IPromiseWithIAsyncOperation[StoreProductPagedQueryResult]
  
  /** Gets a value that indicates whether there are additional pages of results. To get the next page of results, use the GetNextAsync method. */
  var hasMoreResults: Boolean
  
  /** Gets the collection of products returned by the request. */
  var products: IMapView[String, StoreProduct]
}
object StoreProductPagedQueryResult {
  
  inline def apply(
    extendedError: WinRTError,
    getNextAsync: CallbackTo[IPromiseWithIAsyncOperation[StoreProductPagedQueryResult]],
    hasMoreResults: Boolean,
    products: IMapView[String, StoreProduct]
  ): StoreProductPagedQueryResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], getNextAsync = getNextAsync.toJsFn, hasMoreResults = hasMoreResults.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreProductPagedQueryResult]
  }
  
  extension [Self <: StoreProductPagedQueryResult](x: Self) {
    
    inline def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
    
    inline def setGetNextAsync(value: CallbackTo[IPromiseWithIAsyncOperation[StoreProductPagedQueryResult]]): Self = StObject.set(x, "getNextAsync", value.toJsFn)
    
    inline def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    inline def setProducts(value: IMapView[String, StoreProduct]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
  }
}
