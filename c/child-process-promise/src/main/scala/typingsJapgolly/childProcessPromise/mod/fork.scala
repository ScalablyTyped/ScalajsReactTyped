package typingsJapgolly.childProcessPromise.mod

import typingsJapgolly.childProcessPromise.ReadonlyOptionsForkOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child-process-promise", "fork")
@js.native
object fork extends js.Object {
  def apply(modulePath: String): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(modulePath: String, args: js.Array[String]): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(modulePath: String, args: js.Array[String], options: ReadonlyOptionsForkOption): ChildProcessPromise[SpawnPromiseResult] = js.native
}

