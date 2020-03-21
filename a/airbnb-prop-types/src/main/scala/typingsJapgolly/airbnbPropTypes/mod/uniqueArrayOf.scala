package typingsJapgolly.airbnbPropTypes.mod

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "uniqueArrayOf")
@js.native
object uniqueArrayOf extends js.Object {
  def apply[T, P](propType: Validator[P], mapperOrName: String): Requireable[js.Array[T]] = js.native
  def apply[T, P](propType: Validator[P], mapperOrName: String, name: String): Requireable[js.Array[T]] = js.native
  def apply[T, P](propType: Validator[P], mapperOrName: js.Function1[/* value */ js.Any, _]): Requireable[js.Array[T]] = js.native
  def apply[T, P](propType: Validator[P], mapperOrName: js.Function1[/* value */ js.Any, _], name: String): Requireable[js.Array[T]] = js.native
}

