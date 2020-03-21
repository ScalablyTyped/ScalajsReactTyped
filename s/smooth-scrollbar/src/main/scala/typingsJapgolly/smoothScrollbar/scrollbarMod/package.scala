package typingsJapgolly.smoothScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scrollbarMod {
  type AddTransformableMomentumCallback = js.ThisFunction1[
    /* this */ typingsJapgolly.smoothScrollbar.scrollbarMod.Scrollbar, 
    /* willScroll */ scala.Boolean, 
    scala.Unit
  ]
  type ScrollListener = js.ThisFunction1[
    /* this */ typingsJapgolly.smoothScrollbar.scrollbarMod.Scrollbar, 
    /* status */ typingsJapgolly.smoothScrollbar.scrollbarMod.ScrollStatus, 
    scala.Unit
  ]
}
