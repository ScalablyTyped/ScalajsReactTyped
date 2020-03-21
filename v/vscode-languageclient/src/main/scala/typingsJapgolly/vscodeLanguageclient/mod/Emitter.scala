package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeJsonrpc.eventsMod.EmitterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "Emitter")
@js.native
class Emitter[T] ()
  extends typingsJapgolly.vscodeLanguageclient.clientMod.Emitter[T] {
  def this(_options: EmitterOptions) = this()
}

/* static members */
@JSImport("vscode-languageclient", "Emitter")
@js.native
object Emitter extends js.Object {
  var _noop: js.Any = js.native
}

