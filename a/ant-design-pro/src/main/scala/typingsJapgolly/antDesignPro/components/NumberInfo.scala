package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.antDesignProStrings.down
import typingsJapgolly.antDesignPro.antDesignProStrings.up
import typingsJapgolly.antDesignPro.numberInfoMod.NumberInfoProps
import typingsJapgolly.antDesignPro.numberInfoMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NumberInfo {
  def apply(
    gap: Int | Double = null,
    status: up | down = null,
    style: CSSProperties = null,
    subTitle: Node | String = null,
    subTotal: Int | Double = null,
    suffix: String = null,
    theme: String = null,
    title: Node | String = null,
    total: Node | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NumberInfoProps, default, Unit, NumberInfoProps] = {
    val __obj = js.Dynamic.literal()
  
      if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (subTotal != null) __obj.updateDynamic("subTotal")(subTotal.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.numberInfoMod.NumberInfoProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.numberInfoMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.numberInfoMod.NumberInfoProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/NumberInfo", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

