package typingsJapgolly.ionicUtilsSubprocess.mod

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-subprocess", "spawn")
@js.native
object spawn extends js.Object {
  def apply(command: String): ChildProcess = js.native
  def apply(command: String, args: js.Array[String]): ChildProcess = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
}

