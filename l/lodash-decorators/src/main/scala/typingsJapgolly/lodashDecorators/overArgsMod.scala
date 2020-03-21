package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.commonMod.LodashMethodDecorator
import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/overArgs", JSImport.Namespace)
@js.native
object overArgsMod extends js.Object {
  @JSName("OverArgs")
  def OverArgs_(transforms: js.Function*): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def overArgs(transforms: js.Function*): LodashMethodDecorator = js.native
}

