package typingsJapgolly.openlayers.mod.olx

import org.scalajs.dom.raw.Element
import typingsJapgolly.openlayers.mod.Collection
import typingsJapgolly.openlayers.mod.Overlay
import typingsJapgolly.openlayers.mod.RendererType
import typingsJapgolly.openlayers.mod.View
import typingsJapgolly.openlayers.mod.control.Control
import typingsJapgolly.openlayers.mod.interaction.Interaction
import typingsJapgolly.openlayers.mod.layer.Base
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the map.
  */
trait MapOptions extends js.Object {
  var controls: js.UndefOr[Collection[Control] | js.Array[Control]] = js.undefined
  var interactions: js.UndefOr[Collection[Interaction] | js.Array[Interaction]] = js.undefined
  var keyboardEventTarget: js.UndefOr[Element | Document_ | String] = js.undefined
  var layers: js.UndefOr[js.Array[Base] | Collection[Base]] = js.undefined
  var loadTilesWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var loadTilesWhileInteracting: js.UndefOr[Boolean] = js.undefined
  var logo: js.UndefOr[Boolean | String | LogoOptions | Element] = js.undefined
  var moveTolerance: js.UndefOr[Double] = js.undefined
  var overlays: js.UndefOr[Collection[Overlay] | js.Array[Overlay]] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var renderer: js.UndefOr[RendererType | (js.Array[RendererType | String]) | String] = js.undefined
  var target: js.UndefOr[Element | String] = js.undefined
  var view: js.UndefOr[View] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    controls: Collection[Control] | js.Array[Control] = null,
    interactions: Collection[Interaction] | js.Array[Interaction] = null,
    keyboardEventTarget: Element | Document_ | String = null,
    layers: js.Array[Base] | Collection[Base] = null,
    loadTilesWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    loadTilesWhileInteracting: js.UndefOr[Boolean] = js.undefined,
    logo: Boolean | String | LogoOptions | Element = null,
    moveTolerance: Int | Double = null,
    overlays: Collection[Overlay] | js.Array[Overlay] = null,
    pixelRatio: Int | Double = null,
    renderer: RendererType | (js.Array[RendererType | String]) | String = null,
    target: Element | String = null,
    view: View = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (interactions != null) __obj.updateDynamic("interactions")(interactions.asInstanceOf[js.Any])
    if (keyboardEventTarget != null) __obj.updateDynamic("keyboardEventTarget")(keyboardEventTarget.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(loadTilesWhileAnimating)) __obj.updateDynamic("loadTilesWhileAnimating")(loadTilesWhileAnimating.asInstanceOf[js.Any])
    if (!js.isUndefined(loadTilesWhileInteracting)) __obj.updateDynamic("loadTilesWhileInteracting")(loadTilesWhileInteracting.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (moveTolerance != null) __obj.updateDynamic("moveTolerance")(moveTolerance.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

