package typingsJapgolly.protobufjs.lightMod

import typingsJapgolly.protobufjs.mod.LoadCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "load")
@js.native
object load extends js.Object {
  def apply(filename: String): js.Promise[typingsJapgolly.protobufjs.mod.Root] = js.native
  def apply(filename: String, callback: LoadCallback): Unit = js.native
  def apply(filename: String, root: typingsJapgolly.protobufjs.mod.Root): js.Promise[typingsJapgolly.protobufjs.mod.Root] = js.native
  def apply(filename: String, root: typingsJapgolly.protobufjs.mod.Root, callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String]): js.Promise[typingsJapgolly.protobufjs.mod.Root] = js.native
  def apply(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String], root: typingsJapgolly.protobufjs.mod.Root): js.Promise[typingsJapgolly.protobufjs.mod.Root] = js.native
  def apply(filename: js.Array[String], root: typingsJapgolly.protobufjs.mod.Root, callback: LoadCallback): Unit = js.native
}

