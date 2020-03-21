package typingsJapgolly.vegaTypings.signalMod

import typingsJapgolly.vegaTypings.axisMod._TickCount
import typingsJapgolly.vegaTypings.encodeMod.BaseValueRef
import typingsJapgolly.vegaTypings.encodeMod._Field
import typingsJapgolly.vegaTypings.layoutMod.Layout
import typingsJapgolly.vegaTypings.layoutMod.LayoutBounds
import typingsJapgolly.vegaTypings.layoutMod._LayoutOffset
import typingsJapgolly.vegaTypings.onEventsMod._EventListener
import typingsJapgolly.vegaTypings.onEventsMod._Update
import typingsJapgolly.vegaTypings.scaleMod.ScaleInterpolate
import typingsJapgolly.vegaTypings.scaleMod.SortOrder
import typingsJapgolly.vegaTypings.scaleMod._RangeScheme
import typingsJapgolly.vegaTypings.scaleMod._ScaleBins
import typingsJapgolly.vegaTypings.transformMod.TransformField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalRef
  extends BaseValueRef[js.Any]
     with Layout
     with LayoutBounds
     with ScaleInterpolate
     with SortOrder
     with TransformField
     with _EventListener
     with _Field
     with _LayoutOffset
     with _RangeScheme
     with _ScaleBins
     with _TickCount
     with _Update {
  var signal: String
}

object SignalRef {
  @scala.inline
  def apply(signal: String): SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignalRef]
  }
}

