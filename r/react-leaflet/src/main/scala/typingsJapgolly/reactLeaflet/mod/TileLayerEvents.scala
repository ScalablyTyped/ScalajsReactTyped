package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.TileEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayerEvents extends js.Object {
  var onload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onloading: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var ontileerror: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  var ontileload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  var ontileloadstart: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  var ontileunload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
}

object TileLayerEvents {
  @scala.inline
  def apply(
    onload: /* event */ LeafletEvent => Callback = null,
    onloading: /* event */ LeafletEvent => Callback = null,
    ontileerror: /* event */ TileEvent => Callback = null,
    ontileload: /* event */ TileEvent => Callback = null,
    ontileloadstart: /* event */ TileEvent => Callback = null,
    ontileunload: /* event */ TileEvent => Callback = null
  ): TileLayerEvents = {
    val __obj = js.Dynamic.literal()
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onload(t0).runNow()))
    if (onloading != null) __obj.updateDynamic("onloading")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onloading(t0).runNow()))
    if (ontileerror != null) __obj.updateDynamic("ontileerror")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => ontileerror(t0).runNow()))
    if (ontileload != null) __obj.updateDynamic("ontileload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => ontileload(t0).runNow()))
    if (ontileloadstart != null) __obj.updateDynamic("ontileloadstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => ontileloadstart(t0).runNow()))
    if (ontileunload != null) __obj.updateDynamic("ontileunload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => ontileunload(t0).runNow()))
    __obj.asInstanceOf[TileLayerEvents]
  }
}

