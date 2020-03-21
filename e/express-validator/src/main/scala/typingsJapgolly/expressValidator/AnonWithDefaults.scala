package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.validationResultMod.ResultFactory
import typingsJapgolly.expressValidator.validationResultMod.ResultFactoryBuilderOptions
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWithDefaults extends js.Object {
  @JSName("withDefaults")
  var withDefaults_Original: FnCall = js.native
  def withDefaults[T](): ResultFactory[T] = js.native
  def withDefaults[T](options: Partial[ResultFactoryBuilderOptions[T]]): ResultFactory[T] = js.native
}

