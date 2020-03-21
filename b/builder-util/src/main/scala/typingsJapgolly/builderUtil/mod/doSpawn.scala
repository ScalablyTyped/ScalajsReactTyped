package typingsJapgolly.builderUtil.mod

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util", "doSpawn")
@js.native
object doSpawn extends js.Object {
  def apply(command: String, args: js.Array[String]): ChildProcess = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): ChildProcess = js.native
}

