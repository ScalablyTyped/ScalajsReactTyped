package typingsJapgolly.babylonjs.enginesIndexMod

import org.scalajs.dom.Blob
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.babylonjs.HTMLCanvasElement
import typingsJapgolly.babylonjs.OffscreenCanvas
import typingsJapgolly.babylonjs.WebGL2RenderingContext
import typingsJapgolly.babylonjs.anon.Capture
import typingsJapgolly.babylonjs.anon.CaptureConstraint
import typingsJapgolly.babylonjs.enginesThinEngineMod.EngineOptions
import typingsJapgolly.babylonjs.materialsTexturesInternalTextureLoaderMod.IInternalTextureLoader
import typingsJapgolly.babylonjs.miscFileRequestMod.IFileRequest
import typingsJapgolly.babylonjs.miscFileToolsMod.LoadFileError
import typingsJapgolly.babylonjs.miscWebRequestMod.WebRequest
import typingsJapgolly.babylonjs.offlineIofflineproviderMod.IOfflineProvider
import typingsJapgolly.babylonjs.typesMod.Nullable
import typingsJapgolly.std.ImageBitmap
import typingsJapgolly.std.ImageBitmapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/index", "ThinEngine")
@js.native
open class ThinEngine protected ()
  extends typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine {
  /**
    * Creates a new engine
    * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which already used the WebGL context
    * @param antialias defines enable antialiasing (default: false)
    * @param options defines further options to be sent to the getContext() function
    * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
    */
  def this(canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ]) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Unit,
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: Unit,
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Unit,
    options: Unit,
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Unit,
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
}
/* static members */
object ThinEngine {
  
  @JSImport("babylonjs/Engines/index", "ThinEngine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Find the next highest power of two.
    * @param x Number to start search from.
    * @returns Next highest power of two.
    */
  inline def CeilingPOT(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CeilingPOT")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Gets or sets the epsilon value used by collision engine
    */
  @JSImport("babylonjs/Engines/index", "ThinEngine.CollisionsEpsilon")
  @js.native
  def CollisionsEpsilon: Double = js.native
  inline def CollisionsEpsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CollisionsEpsilon")(x.asInstanceOf[js.Any])
  
  /** Use this array to turn off some WebGL2 features on known buggy browsers version */
  @JSImport("babylonjs/Engines/index", "ThinEngine.ExceptionList")
  @js.native
  def ExceptionList: js.Array[Capture | CaptureConstraint] = js.native
  inline def ExceptionList_=(x: js.Array[Capture | CaptureConstraint]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExceptionList")(x.asInstanceOf[js.Any])
  
  /**
    * Find the next lowest power of two.
    * @param x Number to start search from.
    * @returns Next lowest power of two.
    */
  inline def FloorPOT(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("FloorPOT")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Get the closest exponent of two
    * @param value defines the value to approximate
    * @param max defines the maximum value to return
    * @param mode defines how to define the closest value
    * @returns closest exponent of two of the given value
    */
  inline def GetExponentOfTwo(value: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetExponentOfTwo")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def GetExponentOfTwo(value: Double, max: Double, mode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetExponentOfTwo")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Find the nearest power of two.
    * @param x Number to start search from.
    * @returns Next nearest power of two.
    */
  inline def NearestPOT(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("NearestPOT")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Queue a new function into the requested animation frame pool (ie. this function will be executed byt the browser for the next frame)
    * @param func - the function to be called
    * @param requester - the object that will request the next frame. Falls back to window.
    * @returns frame number
    */
  inline def QueueNewFrame(func: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("QueueNewFrame")(func.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def QueueNewFrame(func: js.Function0[Unit], requester: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("QueueNewFrame")(func.asInstanceOf[js.Any], requester.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def _ConcatenateShader(source: String, defines: Nullable[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_ConcatenateShader")(source.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def _ConcatenateShader(source: String, defines: Nullable[String], shaderVersion: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_ConcatenateShader")(source.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], shaderVersion.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("babylonjs/Engines/index", "ThinEngine._CreateCanvas")
  @js.native
  def _CreateCanvas: Any = js.native
  inline def _CreateCanvas_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCanvas")(x.asInstanceOf[js.Any])
  
  /**
    * Loads a file from a url
    * @param url url to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param offlineProvider defines the offline provider for caching
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @returns a file request object
    * @internal
    */
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: Unit,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[WebRequest], 
      /* exception */ js.UndefOr[LoadFileError], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: js.Function2[
      /* request */ js.UndefOr[WebRequest], 
      /* exception */ js.UndefOr[LoadFileError], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[WebRequest], 
      /* exception */ js.UndefOr[LoadFileError], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: js.Function2[
      /* request */ js.UndefOr[WebRequest], 
      /* exception */ js.UndefOr[LoadFileError], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[WebRequest], 
      /* exception */ js.UndefOr[LoadFileError], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: js.Function2[
      /* request */ js.UndefOr[WebRequest], 
      /* exception */ js.UndefOr[LoadFileError], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[WebRequest], 
      /* exception */ js.UndefOr[LoadFileError], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: js.Function2[
      /* request */ js.UndefOr[WebRequest], 
      /* exception */ js.UndefOr[LoadFileError], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  
  /**
    * Loads an image as an HTMLImageElement.
    * @param input url string, ArrayBuffer, or Blob to load
    * @param onLoad callback called when the image successfully loads
    * @param onError callback called when the image fails to load
    * @param offlineProvider offline provider for caching
    * @param mimeType optional mime type
    * @param imageBitmapOptions optional the options to use when creating an ImageBitmap
    * @returns the HTMLImageElement of the loaded image
    * @internal
    */
  inline def _FileToolsLoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: Unit,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: Unit,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: Unit,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def _FileToolsLoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: Unit,
    imageBitmapOptions: ImageBitmapOptions
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  
  @JSImport("babylonjs/Engines/index", "ThinEngine._HasMajorPerformanceCaveat")
  @js.native
  def _HasMajorPerformanceCaveat: Any = js.native
  inline def _HasMajorPerformanceCaveat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HasMajorPerformanceCaveat")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Engines/index", "ThinEngine._IsSupported")
  @js.native
  def _IsSupported: Any = js.native
  inline def _IsSupported_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsSupported")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/Engines/index", "ThinEngine._TextureLoaders")
  @js.native
  def _TextureLoaders: js.Array[IInternalTextureLoader] = js.native
  inline def _TextureLoaders_=(x: js.Array[IInternalTextureLoader]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureLoaders")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a boolean indicating if the engine can be instantiated (ie. if a webGL context can be found)
    * @returns true if the engine can be created
    * @ignorenaming
    */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
}
