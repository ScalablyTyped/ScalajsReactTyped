package typingsJapgolly.reactColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorWrapMod {
  type ColorWrapChangeHandler = js.Function1[
    /* color */ typingsJapgolly.reactColor.mod.Color | typingsJapgolly.reactColor.mod.ColorResult, 
    scala.Unit
  ]
}
