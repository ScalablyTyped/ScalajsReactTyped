package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
import typingsJapgolly.lodashDecorators.sharedMod.ThrottleOptions
import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/throttleAll", JSImport.Namespace)
@js.native
object throttleAllMod extends js.Object {
  @JSName("ThrottleAll")
  def ThrottleAll_(): LodashMethodDecorator = js.native
  @JSName("ThrottleAll")
  def ThrottleAll_(wait: Double): LodashMethodDecorator = js.native
  @JSName("ThrottleAll")
  def ThrottleAll_(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def throttleAll(): LodashMethodDecorator = js.native
  def throttleAll(wait: Double): LodashMethodDecorator = js.native
  def throttleAll(wait: Double, options: ThrottleOptions): LodashMethodDecorator = js.native
}

