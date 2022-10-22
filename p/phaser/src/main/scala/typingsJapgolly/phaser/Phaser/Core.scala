package typingsJapgolly.phaser.Phaser

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.phaser.Phaser.DOM.RequestAnimationFrame
import typingsJapgolly.phaser.Phaser.Display.Color
import typingsJapgolly.phaser.Phaser.Scale.CenterType
import typingsJapgolly.phaser.Phaser.Scale.ScaleModeType
import typingsJapgolly.phaser.Phaser.Scale.ZoomType
import typingsJapgolly.phaser.Phaser.Types.Core.AudioConfig
import typingsJapgolly.phaser.Phaser.Types.Core.FPSConfig
import typingsJapgolly.phaser.Phaser.Types.Core.PhysicsConfig
import typingsJapgolly.phaser.Phaser.Types.Core.PipelineConfig
import typingsJapgolly.phaser.Phaser.Types.Core.TimeStepCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  /**
    * The active game configuration settings, parsed from a {@link Phaser.Types.Core.GameConfig} object.
    */
  trait Config extends StObject {
    
    /**
      * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
      */
    val antialias: Boolean
    
    /**
      * Sets the `antialias` property when the WebGL context is created. Setting this value does not impact any subsequent textures that are created, or the canvas style attributes.
      */
    val antialiasGL: Boolean
    
    /**
      * The Audio Configuration object.
      */
    val audio: AudioConfig
    
    /**
      * Automatically center the canvas within the parent?
      */
    val autoCenter: CenterType
    
    /**
      * If `true` the window will automatically be given focus immediately and on any future mousedown event.
      */
    val autoFocus: Boolean
    
    /**
      * Automatically round the display and style sizes of the canvas. This can help with performance in lower-powered devices.
      */
    val autoRound: Boolean
    
    /**
      * The background color of the game canvas. The default is black. This value is ignored if `transparent` is set to `true`.
      */
    val backgroundColor: Color
    
    /**
      * The background colors of the banner.
      */
    val bannerBackgroundColor: js.Array[String]
    
    /**
      * The color of the banner text.
      */
    val bannerTextColor: String
    
    /**
      * The default WebGL Batch size. Represents the number of _quads_ that can be added to a single batch.
      */
    val batchSize: Double
    
    /**
      * Force Phaser to use your own Canvas element instead of creating one.
      */
    val canvas: HTMLCanvasElement
    
    /**
      * Optional CSS attributes to be set on the canvas object created by the renderer.
      */
    val canvasStyle: String
    
    /**
      * Whether the game canvas will be cleared between each rendering frame. You can disable this if you have a full-screen background image or game object.
      */
    val clearBeforeRender: Boolean
    
    /**
      * Force Phaser to use your own Canvas context instead of creating one.
      */
    val context: CanvasRenderingContext2D | WebGLRenderingContext
    
    /**
      * Is Phaser running under a custom (non-native web) environment? If so, set this to `true` to skip internal Feature detection. If `true` the `renderType` cannot be left as `AUTO`.
      */
    val customEnvironment: Boolean
    
    /**
      * A base64 encoded PNG that will be used as the default blank texture.
      */
    val defaultImage: String
    
    /**
      * The default physics system. It will be started for each scene. Either 'arcade', 'impact' or 'matter'.
      */
    val defaultPhysicsSystem: Boolean | String
    
    /**
      * The plugins installed into every Scene (in addition to CoreScene and Global).
      */
    val defaultPlugins: Any
    
    /**
      * When set to `true` it will create a desynchronized context for both 2D and WebGL. See https://developers.google.com/web/updates/2019/05/desynchronized for details.
      */
    val desynchronized: Boolean
    
    /**
      * Set to `true` to disable the right-click context menu.
      */
    val disableContextMenu: Boolean
    
    /**
      * Should the DOM Container that is created (if `dom.createContainer` is true) be positioned behind (true) or over the top (false, the default) of the game canvas?
      */
    val domBehindCanvas: Boolean
    
    /**
      * Should the game create a div element to act as a DOM Container? Only enable if you're using DOM Element objects. You must provide a parent object if you use this feature.
      */
    val domCreateContainer: Boolean
    
    /**
      * The default `pointerEvents` attribute set on the DOM Container.
      */
    val domPointerEvents: String
    
    /**
      * Is the Scale Manager allowed to adjust the CSS height property of the parent to be 100%?
      */
    val expandParent: Boolean
    
    /**
      * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
      */
    val failIfMajorPerformanceCaveat: Boolean
    
    /**
      * The Frame Rate Configuration object, as parsed by the Timestep class.
      */
    val fps: FPSConfig
    
    /**
      * The DOM element that will be sent into full screen mode, or its `id`. If undefined Phaser will create its own div and insert the canvas into it when entering fullscreen mode.
      */
    val fullscreenTarget: HTMLElement | String
    
    /**
      * The title of the game.
      */
    val gameTitle: String
    
    /**
      * The URL of the game.
      */
    val gameURL: String
    
    /**
      * The version of the game.
      */
    val gameVersion: String
    
    /**
      * The height of the underlying canvas, in pixels.
      */
    val height: Double | String
    
    /**
      * Don't write the banner line to the console.log.
      */
    val hideBanner: Boolean
    
    /**
      * Omit Phaser's name and version from the banner.
      */
    val hidePhaser: Boolean
    
    /**
      * The number of Pointer objects created by default. In a mouse-only, or non-multi touch game, you can leave this as 1.
      */
    val inputActivePointers: Double
    
    /**
      * Enable the Gamepad Plugin. This can be disabled in games that don't need gamepad input.
      */
    val inputGamepad: Boolean
    
    /**
      * The DOM Target to listen for gamepad events on. Defaults to `window` if not specified.
      */
    val inputGamepadEventTarget: Any
    
    /**
      * Enable the Keyboard Plugin. This can be disabled in games that don't need keyboard input.
      */
    val inputKeyboard: Boolean
    
    /**
      * `preventDefault` will be called on every non-modified key which has a key code in this array. By default, it is empty.
      */
    val inputKeyboardCapture: js.Array[Double]
    
    /**
      * The DOM Target to listen for keyboard events on. Defaults to `window` if not specified.
      */
    val inputKeyboardEventTarget: Any
    
    /**
      * Enable the Mouse Plugin. This can be disabled in games that don't need mouse input.
      */
    val inputMouse: Boolean | js.Object
    
    /**
      * The DOM Target to listen for mouse events on. Defaults to the game canvas if not specified.
      */
    val inputMouseEventTarget: Any
    
    /**
      * Should `mousedown` DOM events have `preventDefault` called on them?
      */
    val inputMousePreventDefaultDown: Boolean
    
    /**
      * Should `mousemove` DOM events have `preventDefault` called on them?
      */
    val inputMousePreventDefaultMove: Boolean
    
    /**
      * Should `mouseup` DOM events have `preventDefault` called on them?
      */
    val inputMousePreventDefaultUp: Boolean
    
    /**
      * Should `wheel` DOM events have `preventDefault` called on them?
      */
    val inputMousePreventDefaultWheel: Boolean
    
    /**
      * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
      */
    val inputSmoothFactor: Double
    
    /**
      * Enable the Touch Plugin. This can be disabled in games that don't need touch input.
      */
    val inputTouch: Boolean
    
    /**
      * Should touch events be captured? I.e. have prevent default called on them.
      */
    val inputTouchCapture: Boolean
    
    /**
      * The DOM Target to listen for touch events on. Defaults to the game canvas if not specified.
      */
    val inputTouchEventTarget: Any
    
    /**
      * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
      */
    val inputWindowEvents: Boolean
    
    /**
      * An array of global plugins to be installed.
      */
    val installGlobalPlugins: Any
    
    /**
      * An array of Scene level plugins to be installed.
      */
    val installScenePlugins: Any
    
    /**
      * Should the XHR request use async or not?
      */
    val loaderAsync: Boolean
    
    /**
      * A URL used to resolve paths given to the loader. Example: 'http://labs.phaser.io/assets/'.
      */
    val loaderBaseURL: String
    
    /**
      * 'anonymous', 'use-credentials', or `undefined`. If you're not making cross-origin requests, leave this as `undefined`. See {@link https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes}.
      */
    val loaderCrossOrigin: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum parallel downloads allowed for resources (Default to 32).
      */
    val loaderMaxParallelDownloads: Double
    
    /**
      * Optional password for all XHR requests.
      */
    val loaderPassword: String
    
    /**
      * A URL path used to resolve relative paths given to the loader. Example: 'images/sprites/'.
      */
    val loaderPath: String
    
    /**
      * The response type of the XHR request, e.g. `blob`, `text`, etc.
      */
    val loaderResponseType: String
    
    /**
      * Optional XHR timeout value, in ms.
      */
    val loaderTimeout: Double
    
    /**
      * Optional username for all XHR requests.
      */
    val loaderUser: String
    
    /**
      * Optional XHR withCredentials value.
      */
    val loaderWithCredentials: Boolean
    
    /**
      * The maximum height, in pixels, the canvas will scale up to. A value of zero means no maximum.
      */
    val maxHeight: Double
    
    /**
      * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
      */
    val maxLights: Double
    
    /**
      * When in WebGL mode, this sets the maximum number of GPU Textures to use. The default, -1, will use all available units. The WebGL1 spec says all browsers should provide a minimum of 8.
      */
    val maxTextures: Double
    
    /**
      * The maximum width, in pixels, the canvas will scale up to. A value of zero means no maximum.
      */
    val maxWidth: Double
    
    /**
      * The minimum height, in pixels, the canvas will scale down to. A value of zero means no minimum.
      */
    val minHeight: Double
    
    /**
      * The minimum width, in pixels, the canvas will scale down to. A value of zero means no minimum.
      */
    val minWidth: Double
    
    /**
      * Sets the `mipmapFilter` property when the WebGL renderer is created.
      */
    val mipmapFilter: String
    
    /**
      * A base64 encoded PNG that will be used as the default texture when a texture is assigned that is missing or not loaded.
      */
    val missingImage: String
    
    /**
      * A parent DOM element into which the canvas created by the renderer will be injected.
      */
    val parent: Any
    
    /**
      * The Physics Configuration object.
      */
    val physics: PhysicsConfig
    
    /**
      * An object mapping WebGL names to WebGLPipeline classes. These should be class constructors, not instances.
      */
    val pipeline: PipelineConfig
    
    /**
      * Prevent pixel art from becoming blurred when scaled. It will remain crisp (tells the WebGL renderer to automatically create textures using a linear filter mode).
      */
    val pixelArt: Boolean
    
    /**
      * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
      */
    def postBoot(game: Game): Unit
    
    /**
      * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
      */
    val powerPreference: String
    
    /**
      * Called before Phaser boots. Useful for initializing anything not related to Phaser that Phaser may require while booting.
      */
    def preBoot(game: Game): Unit
    
    /**
      * In WebGL mode, sets the drawing buffer to contain colors with pre-multiplied alpha.
      */
    val premultipliedAlpha: Boolean
    
    /**
      * If the value is true the WebGL buffers will not be cleared and will preserve their values until cleared or overwritten by the author.
      */
    val preserveDrawingBuffer: Boolean
    
    /**
      * Force Phaser to use a specific renderer. Can be `CONST.CANVAS`, `CONST.WEBGL`, `CONST.HEADLESS` or `CONST.AUTO` (default)
      */
    val renderType: Double
    
    /**
      * How many ms should elapse before checking if the browser size has changed?
      */
    val resizeInterval: Double
    
    /**
      * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
      */
    val roundPixels: Boolean
    
    /**
      * The scale mode as used by the Scale Manager. The default is zero, which is no scaling.
      */
    val scaleMode: ScaleModeType
    
    /**
      * The default Scene configuration object.
      */
    val sceneConfig: js.Object
    
    /**
      * A seed which the Random Data Generator will use. If not given, a dynamic seed based on the time is used.
      */
    val seed: js.Array[String]
    
    /**
      * Whether the game canvas will have a transparent background.
      */
    val transparent: Boolean
    
    /**
      * A base64 encoded PNG that will be used as the default texture when a texture is assigned that is white or not loaded.
      */
    val whiteImage: String
    
    /**
      * The width of the underlying canvas, in pixels.
      */
    val width: Double | String
    
    /**
      * The zoom factor, as used by the Scale Manager.
      */
    val zoom: ZoomType | Double
  }
  object Config {
    
    inline def apply(
      antialias: Boolean,
      antialiasGL: Boolean,
      audio: AudioConfig,
      autoCenter: CenterType,
      autoFocus: Boolean,
      autoRound: Boolean,
      backgroundColor: Color,
      bannerBackgroundColor: js.Array[String],
      bannerTextColor: String,
      batchSize: Double,
      canvas: HTMLCanvasElement,
      canvasStyle: String,
      clearBeforeRender: Boolean,
      context: CanvasRenderingContext2D | WebGLRenderingContext,
      customEnvironment: Boolean,
      defaultImage: String,
      defaultPhysicsSystem: Boolean | String,
      defaultPlugins: Any,
      desynchronized: Boolean,
      disableContextMenu: Boolean,
      domBehindCanvas: Boolean,
      domCreateContainer: Boolean,
      domPointerEvents: String,
      expandParent: Boolean,
      failIfMajorPerformanceCaveat: Boolean,
      fps: FPSConfig,
      fullscreenTarget: HTMLElement | String,
      gameTitle: String,
      gameURL: String,
      gameVersion: String,
      height: Double | String,
      hideBanner: Boolean,
      hidePhaser: Boolean,
      inputActivePointers: Double,
      inputGamepad: Boolean,
      inputGamepadEventTarget: Any,
      inputKeyboard: Boolean,
      inputKeyboardCapture: js.Array[Double],
      inputKeyboardEventTarget: Any,
      inputMouse: Boolean | js.Object,
      inputMouseEventTarget: Any,
      inputMousePreventDefaultDown: Boolean,
      inputMousePreventDefaultMove: Boolean,
      inputMousePreventDefaultUp: Boolean,
      inputMousePreventDefaultWheel: Boolean,
      inputSmoothFactor: Double,
      inputTouch: Boolean,
      inputTouchCapture: Boolean,
      inputTouchEventTarget: Any,
      inputWindowEvents: Boolean,
      installGlobalPlugins: Any,
      installScenePlugins: Any,
      loaderAsync: Boolean,
      loaderBaseURL: String,
      loaderMaxParallelDownloads: Double,
      loaderPassword: String,
      loaderPath: String,
      loaderResponseType: String,
      loaderTimeout: Double,
      loaderUser: String,
      loaderWithCredentials: Boolean,
      maxHeight: Double,
      maxLights: Double,
      maxTextures: Double,
      maxWidth: Double,
      minHeight: Double,
      minWidth: Double,
      mipmapFilter: String,
      missingImage: String,
      parent: Any,
      physics: PhysicsConfig,
      pipeline: PipelineConfig,
      pixelArt: Boolean,
      postBoot: Game => Callback,
      powerPreference: String,
      preBoot: Game => Callback,
      premultipliedAlpha: Boolean,
      preserveDrawingBuffer: Boolean,
      renderType: Double,
      resizeInterval: Double,
      roundPixels: Boolean,
      scaleMode: ScaleModeType,
      sceneConfig: js.Object,
      seed: js.Array[String],
      transparent: Boolean,
      whiteImage: String,
      width: Double | String,
      zoom: ZoomType | Double
    ): Config = {
      val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any], antialiasGL = antialiasGL.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], autoCenter = autoCenter.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], autoRound = autoRound.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bannerBackgroundColor = bannerBackgroundColor.asInstanceOf[js.Any], bannerTextColor = bannerTextColor.asInstanceOf[js.Any], batchSize = batchSize.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], canvasStyle = canvasStyle.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], customEnvironment = customEnvironment.asInstanceOf[js.Any], defaultImage = defaultImage.asInstanceOf[js.Any], defaultPhysicsSystem = defaultPhysicsSystem.asInstanceOf[js.Any], defaultPlugins = defaultPlugins.asInstanceOf[js.Any], desynchronized = desynchronized.asInstanceOf[js.Any], disableContextMenu = disableContextMenu.asInstanceOf[js.Any], domBehindCanvas = domBehindCanvas.asInstanceOf[js.Any], domCreateContainer = domCreateContainer.asInstanceOf[js.Any], domPointerEvents = domPointerEvents.asInstanceOf[js.Any], expandParent = expandParent.asInstanceOf[js.Any], failIfMajorPerformanceCaveat = failIfMajorPerformanceCaveat.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], fullscreenTarget = fullscreenTarget.asInstanceOf[js.Any], gameTitle = gameTitle.asInstanceOf[js.Any], gameURL = gameURL.asInstanceOf[js.Any], gameVersion = gameVersion.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideBanner = hideBanner.asInstanceOf[js.Any], hidePhaser = hidePhaser.asInstanceOf[js.Any], inputActivePointers = inputActivePointers.asInstanceOf[js.Any], inputGamepad = inputGamepad.asInstanceOf[js.Any], inputGamepadEventTarget = inputGamepadEventTarget.asInstanceOf[js.Any], inputKeyboard = inputKeyboard.asInstanceOf[js.Any], inputKeyboardCapture = inputKeyboardCapture.asInstanceOf[js.Any], inputKeyboardEventTarget = inputKeyboardEventTarget.asInstanceOf[js.Any], inputMouse = inputMouse.asInstanceOf[js.Any], inputMouseEventTarget = inputMouseEventTarget.asInstanceOf[js.Any], inputMousePreventDefaultDown = inputMousePreventDefaultDown.asInstanceOf[js.Any], inputMousePreventDefaultMove = inputMousePreventDefaultMove.asInstanceOf[js.Any], inputMousePreventDefaultUp = inputMousePreventDefaultUp.asInstanceOf[js.Any], inputMousePreventDefaultWheel = inputMousePreventDefaultWheel.asInstanceOf[js.Any], inputSmoothFactor = inputSmoothFactor.asInstanceOf[js.Any], inputTouch = inputTouch.asInstanceOf[js.Any], inputTouchCapture = inputTouchCapture.asInstanceOf[js.Any], inputTouchEventTarget = inputTouchEventTarget.asInstanceOf[js.Any], inputWindowEvents = inputWindowEvents.asInstanceOf[js.Any], installGlobalPlugins = installGlobalPlugins.asInstanceOf[js.Any], installScenePlugins = installScenePlugins.asInstanceOf[js.Any], loaderAsync = loaderAsync.asInstanceOf[js.Any], loaderBaseURL = loaderBaseURL.asInstanceOf[js.Any], loaderMaxParallelDownloads = loaderMaxParallelDownloads.asInstanceOf[js.Any], loaderPassword = loaderPassword.asInstanceOf[js.Any], loaderPath = loaderPath.asInstanceOf[js.Any], loaderResponseType = loaderResponseType.asInstanceOf[js.Any], loaderTimeout = loaderTimeout.asInstanceOf[js.Any], loaderUser = loaderUser.asInstanceOf[js.Any], loaderWithCredentials = loaderWithCredentials.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxLights = maxLights.asInstanceOf[js.Any], maxTextures = maxTextures.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], mipmapFilter = mipmapFilter.asInstanceOf[js.Any], missingImage = missingImage.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], pixelArt = pixelArt.asInstanceOf[js.Any], postBoot = js.Any.fromFunction1((t0: Game) => postBoot(t0).runNow()), powerPreference = powerPreference.asInstanceOf[js.Any], preBoot = js.Any.fromFunction1((t0: Game) => preBoot(t0).runNow()), premultipliedAlpha = premultipliedAlpha.asInstanceOf[js.Any], preserveDrawingBuffer = preserveDrawingBuffer.asInstanceOf[js.Any], renderType = renderType.asInstanceOf[js.Any], resizeInterval = resizeInterval.asInstanceOf[js.Any], roundPixels = roundPixels.asInstanceOf[js.Any], scaleMode = scaleMode.asInstanceOf[js.Any], sceneConfig = sceneConfig.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], whiteImage = whiteImage.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      inline def setAntialiasGL(value: Boolean): Self = StObject.set(x, "antialiasGL", value.asInstanceOf[js.Any])
      
      inline def setAudio(value: AudioConfig): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAutoCenter(value: CenterType): Self = StObject.set(x, "autoCenter", value.asInstanceOf[js.Any])
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoRound(value: Boolean): Self = StObject.set(x, "autoRound", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBannerBackgroundColor(value: js.Array[String]): Self = StObject.set(x, "bannerBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBannerBackgroundColorVarargs(value: String*): Self = StObject.set(x, "bannerBackgroundColor", js.Array(value*))
      
      inline def setBannerTextColor(value: String): Self = StObject.set(x, "bannerTextColor", value.asInstanceOf[js.Any])
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasStyle(value: String): Self = StObject.set(x, "canvasStyle", value.asInstanceOf[js.Any])
      
      inline def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
      
      inline def setContext(value: CanvasRenderingContext2D | WebGLRenderingContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setCustomEnvironment(value: Boolean): Self = StObject.set(x, "customEnvironment", value.asInstanceOf[js.Any])
      
      inline def setDefaultImage(value: String): Self = StObject.set(x, "defaultImage", value.asInstanceOf[js.Any])
      
      inline def setDefaultPhysicsSystem(value: Boolean | String): Self = StObject.set(x, "defaultPhysicsSystem", value.asInstanceOf[js.Any])
      
      inline def setDefaultPlugins(value: Any): Self = StObject.set(x, "defaultPlugins", value.asInstanceOf[js.Any])
      
      inline def setDesynchronized(value: Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
      
      inline def setDisableContextMenu(value: Boolean): Self = StObject.set(x, "disableContextMenu", value.asInstanceOf[js.Any])
      
      inline def setDomBehindCanvas(value: Boolean): Self = StObject.set(x, "domBehindCanvas", value.asInstanceOf[js.Any])
      
      inline def setDomCreateContainer(value: Boolean): Self = StObject.set(x, "domCreateContainer", value.asInstanceOf[js.Any])
      
      inline def setDomPointerEvents(value: String): Self = StObject.set(x, "domPointerEvents", value.asInstanceOf[js.Any])
      
      inline def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
      
      inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
      
      inline def setFps(value: FPSConfig): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFullscreenTarget(value: HTMLElement | String): Self = StObject.set(x, "fullscreenTarget", value.asInstanceOf[js.Any])
      
      inline def setGameTitle(value: String): Self = StObject.set(x, "gameTitle", value.asInstanceOf[js.Any])
      
      inline def setGameURL(value: String): Self = StObject.set(x, "gameURL", value.asInstanceOf[js.Any])
      
      inline def setGameVersion(value: String): Self = StObject.set(x, "gameVersion", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHideBanner(value: Boolean): Self = StObject.set(x, "hideBanner", value.asInstanceOf[js.Any])
      
      inline def setHidePhaser(value: Boolean): Self = StObject.set(x, "hidePhaser", value.asInstanceOf[js.Any])
      
      inline def setInputActivePointers(value: Double): Self = StObject.set(x, "inputActivePointers", value.asInstanceOf[js.Any])
      
      inline def setInputGamepad(value: Boolean): Self = StObject.set(x, "inputGamepad", value.asInstanceOf[js.Any])
      
      inline def setInputGamepadEventTarget(value: Any): Self = StObject.set(x, "inputGamepadEventTarget", value.asInstanceOf[js.Any])
      
      inline def setInputKeyboard(value: Boolean): Self = StObject.set(x, "inputKeyboard", value.asInstanceOf[js.Any])
      
      inline def setInputKeyboardCapture(value: js.Array[Double]): Self = StObject.set(x, "inputKeyboardCapture", value.asInstanceOf[js.Any])
      
      inline def setInputKeyboardCaptureVarargs(value: Double*): Self = StObject.set(x, "inputKeyboardCapture", js.Array(value*))
      
      inline def setInputKeyboardEventTarget(value: Any): Self = StObject.set(x, "inputKeyboardEventTarget", value.asInstanceOf[js.Any])
      
      inline def setInputMouse(value: Boolean | js.Object): Self = StObject.set(x, "inputMouse", value.asInstanceOf[js.Any])
      
      inline def setInputMouseEventTarget(value: Any): Self = StObject.set(x, "inputMouseEventTarget", value.asInstanceOf[js.Any])
      
      inline def setInputMousePreventDefaultDown(value: Boolean): Self = StObject.set(x, "inputMousePreventDefaultDown", value.asInstanceOf[js.Any])
      
      inline def setInputMousePreventDefaultMove(value: Boolean): Self = StObject.set(x, "inputMousePreventDefaultMove", value.asInstanceOf[js.Any])
      
      inline def setInputMousePreventDefaultUp(value: Boolean): Self = StObject.set(x, "inputMousePreventDefaultUp", value.asInstanceOf[js.Any])
      
      inline def setInputMousePreventDefaultWheel(value: Boolean): Self = StObject.set(x, "inputMousePreventDefaultWheel", value.asInstanceOf[js.Any])
      
      inline def setInputSmoothFactor(value: Double): Self = StObject.set(x, "inputSmoothFactor", value.asInstanceOf[js.Any])
      
      inline def setInputTouch(value: Boolean): Self = StObject.set(x, "inputTouch", value.asInstanceOf[js.Any])
      
      inline def setInputTouchCapture(value: Boolean): Self = StObject.set(x, "inputTouchCapture", value.asInstanceOf[js.Any])
      
      inline def setInputTouchEventTarget(value: Any): Self = StObject.set(x, "inputTouchEventTarget", value.asInstanceOf[js.Any])
      
      inline def setInputWindowEvents(value: Boolean): Self = StObject.set(x, "inputWindowEvents", value.asInstanceOf[js.Any])
      
      inline def setInstallGlobalPlugins(value: Any): Self = StObject.set(x, "installGlobalPlugins", value.asInstanceOf[js.Any])
      
      inline def setInstallScenePlugins(value: Any): Self = StObject.set(x, "installScenePlugins", value.asInstanceOf[js.Any])
      
      inline def setLoaderAsync(value: Boolean): Self = StObject.set(x, "loaderAsync", value.asInstanceOf[js.Any])
      
      inline def setLoaderBaseURL(value: String): Self = StObject.set(x, "loaderBaseURL", value.asInstanceOf[js.Any])
      
      inline def setLoaderCrossOrigin(value: String): Self = StObject.set(x, "loaderCrossOrigin", value.asInstanceOf[js.Any])
      
      inline def setLoaderCrossOriginUndefined: Self = StObject.set(x, "loaderCrossOrigin", js.undefined)
      
      inline def setLoaderMaxParallelDownloads(value: Double): Self = StObject.set(x, "loaderMaxParallelDownloads", value.asInstanceOf[js.Any])
      
      inline def setLoaderPassword(value: String): Self = StObject.set(x, "loaderPassword", value.asInstanceOf[js.Any])
      
      inline def setLoaderPath(value: String): Self = StObject.set(x, "loaderPath", value.asInstanceOf[js.Any])
      
      inline def setLoaderResponseType(value: String): Self = StObject.set(x, "loaderResponseType", value.asInstanceOf[js.Any])
      
      inline def setLoaderTimeout(value: Double): Self = StObject.set(x, "loaderTimeout", value.asInstanceOf[js.Any])
      
      inline def setLoaderUser(value: String): Self = StObject.set(x, "loaderUser", value.asInstanceOf[js.Any])
      
      inline def setLoaderWithCredentials(value: Boolean): Self = StObject.set(x, "loaderWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxLights(value: Double): Self = StObject.set(x, "maxLights", value.asInstanceOf[js.Any])
      
      inline def setMaxTextures(value: Double): Self = StObject.set(x, "maxTextures", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMipmapFilter(value: String): Self = StObject.set(x, "mipmapFilter", value.asInstanceOf[js.Any])
      
      inline def setMissingImage(value: String): Self = StObject.set(x, "missingImage", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPhysics(value: PhysicsConfig): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
      
      inline def setPipeline(value: PipelineConfig): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
      
      inline def setPixelArt(value: Boolean): Self = StObject.set(x, "pixelArt", value.asInstanceOf[js.Any])
      
      inline def setPostBoot(value: Game => Callback): Self = StObject.set(x, "postBoot", js.Any.fromFunction1((t0: Game) => value(t0).runNow()))
      
      inline def setPowerPreference(value: String): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
      
      inline def setPreBoot(value: Game => Callback): Self = StObject.set(x, "preBoot", js.Any.fromFunction1((t0: Game) => value(t0).runNow()))
      
      inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
      
      inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      inline def setRenderType(value: Double): Self = StObject.set(x, "renderType", value.asInstanceOf[js.Any])
      
      inline def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
      
      inline def setRoundPixels(value: Boolean): Self = StObject.set(x, "roundPixels", value.asInstanceOf[js.Any])
      
      inline def setScaleMode(value: ScaleModeType): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
      
      inline def setSceneConfig(value: js.Object): Self = StObject.set(x, "sceneConfig", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: js.Array[String]): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedVarargs(value: String*): Self = StObject.set(x, "seed", js.Array(value*))
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setWhiteImage(value: String): Self = StObject.set(x, "whiteImage", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: ZoomType | Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The core runner class that Phaser uses to handle the game loop. It can use either Request Animation Frame,
    * or SetTimeout, based on browser support and config settings, to create a continuous loop within the browser.
    * 
    * Each time the loop fires, `TimeStep.step` is called and this is then passed onto the core Game update loop,
    * it is the core heartbeat of your game. It will fire as often as Request Animation Frame is capable of handling
    * on the target device.
    * 
    * Note that there are lots of situations where a browser will stop updating your game. Such as if the player
    * switches tabs, or covers up the browser window with another application. In these cases, the 'heartbeat'
    * of your game will pause, and only resume when focus is returned to it by the player. There is no way to avoid
    * this situation, all you can do is use the visibility events the browser, and Phaser, provide to detect when
    * it has happened and then gracefully recover.
    */
  @js.native
  trait TimeStep extends StObject {
    
    /**
      * An exponential moving average of the frames per second.
      */
    val actualFps: Double = js.native
    
    /**
      * Called by the Game instance when the DOM window.onBlur event triggers.
      */
    def blur(): Unit = js.native
    
    /**
      * A callback to be invoked each time the Time Step steps.
      */
    def callback(time: Double, average: Double, interpolation: Double): Unit = js.native
    /**
      * A callback to be invoked each time the Time Step steps.
      */
    @JSName("callback")
    var callback_Original: TimeStepCallback = js.native
    
    /**
      * The delta time, in ms, since the last game step. This is a clamped and smoothed average value.
      */
    var delta: Double = js.native
    
    /**
      * Internal array holding the previous delta values, used for delta smoothing.
      */
    var deltaHistory: js.Array[Double] = js.native
    
    /**
      * Internal index of the delta history position.
      */
    var deltaIndex: Double = js.native
    
    /**
      * The maximum number of delta values that are retained in order to calculate a smoothed moving average.
      * 
      * This can be changed in the Game Config via the `fps.deltaHistory` property. The default is 10.
      */
    var deltaSmoothingMax: Double = js.native
    
    /**
      * Destroys the TimeStep. This will stop Request Animation Frame, stop the step, clear the callbacks and null
      * any objects.
      */
    def destroy(): Unit = js.native
    
    /**
      * Called by the Game instance when the DOM window.onFocus event triggers.
      */
    def focus(): Unit = js.native
    
    /**
      * You can force the Time Step to use Set Timeout instead of Request Animation Frame by setting
      * the `forceSetTimeOut` property to `true` in the Game Configuration object. It cannot be changed at run-time.
      */
    val forceSetTimeOut: Boolean = js.native
    
    /**
      * The current frame the game is on. This counter is incremented once every game step, regardless of how much
      * time has passed and is unaffected by delta smoothing.
      */
    val frame: Double = js.native
    
    /**
      * The number of frames processed this second.
      */
    val framesThisSecond: Double = js.native
    
    /**
      * A reference to the Phaser.Game instance.
      */
    val game: Game = js.native
    
    /**
      * Gets the duration which the game has been running, in seconds.
      */
    def getDuration(): Double = js.native
    
    /**
      * Gets the duration which the game has been running, in ms.
      */
    def getDurationMS(): Double = js.native
    
    /**
      * Is the browser currently considered in focus by the Page Visibility API?
      * This value is set in the `blur` method, which is called automatically by the Game instance.
      */
    val inFocus: Boolean = js.native
    
    /**
      * The time, as returned by `performance.now` of the previous step.
      */
    var lastTime: Double = js.native
    
    /**
      * The minimum fps rate you want the Time Step to run at.
      */
    var minFps: Double = js.native
    
    /**
      * The time at which the next fps rate update will take place.
      * When an fps update happens, the `framesThisSecond` value is reset.
      */
    val nextFpsUpdate: Double = js.native
    
    /**
      * The time, as returned by `performance.now` at the very start of the current step.
      * This can differ from the `time` value in that it isn't calculated based on the delta value.
      */
    var now: Double = js.native
    
    /**
      * The number of frames that the cooldown is set to after the browser panics over the FPS rate, usually
      * as a result of switching tabs and regaining focus.
      * 
      * This can be changed in the Game Config via the `fps.panicMax` property. The default is 120.
      */
    var panicMax: Double = js.native
    
    /**
      * Called when the visibility API says the game is 'hidden' (tab switch out of view, etc)
      */
    def pause(): Unit = js.native
    
    /**
      * The Request Animation Frame DOM Event handler.
      */
    val raf: RequestAnimationFrame = js.native
    
    /**
      * The actual elapsed time in ms between one update and the next.
      * 
      * Unlike with `delta`, no smoothing, capping, or averaging is applied to this value.
      * So please be careful when using this value in math calculations.
      */
    var rawDelta: Double = js.native
    
    /**
      * Resets the time, lastTime, fps averages and delta history.
      * Called automatically when a browser sleeps them resumes.
      */
    def resetDelta(): Unit = js.native
    
    /**
      * Called when the visibility API says the game is 'visible' again (tab switch back into view, etc)
      */
    def resume(): Unit = js.native
    
    /**
      * A flag that is set once the TimeStep has started running and toggled when it stops.
      * The difference between this value and `started` is that `running` is toggled when
      * the TimeStep is sent to sleep, where-as `started` remains `true`, only changing if
      * the TimeStep is actually stopped, not just paused.
      */
    val running: Boolean = js.native
    
    /**
      * Sends the TimeStep to sleep, stopping Request Animation Frame (or SetTimeout) and toggling the `running` flag to false.
      */
    def sleep(): Unit = js.native
    
    /**
      * Apply smoothing to the delta value used within Phasers internal calculations?
      * 
      * This can be changed in the Game Config via the `fps.smoothStep` property. The default is `true`.
      * 
      * Smoothing helps settle down the delta values after browser tab switches, or other situations
      * which could cause significant delta spikes or dips. By default it has been enabled in Phaser 3
      * since the first version, but is now exposed under this property (and the corresponding game config
      * `smoothStep` value), to allow you to easily disable it, should you require.
      */
    var smoothStep: Boolean = js.native
    
    /**
      * Starts the Time Step running, if it is not already doing so.
      * Called automatically by the Game Boot process.
      * @param callback The callback to be invoked each time the Time Step steps.
      */
    def start(callback: TimeStepCallback): Unit = js.native
    
    /**
      * The time at which the game started running. This value is adjusted if the game is then
      * paused and resumes.
      */
    var startTime: Double = js.native
    
    /**
      * A flag that is set once the TimeStep has started running and toggled when it stops.
      */
    val started: Boolean = js.native
    
    /**
      * The main step method. This is called each time the browser updates, either by Request Animation Frame,
      * or by Set Timeout. It is responsible for calculating the delta values, frame totals, cool down history and more.
      * You generally should never call this method directly.
      */
    def step(): Unit = js.native
    
    /**
      * Stops the TimeStep running.
      */
    def stop(): this.type = js.native
    
    /**
      * The target fps rate for the Time Step to run at.
      * 
      * Setting this value will not actually change the speed at which the browser runs, that is beyond
      * the control of Phaser. Instead, it allows you to determine performance issues and if the Time Step
      * is spiraling out of control.
      */
    var targetFps: Double = js.native
    
    /**
      * Manually calls `TimeStep.step`.
      */
    def tick(): Unit = js.native
    
    /**
      * The time, calculated at the start of the current step, as smoothed by the delta value.
      */
    var time: Double = js.native
    
    /**
      * Wakes-up the TimeStep, restarting Request Animation Frame (or SetTimeout) and toggling the `running` flag to true.
      * The `seamless` argument controls if the wake-up should adjust the start time or not.
      * @param seamless Adjust the startTime based on the lastTime values. Default false.
      */
    def wake(): Unit = js.native
    def wake(seamless: Boolean): Unit = js.native
  }
}
