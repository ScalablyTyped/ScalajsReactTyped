package typingsJapgolly.reactNativeSnapCarousel.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  /**
    * Currently focused dot
    */
  var activeDotIndex: Double
  /**
    * Opacity of the dot when tapped. The prop has no effect if tappableDots hasn't been set to true
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Reference to the Carousel component to which pagination is linked.
    * Needed only when setting tappableDots to true
    */
  var carouselRef: js.UndefOr[Component[FlatListProps[_] with js.Object, js.Object]] = js.undefined
  /**
    * Style for dots' container that will be merged with the default one
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Background color of the active dot.
    * Use this if you want to animate the change between active and inactive colors,
    * and always in conjunction with inactiveDotColor
    */
  var dotColor: js.UndefOr[String] = js.undefined
  /**
    * Style of each dot's container.
    * Use this if you need to specify styles that wouldn't have any effect when defined with dotStyle (such as flex)
    */
  var dotContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Optional custom active dot element that will replace the default one.
    * The element will receive a prop active set to true as well as a prop index
    */
  var dotElement: js.UndefOr[Node] = js.undefined
  /**
    * Dots' style that will be merged with the default one
    */
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Number of dots to display
    */
  var dotsLength: Double
  /**
    * Background color of the inactive dots.
    * Use this if you want to animate the change between active and inactive colors, and always in conjunction with dotColor
    */
  var inactiveDotColor: js.UndefOr[String] = js.undefined
  /**
    * Optional custom inactive dot element that will replace the default one.
    * The element will receive a prop active set to false as well as a prop index
    */
  var inactiveDotElement: js.UndefOr[Node] = js.undefined
  /**
    * Value of the opacity effect applied to inactive dots
    */
  var inactiveDotOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Value of the 'scale' transform applied to inactive dots
    */
  var inactiveDotScale: js.UndefOr[Double] = js.undefined
  /**
    * Dots' style that will be applied to inactive elements
    */
  var inactiveDotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Function that gives you complete control over pagination's rendering.
    * It will receive three parameters : (activeIndex, total, context).
    * This can be especially useful in order to replace dots with numbers
    */
  var renderDots: js.UndefOr[
    js.Function3[/* activeIndex */ Double, /* total */ Double, /* context */ js.Any, Node]
  ] = js.undefined
  /**
    * Make default dots tappable, e.g. your carousel will slide to the corresponding item.
    * Note that carouselRef must be specified for this to work
    */
  var tappableDots: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to layout dots vertically or horizontally
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    activeDotIndex: Double,
    dotsLength: Double,
    activeOpacity: Int | Double = null,
    carouselRef: Component[FlatListProps[_] with js.Object, js.Object] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    dotColor: String = null,
    dotContainerStyle: StyleProp[ViewStyle] = null,
    dotElement: VdomNode = null,
    dotStyle: StyleProp[ViewStyle] = null,
    inactiveDotColor: String = null,
    inactiveDotElement: VdomNode = null,
    inactiveDotOpacity: Int | Double = null,
    inactiveDotScale: Int | Double = null,
    inactiveDotStyle: StyleProp[ViewStyle] = null,
    renderDots: (/* activeIndex */ Double, /* total */ Double, /* context */ js.Any) => CallbackTo[Node] = null,
    tappableDots: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(activeDotIndex = activeDotIndex.asInstanceOf[js.Any], dotsLength = dotsLength.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (carouselRef != null) __obj.updateDynamic("carouselRef")(carouselRef.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (dotContainerStyle != null) __obj.updateDynamic("dotContainerStyle")(dotContainerStyle.asInstanceOf[js.Any])
    if (dotElement != null) __obj.updateDynamic("dotElement")(dotElement.rawNode.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (inactiveDotColor != null) __obj.updateDynamic("inactiveDotColor")(inactiveDotColor.asInstanceOf[js.Any])
    if (inactiveDotElement != null) __obj.updateDynamic("inactiveDotElement")(inactiveDotElement.rawNode.asInstanceOf[js.Any])
    if (inactiveDotOpacity != null) __obj.updateDynamic("inactiveDotOpacity")(inactiveDotOpacity.asInstanceOf[js.Any])
    if (inactiveDotScale != null) __obj.updateDynamic("inactiveDotScale")(inactiveDotScale.asInstanceOf[js.Any])
    if (inactiveDotStyle != null) __obj.updateDynamic("inactiveDotStyle")(inactiveDotStyle.asInstanceOf[js.Any])
    if (renderDots != null) __obj.updateDynamic("renderDots")(js.Any.fromFunction3((t0: /* activeIndex */ scala.Double, t1: /* total */ scala.Double, t2: /* context */ js.Any) => renderDots(t0, t1, t2).runNow()))
    if (!js.isUndefined(tappableDots)) __obj.updateDynamic("tappableDots")(tappableDots.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

