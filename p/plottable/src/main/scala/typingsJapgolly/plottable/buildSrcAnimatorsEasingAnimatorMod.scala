package typingsJapgolly.plottable

import typingsJapgolly.d3Transition.mod.Transition_
import typingsJapgolly.plottable.buildSrcAnimatorsAnimatorMod.IAnimator
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import typingsJapgolly.plottable.plottableStrings.back
import typingsJapgolly.plottable.plottableStrings.backIn
import typingsJapgolly.plottable.plottableStrings.backInOut
import typingsJapgolly.plottable.plottableStrings.backOut
import typingsJapgolly.plottable.plottableStrings.bounce
import typingsJapgolly.plottable.plottableStrings.bounceIn
import typingsJapgolly.plottable.plottableStrings.bounceInOut
import typingsJapgolly.plottable.plottableStrings.bounceOut
import typingsJapgolly.plottable.plottableStrings.circle
import typingsJapgolly.plottable.plottableStrings.circleIn
import typingsJapgolly.plottable.plottableStrings.circleInOut
import typingsJapgolly.plottable.plottableStrings.circleOut
import typingsJapgolly.plottable.plottableStrings.cubic
import typingsJapgolly.plottable.plottableStrings.cubicIn
import typingsJapgolly.plottable.plottableStrings.cubicInOut
import typingsJapgolly.plottable.plottableStrings.cubicOut
import typingsJapgolly.plottable.plottableStrings.elastic
import typingsJapgolly.plottable.plottableStrings.elasticIn
import typingsJapgolly.plottable.plottableStrings.elasticInOut
import typingsJapgolly.plottable.plottableStrings.elasticOut
import typingsJapgolly.plottable.plottableStrings.exp
import typingsJapgolly.plottable.plottableStrings.expIn
import typingsJapgolly.plottable.plottableStrings.expInOut
import typingsJapgolly.plottable.plottableStrings.expOut
import typingsJapgolly.plottable.plottableStrings.linear
import typingsJapgolly.plottable.plottableStrings.poly
import typingsJapgolly.plottable.plottableStrings.polyIn
import typingsJapgolly.plottable.plottableStrings.polyInOut
import typingsJapgolly.plottable.plottableStrings.polyOut
import typingsJapgolly.plottable.plottableStrings.quad
import typingsJapgolly.plottable.plottableStrings.quadIn
import typingsJapgolly.plottable.plottableStrings.quadInOut
import typingsJapgolly.plottable.plottableStrings.quadOut
import typingsJapgolly.plottable.plottableStrings.sin
import typingsJapgolly.plottable.plottableStrings.sinIn
import typingsJapgolly.plottable.plottableStrings.sinInOut
import typingsJapgolly.plottable.plottableStrings.sinOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAnimatorsEasingAnimatorMod {
  
  /* keyof plottable.anon.Back */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.plottable.plottableStrings.linear
    - typingsJapgolly.plottable.plottableStrings.circle
    - typingsJapgolly.plottable.plottableStrings.quad
    - typingsJapgolly.plottable.plottableStrings.quadIn
    - typingsJapgolly.plottable.plottableStrings.quadOut
    - typingsJapgolly.plottable.plottableStrings.quadInOut
    - typingsJapgolly.plottable.plottableStrings.cubic
    - typingsJapgolly.plottable.plottableStrings.cubicIn
    - typingsJapgolly.plottable.plottableStrings.cubicOut
    - typingsJapgolly.plottable.plottableStrings.cubicInOut
    - typingsJapgolly.plottable.plottableStrings.poly
    - typingsJapgolly.plottable.plottableStrings.polyIn
    - typingsJapgolly.plottable.plottableStrings.polyOut
    - typingsJapgolly.plottable.plottableStrings.polyInOut
    - typingsJapgolly.plottable.plottableStrings.sin
    - typingsJapgolly.plottable.plottableStrings.sinIn
    - typingsJapgolly.plottable.plottableStrings.sinOut
    - typingsJapgolly.plottable.plottableStrings.sinInOut
    - typingsJapgolly.plottable.plottableStrings.exp
    - typingsJapgolly.plottable.plottableStrings.expIn
    - typingsJapgolly.plottable.plottableStrings.expOut
    - typingsJapgolly.plottable.plottableStrings.expInOut
    - typingsJapgolly.plottable.plottableStrings.circleIn
    - typingsJapgolly.plottable.plottableStrings.circleOut
    - typingsJapgolly.plottable.plottableStrings.circleInOut
    - typingsJapgolly.plottable.plottableStrings.bounce
    - typingsJapgolly.plottable.plottableStrings.bounceIn
    - typingsJapgolly.plottable.plottableStrings.bounceOut
    - typingsJapgolly.plottable.plottableStrings.bounceInOut
    - typingsJapgolly.plottable.plottableStrings.back
    - typingsJapgolly.plottable.plottableStrings.backIn
    - typingsJapgolly.plottable.plottableStrings.backOut
    - typingsJapgolly.plottable.plottableStrings.backInOut
    - typingsJapgolly.plottable.plottableStrings.elastic
    - typingsJapgolly.plottable.plottableStrings.elasticIn
    - typingsJapgolly.plottable.plottableStrings.elasticOut
    - typingsJapgolly.plottable.plottableStrings.elasticInOut
  */
  trait EaseName extends StObject
  object EaseName {
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.back")
    @js.native
    def back: typingsJapgolly.plottable.plottableStrings.back = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.backIn")
    @js.native
    def backIn: typingsJapgolly.plottable.plottableStrings.backIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.backInOut")
    @js.native
    def backInOut: typingsJapgolly.plottable.plottableStrings.backInOut = js.native
    inline def backInOut_=(x: backInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backInOut")(x.asInstanceOf[js.Any])
    
    inline def backIn_=(x: backIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.backOut")
    @js.native
    def backOut: typingsJapgolly.plottable.plottableStrings.backOut = js.native
    inline def backOut_=(x: backOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backOut")(x.asInstanceOf[js.Any])
    
    inline def back_=(x: back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("back")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.bounce")
    @js.native
    def bounce: typingsJapgolly.plottable.plottableStrings.bounce = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.bounceIn")
    @js.native
    def bounceIn: typingsJapgolly.plottable.plottableStrings.bounceIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.bounceInOut")
    @js.native
    def bounceInOut: typingsJapgolly.plottable.plottableStrings.bounceInOut = js.native
    inline def bounceInOut_=(x: bounceInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounceInOut")(x.asInstanceOf[js.Any])
    
    inline def bounceIn_=(x: bounceIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounceIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.bounceOut")
    @js.native
    def bounceOut: typingsJapgolly.plottable.plottableStrings.bounceOut = js.native
    inline def bounceOut_=(x: bounceOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounceOut")(x.asInstanceOf[js.Any])
    
    inline def bounce_=(x: bounce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounce")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.circle")
    @js.native
    def circle: typingsJapgolly.plottable.plottableStrings.circle = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.circleIn")
    @js.native
    def circleIn: typingsJapgolly.plottable.plottableStrings.circleIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.circleInOut")
    @js.native
    def circleInOut: typingsJapgolly.plottable.plottableStrings.circleInOut = js.native
    inline def circleInOut_=(x: circleInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circleInOut")(x.asInstanceOf[js.Any])
    
    inline def circleIn_=(x: circleIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circleIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.circleOut")
    @js.native
    def circleOut: typingsJapgolly.plottable.plottableStrings.circleOut = js.native
    inline def circleOut_=(x: circleOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circleOut")(x.asInstanceOf[js.Any])
    
    inline def circle_=(x: circle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.cubic")
    @js.native
    def cubic: typingsJapgolly.plottable.plottableStrings.cubic = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.cubicIn")
    @js.native
    def cubicIn: typingsJapgolly.plottable.plottableStrings.cubicIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.cubicInOut")
    @js.native
    def cubicInOut: typingsJapgolly.plottable.plottableStrings.cubicInOut = js.native
    inline def cubicInOut_=(x: cubicInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubicInOut")(x.asInstanceOf[js.Any])
    
    inline def cubicIn_=(x: cubicIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubicIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.cubicOut")
    @js.native
    def cubicOut: typingsJapgolly.plottable.plottableStrings.cubicOut = js.native
    inline def cubicOut_=(x: cubicOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubicOut")(x.asInstanceOf[js.Any])
    
    inline def cubic_=(x: cubic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubic")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.elastic")
    @js.native
    def elastic: typingsJapgolly.plottable.plottableStrings.elastic = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.elasticIn")
    @js.native
    def elasticIn: typingsJapgolly.plottable.plottableStrings.elasticIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.elasticInOut")
    @js.native
    def elasticInOut: typingsJapgolly.plottable.plottableStrings.elasticInOut = js.native
    inline def elasticInOut_=(x: elasticInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elasticInOut")(x.asInstanceOf[js.Any])
    
    inline def elasticIn_=(x: elasticIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elasticIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.elasticOut")
    @js.native
    def elasticOut: typingsJapgolly.plottable.plottableStrings.elasticOut = js.native
    inline def elasticOut_=(x: elasticOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elasticOut")(x.asInstanceOf[js.Any])
    
    inline def elastic_=(x: elastic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elastic")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.exp")
    @js.native
    def exp: typingsJapgolly.plottable.plottableStrings.exp = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.expIn")
    @js.native
    def expIn: typingsJapgolly.plottable.plottableStrings.expIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.expInOut")
    @js.native
    def expInOut: typingsJapgolly.plottable.plottableStrings.expInOut = js.native
    inline def expInOut_=(x: expInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expInOut")(x.asInstanceOf[js.Any])
    
    inline def expIn_=(x: expIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.expOut")
    @js.native
    def expOut: typingsJapgolly.plottable.plottableStrings.expOut = js.native
    inline def expOut_=(x: expOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expOut")(x.asInstanceOf[js.Any])
    
    inline def exp_=(x: exp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exp")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.linear")
    @js.native
    def linear: typingsJapgolly.plottable.plottableStrings.linear = js.native
    inline def linear_=(x: linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.poly")
    @js.native
    def poly: typingsJapgolly.plottable.plottableStrings.poly = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.polyIn")
    @js.native
    def polyIn: typingsJapgolly.plottable.plottableStrings.polyIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.polyInOut")
    @js.native
    def polyInOut: typingsJapgolly.plottable.plottableStrings.polyInOut = js.native
    inline def polyInOut_=(x: polyInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyInOut")(x.asInstanceOf[js.Any])
    
    inline def polyIn_=(x: polyIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.polyOut")
    @js.native
    def polyOut: typingsJapgolly.plottable.plottableStrings.polyOut = js.native
    inline def polyOut_=(x: polyOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyOut")(x.asInstanceOf[js.Any])
    
    inline def poly_=(x: poly): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("poly")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.quad")
    @js.native
    def quad: typingsJapgolly.plottable.plottableStrings.quad = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.quadIn")
    @js.native
    def quadIn: typingsJapgolly.plottable.plottableStrings.quadIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.quadInOut")
    @js.native
    def quadInOut: typingsJapgolly.plottable.plottableStrings.quadInOut = js.native
    inline def quadInOut_=(x: quadInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quadInOut")(x.asInstanceOf[js.Any])
    
    inline def quadIn_=(x: quadIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quadIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.quadOut")
    @js.native
    def quadOut: typingsJapgolly.plottable.plottableStrings.quadOut = js.native
    inline def quadOut_=(x: quadOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quadOut")(x.asInstanceOf[js.Any])
    
    inline def quad_=(x: quad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quad")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.sin")
    @js.native
    def sin: typingsJapgolly.plottable.plottableStrings.sin = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.sinIn")
    @js.native
    def sinIn: typingsJapgolly.plottable.plottableStrings.sinIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.sinInOut")
    @js.native
    def sinInOut: typingsJapgolly.plottable.plottableStrings.sinInOut = js.native
    inline def sinInOut_=(x: sinInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sinInOut")(x.asInstanceOf[js.Any])
    
    inline def sinIn_=(x: sinIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sinIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.sinOut")
    @js.native
    def sinOut: typingsJapgolly.plottable.plottableStrings.sinOut = js.native
    inline def sinOut_=(x: sinOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sinOut")(x.asInstanceOf[js.Any])
    
    inline def sin_=(x: sin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sin")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/animators/easingAnimator", "Easing")
  @js.native
  /**
    * Constructs the default animator
    *
    * @constructor
    */
  open class Easing ()
    extends StObject
       with IAnimator {
    
    /* private */ var _easingMode: Any = js.native
    
    /**
      * Adjust the iterative delay, such that it takes into account the maxTotalDuration constraint
      */
    /* private */ var _getAdjustedIterativeDelay: Any = js.native
    
    /* protected */ def _getEaseFactory(): EaseFn = js.native
    
    /* private */ var _maxTotalDuration: Any = js.native
    
    /* private */ var _startDelay: Any = js.native
    
    /* private */ var _stepDelay: Any = js.native
    
    /* private */ var _stepDuration: Any = js.native
    
    /**
      * Applies the supplied attributes to a d3.Selection with some animation.
      *
      * @param {d3.Selection} selection The update selection or transition selection that we wish to animate.
      * @param {AttributeToAppliedProjector} attrToAppliedProjector The set of
      *     AppliedProjectors that we will use to set attributes on the selection.
      * @return {any} Animators should return the selection or
      *     transition object so that plots may chain the transitions between
      *     animators.
      */
    /* CompleteClass */
    override def animate(selection: SimpleSelection[Any], attrToAppliedProjector: AttributeToAppliedProjector): SimpleSelection[Any] | (Transition_[Any, Any, Any, Any]) = js.native
    
    /**
      * Gets the current easing mode of the animation.
      *
      * @returns {string} the current easing mode.
      */
    def easingMode(): EaseName | EaseFn = js.native
    def easingMode(easingMode: EaseFn): this.type = js.native
    /**
      * Sets the easing mode of the animation.
      *
      * @param {string} easingMode The desired easing mode.
      * @returns {Easing} The calling Easing Animator.
      */
    def easingMode(easingMode: EaseName): this.type = js.native
    
    /**
      * Gets the maximum total animation duration constraint in milliseconds.
      *
      * If the animation time would exceed the specified time, the duration of each step
      * and the delay between each step will be reduced until the animation fits within
      * the specified time.
      *
      * @returns {number} The current maximum total animation duration.
      */
    def maxTotalDuration(): Double = js.native
    /**
      * Sets the maximum total animation duration constraint in miliseconds.
      *
      * If the animation time would exceed the specified time, the duration of each step
      * and the delay between each step will be reduced until the animation fits within
      * the specified time.
      *
      * @param {number} maxTotalDuration The maximum total animation duration in milliseconds.
      * @returns {Easing} The calling Easing Animator.
      */
    def maxTotalDuration(maxTotalDuration: Double): this.type = js.native
    
    /**
      * Gets the start delay of the animation in milliseconds.
      *
      * @returns {number} The current start delay.
      */
    def startDelay(): Double = js.native
    /**
      * Sets the start delay of the animation in milliseconds.
      *
      * @param {number} startDelay The start delay in milliseconds.
      * @returns {Easing} The calling Easing Animator.
      */
    def startDelay(startDelay: Double): this.type = js.native
    
    /**
      * Gets the maximum start delay between animation steps in milliseconds.
      *
      * @returns {number} The current maximum iterative delay.
      */
    def stepDelay(): Double = js.native
    /**
      * Sets the maximum start delay between animation steps in milliseconds.
      *
      * @param {number} stepDelay The maximum iterative delay in milliseconds.
      * @returns {Easing} The calling Easing Animator.
      */
    def stepDelay(stepDelay: Double): this.type = js.native
    
    /**
      * Gets the duration of one animation step in milliseconds.
      *
      * @returns {number} The current duration.
      */
    def stepDuration(): Double = js.native
    /**
      * Sets the duration of one animation step in milliseconds.
      *
      * @param {number} stepDuration The duration in milliseconds.
      * @returns {Easing} The calling Easing Animator.
      */
    def stepDuration(stepDuration: Double): this.type = js.native
    
    /**
      * Given the number of elements, return the total time the animation requires
      *
      * @param {number} numberofIterations The number of elements that will be drawn
      * @returns {number}
      */
    /* CompleteClass */
    override def totalTime(numberOfIterations: Double): Double = js.native
  }
  /* static members */
  object Easing {
    
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default easing of the animation
      */
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing._DEFAULT_EASING_MODE")
    @js.native
    def _DEFAULT_EASING_MODE: Any = js.native
    inline def _DEFAULT_EASING_MODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_EASING_MODE")(x.asInstanceOf[js.Any])
    
    /**
      * The default maximum start delay between each step of an animation
      */
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing._DEFAULT_ITERATIVE_DELAY_MILLISECONDS")
    @js.native
    def _DEFAULT_ITERATIVE_DELAY_MILLISECONDS: Any = js.native
    inline def _DEFAULT_ITERATIVE_DELAY_MILLISECONDS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_ITERATIVE_DELAY_MILLISECONDS")(x.asInstanceOf[js.Any])
    
    /**
      * The default maximum total animation duration
      */
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing._DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS")
    @js.native
    def _DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS: Any = js.native
    inline def _DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS")(x.asInstanceOf[js.Any])
    
    /**
      * The default starting delay of the animation in milliseconds
      */
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing._DEFAULT_START_DELAY_MILLISECONDS")
    @js.native
    def _DEFAULT_START_DELAY_MILLISECONDS: Any = js.native
    inline def _DEFAULT_START_DELAY_MILLISECONDS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_START_DELAY_MILLISECONDS")(x.asInstanceOf[js.Any])
    
    /**
      * The default duration of one animation step in milliseconds
      */
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing._DEFAULT_STEP_DURATION_MILLISECONDS")
    @js.native
    def _DEFAULT_STEP_DURATION_MILLISECONDS: Any = js.native
    inline def _DEFAULT_STEP_DURATION_MILLISECONDS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_STEP_DURATION_MILLISECONDS")(x.asInstanceOf[js.Any])
  }
  
  type EaseFn = js.Function1[/* normalizedTime */ Double, Double]
}
