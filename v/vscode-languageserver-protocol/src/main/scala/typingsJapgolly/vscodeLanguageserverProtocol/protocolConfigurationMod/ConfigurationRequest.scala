package typingsJapgolly.vscodeLanguageserverProtocol.protocolConfigurationMod

import typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsJapgolly.vscodeJsonrpc.mod.HandlerResult
import typingsJapgolly.vscodeJsonrpc.mod.RequestHandler
import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.configuration", "ConfigurationRequest")
@js.native
object ConfigurationRequest extends js.Object {
  val `type`: RequestType[ConfigurationParams, js.Array[js.Any], Unit, Unit] = js.native
  type HandlerSignature = RequestHandler[ConfigurationParams, js.Array[js.Any], Unit]
  type MiddlewareSignature = js.Function3[
    /* params */ ConfigurationParams, 
    /* token */ CancellationToken, 
    /* next */ HandlerSignature, 
    HandlerResult[js.Array[js.Any], Unit]
  ]
}

