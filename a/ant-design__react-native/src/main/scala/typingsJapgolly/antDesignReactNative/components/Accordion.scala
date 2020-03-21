package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.PartialAccordionStyle
import typingsJapgolly.antDesignReactNative.accordionMod.AccordionHeader
import typingsJapgolly.antDesignReactNative.accordionMod.AccordionNativeProps
import typingsJapgolly.antDesignReactNative.accordionMod.default
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.center
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.top
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCollapsible.mod.EasingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion {
  def apply[T /* <: AccordionHeader */](
    activeSections: js.Array[Double] = null,
    align: top | center | bottom = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: EasingMode | js.Any = null,
    expandFromBottom: js.UndefOr[Boolean] = js.undefined,
    expandMultiple: js.UndefOr[Boolean] = js.undefined,
    onChange: /* indexes */ js.Array[Double] => Callback = null,
    renderContent: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => CallbackTo[Element] = null,
    renderFooter: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => CallbackTo[Element] = null,
    renderHeader: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => CallbackTo[Element] = null,
    renderSectionTitle: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => CallbackTo[Element] = null,
    sectionContainerStyle: StyleProp[ViewStyle] = null,
    sections: js.Array[T] = null,
    style: StyleProp[ViewStyle] = null,
    styles: PartialAccordionStyle = null,
    touchableComponent: ComponentClassP[js.Object] = null,
    touchableProps: js.Object = null,
    underlayColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AccordionNativeProps[T], default[T], Unit, AccordionNativeProps[T]] = {
    val __obj = js.Dynamic.literal()
  
      if (activeSections != null) __obj.updateDynamic("activeSections")(activeSections.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(expandFromBottom)) __obj.updateDynamic("expandFromBottom")(expandFromBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(expandMultiple)) __obj.updateDynamic("expandMultiple")(expandMultiple.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* indexes */ js.Array[scala.Double]) => onChange(t0).runNow()))
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction4((t0: T, t1: /* index */ scala.Double, t2: /* isActive */ scala.Boolean, t3: /* sections */ js.Array[T]) => renderContent(t0, t1, t2, t3).runNow()))
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction4((t0: T, t1: /* index */ scala.Double, t2: /* isActive */ scala.Boolean, t3: /* sections */ js.Array[T]) => renderFooter(t0, t1, t2, t3).runNow()))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction4((t0: T, t1: /* index */ scala.Double, t2: /* isActive */ scala.Boolean, t3: /* sections */ js.Array[T]) => renderHeader(t0, t1, t2, t3).runNow()))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction4((t0: T, t1: /* index */ scala.Double, t2: /* isActive */ scala.Boolean, t3: /* sections */ js.Array[T]) => renderSectionTitle(t0, t1, t2, t3).runNow()))
    if (sectionContainerStyle != null) __obj.updateDynamic("sectionContainerStyle")(sectionContainerStyle.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    if (touchableProps != null) __obj.updateDynamic("touchableProps")(touchableProps.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.accordionMod.AccordionNativeProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.accordionMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.accordionMod.AccordionNativeProps[T]])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/accordion", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

