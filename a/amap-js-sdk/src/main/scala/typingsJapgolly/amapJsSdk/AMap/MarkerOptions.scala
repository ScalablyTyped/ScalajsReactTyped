package typingsJapgolly.amapJsSdk.AMap

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.amapJsSdk.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var autoRotation: js.UndefOr[Boolean] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String | HTMLElement] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var extData: js.UndefOr[js.Any] = js.undefined
  var icon: js.UndefOr[String | Icon] = js.undefined
  var label: js.UndefOr[AnonContent] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var offset: js.UndefOr[Pixel] = js.undefined
  var position: js.UndefOr[LngLat] = js.undefined
  var raiseOnDrag: js.UndefOr[Boolean] = js.undefined
  var shadow: js.UndefOr[Icon] = js.undefined
  var shape: js.UndefOr[MarkerShape] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var topWhenClick: js.UndefOr[Boolean] = js.undefined
  var topWhenMouseOver: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    animation: String = null,
    autoRotation: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    content: String | HTMLElement = null,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    extData: js.Any = null,
    icon: String | Icon = null,
    label: AnonContent = null,
    map: Map = null,
    offset: Pixel = null,
    position: LngLat = null,
    raiseOnDrag: js.UndefOr[Boolean] = js.undefined,
    shadow: Icon = null,
    shape: MarkerShape = null,
    title: String = null,
    topWhenClick: js.UndefOr[Boolean] = js.undefined,
    topWhenMouseOver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRotation)) __obj.updateDynamic("autoRotation")(autoRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(raiseOnDrag)) __obj.updateDynamic("raiseOnDrag")(raiseOnDrag.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(topWhenClick)) __obj.updateDynamic("topWhenClick")(topWhenClick.asInstanceOf[js.Any])
    if (!js.isUndefined(topWhenMouseOver)) __obj.updateDynamic("topWhenMouseOver")(topWhenMouseOver.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

