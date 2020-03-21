package typingsJapgolly.reactMapGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ContextViewStateChangeHandler = js.Function1[/* info */ typingsJapgolly.reactMapGl.mod.ContextViewStateChangeInfo, scala.Unit]
  type ContextViewportChangeHandler = js.Function3[
    /* viewState */ typingsJapgolly.reactMapGl.mod.ViewportProps, 
    /* interactionState */ typingsJapgolly.reactMapGl.mod.ExtraState, 
    /* oldViewState */ typingsJapgolly.reactMapGl.mod.ViewportProps, 
    scala.Unit
  ]
  type EasingFunction = js.Function1[/* t */ scala.Double, scala.Double]
  type EventManager = js.Any
  type SVGRedrawOptions = typingsJapgolly.reactMapGl.mod.HTMLRedrawOptions
  type ViewStateChangeHandler = js.Function1[/* info */ typingsJapgolly.reactMapGl.mod.ViewStateChangeInfo, scala.Unit]
  type ViewportChangeHandler = js.Function1[/* viewState */ typingsJapgolly.reactMapGl.mod.ViewportProps, scala.Unit]
}
