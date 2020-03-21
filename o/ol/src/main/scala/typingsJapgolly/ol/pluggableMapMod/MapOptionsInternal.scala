package typingsJapgolly.ol.pluggableMapMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptionsInternal extends js.Object {
  var controls: js.UndefOr[
    typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default]
  ] = js.undefined
  var interactions: js.UndefOr[
    typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default]
  ] = js.undefined
  var keyboardEventTarget: HTMLElement | Document_
  var overlays: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default]
  var values: StringDictionary[js.Any]
}

object MapOptionsInternal {
  @scala.inline
  def apply(
    keyboardEventTarget: HTMLElement | Document_,
    overlays: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.overlayMod.default],
    values: StringDictionary[js.Any],
    controls: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] = null,
    interactions: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.interactionInteractionMod.default] = null
  ): MapOptionsInternal = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (interactions != null) __obj.updateDynamic("interactions")(interactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptionsInternal]
  }
}

