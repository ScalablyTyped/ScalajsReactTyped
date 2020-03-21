package typingsJapgolly.reactToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRippleMod {
  type RippledComponentFactory = js.Function1[
    /* component */ (japgolly.scalajs.react.raw.React.ComponentClassP[js.Any with js.Object]) | typingsJapgolly.react.mod.SFC[js.Any], 
    (japgolly.scalajs.react.raw.React.ComponentClassP[js.Any with js.Object]) | typingsJapgolly.react.mod.SFC[js.Any]
  ]
}
