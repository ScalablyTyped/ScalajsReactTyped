package typingsJapgolly.reduxForm.reduxFormMod

import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/reduxForm", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, Partial[ConfigProps[FormData, P, ErrorType]], ErrorType] = js.native
  def apply[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ConfigProps[FormData, P, ErrorType], ErrorType] = js.native
}

