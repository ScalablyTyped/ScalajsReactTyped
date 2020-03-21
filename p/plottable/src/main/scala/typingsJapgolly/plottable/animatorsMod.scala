package typingsJapgolly.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/animators", JSImport.Namespace)
@js.native
object animatorsMod extends js.Object {
  @js.native
  /**
    * Constructs the default animator
    *
    * @constructor
    */
  class Easing ()
    extends typingsJapgolly.plottable.easingAnimatorMod.Easing
  
  @js.native
  class Null ()
    extends typingsJapgolly.plottable.nullAnimatorMod.Null
  
  @js.native
  object EaseName extends js.Object {
    var back: typingsJapgolly.plottable.plottableStrings.back = js.native
    var backIn: typingsJapgolly.plottable.plottableStrings.backIn = js.native
    var backInOut: typingsJapgolly.plottable.plottableStrings.backInOut = js.native
    var backOut: typingsJapgolly.plottable.plottableStrings.backOut = js.native
    var bounce: typingsJapgolly.plottable.plottableStrings.bounce = js.native
    var bounceIn: typingsJapgolly.plottable.plottableStrings.bounceIn = js.native
    var bounceInOut: typingsJapgolly.plottable.plottableStrings.bounceInOut = js.native
    var bounceOut: typingsJapgolly.plottable.plottableStrings.bounceOut = js.native
    var circle: typingsJapgolly.plottable.plottableStrings.circle = js.native
    var circleIn: typingsJapgolly.plottable.plottableStrings.circleIn = js.native
    var circleInOut: typingsJapgolly.plottable.plottableStrings.circleInOut = js.native
    var circleOut: typingsJapgolly.plottable.plottableStrings.circleOut = js.native
    var cubic: typingsJapgolly.plottable.plottableStrings.cubic = js.native
    var cubicIn: typingsJapgolly.plottable.plottableStrings.cubicIn = js.native
    var cubicInOut: typingsJapgolly.plottable.plottableStrings.cubicInOut = js.native
    var cubicOut: typingsJapgolly.plottable.plottableStrings.cubicOut = js.native
    var elastic: typingsJapgolly.plottable.plottableStrings.elastic = js.native
    var elasticIn: typingsJapgolly.plottable.plottableStrings.elasticIn = js.native
    var elasticInOut: typingsJapgolly.plottable.plottableStrings.elasticInOut = js.native
    var elasticOut: typingsJapgolly.plottable.plottableStrings.elasticOut = js.native
    var exp: typingsJapgolly.plottable.plottableStrings.exp = js.native
    var expIn: typingsJapgolly.plottable.plottableStrings.expIn = js.native
    var expInOut: typingsJapgolly.plottable.plottableStrings.expInOut = js.native
    var expOut: typingsJapgolly.plottable.plottableStrings.expOut = js.native
    var linear: typingsJapgolly.plottable.plottableStrings.linear = js.native
    var poly: typingsJapgolly.plottable.plottableStrings.poly = js.native
    var polyIn: typingsJapgolly.plottable.plottableStrings.polyIn = js.native
    var polyInOut: typingsJapgolly.plottable.plottableStrings.polyInOut = js.native
    var polyOut: typingsJapgolly.plottable.plottableStrings.polyOut = js.native
    var quad: typingsJapgolly.plottable.plottableStrings.quad = js.native
    var quadIn: typingsJapgolly.plottable.plottableStrings.quadIn = js.native
    var quadInOut: typingsJapgolly.plottable.plottableStrings.quadInOut = js.native
    var quadOut: typingsJapgolly.plottable.plottableStrings.quadOut = js.native
    var sin: typingsJapgolly.plottable.plottableStrings.sin = js.native
    var sinIn: typingsJapgolly.plottable.plottableStrings.sinIn = js.native
    var sinInOut: typingsJapgolly.plottable.plottableStrings.sinInOut = js.native
    var sinOut: typingsJapgolly.plottable.plottableStrings.sinOut = js.native
  }
  
  /* static members */
  @js.native
  object Easing extends js.Object {
    /**
      * The default easing of the animation
      */
    var _DEFAULT_EASING_MODE: js.Any = js.native
    /**
      * The default maximum start delay between each step of an animation
      */
    var _DEFAULT_ITERATIVE_DELAY_MILLISECONDS: js.Any = js.native
    /**
      * The default maximum total animation duration
      */
    var _DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS: js.Any = js.native
    /**
      * The default starting delay of the animation in milliseconds
      */
    var _DEFAULT_START_DELAY_MILLISECONDS: js.Any = js.native
    /**
      * The default duration of one animation step in milliseconds
      */
    var _DEFAULT_STEP_DURATION_MILLISECONDS: js.Any = js.native
  }
  
}

