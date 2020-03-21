package typingsJapgolly.remotedevSerialize

import typingsJapgolly.immutable.Immutable.Record
import typingsJapgolly.std.Iterable
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofFactory extends js.Object {
  def apply[TProps /* <: js.Object */](): Record[TProps] with TProps = js.native
  def apply[TProps /* <: js.Object */](values: Iterable[js.Tuple2[String, _]]): Record[TProps] with TProps = js.native
  def apply[TProps /* <: js.Object */](values: Partial[TProps]): Record[TProps] with TProps = js.native
}

