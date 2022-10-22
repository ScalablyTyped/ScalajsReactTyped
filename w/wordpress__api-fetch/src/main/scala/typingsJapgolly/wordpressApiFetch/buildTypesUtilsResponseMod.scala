package typingsJapgolly.wordpressApiFetch

import org.scalajs.dom.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesUtilsResponseMod {
  
  @JSImport("@wordpress/api-fetch/build-types/utils/response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseAndThrowError(response: Response): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAndThrowError")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def parseAndThrowError(response: Response, shouldParseResponse: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAndThrowError")(response.asInstanceOf[js.Any], shouldParseResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def parseResponseAndNormalizeError(response: Response): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseResponseAndNormalizeError")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def parseResponseAndNormalizeError(response: Response, shouldParseResponse: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseResponseAndNormalizeError")(response.asInstanceOf[js.Any], shouldParseResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
