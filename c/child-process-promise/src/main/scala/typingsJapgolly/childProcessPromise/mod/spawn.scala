package typingsJapgolly.childProcessPromise.mod

import typingsJapgolly.childProcessPromise.ReadonlyOptionsSpawnOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child-process-promise", "spawn")
@js.native
object spawn extends js.Object {
  def apply(command: String): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(command: String, args: js.Array[String]): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(command: String, args: js.Array[String], options: ReadonlyOptionsSpawnOptio): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(command: String, args: Null, options: ReadonlyOptionsSpawnOptio): ChildProcessPromise[SpawnPromiseResult] = js.native
}

