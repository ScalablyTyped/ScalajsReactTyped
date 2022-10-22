package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.animationsEasingMod.BackEase
import typingsJapgolly.babylonjs.behaviorsBehaviorMod.Behavior
import typingsJapgolly.babylonjs.camerasArcRotateCameraMod.ArcRotateCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsCamerasBouncingBehaviorMod {
  
  @JSImport("babylonjs/Behaviors/Cameras/bouncingBehavior", "BouncingBehavior")
  @js.native
  open class BouncingBehavior ()
    extends StObject
       with Behavior[ArcRotateCamera] {
    
    /* private */ var _animatables: Any = js.native
    
    /**
      * Applies an animation to the radius of the camera, extending by the radiusDelta.
      * @param radiusDelta The delta by which to animate to. Can be negative.
      */
    /* private */ var _applyBoundRadiusAnimation: Any = js.native
    
    /* private */ var _attachedCamera: Any = js.native
    
    /* private */ var _autoTransitionRange: Any = js.native
    
    /* private */ var _cachedWheelPrecision: Any = js.native
    
    /**
      * Removes all animation locks. Allows new animations to be added to any of the camera properties.
      */
    /* protected */ def _clearAnimationLocks(): Unit = js.native
    
    /**
      * Checks if the camera radius is at the specified limit. Takes into account animation locks.
      * @param radiusLimit The limit to check against.
      * @returns Bool to indicate if at limit.
      */
    /* private */ var _isRadiusAtLimit: Any = js.native
    
    /* private */ var _onAfterCheckInputsObserver: Any = js.native
    
    /* private */ var _onMeshTargetChangedObserver: Any = js.native
    
    /* private */ var _radiusBounceTransition: Any = js.native
    
    /* private */ var _radiusIsAnimating: Any = js.native
    
    /**
      * Called when the behavior is attached to a target
      * @param target defines the target where the behavior is attached to
      */
    /* CompleteClass */
    override def attach(target: ArcRotateCamera): Unit = js.native
    
    /**
      * Gets a value indicating if the lowerRadiusTransitionRange and upperRadiusTransitionRange are defined automatically
      */
    def autoTransitionRange: Boolean = js.native
    /**
      * Sets a value indicating if the lowerRadiusTransitionRange and upperRadiusTransitionRange are defined automatically
      * Transition ranges will be set to 5% of the bounding box diagonal in world space
      */
    def autoTransitionRange_=(value: Boolean): Unit = js.native
    
    /**
      * Called when the behavior is detached from its target
      */
    /* CompleteClass */
    override def detach(): Unit = js.native
    
    /**
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /**
      * Length of the distance animated by the transition when lower radius is reached
      */
    var lowerRadiusTransitionRange: Double = js.native
    
    /** gets or sets behavior's name */
    /* CompleteClass */
    var name: String = js.native
    /**
      * Gets the name of the behavior.
      */
    @JSName("name")
    def name_MBouncingBehavior: String = js.native
    
    /**
      * Stops and removes all animations that have been applied to the camera
      */
    def stopAllAnimations(): Unit = js.native
    
    /**
      * The duration of the animation, in milliseconds
      */
    var transitionDuration: Double = js.native
    
    /**
      * Length of the distance animated by the transition when upper radius is reached
      */
    var upperRadiusTransitionRange: Double = js.native
  }
  /* static members */
  object BouncingBehavior {
    
    @JSImport("babylonjs/Behaviors/Cameras/bouncingBehavior", "BouncingBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The easing function used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/bouncingBehavior", "BouncingBehavior.EasingFunction")
    @js.native
    def EasingFunction: BackEase = js.native
    inline def EasingFunction_=(x: BackEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
    
    /**
      * The easing mode used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/bouncingBehavior", "BouncingBehavior.EasingMode")
    @js.native
    def EasingMode: Double = js.native
    inline def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
  }
}
