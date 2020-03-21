package typingsJapgolly.ionicUtilsSubprocess.mod

import typingsJapgolly.ionicUtilsSubprocess.ForkOptionsPickSpawnOptio
import typingsJapgolly.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-subprocess", "fork")
@js.native
object fork extends js.Object {
  def apply(modulePath: String): ChildProcess = js.native
  def apply(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  def apply(modulePath: String, args: js.Array[String], options: ForkOptionsPickSpawnOptio): ChildProcess = js.native
}

