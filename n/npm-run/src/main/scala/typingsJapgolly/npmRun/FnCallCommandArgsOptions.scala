package typingsJapgolly.npmRun

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.childProcessMod.SpawnSyncOptions
import typingsJapgolly.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import typingsJapgolly.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import typingsJapgolly.node.childProcessMod.SpawnSyncReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallCommandArgsOptions extends js.Object {
  def apply(command: String): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def apply(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
}

