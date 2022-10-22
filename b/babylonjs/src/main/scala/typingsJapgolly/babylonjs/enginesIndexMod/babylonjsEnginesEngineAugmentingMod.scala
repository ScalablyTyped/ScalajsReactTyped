package typingsJapgolly.babylonjs.enginesIndexMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.babylonjs.HTMLCanvasElement
import typingsJapgolly.babylonjs.WebGLProgram
import typingsJapgolly.babylonjs.buffersDataBufferMod.DataBuffer
import typingsJapgolly.babylonjs.camerasCameraMod.Camera
import typingsJapgolly.babylonjs.camerasVRWebVRCameraMod.WebVROptions
import typingsJapgolly.babylonjs.enginesEngineMod.IDisplayChangedEventArgs
import typingsJapgolly.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionQuery
import typingsJapgolly.babylonjs.enginesExtensionsEngineDotwebVRMod.IVRPresentationAttributes
import typingsJapgolly.babylonjs.instrumentationTimeTokenMod.TimeToken
import typingsJapgolly.babylonjs.mathsMathDotsizeMod.Size
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.miscObservableMod.Observer
import typingsJapgolly.babylonjs.miscPerfCounterMod.PerfCounter
import typingsJapgolly.babylonjs.typesMod.Nullable
import typingsJapgolly.babylonjs.typesMod.int
import typingsJapgolly.std.WebGLQuery
import typingsJapgolly.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsEnginesEngineAugmentingMod {
  
  @js.native
  trait Engine extends StObject {
    
    /** @internal */
    var _captureGPUFrameTime: Boolean = js.native
    
    /** @internal */
    def _createTimeQuery(): WebGLQuery = js.native
    
    /** @internal */
    var _currentNonTimestampToken: Nullable[TimeToken] = js.native
    
    /** @internal */
    def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
    
    /** @internal */
    var _excludedCompressedTextures: js.Array[String] = js.native
    
    /** @internal */
    def _getGlAlgorithmType(algorithmType: Double): Double = js.native
    
    /** @internal */
    def _getTimeQueryAvailability(query: WebGLQuery): Any = js.native
    
    /** @internal */
    def _getTimeQueryResult(query: WebGLQuery): Any = js.native
    
    /** @internal */
    def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
    
    /** @internal */
    var _gpuFrameTime: PerfCounter = js.native
    
    /** @internal */
    var _gpuFrameTimeToken: Nullable[TimeToken] = js.native
    
    /** @internal */
    var _inputElement: Nullable[HTMLElement] = js.native
    
    /** @internal */
    var _oldHardwareScaleFactor: Double = js.native
    
    /** @internal */
    var _oldSize: Size = js.native
    
    /** @internal */
    var _onBeginFrameObserver: Nullable[
        Observer[
          typingsJapgolly.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine
        ]
      ] = js.native
    
    /** @internal */
    var _onEndFrameObserver: Nullable[
        Observer[
          typingsJapgolly.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine
        ]
      ] = js.native
    
    /**
      * Observable to handle when a change to inputElement occurs
      * @internal
      */
    var _onEngineViewChanged: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** @internal */
    def _onVRDisplayPointerRestricted(): Unit = js.native
    
    /** @internal */
    def _onVRDisplayPointerUnrestricted(): Unit = js.native
    
    /** @internal */
    def _onVRFullScreenTriggered(): Unit = js.native
    
    /** @internal */
    var _onVrDisplayConnect: Nullable[js.Function1[/* display */ Any, Unit]] = js.native
    
    /** @internal */
    var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
    
    /** @internal */
    var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
    
    /** @internal */
    var _textureFormatInUse: String = js.native
    
    /** @internal */
    var _vrDisplay: Any = js.native
    
    /** @internal */
    var _vrExclusivePointerMode: Boolean = js.native
    
    /** @internal */
    var _vrSupported: Boolean = js.native
    
    /** @internal */
    var _webVRInitPromise: js.Promise[IDisplayChangedEventArgs] = js.native
    
    /**
      * Gets the current engine view
      * @see https://doc.babylonjs.com/how_to/multi_canvases
      */
    var activeView: Nullable[typingsJapgolly.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView] = js.native
    
    /**
      * Initiates an occlusion query
      * @param algorithmType defines the algorithm to use
      * @param query defines the query to use
      * @returns the current engine
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    def beginOcclusionQuery(algorithmType: Double, query: OcclusionQuery): Boolean = js.native
    
    /**
      * Begins a transform feedback operation
      * @param usePoints defines if points or triangles must be used
      */
    def beginTransformFeedback(usePoints: Boolean): Unit = js.native
    
    /**
      * Binds a multiview render target wrapper to be drawn to
      * @param multiviewTexture render target wrapper to bind
      */
    def bindMultiviewFramebuffer(multiviewTexture: typingsJapgolly.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper): Unit = js.native
    
    /**
      * Bind a webGL transform feedback object to the webgl context
      * @param value defines the webGL transform feedback object to bind
      */
    def bindTransformFeedback(value: Nullable[WebGLTransformFeedback]): Unit = js.native
    
    /**
      * Bind a webGL buffer for a transform feedback operation
      * @param value defines the webGL buffer to bind
      */
    def bindTransformFeedbackBuffer(value: Nullable[DataBuffer]): Unit = js.native
    
    /**
      * Enable or disable the GPU frame time capture
      * @param value True to enable, false to disable
      */
    def captureGPUFrameTime(value: Boolean): Unit = js.native
    
    /**
      * Creates a new multiview render target
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @returns the created multiview render target wrapper
      */
    def createMultiviewRenderTargetTexture(width: Double, height: Double): typingsJapgolly.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper = js.native
    
    /**
      * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
      * @returns the new query
      */
    def createQuery(): OcclusionQuery = js.native
    
    /**
      * Creates a webGL transform feedback object
      * Please makes sure to check webGLVersion property to check if you are running webGL 2+
      * @returns the webGL transform feedback object
      */
    def createTransformFeedback(): WebGLTransformFeedback = js.native
    
    /**
      * Delete and release a webGL query
      * @param query defines the query to delete
      * @returns the current engine
      */
    def deleteQuery(query: OcclusionQuery): typingsJapgolly.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /**
      * Delete a webGL transform feedback object
      * @param value defines the webGL transform feedback object to delete
      */
    def deleteTransformFeedback(value: WebGLTransformFeedback): Unit = js.native
    
    /**
      * Call this function to switch to webVR mode
      * Will do nothing if webVR is not supported or if there is no webVR device
      * @param options the webvr options provided to the camera. mainly used for multiview
      * @see https://doc.babylonjs.com/how_to/webvr_camera
      */
    def enableVR(options: WebVROptions): Unit = js.native
    
    /**
      * Ends an occlusion query
      * @see https://doc.babylonjs.com/features/occlusionquery
      * @param algorithmType defines the algorithm to use
      * @returns the current engine
      */
    def endOcclusionQuery(algorithmType: Double): typingsJapgolly.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /**
      * Ends a time query
      * @param token defines the token used to measure the time span
      * @returns the time spent (in ns)
      */
    def endTimeQuery(token: TimeToken): int = js.native
    
    /**
      * Ends a transform feedback operation
      */
    def endTransformFeedback(): Unit = js.native
    
    /**
      * Get the performance counter associated with the frame time computation
      * @returns the perf counter
      */
    def getGPUFrameTimeCounter(): PerfCounter = js.native
    
    /**
      * Gets the value of a given query
      * @param query defines the query to check
      * @returns the value of the query
      */
    def getQueryResult(query: OcclusionQuery): Double = js.native
    
    /**
      * Gets the current webVR device
      * @returns the current webVR device (or null)
      */
    def getVRDevice(): Any = js.native
    
    /**
      * Initializes a webVR display and starts listening to display change events
      * The onVRDisplayChangedObservable will be notified upon these changes
      * @returns A promise containing a VRDisplay and if vr is supported
      */
    def initWebVRAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
    
    /**
      * Gets or sets the  HTML element to use for attaching events
      */
    var inputElement: Nullable[HTMLElement] = js.native
    
    /**
      * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
      * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
      */
    var isInVRExclusivePointerMode: Boolean = js.native
    
    /**
      * Check if a given query has resolved and got its value
      * @param query defines the query to check
      * @returns true if the query got its value
      */
    def isQueryResultAvailable(query: OcclusionQuery): Boolean = js.native
    
    /**
      * Gets a boolean indicating if a webVR device was detected
      * @returns true if a webVR device was detected
      */
    def isVRDevicePresent(): Boolean = js.native
    
    /**
      * Will be triggered after the view rendered
      */
    val onAfterViewRenderObservable: Observable[typingsJapgolly.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView] = js.native
    
    /**
      * Will be triggered before the view renders
      */
    val onBeforeViewRenderObservable: Observable[typingsJapgolly.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView] = js.native
    
    /**
      * Observable signaled when VR display mode changes
      */
    var onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs] = js.native
    
    /**
      * Observable signaled when VR request present is complete
      */
    var onVRRequestPresentComplete: Observable[Boolean] = js.native
    
    /**
      * Observable signaled when VR request present starts
      */
    var onVRRequestPresentStart: Observable[
        typingsJapgolly.babylonjs.enginesExtensionsEngineDotwebVRMod.babylonjsEnginesEngineAugmentingMod.Engine
      ] = js.native
    
    /**
      * Register a new child canvas
      * @param canvas defines the canvas to register
      * @param camera defines an optional camera to use with this canvas (it will overwrite the scene.camera for this view)
      * @param clearBeforeCopy Indicates if the destination view canvas should be cleared before copying the parent canvas. Can help if the scene clear color has alpha < 1
      * @returns the associated view
      */
    def registerView(canvas: HTMLCanvasElement): typingsJapgolly.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView = js.native
    def registerView(canvas: HTMLCanvasElement, camera: Unit, clearBeforeCopy: Boolean): typingsJapgolly.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView = js.native
    def registerView(canvas: HTMLCanvasElement, camera: Camera): typingsJapgolly.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView = js.native
    def registerView(canvas: HTMLCanvasElement, camera: Camera, clearBeforeCopy: Boolean): typingsJapgolly.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView = js.native
    
    /**
      * Set the compressed texture extensions or file names to skip.
      *
      * @param skippedFiles defines the list of those texture files you want to skip
      * Example: [".dds", ".env", "myfile.png"]
      */
    def setCompressedTextureExclusions(skippedFiles: js.Array[String]): Unit = js.native
    
    /**
      * Set the compressed texture format to use, based on the formats you have, and the formats
      * supported by the hardware / browser.
      *
      * Khronos Texture Container (.ktx) files are used to support this.  This format has the
      * advantage of being specifically designed for OpenGL.  Header elements directly correspond
      * to API arguments needed to compressed textures.  This puts the burden on the container
      * generator to house the arcane code for determining these for current & future formats.
      *
      * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
      * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
      *
      * Note: The result of this call is not taken into account when a texture is base64.
      *
      * @param formatsAvailable defines the list of those format families you have created
      * on your server.  Syntax: '-' + format family + '.ktx'.  (Case and order do not matter.)
      *
      * Current families are astc, dxt, pvrtc, etc2, & etc1.
      * @returns The extension selected.
      */
    def setTextureFormatToUse(formatsAvailable: js.Array[String]): Nullable[String] = js.native
    
    /**
      * Specify the varyings to use with transform feedback
      * @param program defines the associated webGL program
      * @param value defines the list of strings representing the varying names
      */
    def setTranformFeedbackVaryings(program: WebGLProgram, value: js.Array[String]): Unit = js.native
    
    /**
      * Starts a time query (used to measure time spent by the GPU on a specific frame)
      * Please note that only one query can be issued at a time
      * @returns a time token used to track the time span
      */
    def startTimeQuery(): Nullable[TimeToken] = js.native
    
    /**
      * Gets the texture format in use
      */
    val textureFormatInUse: Nullable[String] = js.native
    
    /**
      * Gets the list of texture formats supported
      */
    val texturesSupported: js.Array[String] = js.native
    
    /**
      * Remove a registered child canvas
      * @param canvas defines the canvas to remove
      * @returns the current engine
      */
    def unRegisterView(canvas: HTMLCanvasElement): typingsJapgolly.babylonjs.enginesExtensionsEngineDotviewsMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /** Gets or sets the list of views */
    var views: js.Array[typingsJapgolly.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView] = js.native
    
    /**
      * Gets or sets the presentation attributes used to configure VR rendering
      */
    var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.native
  }
}
