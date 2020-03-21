package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/ary", JSImport.Namespace)
@js.native
object aryMod extends js.Object {
  @JSName("Ary")
  def Ary_(n: Double): LodashMethodDecorator = js.native
  def ary(n: Double): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
}

