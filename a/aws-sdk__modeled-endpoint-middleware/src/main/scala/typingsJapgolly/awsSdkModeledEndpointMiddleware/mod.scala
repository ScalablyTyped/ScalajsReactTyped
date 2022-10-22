package typingsJapgolly.awsSdkModeledEndpointMiddleware

import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UrlParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/modeled-endpoint-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def modeledEndpointMiddleware[InputType /* <: js.Object */](urlParser: UrlParser, inputKey: /* keyof InputType */ String): BuildMiddleware[InputType, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("modeledEndpointMiddleware")(urlParser.asInstanceOf[js.Any], inputKey.asInstanceOf[js.Any])).asInstanceOf[BuildMiddleware[InputType, Any]]
}
