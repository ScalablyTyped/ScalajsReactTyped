package typingsJapgolly.airbnbPropTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "valuesOf")
@js.native
object valuesOf extends js.Object {
  def apply[T](propType: Validator[T]): Requireable[StringDictionary[T]] = js.native
}

