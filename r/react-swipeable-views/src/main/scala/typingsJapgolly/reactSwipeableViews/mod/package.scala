package typingsJapgolly.reactSwipeableViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OnChangeIndexCallback = js.Function2[/* index */ scala.Double, /* indexLatest */ scala.Double, scala.Unit]
  type OnSwitchingCallback = js.Function2[
    /* index */ scala.Double, 
    /* type */ typingsJapgolly.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor, 
    scala.Unit
  ]
  type OnTransitionEndCallback = js.Function0[scala.Unit]
  type SwipeableViews = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactSwipeableViews.mod.SwipeableViewsProps with js.Object, 
    js.Object
  ]
}
