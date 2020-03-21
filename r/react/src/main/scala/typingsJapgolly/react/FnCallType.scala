package typingsJapgolly.react

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallType extends js.Object {
  def apply[T](`type`: Validator[T]): Requireable[js.Array[T]] = js.native
}

