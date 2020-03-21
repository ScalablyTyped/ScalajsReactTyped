package typingsJapgolly.stormReactDiagrams.diagramModelMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.stormReactDiagrams.AnonLocked
import typingsJapgolly.stormReactDiagrams.BaseEventDiagramModeloffs
import typingsJapgolly.stormReactDiagrams.BaseEventDiagramModelsize
import typingsJapgolly.stormReactDiagrams.BaseEventDiagramModelzoom
import typingsJapgolly.stormReactDiagrams.BaseEventanylinkLinkModel
import typingsJapgolly.stormReactDiagrams.BaseEventanynodeNodeModel
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramListener
  extends BaseListener[js.Any] {
  var gridUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModelsize, Unit]] = js.undefined
  var linksUpdated: js.UndefOr[js.Function1[/* event */ BaseEventanylinkLinkModel, Unit]] = js.undefined
  var nodesUpdated: js.UndefOr[js.Function1[/* event */ BaseEventanynodeNodeModel, Unit]] = js.undefined
  var offsetUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModeloffs, Unit]] = js.undefined
  var zoomUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModelzoom, Unit]] = js.undefined
}

object DiagramListener {
  @scala.inline
  def apply(
    gridUpdated: /* event */ BaseEventDiagramModelsize => Callback = null,
    linksUpdated: /* event */ BaseEventanylinkLinkModel => Callback = null,
    lockChanged: /* event */ BaseEvent[js.Any] with AnonLocked => Callback = null,
    nodesUpdated: /* event */ BaseEventanynodeNodeModel => Callback = null,
    offsetUpdated: /* event */ BaseEventDiagramModeloffs => Callback = null,
    zoomUpdated: /* event */ BaseEventDiagramModelzoom => Callback = null
  ): DiagramListener = {
    val __obj = js.Dynamic.literal()
    if (gridUpdated != null) __obj.updateDynamic("gridUpdated")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventDiagramModelsize) => gridUpdated(t0).runNow()))
    if (linksUpdated != null) __obj.updateDynamic("linksUpdated")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventanylinkLinkModel) => linksUpdated(t0).runNow()))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent[js.Any] with typingsJapgolly.stormReactDiagrams.AnonLocked) => lockChanged(t0).runNow()))
    if (nodesUpdated != null) __obj.updateDynamic("nodesUpdated")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventanynodeNodeModel) => nodesUpdated(t0).runNow()))
    if (offsetUpdated != null) __obj.updateDynamic("offsetUpdated")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventDiagramModeloffs) => offsetUpdated(t0).runNow()))
    if (zoomUpdated != null) __obj.updateDynamic("zoomUpdated")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventDiagramModelzoom) => zoomUpdated(t0).runNow()))
    __obj.asInstanceOf[DiagramListener]
  }
}

