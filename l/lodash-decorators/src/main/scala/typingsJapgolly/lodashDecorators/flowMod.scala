package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.commonMod.LodashDecorator
import typingsJapgolly.lodashDecorators.commonMod.ResolvableFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/flow", JSImport.Namespace)
@js.native
object flowMod extends js.Object {
  @JSName("Flow")
  def Flow_(fns: ResolvableFunction*): LodashDecorator = js.native
  def default(args: js.Any*): LodashDecorator = js.native
  def flow(fns: ResolvableFunction*): LodashDecorator = js.native
}

