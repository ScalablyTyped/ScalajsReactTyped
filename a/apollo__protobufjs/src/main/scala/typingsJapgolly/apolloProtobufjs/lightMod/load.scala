package typingsJapgolly.apolloProtobufjs.lightMod

import typingsJapgolly.apolloProtobufjs.mod.LoadCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/light", "load")
@js.native
object load extends js.Object {
  def apply(filename: String): js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root] = js.native
  def apply(filename: String, callback: LoadCallback): Unit = js.native
  def apply(filename: String, root: typingsJapgolly.apolloProtobufjs.mod.Root): js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root] = js.native
  def apply(filename: String, root: typingsJapgolly.apolloProtobufjs.mod.Root, callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String]): js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root] = js.native
  def apply(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String], root: typingsJapgolly.apolloProtobufjs.mod.Root): js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root] = js.native
  def apply(
    filename: js.Array[String],
    root: typingsJapgolly.apolloProtobufjs.mod.Root,
    callback: LoadCallback
  ): Unit = js.native
}

