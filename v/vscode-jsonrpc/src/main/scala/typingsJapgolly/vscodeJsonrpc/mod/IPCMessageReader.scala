package typingsJapgolly.vscodeJsonrpc.mod

import typingsJapgolly.node.NodeJS.Process
import typingsJapgolly.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typingsJapgolly.vscodeJsonrpc.messageReaderMod.IPCMessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

