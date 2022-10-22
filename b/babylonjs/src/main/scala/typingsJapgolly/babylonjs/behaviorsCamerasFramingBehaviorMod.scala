package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.animationsEasingMod.ExponentialEase
import typingsJapgolly.babylonjs.behaviorsBehaviorMod.Behavior
import typingsJapgolly.babylonjs.camerasArcRotateCameraMod.ArcRotateCamera
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsCamerasFramingBehaviorMod {
  
  @JSImport("babylonjs/Behaviors/Cameras/framingBehavior", "FramingBehavior")
  @js.native
  open class FramingBehavior ()
    extends StObject
       with Behavior[ArcRotateCamera] {
    
    /* private */ var _animatables: Any = js.native
    
    /**
      *  Applies any current user interaction to the camera. Takes into account maximum alpha rotation.
      */
    /* private */ var _applyUserInteraction: Any = js.native
    
    /* private */ var _attachedCamera: Any = js.native
    
    /* private */ var _betaIsAnimating: Any = js.native
    
    /* private */ var _betaTransition: Any = js.native
    
    /**
      * Calculates the lowest radius for the camera based on the bounding box of the mesh.
      * @param minimumWorld
      * @param maximumWorld
      * @returns The minimum distance from the primary mesh's center point at which the camera must be kept in order
      *		 to fully enclose the mesh in the viewing frustum.
      */
    /* protected */ def _calculateLowerRadiusFromModelBoundingSphere(minimumWorld: Vector3, maximumWorld: Vector3): Double = js.native
    
    /**
      * Removes all animation locks. Allows new animations to be added to any of the arcCamera properties.
      */
    /* private */ var _clearAnimationLocks: Any = js.native
    
    /* private */ var _defaultElevation: Any = js.native
    
    /* private */ var _elevationReturnTime: Any = js.native
    
    /* private */ var _elevationReturnWaitTime: Any = js.native
    
    /* private */ var _framingTime: Any = js.native
    
    /**
      * Returns the frustum slope based on the canvas ratio and camera FOV
      * @returns The frustum slope represented as a Vector2 with X and Y slopes
      */
    /* private */ var _getFrustumSlope: Any = js.native
    
    /* private */ var _isPointerDown: Any = js.native
    
    /* private */ var _lastInteractionTime: Any = js.native
    
    /**
      * Keeps the camera above the ground plane. If the user pulls the camera below the ground plane, the camera
      * is automatically returned to its default position (expected to be above ground plane).
      */
    /* private */ var _maintainCameraAboveGround: Any = js.native
    
    /* private */ var _mode: Any = js.native
    
    /* private */ var _onAfterCheckInputsObserver: Any = js.native
    
    /* private */ var _onMeshTargetChangedObserver: Any = js.native
    
    /* private */ var _onPrePointerObservableObserver: Any = js.native
    
    /* private */ var _positionScale: Any = js.native
    
    /* private */ var _radiusScale: Any = js.native
    
    /* private */ var _radiusTransition: Any = js.native
    
    /* private */ var _vectorTransition: Any = js.native
    
    /* private */ var _zoomStopsAnimation: Any = js.native
    
    /**
      * Called when the behavior is attached to a target
      * @param target defines the target where the behavior is attached to
      */
    /* CompleteClass */
    override def attach(target: ArcRotateCamera): Unit = js.native
    
    /**
      * Define if the behavior should automatically change the configured
      * camera limits and sensibilities.
      */
    var autoCorrectCameraLimitsAndSensibility: Boolean = js.native
    
    /**
      * Gets the angle above/below the horizontal plane to return to when the return to default elevation idle
      * behaviour is triggered, in radians.
      */
    def defaultElevation: Double = js.native
    /**
      * Sets the angle above/below the horizontal plane to return to when the return to default elevation idle
      * behaviour is triggered, in radians.
      */
    def defaultElevation_=(elevation: Double): Unit = js.native
    
    /**
      * Called when the behavior is detached from its target
      */
    /* CompleteClass */
    override def detach(): Unit = js.native
    
    /**
      * Gets the time (in milliseconds) taken to return to the default beta position.
      * Negative value indicates camera should not return to default.
      */
    def elevationReturnTime: Double = js.native
    /**
      * Sets the time (in milliseconds) taken to return to the default beta position.
      * Negative value indicates camera should not return to default.
      */
    def elevationReturnTime_=(speed: Double): Unit = js.native
    
    /**
      * Gets the delay (in milliseconds) taken before the camera returns to the default beta position.
      */
    def elevationReturnWaitTime: Double = js.native
    /**
      * Sets the delay (in milliseconds) taken before the camera returns to the default beta position.
      */
    def elevationReturnWaitTime_=(time: Double): Unit = js.native
    
    /**
      * Gets the transition time when framing the mesh, in milliseconds
      */
    def framingTime: Double = js.native
    /**
      * Sets the transition time when framing the mesh, in milliseconds
      */
    def framingTime_=(time: Double): Unit = js.native
    
    /**
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /**
      * Gets a value indicating if the user is moving the camera
      */
    def isUserIsMoving: Boolean = js.native
    
    /**
      * Gets current mode used by the behavior.
      */
    def mode: Double = js.native
    /**
      * Sets the current mode used by the behavior
      */
    def mode_=(mode: Double): Unit = js.native
    
    /** gets or sets behavior's name */
    /* CompleteClass */
    var name: String = js.native
    /**
      * Gets the name of the behavior.
      */
    @JSName("name")
    def name_MFramingBehavior: String = js.native
    
    /**
      * An event triggered when the animation to zoom on target mesh has ended
      */
    var onTargetFramingAnimationEndObservable: Observable[Unit] = js.native
    
    /**
      * Gets the scale to apply on Y axis to position camera focus. 0.5 by default which means the center of the bounding box.
      */
    def positionScale: Double = js.native
    /**
      * Sets the scale to apply on Y axis to position camera focus. 0.5 by default which means the center of the bounding box.
      */
    def positionScale_=(scale: Double): Unit = js.native
    
    /**
      * Gets the scale applied to the radius
      */
    def radiusScale: Double = js.native
    /**
      * Sets the scale applied to the radius (1 by default)
      */
    def radiusScale_=(radius: Double): Unit = js.native
    
    /**
      * Stops and removes all animations that have been applied to the camera
      */
    def stopAllAnimations(): Unit = js.native
    
    /**
      * Targets the bounding box info defined by its extends and updates zoom level accordingly.
      * @param minimumWorld Determines the smaller position of the bounding box extend
      * @param maximumWorld Determines the bigger position of the bounding box extend
      * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
      * @param onAnimationEnd Callback triggered at the end of the framing animation
      */
    def zoomOnBoundingInfo(minimumWorld: Vector3, maximumWorld: Vector3): Unit = js.native
    def zoomOnBoundingInfo(minimumWorld: Vector3, maximumWorld: Vector3, focusOnOriginXZ: Boolean): Unit = js.native
    def zoomOnBoundingInfo(
      minimumWorld: Vector3,
      maximumWorld: Vector3,
      focusOnOriginXZ: Boolean,
      onAnimationEnd: Nullable[js.Function0[Unit]]
    ): Unit = js.native
    def zoomOnBoundingInfo(
      minimumWorld: Vector3,
      maximumWorld: Vector3,
      focusOnOriginXZ: Unit,
      onAnimationEnd: Nullable[js.Function0[Unit]]
    ): Unit = js.native
    
    /**
      * Targets the given mesh and updates zoom level accordingly.
      * @param mesh  The mesh to target.
      * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
      * @param onAnimationEnd Callback triggered at the end of the framing animation
      */
    def zoomOnMesh(mesh: AbstractMesh): Unit = js.native
    def zoomOnMesh(mesh: AbstractMesh, focusOnOriginXZ: Boolean): Unit = js.native
    def zoomOnMesh(mesh: AbstractMesh, focusOnOriginXZ: Boolean, onAnimationEnd: Nullable[js.Function0[Unit]]): Unit = js.native
    def zoomOnMesh(mesh: AbstractMesh, focusOnOriginXZ: Unit, onAnimationEnd: Nullable[js.Function0[Unit]]): Unit = js.native
    
    /**
      * Targets the given mesh with its children and updates zoom level accordingly.
      * @param mesh  The mesh to target.
      * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
      * @param onAnimationEnd Callback triggered at the end of the framing animation
      */
    def zoomOnMeshHierarchy(mesh: AbstractMesh): Unit = js.native
    def zoomOnMeshHierarchy(mesh: AbstractMesh, focusOnOriginXZ: Boolean): Unit = js.native
    def zoomOnMeshHierarchy(mesh: AbstractMesh, focusOnOriginXZ: Boolean, onAnimationEnd: Nullable[js.Function0[Unit]]): Unit = js.native
    def zoomOnMeshHierarchy(mesh: AbstractMesh, focusOnOriginXZ: Unit, onAnimationEnd: Nullable[js.Function0[Unit]]): Unit = js.native
    
    /**
      * Targets the given meshes with their children and updates zoom level accordingly.
      * @param meshes  The mesh to target.
      * @param focusOnOriginXZ Determines if the camera should focus on 0 in the X and Z axis instead of the mesh
      * @param onAnimationEnd Callback triggered at the end of the framing animation
      */
    def zoomOnMeshesHierarchy(meshes: js.Array[AbstractMesh]): Unit = js.native
    def zoomOnMeshesHierarchy(meshes: js.Array[AbstractMesh], focusOnOriginXZ: Boolean): Unit = js.native
    def zoomOnMeshesHierarchy(
      meshes: js.Array[AbstractMesh],
      focusOnOriginXZ: Boolean,
      onAnimationEnd: Nullable[js.Function0[Unit]]
    ): Unit = js.native
    def zoomOnMeshesHierarchy(
      meshes: js.Array[AbstractMesh],
      focusOnOriginXZ: Unit,
      onAnimationEnd: Nullable[js.Function0[Unit]]
    ): Unit = js.native
    
    /**
      * Gets the flag that indicates if user zooming should stop animation.
      */
    def zoomStopsAnimation: Boolean = js.native
    /**
      * Sets the flag that indicates if user zooming should stop animation.
      */
    def zoomStopsAnimation_=(flag: Boolean): Unit = js.native
  }
  /* static members */
  object FramingBehavior {
    
    @JSImport("babylonjs/Behaviors/Cameras/framingBehavior", "FramingBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The easing function used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/framingBehavior", "FramingBehavior.EasingFunction")
    @js.native
    def EasingFunction: ExponentialEase = js.native
    inline def EasingFunction_=(x: ExponentialEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingFunction")(x.asInstanceOf[js.Any])
    
    /**
      * The easing mode used by animations
      */
    @JSImport("babylonjs/Behaviors/Cameras/framingBehavior", "FramingBehavior.EasingMode")
    @js.native
    def EasingMode: Double = js.native
    inline def EasingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EasingMode")(x.asInstanceOf[js.Any])
    
    /**
      * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
      */
    @JSImport("babylonjs/Behaviors/Cameras/framingBehavior", "FramingBehavior.FitFrustumSidesMode")
    @js.native
    def FitFrustumSidesMode: Double = js.native
    inline def FitFrustumSidesMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FitFrustumSidesMode")(x.asInstanceOf[js.Any])
    
    /**
      * The camera can move all the way towards the mesh.
      */
    @JSImport("babylonjs/Behaviors/Cameras/framingBehavior", "FramingBehavior.IgnoreBoundsSizeMode")
    @js.native
    def IgnoreBoundsSizeMode: Double = js.native
    inline def IgnoreBoundsSizeMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IgnoreBoundsSizeMode")(x.asInstanceOf[js.Any])
  }
}
