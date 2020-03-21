package typingsJapgolly.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task which consists of a shell command for the worker to execute.
  */
@js.native
trait SchemaShellTask extends js.Object {
  /**
    * The shell command to run.
    */
  var command: js.UndefOr[String] = js.native
  /**
    * Exit code for the task.
    */
  var exitCode: js.UndefOr[Double] = js.native
}

object SchemaShellTask {
  @scala.inline
  def apply(command: String = null, exitCode: Int | Double = null): SchemaShellTask = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShellTask]
  }
}

