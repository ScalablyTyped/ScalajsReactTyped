package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameFixedWidth
import typingsJapgolly.reactOnsenui.mod.ModifiersNumber
import typingsJapgolly.reactOnsenui.mod.ModifiersString
import typingsJapgolly.reactOnsenui.reactOnsenuiNumbers.`180`
import typingsJapgolly.reactOnsenui.reactOnsenuiNumbers.`270`
import typingsJapgolly.reactOnsenui.reactOnsenuiNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Icon {
  def apply(
    className: String = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    icon: String | ModifiersString = null,
    id: String = null,
    modifier: String = null,
    rotate: `90` | `180` | `270` = null,
    size: Double | ModifiersNumber = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameFixedWidth, 
    typingsJapgolly.reactOnsenui.mod.Icon, 
    Unit, 
    HTMLAttributesidclassNameFixedWidth
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameFixedWidth, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.Icon](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameFixedWidth])(children: _*)
  }
  @JSImport("react-onsenui", "Icon")
  @js.native
  object componentImport extends js.Object
  
}

