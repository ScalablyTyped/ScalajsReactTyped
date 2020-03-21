package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.mapboxGl.mod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContextProps extends js.Object {
  var eventManager: js.UndefOr[EventManager] = js.undefined
  var isDragging: Boolean
  var map: js.UndefOr[Map] = js.undefined
  var mapContainer: HTMLElement | Null
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.undefined
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.undefined
  var viewport: js.UndefOr[typingsJapgolly.viewportMercatorProject.mod.default] = js.undefined
}

object MapContextProps {
  @scala.inline
  def apply(
    isDragging: Boolean,
    eventManager: EventManager = null,
    map: Map = null,
    mapContainer: HTMLElement = null,
    onViewStateChange: /* info */ ContextViewStateChangeInfo => Callback = null,
    onViewportChange: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Callback = null,
    viewport: typingsJapgolly.viewportMercatorProject.mod.default = null
  ): MapContextProps = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any])
    if (eventManager != null) __obj.updateDynamic("eventManager")(eventManager.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapContainer != null) __obj.updateDynamic("mapContainer")(mapContainer.asInstanceOf[js.Any])
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactMapGl.mod.ContextViewStateChangeInfo) => onViewStateChange(t0).runNow()))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction3((t0: /* viewState */ typingsJapgolly.reactMapGl.mod.ViewportProps, t1: /* interactionState */ typingsJapgolly.reactMapGl.mod.ExtraState, t2: /* oldViewState */ typingsJapgolly.reactMapGl.mod.ViewportProps) => onViewportChange(t0, t1, t2).runNow()))
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextProps]
  }
}

