package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.node.NodeJS.Process
import typingsJapgolly.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typingsJapgolly.vscodeJsonrpc.mod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

