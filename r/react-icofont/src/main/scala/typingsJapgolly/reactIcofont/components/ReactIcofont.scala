package typingsJapgolly.reactIcofont.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactIcofont.mod.IcofontProps
import typingsJapgolly.reactIcofont.mod.default
import typingsJapgolly.reactIcofont.reactIcofontStrings.`10`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`180`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`1`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`270`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`2`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`3`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`4`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`5`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`6`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`7`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`8`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`90`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`9`
import typingsJapgolly.reactIcofont.reactIcofontStrings.h
import typingsJapgolly.reactIcofont.reactIcofontStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactIcofont {
  def apply(
    icon: String,
    className: String = null,
    flip: h | v = null,
    rotate: `90` | `180` | `270` = null,
    size: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IcofontProps, default, Unit, IcofontProps] = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactIcofont.mod.IcofontProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactIcofont.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactIcofont.mod.IcofontProps])(children: _*)
  }
  @JSImport("react-icofont", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

