package typingsJapgolly.reactColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.reactColor.mod.HSLColor
    - typingsJapgolly.reactColor.mod.RGBColor
  */
  type Color = typingsJapgolly.reactColor.mod._Color | java.lang.String
  type ColorChangeHandler = js.Function1[/* color */ typingsJapgolly.reactColor.mod.ColorResult, scala.Unit]
}
