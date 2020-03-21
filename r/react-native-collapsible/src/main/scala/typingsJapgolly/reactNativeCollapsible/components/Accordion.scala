package typingsJapgolly.reactNativeCollapsible.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCollapsible.accordionMod.AccordionProps
import typingsJapgolly.reactNativeCollapsible.accordionMod.default
import typingsJapgolly.reactNativeCollapsible.mod.EasingMode
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion {
  def apply[T](
    activeSections: js.Array[Double],
    sections: js.Array[T],
    onChange: js.Array[Double] => Callback,
    renderContent: (T, Double, Boolean, js.Array[T]) => CallbackTo[Element],
    renderHeader: (T, Double, Boolean, js.Array[T]) => CallbackTo[Element],
    align: top | center | bottom = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: EasingMode | js.Any = null,
    expandFromBottom: js.UndefOr[Boolean] = js.undefined,
    expandMultiple: js.UndefOr[Boolean] = js.undefined,
    renderFooter: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => CallbackTo[Element] = null,
    renderSectionTitle: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => CallbackTo[Element] = null,
    sectionContainerStyle: StyleProp[ViewStyle] = null,
    touchableComponent: ComponentClassP[js.Object] = null,
    touchableProps: js.Object = null,
    underlayColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AccordionProps[T], default[T], Unit, AccordionProps[T]] = {
    val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => onChange(t0).runNow()))
    __obj.updateDynamic("renderContent")(js.Any.fromFunction4((t0: T, t1: scala.Double, t2: scala.Boolean, t3: js.Array[T]) => renderContent(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("renderHeader")(js.Any.fromFunction4((t0: T, t1: scala.Double, t2: scala.Boolean, t3: js.Array[T]) => renderHeader(t0, t1, t2, t3).runNow()))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(expandFromBottom)) __obj.updateDynamic("expandFromBottom")(expandFromBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(expandMultiple)) __obj.updateDynamic("expandMultiple")(expandMultiple.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction4((t0: T, t1: /* index */ scala.Double, t2: /* isActive */ scala.Boolean, t3: /* sections */ js.Array[T]) => renderFooter(t0, t1, t2, t3).runNow()))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction4((t0: T, t1: /* index */ scala.Double, t2: /* isActive */ scala.Boolean, t3: /* sections */ js.Array[T]) => renderSectionTitle(t0, t1, t2, t3).runNow()))
    if (sectionContainerStyle != null) __obj.updateDynamic("sectionContainerStyle")(sectionContainerStyle.asInstanceOf[js.Any])
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    if (touchableProps != null) __obj.updateDynamic("touchableProps")(touchableProps.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeCollapsible.accordionMod.AccordionProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeCollapsible.accordionMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeCollapsible.accordionMod.AccordionProps[T]])(children: _*)
  }
  @JSImport("react-native-collapsible/Accordion", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

