package typingsJapgolly.awsSdkFetchHttpHandler

import typingsJapgolly.awsSdkFetchHttpHandler.distTypesFetchHttpHandlerMod.FetchHttpHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.StreamCollector
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/fetch-http-handler", "FetchHttpHandler")
  @js.native
  open class FetchHttpHandler ()
    extends typingsJapgolly.awsSdkFetchHttpHandler.distTypesFetchHttpHandlerMod.FetchHttpHandler {
    def this(options: FetchHttpHandlerOptions) = this()
    def this(options: Provider[js.UndefOr[FetchHttpHandlerOptions]]) = this()
  }
  
  @JSImport("@aws-sdk/fetch-http-handler", "streamCollector")
  @js.native
  val streamCollector: StreamCollector = js.native
}
