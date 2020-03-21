package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
import typingsJapgolly.lodashDecorators.sharedMod.DebounceOptions
import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/debounceAll", JSImport.Namespace)
@js.native
object debounceAllMod extends js.Object {
  @JSName("DebounceAll")
  def DebounceAll_(): LodashMethodDecorator = js.native
  @JSName("DebounceAll")
  def DebounceAll_(wait: Double): LodashMethodDecorator = js.native
  @JSName("DebounceAll")
  def DebounceAll_(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  def debounceAll(): LodashMethodDecorator = js.native
  def debounceAll(wait: Double): LodashMethodDecorator = js.native
  def debounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
}

