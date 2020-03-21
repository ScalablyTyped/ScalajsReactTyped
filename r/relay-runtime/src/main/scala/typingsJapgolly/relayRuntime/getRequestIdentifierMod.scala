package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.relayConcreteNodeMod.RequestParameters
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/util/getRequestIdentifier", JSImport.Namespace)
@js.native
object getRequestIdentifierMod extends js.Object {
  def getRequestIdentifier(parameters: RequestParameters, variables: Variables): RequestIdentifier = js.native
  type RequestIdentifier = String
}

