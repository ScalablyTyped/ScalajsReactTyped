package typingsJapgolly.propTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Requireable[T]
  extends Validator[js.UndefOr[T | Null]] {
  @JSName("isRequired")
  var isRequired_Original: Validator[NonNullable[T]] = js.native
  def isRequired(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
}

