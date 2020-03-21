package typingsJapgolly.emailValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("email-validator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def validate(email: String): Boolean = js.native
  @JSName("validate_async")
  def validateAsync(email: String, callback: AsyncCallback): Unit = js.native
  type AsyncCallback = js.Function2[/* err */ js.Any, /* isValideEmail */ Boolean, js.Any]
}

