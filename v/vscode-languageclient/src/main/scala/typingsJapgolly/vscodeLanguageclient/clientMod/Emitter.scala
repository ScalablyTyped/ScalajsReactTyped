package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.vscodeJsonrpc.eventsMod.EmitterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "Emitter")
@js.native
class Emitter[T] ()
  extends typingsJapgolly.vscodeLanguageserverProtocol.mod.Emitter[T] {
  def this(_options: EmitterOptions) = this()
}

/* static members */
@JSImport("vscode-languageclient/lib/client", "Emitter")
@js.native
object Emitter extends js.Object {
  var _noop: js.Any = js.native
}

