package typingsJapgolly.vscodeLanguageclient.configurationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsJapgolly.vscodeJsonrpc.mod.HandlerResult
import typingsJapgolly.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.HandlerSignature
import typingsJapgolly.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.MiddlewareSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationWorkspaceMiddleware extends js.Object {
  var configuration: js.UndefOr[MiddlewareSignature] = js.undefined
}

object ConfigurationWorkspaceMiddleware {
  @scala.inline
  def apply(
    configuration: (/* params */ ConfigurationParams, /* token */ CancellationToken, /* next */ HandlerSignature) => CallbackTo[HandlerResult[js.Array[js.Any], Unit]] = null
  ): ConfigurationWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(js.Any.fromFunction3((t0: /* params */ typingsJapgolly.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams, t1: /* token */ typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken, t2: /* next */ typingsJapgolly.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationRequest.HandlerSignature) => configuration(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ConfigurationWorkspaceMiddleware]
  }
}

