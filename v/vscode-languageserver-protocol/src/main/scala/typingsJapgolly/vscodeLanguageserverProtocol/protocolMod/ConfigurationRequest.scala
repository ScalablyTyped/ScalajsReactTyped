package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "ConfigurationRequest")
@js.native
object ConfigurationRequest extends js.Object {
  val `type`: RequestType[ConfigurationParams, js.Array[js.Any], Unit, Unit] = js.native
}

