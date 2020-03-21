package typingsJapgolly.reactLeaflet.mod

import typingsJapgolly.leaflet.mod.CrossOrigin
import typingsJapgolly.leaflet.mod.ImageOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet */ trait SVGOverlayProps extends ImageOverlayOptions {
  var children: js.UndefOr[Children] = js.undefined
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}

object SVGOverlayProps {
  @scala.inline
  def apply(
    alt: String = null,
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    errorOverlayUrl: String = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    opacity: Int | Double = null,
    pane: String = null,
    zIndex: Int | Double = null
  ): SVGOverlayProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (errorOverlayUrl != null) __obj.updateDynamic("errorOverlayUrl")(errorOverlayUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGOverlayProps]
  }
}

