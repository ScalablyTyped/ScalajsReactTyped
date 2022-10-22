package typingsJapgolly.umbraco

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IHttpHeadersGetter
import typingsJapgolly.angular.mod.IHttpPromiseCallback
import typingsJapgolly.angular.mod.IRequestConfig
import typingsJapgolly.umbraco.mod.resources.IResourcePromise
import typingsJapgolly.umbraco.umbraco.resources.Direction
import typingsJapgolly.umbraco.umbraco.resources.OrderItemsBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error[T] extends StObject {
    
    def error(data: IResourcePromise, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit
    @JSName("error")
    var error_Original: IHttpPromiseCallback[IResourcePromise]
    
    def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit
    @JSName("success")
    var success_Original: IHttpPromiseCallback[T]
  }
  object Error {
    
    inline def apply[T](
      error: (IResourcePromise, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Callback,
      success: (T, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Callback
    ): Error[T] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction4((t0: IResourcePromise, t1: /* status */ Double, t2: /* headers */ IHttpHeadersGetter, t3: /* config */ IRequestConfig) => (error(t0, t1, t2, t3)).runNow()), success = js.Any.fromFunction4((t0: T, t1: /* status */ Double, t2: /* headers */ IHttpHeadersGetter, t3: /* config */ IRequestConfig) => (success(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[Error[T]]
    }
    
    extension [Self <: Error[?], T](x: Self & Error[T]) {
      
      inline def setError(
        value: (IResourcePromise, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Callback
      ): Self = StObject.set(x, "error", js.Any.fromFunction4((t0: IResourcePromise, t1: /* status */ Double, t2: /* headers */ IHttpHeadersGetter, t3: /* config */ IRequestConfig) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setSuccess(
        value: (T, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Callback
      ): Self = StObject.set(x, "success", js.Any.fromFunction4((t0: T, t1: /* status */ Double, t2: /* headers */ IHttpHeadersGetter, t3: /* config */ IRequestConfig) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  trait ErrorMsg[T] extends StObject {
    
    var errorMsg: String
    
    def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit
    @JSName("success")
    var success_Original: IHttpPromiseCallback[T]
  }
  object ErrorMsg {
    
    inline def apply[T](
      errorMsg: String,
      success: (T, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Callback
    ): ErrorMsg[T] = {
      val __obj = js.Dynamic.literal(errorMsg = errorMsg.asInstanceOf[js.Any], success = js.Any.fromFunction4((t0: T, t1: /* status */ Double, t2: /* headers */ IHttpHeadersGetter, t3: /* config */ IRequestConfig) => (success(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[ErrorMsg[T]]
    }
    
    extension [Self <: ErrorMsg[?], T](x: Self & ErrorMsg[T]) {
      
      inline def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
      
      inline def setSuccess(
        value: (T, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Callback
      ): Self = StObject.set(x, "success", js.Any.fromFunction4((t0: T, t1: /* status */ Double, t2: /* headers */ IHttpHeadersGetter, t3: /* config */ IRequestConfig) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  trait Filter extends StObject {
    
    var filter: String
    
    var orderBy: OrderItemsBy
    
    var orderDirection: Direction
    
    var pageNumber: Double
    
    var pageSize: Double
  }
  object Filter {
    
    inline def apply(
      filter: String,
      orderBy: OrderItemsBy,
      orderDirection: Direction,
      pageNumber: Double,
      pageSize: Double
    ): Filter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], orderDirection = orderDirection.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setOrderBy(value: OrderItemsBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderDirection(value: Direction): Self = StObject.set(x, "orderDirection", value.asInstanceOf[js.Any])
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    var Url: String
  }
  object Url {
    
    inline def apply(Url: String): Url = {
      val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
}
