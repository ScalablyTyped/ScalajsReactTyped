package typingsJapgolly.wordpressApiFetch

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressApiFetch.buildTypesTypesMod.APIFetchMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMiddlewaresPreloadingMod {
  
  @JSImport("@wordpress/api-fetch/build-types/middlewares/preloading", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {Record<string, any>} preloadedData
    * @return {import('../types').APIFetchMiddleware} Preloading middleware.
    */
  inline def default(preloadedData: Record[String, Any]): APIFetchMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(preloadedData.asInstanceOf[js.Any]).asInstanceOf[APIFetchMiddleware]
}
