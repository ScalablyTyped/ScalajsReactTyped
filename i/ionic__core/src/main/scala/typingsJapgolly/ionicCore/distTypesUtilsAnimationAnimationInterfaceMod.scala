package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.ionicCore.ionicCoreInts.`0`
import typingsJapgolly.ionicCore.ionicCoreInts.`1`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsAnimationAnimationInterfaceMod {
  
  @js.native
  trait Animation extends StObject {
    
    def addAnimation(animationToAdd: js.Array[Animation]): Animation = js.native
    /**
      * Group one or more animations together to be controlled by a parent animation.
      */
    def addAnimation(animationToAdd: Animation): Animation = js.native
    
    def addElement(el: js.Array[Element | Node]): Animation = js.native
    /**
      * Add one or more elements to the animation
      */
    def addElement(el: Element): Animation = js.native
    def addElement(el: Node): Animation = js.native
    def addElement(el: NodeList[Node]): Animation = js.native
    
    /**
      * Add CSS class to the animation's
      * elements after the animation ends.
      */
    def afterAddClass(className: String): Animation = js.native
    def afterAddClass(className: js.Array[String]): Animation = js.native
    
    /**
      * Add a function that performs a
      * DOM read to be run after the
      * animation end
      */
    def afterAddRead(readFn: js.Function0[Unit]): Animation = js.native
    
    /**
      * Add a function that performs a
      * DOM write to be run after the
      * animation end
      */
    def afterAddWrite(writeFn: js.Function0[Unit]): Animation = js.native
    
    /**
      * Clear CSS inline styles from the animation's
      * elements after the animation ends.
      */
    def afterClearStyles(propertyNames: js.Array[String]): Animation = js.native
    
    /**
      * Remove CSS class from the animation's
      * elements after the animation ends.
      */
    def afterRemoveClass(className: String): Animation = js.native
    def afterRemoveClass(className: js.Array[String]): Animation = js.native
    
    /**
      * Set CSS inline styles to the animation's
      * elements after the animation ends.
      */
    def afterStyles(styles: StringDictionary[Any]): Animation = js.native
    
    /**
      * Add a class to the animation's
      * elements before the animation starts
      */
    def beforeAddClass(className: String): Animation = js.native
    def beforeAddClass(className: js.Array[String]): Animation = js.native
    
    /**
      * Add a function that performs a
      * DOM read to be run before the
      * animation starts
      */
    def beforeAddRead(readFn: js.Function0[Unit]): Animation = js.native
    
    /**
      * Add a function that performs a
      * DOM write to be run before the
      * animation starts
      */
    def beforeAddWrite(writeFn: js.Function0[Unit]): Animation = js.native
    
    /**
      * Clear CSS inline styles from the animation's
      * elements before the animation begins.
      */
    def beforeClearStyles(propertyNames: js.Array[String]): Animation = js.native
    
    /**
      * Remove a class from the animation's
      * elements before the animation starts
      */
    def beforeRemoveClass(className: String): Animation = js.native
    def beforeRemoveClass(className: js.Array[String]): Animation = js.native
    
    /**
      * Set CSS inline styles to the animation's
      * elements before the animation begins.
      */
    def beforeStyles(styles: StringDictionary[Any]): Animation = js.native
    
    var childAnimations: js.Array[Animation] = js.native
    
    /**
      * Sets when an animation starts (in milliseconds).
      */
    def delay(): Animation = js.native
    def delay(delay: Double): Animation = js.native
    
    /**
      * Destroy the animation and all child animations.
      */
    def destroy(): Unit = js.native
    def destroy(clearStyleSheets: Boolean): Unit = js.native
    
    /**
      * Sets whether the animation should play forwards,
      * backwards, or alternating back and forth.
      */
    def direction(): Animation = js.native
    def direction(direction: AnimationDirection): Animation = js.native
    
    /**
      * Sets the length of time the animation takes
      * to complete one cycle.
      */
    def duration(): Animation = js.native
    def duration(duration: Double): Animation = js.native
    
    /**
      * Sets how the animation progresses through the
      * duration of each cycle.
      */
    def easing(): Animation = js.native
    def easing(easing: String): Animation = js.native
    
    var elements: js.Array[HTMLElement] = js.native
    
    /**
      * Sets how the animation applies styles to its
      * elements before and after the animation's execution.
      */
    def fill(): Animation = js.native
    def fill(fill: AnimationFill): Animation = js.native
    
    def from(property: String, value: Any): Animation = js.native
    
    def fromTo(property: String, fromValue: Any, toValue: Any): Animation = js.native
    
    /**
      * Gets the animation's delay in milliseconds.
      */
    def getDelay(): Double = js.native
    
    /**
      * Returns the animation's direction.
      */
    def getDirection(): AnimationDirection = js.native
    
    /**
      * Gets the animation's duration in milliseconds.
      */
    def getDuration(): Double = js.native
    
    /**
      * Returns the animation's easing.
      */
    def getEasing(): String = js.native
    
    /**
      * Returns the animation's fill mode.
      */
    def getFill(): AnimationFill = js.native
    
    /**
      * Gets the number of iterations the animation will run.
      */
    def getIterations(): Double = js.native
    
    /**
      * Get an array of keyframes for the animation.
      */
    def getKeyframes(): AnimationKeyFrames = js.native
    
    /**
      * Returns the raw Web Animations object
      * for all elements in an Animation.
      * This will return an empty array on
      * browsers that do not support
      * the Web Animations API.
      */
    def getWebAnimations(): js.Array[Any] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    /**
      * Returns `true` if the animation is running.
      * Returns `false` otherwise.
      */
    def isRunning(): Boolean = js.native
    
    /**
      * Sets the number of times the animation cycle
      * should be played before stopping.
      */
    def iterations(iterations: Double): Animation = js.native
    
    /**
      * Set the keyframes for the animation.
      */
    def keyframes(keyframes: AnimationKeyFrames): Animation = js.native
    
    /**
      * Add a callback to be run
      * upon the animation ending
      */
    def onFinish(callback: AnimationLifecycle): Animation = js.native
    def onFinish(callback: AnimationLifecycle, opts: AnimationCallbackOptions): Animation = js.native
    
    var parentAnimation: js.UndefOr[Animation] = js.native
    
    /**
      * Pauses the animation
      */
    def pause(): Unit = js.native
    
    /**
      * Play the animation
      *
      * If the `sync` options is `true`, the animation will play synchronously. This
      * is the equivalent of running the animation
      * with a duration of 0ms.
      */
    def play(): js.Promise[Unit] = js.native
    def play(opts: AnimationPlayOptions): js.Promise[Unit] = js.native
    
    def progressEnd(playTo: `0` | `1`, step: Double): Animation = js.native
    def progressEnd(playTo: `0` | `1`, step: Double, dur: Double): Animation = js.native
    def progressEnd(playTo: Unit, step: Double): Animation = js.native
    def progressEnd(playTo: Unit, step: Double, dur: Double): Animation = js.native
    
    def progressStart(): Animation = js.native
    def progressStart(forceLinearEasing: Boolean): Animation = js.native
    def progressStart(forceLinearEasing: Boolean, step: Double): Animation = js.native
    def progressStart(forceLinearEasing: Unit, step: Double): Animation = js.native
    
    def progressStep(step: Double): Animation = js.native
    
    /**
      * Stop the animation and reset
      * all elements to their initial state
      */
    def stop(): Unit = js.native
    
    def to(property: String, value: Any): Animation = js.native
  }
  
  type AnimationBuilder = js.Function2[/* baseEl */ Any, /* opts */ js.UndefOr[Any], Animation]
  
  trait AnimationCallbackOptions extends StObject {
    
    var oneTimeCallback: Boolean
  }
  object AnimationCallbackOptions {
    
    inline def apply(oneTimeCallback: Boolean): AnimationCallbackOptions = {
      val __obj = js.Dynamic.literal(oneTimeCallback = oneTimeCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationCallbackOptions]
    }
    
    extension [Self <: AnimationCallbackOptions](x: Self) {
      
      inline def setOneTimeCallback(value: Boolean): Self = StObject.set(x, "oneTimeCallback", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.normal
    - typingsJapgolly.ionicCore.ionicCoreStrings.reverse
    - typingsJapgolly.ionicCore.ionicCoreStrings.alternate
    - typingsJapgolly.ionicCore.ionicCoreStrings.`alternate-reverse`
  */
  trait AnimationDirection extends StObject
  object AnimationDirection {
    
    inline def alternate: typingsJapgolly.ionicCore.ionicCoreStrings.alternate = "alternate".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.alternate]
    
    inline def `alternate-reverse`: typingsJapgolly.ionicCore.ionicCoreStrings.`alternate-reverse` = "alternate-reverse".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.`alternate-reverse`]
    
    inline def normal: typingsJapgolly.ionicCore.ionicCoreStrings.normal = "normal".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.normal]
    
    inline def reverse: typingsJapgolly.ionicCore.ionicCoreStrings.reverse = "reverse".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.reverse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.auto
    - typingsJapgolly.ionicCore.ionicCoreStrings.none
    - typingsJapgolly.ionicCore.ionicCoreStrings.forwards
    - typingsJapgolly.ionicCore.ionicCoreStrings.backwards
    - typingsJapgolly.ionicCore.ionicCoreStrings.both
  */
  trait AnimationFill extends StObject
  object AnimationFill {
    
    inline def auto: typingsJapgolly.ionicCore.ionicCoreStrings.auto = "auto".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.auto]
    
    inline def backwards: typingsJapgolly.ionicCore.ionicCoreStrings.backwards = "backwards".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.backwards]
    
    inline def both: typingsJapgolly.ionicCore.ionicCoreStrings.both = "both".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.both]
    
    inline def forwards: typingsJapgolly.ionicCore.ionicCoreStrings.forwards = "forwards".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.forwards]
    
    inline def none: typingsJapgolly.ionicCore.ionicCoreStrings.none = "none".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.none]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait AnimationKeyFrame extends StObject {
    
    var offset: Double
  }
  object AnimationKeyFrame {
    
    inline def apply(offset: Double): AnimationKeyFrame = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationKeyFrame]
    }
    
    extension [Self <: AnimationKeyFrame](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait AnimationKeyFrameEdge extends StObject {
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object AnimationKeyFrameEdge {
    
    inline def apply(): AnimationKeyFrameEdge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationKeyFrameEdge]
    }
    
    extension [Self <: AnimationKeyFrameEdge](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  type AnimationKeyFrames = (js.Tuple2[AnimationKeyFrameEdge, AnimationKeyFrameEdge]) | js.Array[AnimationKeyFrame]
  
  type AnimationLifecycle = js.Function2[/* currentStep */ `0` | `1`, /* animation */ Animation, Unit]
  
  trait AnimationPlayOptions extends StObject {
    
    var sync: Boolean
  }
  object AnimationPlayOptions {
    
    inline def apply(sync: Boolean): AnimationPlayOptions = {
      val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationPlayOptions]
    }
    
    extension [Self <: AnimationPlayOptions](x: Self) {
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.start
    - typingsJapgolly.ionicCore.ionicCoreStrings.end
  */
  trait AnimationPlayTo extends StObject
  object AnimationPlayTo {
    
    inline def end: typingsJapgolly.ionicCore.ionicCoreStrings.end = "end".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.end]
    
    inline def start: typingsJapgolly.ionicCore.ionicCoreStrings.start = "start".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.start]
  }
  
  type AnimationStyles = Record[String, Any]
}
