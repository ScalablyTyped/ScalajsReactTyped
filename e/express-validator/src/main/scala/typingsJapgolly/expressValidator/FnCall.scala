package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.validationResultMod.ResultFactory
import typingsJapgolly.expressValidator.validationResultMod.ResultFactoryBuilderOptions
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T](): ResultFactory[T] = js.native
  def apply[T](options: Partial[ResultFactoryBuilderOptions[T]]): ResultFactory[T] = js.native
}

