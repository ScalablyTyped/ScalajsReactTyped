package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.vscodeJsonrpc.mod.TraceValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "Trace")
@js.native
object Trace extends js.Object {
  /* 1 */ val Messages: typingsJapgolly.vscodeJsonrpc.mod.Trace.Messages with Double = js.native
  /* 0 */ val Off: typingsJapgolly.vscodeJsonrpc.mod.Trace.Off with Double = js.native
  /* 2 */ val Verbose: typingsJapgolly.vscodeJsonrpc.mod.Trace.Verbose with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.vscodeJsonrpc.mod.Trace with Double] = js.native
  def fromString(value: String): typingsJapgolly.vscodeJsonrpc.mod.Trace = js.native
  def toString(value: typingsJapgolly.vscodeJsonrpc.mod.Trace): TraceValues = js.native
}

