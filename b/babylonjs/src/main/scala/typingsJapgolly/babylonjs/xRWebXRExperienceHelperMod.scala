package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.sceneMod.IDisposable
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.xRWebXRCameraMod.WebXRCamera
import typingsJapgolly.babylonjs.xRWebXRFeaturesManagerMod.WebXRFeaturesManager
import typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import typingsJapgolly.babylonjs.xRWebXRTypesMod.WebXRRenderTarget
import typingsJapgolly.babylonjs.xRWebXRTypesMod.WebXRState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRWebXRExperienceHelperMod {
  
  @JSImport("babylonjs/XR/webXRExperienceHelper", "WebXRExperienceHelper")
  @js.native
  /**
    * Creates a WebXRExperienceHelper
    * @param _scene The scene the helper should be created in
    */
  /* private */ open class WebXRExperienceHelper ()
    extends StObject
       with IDisposable {
    
    /* private */ var _attachedToElement: Any = js.native
    
    /* private */ var _lastTimestamp: Any = js.native
    
    /* private */ var _nonVRCamera: Any = js.native
    
    /* private */ var _nonXRToXRCamera: Any = js.native
    
    /* private */ var _originalSceneAutoClear: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _setState: Any = js.native
    
    /* private */ var _spectatorCamera: Any = js.native
    
    /* private */ var _spectatorMode: Any = js.native
    
    /* private */ var _supported: Any = js.native
    
    /* private */ var _switchSpectatorMode: Any = js.native
    
    /**
      * Camera used to render xr content
      */
    var camera: WebXRCamera = js.native
    
    /**
      * Disable spectator mode for desktop VR experiences.
      */
    def disableSpecatatorMode(): Unit = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Enable spectator mode for desktop VR experiences.
      * When spectator mode is enabled a camera will be attached to the desktop canvas and will
      * display the first rig camera's view on the desktop canvas.
      * Please note that this will degrade performance, as it requires another camera render.
      * It is also not recommended to enable this in devices like the quest, as it brings no benefit there.
      * @param options giving WebXRSpectatorModeOption for specutator camera to setup when the spectator mode is enabled.
      */
    def enableSpectatorMode(): Unit = js.native
    def enableSpectatorMode(options: WebXRSpectatorModeOption): Unit = js.native
    
    /**
      * Enters XR mode (This must be done within a user interaction in most browsers eg. button click)
      * @param sessionMode options for the XR session
      * @param referenceSpaceType frame of reference of the XR session
      * @param renderTarget the output canvas that will be used to enter XR mode
      * @param sessionCreationOptions optional XRSessionInit object to init the session with
      * @returns promise that resolves after xr mode has entered
      */
    def enterXRAsync(sessionMode: XRSessionMode, referenceSpaceType: XRReferenceSpaceType): js.Promise[WebXRSessionManager] = js.native
    def enterXRAsync(
      sessionMode: XRSessionMode,
      referenceSpaceType: XRReferenceSpaceType,
      renderTarget: Unit,
      sessionCreationOptions: XRSessionInit
    ): js.Promise[WebXRSessionManager] = js.native
    def enterXRAsync(
      sessionMode: XRSessionMode,
      referenceSpaceType: XRReferenceSpaceType,
      renderTarget: WebXRRenderTarget
    ): js.Promise[WebXRSessionManager] = js.native
    def enterXRAsync(
      sessionMode: XRSessionMode,
      referenceSpaceType: XRReferenceSpaceType,
      renderTarget: WebXRRenderTarget,
      sessionCreationOptions: XRSessionInit
    ): js.Promise[WebXRSessionManager] = js.native
    
    /**
      * Exits XR mode and returns the scene to its original state
      * @returns promise that resolves after xr mode has exited
      */
    def exitXRAsync(): js.Promise[Unit] = js.native
    
    /** A features manager for this xr session */
    var featuresManager: WebXRFeaturesManager = js.native
    
    /**
      * Observers registered here will be triggered after the camera's initial transformation is set
      * This can be used to set a different ground level or an extra rotation.
      *
      * Note that ground level is considered to be at 0. The height defined by the XR camera will be added
      * to the position set after this observable is done executing.
      */
    var onInitialXRPoseSetObservable: Observable[WebXRCamera] = js.native
    
    /**
      * Fires when the state of the experience helper has changed
      */
    var onStateChangedObservable: Observable[WebXRState] = js.native
    
    /** Session manager used to keep track of xr session */
    var sessionManager: WebXRSessionManager = js.native
    
    /**
      * The current state of the XR experience (eg. transitioning, in XR or not in XR)
      */
    var state: WebXRState = js.native
  }
  /* static members */
  object WebXRExperienceHelper {
    
    @JSImport("babylonjs/XR/webXRExperienceHelper", "WebXRExperienceHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates the experience helper
      * @param scene the scene to attach the experience helper to
      * @returns a promise for the experience helper
      */
    inline def CreateAsync(scene: Scene): js.Promise[WebXRExperienceHelper] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebXRExperienceHelper]]
  }
  
  trait WebXRSpectatorModeOption extends StObject {
    
    /**
      * Expected refresh rate (frames per sec) for a spectator camera.
      */
    var fps: js.UndefOr[Double] = js.undefined
    
    /**
      * The index of rigCameras array in a WebXR camera.
      */
    var preferredCameraIndex: js.UndefOr[Double] = js.undefined
  }
  object WebXRSpectatorModeOption {
    
    inline def apply(): WebXRSpectatorModeOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebXRSpectatorModeOption]
    }
    
    extension [Self <: WebXRSpectatorModeOption](x: Self) {
      
      inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      inline def setPreferredCameraIndex(value: Double): Self = StObject.set(x, "preferredCameraIndex", value.asInstanceOf[js.Any])
      
      inline def setPreferredCameraIndexUndefined: Self = StObject.set(x, "preferredCameraIndex", js.undefined)
    }
  }
}
