package typingsJapgolly.popperDotJs.popperDotJsMod.Popper

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.popperDotJs.Anon_Behavior
import typingsJapgolly.popperDotJs.Anon_Bottom
import typingsJapgolly.popperDotJs.Anon_BoundariesElement
import typingsJapgolly.popperDotJs.Anon_Element
import typingsJapgolly.popperDotJs.Anon_GpuAcceleration
import typingsJapgolly.popperDotJs.Anon_Offset
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers
  extends /* name */ StringDictionary[
      js.UndefOr[
        typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with (Record[String, _])
      ]
    ] {
  var applyStyle: js.UndefOr[
    typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_GpuAcceleration
  ] = js.undefined
  var arrow: js.UndefOr[typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Element] = js.undefined
  var computeStyle: js.UndefOr[typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Bottom] = js.undefined
  var flip: js.UndefOr[
    typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Behavior
  ] = js.undefined
  var hide: js.UndefOr[typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
  var inner: js.UndefOr[typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
  var keepTogether: js.UndefOr[typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
  var offset: js.UndefOr[typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Offset] = js.undefined
  var preventOverflow: js.UndefOr[
    typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_BoundariesElement
  ] = js.undefined
  var shift: js.UndefOr[typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
}

object Modifiers {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[
      js.UndefOr[
        typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with (Record[String, _])
      ]
    ] = null,
    applyStyle: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_GpuAcceleration = null,
    arrow: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Element = null,
    computeStyle: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Bottom = null,
    flip: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Behavior = null,
    hide: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier = null,
    inner: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier = null,
    keepTogether: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier = null,
    offset: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Offset = null,
    preventOverflow: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_BoundariesElement = null,
    shift: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.BaseModifier = null
  ): Modifiers = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (applyStyle != null) __obj.updateDynamic("applyStyle")(applyStyle.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (computeStyle != null) __obj.updateDynamic("computeStyle")(computeStyle.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (keepTogether != null) __obj.updateDynamic("keepTogether")(keepTogether.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (preventOverflow != null) __obj.updateDynamic("preventOverflow")(preventOverflow.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifiers]
  }
}

