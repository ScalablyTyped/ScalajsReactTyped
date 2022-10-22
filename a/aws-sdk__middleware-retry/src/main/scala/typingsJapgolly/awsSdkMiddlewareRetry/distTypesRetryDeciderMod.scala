package typingsJapgolly.awsSdkMiddlewareRetry

import typingsJapgolly.awsSdkTypes.distTypesShapesMod.SdkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRetryDeciderMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/retryDecider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultRetryDecider(error: SdkError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
