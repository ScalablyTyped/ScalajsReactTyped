package typingsJapgolly.ionic.shellMod

import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.definitionsMod.IShellSpawnOptions
import typingsJapgolly.ionicUtilsSubprocess.mod.Subprocess
import typingsJapgolly.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/shell", "Shell")
@js.native
class Shell protected () extends IShell {
  def this(e: ShellDeps) = this()
  def this(e: ShellDeps, options: ShellOptions) = this()
  val e: ShellDeps = js.native
  def createSubprocess(command: String): js.Promise[Subprocess] = js.native
  /* protected */ def prepareSpawnOptions(options: IShellSpawnOptions): Unit = js.native
  /**
    * When `child_process.spawn` isn't provided a full path to the command
    * binary, it behaves differently on Windows than other platforms. For
    * Windows, discover the full path to the binary, otherwise fallback to the
    * command provided.
    *
    * @see https://github.com/ionic-team/ionic-cli/issues/3563#issuecomment-425232005
    */
  def resolveCommandPath(command: String, options: SpawnOptions): js.Promise[String] = js.native
}

