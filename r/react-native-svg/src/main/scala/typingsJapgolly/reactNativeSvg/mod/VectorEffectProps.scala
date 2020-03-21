package typingsJapgolly.reactNativeSvg.mod

import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.`non-scaling-stroke`
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.inherit
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.nonScalingStroke
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.none
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorEffectProps extends js.Object {
  var vectorEffect: js.UndefOr[
    none | `non-scaling-stroke` | nonScalingStroke | typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.default | inherit | uri
  ] = js.undefined
}

object VectorEffectProps {
  @scala.inline
  def apply(
    vectorEffect: none | `non-scaling-stroke` | nonScalingStroke | typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.default | inherit | uri = null
  ): VectorEffectProps = {
    val __obj = js.Dynamic.literal()
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorEffectProps]
  }
}

