package typingsJapgolly.antDesignReactNative.paginationMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignReactNative.AnonNextText
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.button
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.number
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.pointer
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.antDesignReactNative.paginationPropsTypeMod.PaginationPropsType
import typingsJapgolly.antDesignReactNative.paginationStyleMod.PaginationStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationNativeProps
  extends PaginationPropsType
     with WithThemeStyles[PaginationStyle] {
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var locale: js.UndefOr[AnonNextText] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PaginationNativeProps {
  @scala.inline
  def apply(
    current: Double,
    total: Double,
    indicatorStyle: StyleProp[ViewStyle] = null,
    locale: AnonNextText = null,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Callback = null,
    onNext: js.UndefOr[Callback] = js.undefined,
    onPrev: js.UndefOr[Callback] = js.undefined,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[PaginationStyle] = null
  ): PaginationNativeProps = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* current */ scala.Double) => onChange(t0).runNow()))
    onNext.foreach(p => __obj.updateDynamic("onNext")(p.toJsFn))
    onPrev.foreach(p => __obj.updateDynamic("onPrev")(p.toJsFn))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationNativeProps]
  }
}

