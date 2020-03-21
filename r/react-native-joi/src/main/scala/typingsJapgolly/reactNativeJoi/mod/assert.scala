package typingsJapgolly.reactNativeJoi.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-joi", "assert")
@js.native
object assert extends js.Object {
  def apply(value: js.Any, schema: SchemaLike): Unit = js.native
  def apply(value: js.Any, schema: SchemaLike, message: String): Unit = js.native
  def apply(value: js.Any, schema: SchemaLike, message: Error): Unit = js.native
}

