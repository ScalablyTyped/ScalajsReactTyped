package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.reactDashNative.Anon_Animated
import typingsJapgolly.reactDashNative.Anon_AnimatedBoolean_1238086454
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin */ @JSImport("react-native", "ScrollView")
@js.native
class ScrollView ()
  extends Component[ScrollViewProps, js.Object, js.Any] {
  /**
    * @deprecated Use scrollTo instead
    */
  var scrollWithoutAnimationTo: js.UndefOr[js.Function2[/* y */ Double, /* x */ Double, Unit]] = js.native
  // Undocumented
  def getInnerViewNode(): js.Any = js.native
  /**
    * Returns a reference to the underlying scroll responder, which supports
    * operations like `scrollTo`. All ScrollView-like components should
    * implement this method so that they can be composed while providing access
    * to the underlying scroll responder's methods.
    */
  def getScrollResponder(): Element = js.native
  def getScrollableNode(): js.Any = js.native
  /**
    * Scrolls to a given x, y offset, either immediately or with a smooth animation.
    * Syntax:
    *
    * scrollTo(options: {x: number = 0; y: number = 0; animated: boolean = true})
    *
    * Note: The weird argument signature is due to the fact that, for historical reasons,
    * the function also accepts separate arguments as as alternative to the options object.
    * This is deprecated due to ambiguity (y before x), and SHOULD NOT BE USED.
    */
  def scrollTo(): Unit = js.native
  def scrollTo(y: Double): Unit = js.native
  def scrollTo(y: Double, x: Double): Unit = js.native
  def scrollTo(y: Double, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: Anon_Animated): Unit = js.native
  def scrollTo(y: Anon_Animated, x: Double): Unit = js.native
  def scrollTo(y: Anon_Animated, x: Double, animated: Boolean): Unit = js.native
  /**
    * A helper function that scrolls to the end of the scrollview;
    * If this is a vertical ScrollView, it scrolls to the bottom.
    * If this is a horizontal ScrollView scrolls to the right.
    *
    * The options object has an animated prop, that enables the scrolling animation or not.
    * The animated prop defaults to true
    */
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(options: Anon_AnimatedBoolean_1238086454): Unit = js.native
}

