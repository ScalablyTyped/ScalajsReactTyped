package typingsJapgolly.reactNativeCollapsible.accordionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCollapsible.mod.EasingMode
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps[T] extends js.Object {
  /**
    * Control which indices in the sections array are currently open. If empty, closes all sections.
    */
  var activeSections: js.Array[Double]
  /**
    * Alignment of the content when transitioning, can be top, center or bottom
    *
    * @default top
    */
  var align: js.UndefOr[top | center | bottom] = js.undefined
  /**
    * Optional styling for the Accordion container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Controls whether user can interact with accordion
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Duration of transition in milliseconds
    *
    * @default 300
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Function or function name from Easing (or tween-functions if < RN 0.8). Collapsible will try to combine Easing functions for you if you name them like tween-functions.
    *
    * @default easeOutCubic
    */
  var easing: js.UndefOr[EasingMode | js.Any] = js.undefined
  /**
    * Expand content from the bottom instead of the top
    *
    * @default false
    */
  var expandFromBottom: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow more than one section to be expanded at a time. Defaults to false for legacy behavior.
    *
    * @default false
    */
  var expandMultiple: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that should return a renderable representing the footer
    */
  var renderFooter: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      Element
    ]
  ] = js.undefined
  /**
    * A function that should return a renderable representing the section title above the touchable
    */
  var renderSectionTitle: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      Element
    ]
  ] = js.undefined
  /**
    * Optional styling for the section container
    */
  var sectionContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * An array of sections passed to the render methods
    */
  var sections: js.Array[T]
  /**
    * Component to use for the Touchable
    *
    * @default TouchableHighlight
    */
  var touchableComponent: js.UndefOr[ComponentClassP[js.Object]] = js.undefined
  /**
    * Object of props to pass to the touchable component
    */
  var touchableProps: js.UndefOr[js.Object] = js.undefined
  /**
    * The color of the underlay that will show through when tapping on headers.
    *
    * @default black
    */
  var underlayColor: js.UndefOr[String] = js.undefined
  /**
    * A function that is called when the currently active section(s) are updated.
    */
  def onChange(indexes: js.Array[Double]): Unit
  /**
    * A function that should return a renderable representing the content
    */
  def renderContent(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): Element
  /**
    * A function that should return a renderable representing the header
    */
  def renderHeader(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): Element
}

object AccordionProps {
  @scala.inline
  def apply[T](
    activeSections: js.Array[Double],
    onChange: js.Array[Double] => Callback,
    renderContent: (T, Double, Boolean, js.Array[T]) => CallbackTo[Element],
    renderHeader: (T, Double, Boolean, js.Array[T]) => CallbackTo[Element],
    sections: js.Array[T],
    align: top | center | bottom = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: EasingMode | js.Any = null,
    expandFromBottom: js.UndefOr[Boolean] = js.undefined,
    expandMultiple: js.UndefOr[Boolean] = js.undefined,
    renderFooter: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => CallbackTo[Element] = null,
    renderSectionTitle: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => CallbackTo[Element] = null,
    sectionContainerStyle: StyleProp[ViewStyle] = null,
    touchableComponent: ComponentClassP[js.Object] = null,
    touchableProps: js.Object = null,
    underlayColor: String = null
  ): AccordionProps[T] = {
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
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction4((t0: /* content */ T, t1: /* index */ scala.Double, t2: /* isActive */ scala.Boolean, t3: /* sections */ js.Array[T]) => renderFooter(t0, t1, t2, t3).runNow()))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction4((t0: /* content */ T, t1: /* index */ scala.Double, t2: /* isActive */ scala.Boolean, t3: /* sections */ js.Array[T]) => renderSectionTitle(t0, t1, t2, t3).runNow()))
    if (sectionContainerStyle != null) __obj.updateDynamic("sectionContainerStyle")(sectionContainerStyle.asInstanceOf[js.Any])
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    if (touchableProps != null) __obj.updateDynamic("touchableProps")(touchableProps.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps[T]]
  }
}

