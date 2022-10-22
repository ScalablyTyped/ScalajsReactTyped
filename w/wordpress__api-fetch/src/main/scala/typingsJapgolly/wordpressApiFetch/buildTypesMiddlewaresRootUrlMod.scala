package typingsJapgolly.wordpressApiFetch

import typingsJapgolly.wordpressApiFetch.buildTypesTypesMod.APIFetchMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMiddlewaresRootUrlMod {
  
  @JSImport("@wordpress/api-fetch/build-types/middlewares/root-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {string} rootURL
    * @return {import('../types').APIFetchMiddleware} Root URL middleware.
    */
  inline def default(rootURL: String): APIFetchMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rootURL.asInstanceOf[js.Any]).asInstanceOf[APIFetchMiddleware]
}
