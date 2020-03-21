package typingsJapgolly.materialUi.MaterialUI

import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.react.mod.Props because var conflicts: children. Inlined key, ref */ trait SvgIconProps
  extends SVGAttributes[js.Object] {
  var hoverColor: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var ref: js.UndefOr[LegacyRef[SvgIcon]] = js.undefined
}

object SvgIconProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[js.Object] = null,
    hoverColor: String = null,
    key: Key = null,
    ref: LegacyRef[SvgIcon] = null
  ): SvgIconProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconProps]
  }
}

