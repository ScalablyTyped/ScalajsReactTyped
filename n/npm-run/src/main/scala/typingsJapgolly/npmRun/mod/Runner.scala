package typingsJapgolly.npmRun.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.node.childProcessMod.ChildProcessByStdio
import typingsJapgolly.node.childProcessMod.ChildProcessWithoutNullStreams
import typingsJapgolly.node.childProcessMod.ExecSyncOptions
import typingsJapgolly.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import typingsJapgolly.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import typingsJapgolly.node.childProcessMod.SpawnOptions
import typingsJapgolly.node.childProcessMod.SpawnOptionsWithStdioTuple
import typingsJapgolly.node.childProcessMod.SpawnOptionsWithoutStdio
import typingsJapgolly.node.childProcessMod.SpawnSyncOptions
import typingsJapgolly.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import typingsJapgolly.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import typingsJapgolly.node.childProcessMod.SpawnSyncReturns
import typingsJapgolly.node.childProcessMod.StdioNull
import typingsJapgolly.node.childProcessMod.StdioPipe
import typingsJapgolly.npmRun.Fn0
import typingsJapgolly.npmRun.FnCall
import typingsJapgolly.npmRun.FnCallCommandArgsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner extends ExecFunction {
  var exec: ExecFunction = js.native
  @JSName("execSync")
  var execSync_Original: FnCall = js.native
  @JSName("spawnSync")
  var spawnSync_Original: FnCallCommandArgsOptions = js.native
  @JSName("spawn")
  var spawn_Original: Fn0 = js.native
  @JSName("sync")
  var sync_Original: FnCall = js.native
  def execSync(command: String): String = js.native
  def execSync(command: String, options: ExecSyncOptions): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  @JSName("execSync")
  def execSync_Buffer(command: String): Buffer = js.native
  def spawn(command: String): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def spawn(
    command: String,
    args: js.Array[String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, options: SpawnOptions): ChildProcess = js.native
  def spawn(
    command: String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = js.native
  def spawn(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def spawnSync(command: String): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def spawnSync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def sync(command: String): String = js.native
  def sync(command: String, options: ExecSyncOptions): Buffer = js.native
  def sync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def sync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  @JSName("sync")
  def sync_Buffer(command: String): Buffer = js.native
}

