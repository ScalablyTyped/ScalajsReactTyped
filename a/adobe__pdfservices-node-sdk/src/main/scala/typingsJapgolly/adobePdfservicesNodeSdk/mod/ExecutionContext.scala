package typingsJapgolly.adobePdfservicesNodeSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@adobe/pdfservices-node-sdk", "ExecutionContext")
@js.native
open class ExecutionContext ()
  extends typingsJapgolly.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
/* static members */
object ExecutionContext {
  
  @JSImport("@adobe/pdfservices-node-sdk", "ExecutionContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Creates a context instance using the provided {@link Credentials} and {@link ClientConfig}.
    *
    */
  inline def create(credentials: typingsJapgolly.adobePdfservicesNodeSdk.authCredentialsMod.Credentials): typingsJapgolly.adobePdfservicesNodeSdk.executionContextMod.ExecutionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(credentials.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.adobePdfservicesNodeSdk.executionContextMod.ExecutionContext]
  inline def create(
    credentials: typingsJapgolly.adobePdfservicesNodeSdk.authCredentialsMod.Credentials,
    clientConfig: typingsJapgolly.adobePdfservicesNodeSdk.clientConfigMod.ClientConfig
  ): typingsJapgolly.adobePdfservicesNodeSdk.executionContextMod.ExecutionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(credentials.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.adobePdfservicesNodeSdk.executionContextMod.ExecutionContext]
}
