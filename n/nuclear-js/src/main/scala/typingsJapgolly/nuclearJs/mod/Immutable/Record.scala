package typingsJapgolly.nuclearJs.mod.Immutable

import typingsJapgolly.immutable.Immutable.Record.Factory
import typingsJapgolly.std.Iterable
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuclear-js", "Immutable.Record")
@js.native
object Record extends js.Object {
  def apply[TProps](defaultValues: TProps): Factory[TProps] = js.native
  def apply[TProps](defaultValues: TProps, name: String): Factory[TProps] = js.native
  def getDescriptiveName(record: typingsJapgolly.immutable.Immutable.Record[_]): String = js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
  @js.native
  object Factory extends js.Object {
    def apply[TProps /* <: js.Object */](): typingsJapgolly.immutable.Immutable.Record[TProps] with TProps = js.native
    def apply[TProps /* <: js.Object */](values: Iterable[js.Tuple2[String, _]]): typingsJapgolly.immutable.Immutable.Record[TProps] with TProps = js.native
    def apply[TProps /* <: js.Object */](values: Partial[TProps]): typingsJapgolly.immutable.Immutable.Record[TProps] with TProps = js.native
  }
  
}

