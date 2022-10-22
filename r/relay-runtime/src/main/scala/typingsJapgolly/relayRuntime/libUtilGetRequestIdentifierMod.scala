package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGetRequestIdentifierMod {
  
  @JSImport("relay-runtime/lib/util/getRequestIdentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parameters: RequestParameters, variables: Variables): RequestIdentifier = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(parameters.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[RequestIdentifier]
  
  type RequestIdentifier = String
}
