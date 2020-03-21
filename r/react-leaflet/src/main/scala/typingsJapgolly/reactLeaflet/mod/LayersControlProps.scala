package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.ControlPosition
import typingsJapgolly.leaflet.mod.Control_.LayersOptions
import typingsJapgolly.leaflet.mod.LayersControlEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.reactLeaflet.mod.MapControlProps because var conflicts: position. Inlined leaflet */ trait LayersControlProps
  extends LayersOptions
     with LayersControlEvents {
  var children: Children
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}

object LayersControlProps {
  @scala.inline
  def apply(
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    hideSingleBase: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    onbaselayerchange: /* event */ LayersControlEvent => Callback = null,
    onoverlayadd: /* event */ LayersControlEvent => Callback = null,
    onoverlayremove: /* event */ LayersControlEvent => Callback = null,
    position: ControlPosition = null
  ): LayersControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSingleBase)) __obj.updateDynamic("hideSingleBase")(hideSingleBase.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onbaselayerchange(t0).runNow()))
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onoverlayadd(t0).runNow()))
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onoverlayremove(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersControlProps]
  }
}

