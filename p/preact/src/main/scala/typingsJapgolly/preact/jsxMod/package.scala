package typingsJapgolly.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsxMod {
  type Defaultize[Props, Defaults] = (typingsJapgolly.std.Partial[
    typingsJapgolly.std.Pick[Props, typingsJapgolly.std.Extract[java.lang.String, java.lang.String]]
  ]) with (// Include the remaining properties from Props
  typingsJapgolly.std.Pick[Props, typingsJapgolly.std.Exclude[java.lang.String, java.lang.String]])
}
