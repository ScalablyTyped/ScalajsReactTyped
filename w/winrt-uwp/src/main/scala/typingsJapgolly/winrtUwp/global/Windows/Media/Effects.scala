package typingsJapgolly.winrtUwp.global.Windows.Media

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.Windows.Foundation.Size
import typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaCategory
import typingsJapgolly.winrtUwp.Windows.Media.Editing.MediaOverlay
import typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.MediaMirroringOptions
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.MediaRotation
import typingsJapgolly.winrtUwp.Windows.Media.Render.AudioRenderCategory
import typingsJapgolly.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm
import typingsJapgolly.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for discovering the audio processing chain on a device. */
object Effects {
  
  /** Represent an audio capture effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Effects.AudioCaptureEffectsManager")
  @js.native
  open class AudioCaptureEffectsManager ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager
  
  /** Represents an audio effect. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Effects.AudioEffect")
  @js.native
  open class AudioEffect ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffect {
    
    /** Gets the type of the audio effect. */
    /* CompleteClass */
    var audioEffectType: AudioEffectType = js.native
  }
  
  /** Represents an audio effect definition. */
  @JSGlobal("Windows.Media.Effects.AudioEffectDefinition")
  @js.native
  open class AudioEffectDefinition protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectDefinition {
    /**
      * Creates a new AudioEffectDefinition object with the specified activatable class ID.
      * @param activatableClassId The activatable class ID of the audio effect definition.
      */
    def this(activatableClassId: String) = this()
    /**
      * Creates a new AudioEffectDefinition object with the specified activatable class ID, configuring the object with the specified settings.
      * @param activatableClassId The activatable class ID of the audio effect definition.
      * @param props Configuration properties for the specified audio effect definition.
      */
    def this(activatableClassId: String, props: IPropertySet) = this()
    
    /** The activatable class ID of the audio effect definition. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** The set of properties for configuring an AudioEffectDefinition object. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
  }
  
  /** Defines values for audio effect types. */
  @JSGlobal("Windows.Media.Effects.AudioEffectType")
  @js.native
  object AudioEffectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType & Double] = js.native
    
    /* 1 */ val acousticEchoCancellation: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.acousticEchoCancellation & Double = js.native
    
    /* 3 */ val automaticGainControl: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.automaticGainControl & Double = js.native
    
    /* 8 */ val bassBoost: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.bassBoost & Double = js.native
    
    /* 13 */ val bassManagement: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.bassManagement & Double = js.native
    
    /* 4 */ val beamForming: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.beamForming & Double = js.native
    
    /* 5 */ val constantToneRemoval: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.constantToneRemoval & Double = js.native
    
    /* 17 */ val dynamicRangeCompression: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.dynamicRangeCompression & Double = js.native
    
    /* 14 */ val environmentalEffects: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.environmentalEffects & Double = js.native
    
    /* 6 */ val equalizer: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.equalizer & Double = js.native
    
    /* 7 */ val loudnessEqualizer: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.loudnessEqualizer & Double = js.native
    
    /* 2 */ val noiseSuppression: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.noiseSuppression & Double = js.native
    
    /* 0 */ val other: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.other & Double = js.native
    
    /* 12 */ val roomCorrection: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.roomCorrection & Double = js.native
    
    /* 16 */ val speakerCompensation: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.speakerCompensation & Double = js.native
    
    /* 11 */ val speakerFill: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.speakerFill & Double = js.native
    
    /* 15 */ val speakerProtection: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.speakerProtection & Double = js.native
    
    /* 10 */ val virtualHeadphones: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.virtualHeadphones & Double = js.native
    
    /* 9 */ val virtualSurround: typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectType.virtualSurround & Double = js.native
  }
  
  /** Provides functionality for creating audio capture and render effects manager objects. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Effects.AudioEffectsManager")
  @js.native
  open class AudioEffectsManager ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioEffectsManager
  object AudioEffectsManager {
    
    @JSGlobal("Windows.Media.Effects.AudioEffectsManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a AudioCaptureEffectsManager object for the specified device for a specific media category.
      * @param deviceId The device id.
      * @param category The media category.
      * @return The new audio capture effects manager.
      */
    /* static member */
    inline def createAudioCaptureEffectsManager(deviceId: String, category: MediaCategory): typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createAudioCaptureEffectsManager")(deviceId.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager]
    /**
      * Creates a AudioCaptureEffectsManager object for the specified device for a specific media category and audio processing mode.
      * @param deviceId The device id.
      * @param category The media category.
      * @param mode The audio processing mode.
      * @return The new audio capture effects manager.
      */
    /* static member */
    inline def createAudioCaptureEffectsManager(
      deviceId: String,
      category: MediaCategory,
      mode: typingsJapgolly.winrtUwp.Windows.Media.AudioProcessing
    ): typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createAudioCaptureEffectsManager")(deviceId.asInstanceOf[js.Any], category.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager]
    
    /**
      * Creates a AudioRenderEffectsManager object for the specified device for a specific media category and audio processing mode.
      * @param deviceId The device id.
      * @param category The audio render category.
      * @return The new audio render effects manager.
      */
    /* static member */
    inline def createAudioRenderEffectsManager(deviceId: String, category: AudioRenderCategory): typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createAudioRenderEffectsManager")(deviceId.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager]
    /**
      * Creates a AudioRenderEffectsManager object for the specified device for a specific media category.
      * @param deviceId The device id.
      * @param category The audio render category.
      * @param mode The audio precessing mode.
      * @return The new audio render effects manager.
      */
    /* static member */
    inline def createAudioRenderEffectsManager(
      deviceId: String,
      category: AudioRenderCategory,
      mode: typingsJapgolly.winrtUwp.Windows.Media.AudioProcessing
    ): typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createAudioRenderEffectsManager")(deviceId.asInstanceOf[js.Any], category.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager]
  }
  
  /** Represent an audio render effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Effects.AudioRenderEffectsManager")
  @js.native
  open class AudioRenderEffectsManager ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager
  
  /** Provides context for performing a custom overlay operation within the CompositeFrame method. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Effects.CompositeVideoFrameContext")
  @js.native
  open class CompositeVideoFrameContext ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.CompositeVideoFrameContext {
    
    /** Gets the background frame for an overlay operation. */
    /* CompleteClass */
    var backgroundFrame: typingsJapgolly.winrtUwp.Windows.Media.VideoFrame = js.native
    
    /**
      * Gets a MediaOverlay object for the provided Direct3D surface.
      * @param surfaceToOverlay The Direct3D surface.
      * @return The created MediaOverlay object.
      */
    /* CompleteClass */
    override def getOverlayForSurface(surfaceToOverlay: IDirect3DSurface): MediaOverlay = js.native
    
    /** Gets the output frame for an overlay operation. */
    /* CompleteClass */
    var outputFrame: typingsJapgolly.winrtUwp.Windows.Media.VideoFrame = js.native
    
    /** Gets the list of Direct3D surfaces to be used in an overlay operation. */
    /* CompleteClass */
    var surfacesToOverlay: IVectorView[IDirect3DSurface] = js.native
  }
  
  /** Specifies the reason why a media effect was closed. */
  @JSGlobal("Windows.Media.Effects.MediaEffectClosedReason")
  @js.native
  object MediaEffectClosedReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason & Double] = js.native
    
    /* 0 */ val done: typingsJapgolly.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.done & Double = js.native
    
    /* 3 */ val effectCurrentlyUnloaded: typingsJapgolly.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.effectCurrentlyUnloaded & Double = js.native
    
    /* 1 */ val unknownError: typingsJapgolly.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.unknownError & Double = js.native
    
    /* 2 */ val unsupportedEncodingFormat: typingsJapgolly.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.unsupportedEncodingFormat & Double = js.native
  }
  
  /** Specifies the types of memory that can be used for a media operation. */
  @JSGlobal("Windows.Media.Effects.MediaMemoryTypes")
  @js.native
  object MediaMemoryTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Effects.MediaMemoryTypes & Double] = js.native
    
    /* 1 */ val cpu: typingsJapgolly.winrtUwp.Windows.Media.Effects.MediaMemoryTypes.cpu & Double = js.native
    
    /* 0 */ val gpu: typingsJapgolly.winrtUwp.Windows.Media.Effects.MediaMemoryTypes.gpu & Double = js.native
    
    /* 2 */ val gpuAndCpu: typingsJapgolly.winrtUwp.Windows.Media.Effects.MediaMemoryTypes.gpuAndCpu & Double = js.native
  }
  
  /** Provides context for performing a custom audio effect operation within the ProcessFrame method. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Effects.ProcessAudioFrameContext")
  @js.native
  open class ProcessAudioFrameContext ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.ProcessAudioFrameContext {
    
    /** Gets the input frame for an audio effect operation. */
    /* CompleteClass */
    var inputFrame: typingsJapgolly.winrtUwp.Windows.Media.AudioFrame = js.native
    
    /** Gets the output frame for an audio effect operation. */
    /* CompleteClass */
    var outputFrame: typingsJapgolly.winrtUwp.Windows.Media.AudioFrame = js.native
  }
  
  /** Provides context for performing a custom video effect operation within the ProcessFrame method. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Effects.ProcessVideoFrameContext")
  @js.native
  open class ProcessVideoFrameContext ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.ProcessVideoFrameContext {
    
    /** Gets the input frame for a video effect operation. */
    /* CompleteClass */
    var inputFrame: typingsJapgolly.winrtUwp.Windows.Media.VideoFrame = js.native
    
    /** Gets the output frame for a video effect operation. */
    /* CompleteClass */
    var outputFrame: typingsJapgolly.winrtUwp.Windows.Media.VideoFrame = js.native
  }
  
  /** Represents the definition of a custom video compositor. */
  @JSGlobal("Windows.Media.Effects.VideoCompositorDefinition")
  @js.native
  open class VideoCompositorDefinition protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.VideoCompositorDefinition {
    /**
      * Initializes a new instance of the VideoCompositorDefinition class.
      * @param activatableClassId The activatable class ID of the video compositor.
      */
    def this(activatableClassId: String) = this()
    /**
      * Initializes a new instance of the VideoCompositorDefinition class.
      * @param activatableClassId The activatable class ID of the video compositor.
      * @param props The set of properties for configuring the video compositor object.
      */
    def this(activatableClassId: String, props: IPropertySet) = this()
    
    /** Gets the activatable class ID of the video compositor. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** Gets the set of properties for configuring the video compositor object. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
  }
  
  /** Represents a video effect definition. */
  @JSGlobal("Windows.Media.Effects.VideoEffectDefinition")
  @js.native
  open class VideoEffectDefinition protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.VideoEffectDefinition {
    /**
      * Creates a new VideoEffectDefinition object with the specified activatable class ID.
      * @param activatableClassId The activatable class ID of the video effect definition.
      */
    def this(activatableClassId: String) = this()
    /**
      * Creates a new VideoEffectDefinition object with the specified activatable class ID, configuring the object with the specified settings.
      * @param activatableClassId The activatable class ID of the video effect definition.
      * @param props Configuration properties for the specified video effect definition.
      */
    def this(activatableClassId: String, props: IPropertySet) = this()
    
    /** Gets the activatable class ID of the video effect definition. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** Gets the set of properties for configuring the VideoEffectDefinition object. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
  }
  
  /** Represents the definition of a video transform effect. */
  @JSGlobal("Windows.Media.Effects.VideoTransformEffectDefinition")
  @js.native
  /** Initializes a new instance of the VideoTransformEffectDefinition class. */
  open class VideoTransformEffectDefinition ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Effects.VideoTransformEffectDefinition {
    
    /** Gets the activatable class ID of the video transform effect definition. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** Gets or sets the rectangle within which the video will be cropped, specified in pixels. */
    /* CompleteClass */
    var cropRectangle: Rect = js.native
    
    /** Gets or sets the direction in which the video will be mirrored. */
    /* CompleteClass */
    var mirror: MediaMirroringOptions = js.native
    
    /** Gets or sets the output size of the video, in pixels. */
    /* CompleteClass */
    var outputSize: Size = js.native
    
    /** Gets or sets the color that will be used to fill pixels in the frame that are not filled with video, such as when video is letterboxed. */
    /* CompleteClass */
    var paddingColor: Color = js.native
    
    /** Gets or sets the media processing algorithm that is used for the video transform. */
    /* CompleteClass */
    var processingAlgorithm: MediaVideoProcessingAlgorithm = js.native
    
    /** Gets the set of properties for configuring the VideoTransformEffectDefinition object. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
    
    /** Gets or sets the angle and direction in which the video will be rotated. */
    /* CompleteClass */
    var rotation: MediaRotation = js.native
  }
}
