package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.PointExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.DivOverlayOptions because var conflicts: pane. Inlined className, offset, zoomAnimation */ trait DivOverlayProps extends MapComponentProps {
  var children: Children
  var className: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[PointExpression] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var zoomAnimation: js.UndefOr[Boolean] = js.undefined
}

object DivOverlayProps {
  @scala.inline
  def apply(
    children: Children = null,
    className: String = null,
    leaflet: LeafletContext = null,
    offset: PointExpression = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onOpen: js.UndefOr[Callback] = js.undefined,
    pane: String = null,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined
  ): DivOverlayProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivOverlayProps]
  }
}

