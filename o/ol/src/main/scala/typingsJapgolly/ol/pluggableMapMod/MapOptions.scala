package typingsJapgolly.ol.pluggableMapMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var controls: js.UndefOr[
    typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] | js.Array[typingsJapgolly.ol.controlControlMod.default]
  ] = js.undefined
  var interactions: js.UndefOr[
    typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default] | js.Array[typingsJapgolly.ol.interactionInteractionMod.default]
  ] = js.undefined
  var keyboardEventTarget: js.UndefOr[HTMLElement | Document_ | String] = js.undefined
  var layers: js.UndefOr[
    js.Array[typingsJapgolly.ol.baseMod.default] | typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.baseMod.default] | typingsJapgolly.ol.groupMod.default
  ] = js.undefined
  var maxTilesLoading: js.UndefOr[Double] = js.undefined
  var moveTolerance: js.UndefOr[Double] = js.undefined
  var overlays: js.UndefOr[
    typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default] | js.Array[typingsJapgolly.ol.overlayMod.default]
  ] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var view: js.UndefOr[typingsJapgolly.ol.viewMod.default] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    controls: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] | js.Array[typingsJapgolly.ol.controlControlMod.default] = null,
    interactions: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default] | js.Array[typingsJapgolly.ol.interactionInteractionMod.default] = null,
    keyboardEventTarget: HTMLElement | Document_ | String = null,
    layers: js.Array[typingsJapgolly.ol.baseMod.default] | typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.baseMod.default] | typingsJapgolly.ol.groupMod.default = null,
    maxTilesLoading: Int | Double = null,
    moveTolerance: Int | Double = null,
    overlays: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default] | js.Array[typingsJapgolly.ol.overlayMod.default] = null,
    pixelRatio: Int | Double = null,
    target: HTMLElement | String = null,
    view: typingsJapgolly.ol.viewMod.default = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (interactions != null) __obj.updateDynamic("interactions")(interactions.asInstanceOf[js.Any])
    if (keyboardEventTarget != null) __obj.updateDynamic("keyboardEventTarget")(keyboardEventTarget.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (maxTilesLoading != null) __obj.updateDynamic("maxTilesLoading")(maxTilesLoading.asInstanceOf[js.Any])
    if (moveTolerance != null) __obj.updateDynamic("moveTolerance")(moveTolerance.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

