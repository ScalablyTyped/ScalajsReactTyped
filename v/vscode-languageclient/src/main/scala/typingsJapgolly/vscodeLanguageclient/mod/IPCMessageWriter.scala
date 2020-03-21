package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.node.NodeJS.Process
import typingsJapgolly.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typingsJapgolly.vscodeLanguageclient.clientMod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

