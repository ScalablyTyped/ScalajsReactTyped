package typingsJapgolly.reactToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTooltipMod {
  type tooltipHOC[P] = js.Function1[
    /* componentClass */ japgolly.scalajs.react.raw.React.ComponentClassP[P with js.Object], 
    typingsJapgolly.reactToolbox.libTooltipMod.TooltippedComponentClass[P]
  ]
}
