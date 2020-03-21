package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.node.NodeJS.Process
import typingsJapgolly.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typingsJapgolly.vscodeLanguageserverProtocol.mod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

