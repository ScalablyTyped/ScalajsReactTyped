package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.clientMod.LanguageClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "LanguageClient")
@js.native
class LanguageClient protected ()
  extends typingsJapgolly.vscodeLanguageclient.clientMod.BaseLanguageClient {
  def this(name: String, serverOptions: ServerOptions, clientOptions: LanguageClientOptions) = this()
  def this(id: String, name: String, serverOptions: ServerOptions, clientOptions: LanguageClientOptions) = this()
  def this(
    name: String,
    serverOptions: ServerOptions,
    clientOptions: LanguageClientOptions,
    forceDebug: Boolean
  ) = this()
  def this(
    id: String,
    name: String,
    serverOptions: ServerOptions,
    clientOptions: LanguageClientOptions,
    forceDebug: Boolean
  ) = this()
  var _forceDebug: js.Any = js.native
  var _getServerWorkingDir: js.Any = js.native
  var _isDetached: js.Any = js.native
  var _mainGetRootPath: js.Any = js.native
  var _serverOptions: js.Any = js.native
  var _serverProcess: js.Any = js.native
  var checkProcessDied: js.Any = js.native
  var checkVersion: js.Any = js.native
  def registerProposedFeatures(): Unit = js.native
}

