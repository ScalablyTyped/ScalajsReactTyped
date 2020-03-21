package typingsJapgolly.linguiMacro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.linguiMacro.reactSelectMod.PluralPropsWithoutI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PluralPropsWithoutI18n1931829570[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    value: Double | String,
    StringDictionary: /* exact */ StringDictionary[Node] = null,
    className: String = null,
    description: String = null,
    few: VdomNode = null,
    id: String = null,
    many: VdomNode = null,
    offset: Double | String = null,
    one: VdomNode = null,
    other: VdomNode = null,
    render: VdomNode = null,
    two: VdomNode = null,
    zero: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PluralPropsWithoutI18n, ComponentRef, Unit, PluralPropsWithoutI18n] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (few != null) __obj.updateDynamic("few")(few.rawNode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.rawNode.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.rawNode.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.rawNode.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.rawNode.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.rawNode.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.linguiMacro.reactSelectMod.PluralPropsWithoutI18n, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.linguiMacro.reactSelectMod.PluralPropsWithoutI18n])(children: _*)
  }
}

