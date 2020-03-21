package typingsJapgolly.npmRun

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.node.childProcessMod.ChildProcessByStdio
import typingsJapgolly.node.childProcessMod.ChildProcessWithoutNullStreams
import typingsJapgolly.node.childProcessMod.SpawnOptions
import typingsJapgolly.node.childProcessMod.SpawnOptionsWithStdioTuple
import typingsJapgolly.node.childProcessMod.SpawnOptionsWithoutStdio
import typingsJapgolly.node.childProcessMod.StdioNull
import typingsJapgolly.node.childProcessMod.StdioPipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn0 extends js.Object {
  def apply(command: String): ChildProcessWithoutNullStreams = js.native
  def apply(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def apply(
    command: String,
    args: js.Array[String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def apply(command: String, options: SpawnOptions): ChildProcess = js.native
  def apply(
    command: String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = js.native
  def apply(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
}

