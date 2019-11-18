package typingsJapgolly.materialDashUi.internalScaleInMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.Key
import typingsJapgolly.react.reactMod.LegacyRef
import typingsJapgolly.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleInProps extends Props[ScaleIn] {
  var childStyle: js.UndefOr[CSSProperties] = js.undefined
  var enterDelay: js.UndefOr[Double] = js.undefined
  var maxScale: js.UndefOr[Double] = js.undefined
  var minScale: js.UndefOr[Double] = js.undefined
}

object ScaleInProps {
  @scala.inline
  def apply(
    childStyle: CSSProperties = null,
    children: VdomNode = null,
    enterDelay: Int | Double = null,
    key: Key = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    ref: LegacyRef[ScaleIn] = null
  ): ScaleInProps = {
    val __obj = js.Dynamic.literal()
    if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInProps]
  }
}

