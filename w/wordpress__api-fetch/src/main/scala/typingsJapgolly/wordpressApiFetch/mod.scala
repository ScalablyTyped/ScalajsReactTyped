package typingsJapgolly.wordpressApiFetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
      * @template T
      * @param {import('./types').APIFetchOptions} options
      * @return {Promise<T>} A promise representing the request processed via the registered middlewares.
      */
    inline def apply[T](options: typingsJapgolly.wordpressApiFetch.buildTypesTypesMod.APIFetchOptions): js.Promise[T] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    
    @JSImport("@wordpress/api-fetch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  type APIFetchMiddleware = typingsJapgolly.wordpressApiFetch.buildTypesTypesMod.APIFetchMiddleware
  
  type APIFetchOptions = typingsJapgolly.wordpressApiFetch.buildTypesTypesMod.APIFetchOptions
  
  type FetchHandler = js.Function1[
    /* options */ typingsJapgolly.wordpressApiFetch.buildTypesTypesMod.APIFetchOptions, 
    js.Promise[Any]
  ]
}
