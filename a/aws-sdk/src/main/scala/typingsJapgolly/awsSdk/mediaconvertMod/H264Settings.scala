package typingsJapgolly.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H264Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.native
  /**
    * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max1152000000] = js.native
  /**
    * Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
    */
  var CodecLevel: js.UndefOr[H264CodecLevel] = js.native
  /**
    * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
    */
  var CodecProfile: js.UndefOr[H264CodecProfile] = js.native
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[H264DynamicSubGop] = js.native
  /**
    * Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
    */
  var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.native
  /**
    * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
    */
  var FieldEncoding: js.UndefOr[H264FieldEncoding] = js.native
  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization] = js.native
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[H264FramerateControl] = js.native
  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm] = js.native
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  var GopBReference: js.UndefOr[H264GopBReference] = js.native
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.native
  /**
    * Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.native
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[integerMin0Max100] = js.native
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max1152000000] = js.native
  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type, as follows.
    - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  var InterlaceMode: js.UndefOr[H264InterlaceMode] = js.native
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max1152000000] = js.native
  /**
    * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.native
  /**
    * Number of B-frames between reference frames.
    */
  var NumberBFramesBetweenReferenceFrames: js.UndefOr[integerMin0Max7] = js.native
  /**
    * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
    */
  var NumberReferenceFrames: js.UndefOr[integerMin1Max6] = js.native
  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  var ParControl: js.UndefOr[H264ParControl] = js.native
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Use Quality tuning level (H264QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality singlepass, or high-quality multipass video encoding.
    */
  var QualityTuningLevel: js.UndefOr[H264QualityTuningLevel] = js.native
  /**
    * Settings for quality-defined variable bitrate encoding with the H.264 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  var QvbrSettings: js.UndefOr[H264QvbrSettings] = js.native
  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  var RateControlMode: js.UndefOr[H264RateControlMode] = js.native
  /**
    * Places a PPS header on each encoded picture, even if repeated.
    */
  var RepeatPps: js.UndefOr[H264RepeatPps] = js.native
  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.native
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.native
  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  var SlowPal: js.UndefOr[H264SlowPal] = js.native
  /**
    * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
    */
  var Softness: js.UndefOr[integerMin0Max128] = js.native
  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization] = js.native
  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  var Syntax: js.UndefOr[H264Syntax] = js.native
  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  var Telecine: js.UndefOr[H264Telecine] = js.native
  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  var TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization] = js.native
  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  var UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode] = js.native
}

object H264Settings {
  @scala.inline
  def apply(
    AdaptiveQuantization: H264AdaptiveQuantization = null,
    Bitrate: Int | Double = null,
    CodecLevel: H264CodecLevel = null,
    CodecProfile: H264CodecProfile = null,
    DynamicSubGop: H264DynamicSubGop = null,
    EntropyEncoding: H264EntropyEncoding = null,
    FieldEncoding: H264FieldEncoding = null,
    FlickerAdaptiveQuantization: H264FlickerAdaptiveQuantization = null,
    FramerateControl: H264FramerateControl = null,
    FramerateConversionAlgorithm: H264FramerateConversionAlgorithm = null,
    FramerateDenominator: Int | Double = null,
    FramerateNumerator: Int | Double = null,
    GopBReference: H264GopBReference = null,
    GopClosedCadence: Int | Double = null,
    GopSize: Int | Double = null,
    GopSizeUnits: H264GopSizeUnits = null,
    HrdBufferInitialFillPercentage: Int | Double = null,
    HrdBufferSize: Int | Double = null,
    InterlaceMode: H264InterlaceMode = null,
    MaxBitrate: Int | Double = null,
    MinIInterval: Int | Double = null,
    NumberBFramesBetweenReferenceFrames: Int | Double = null,
    NumberReferenceFrames: Int | Double = null,
    ParControl: H264ParControl = null,
    ParDenominator: Int | Double = null,
    ParNumerator: Int | Double = null,
    QualityTuningLevel: H264QualityTuningLevel = null,
    QvbrSettings: H264QvbrSettings = null,
    RateControlMode: H264RateControlMode = null,
    RepeatPps: H264RepeatPps = null,
    SceneChangeDetect: H264SceneChangeDetect = null,
    Slices: Int | Double = null,
    SlowPal: H264SlowPal = null,
    Softness: Int | Double = null,
    SpatialAdaptiveQuantization: H264SpatialAdaptiveQuantization = null,
    Syntax: H264Syntax = null,
    Telecine: H264Telecine = null,
    TemporalAdaptiveQuantization: H264TemporalAdaptiveQuantization = null,
    UnregisteredSeiTimecode: H264UnregisteredSeiTimecode = null
  ): H264Settings = {
    val __obj = js.Dynamic.literal()
    if (AdaptiveQuantization != null) __obj.updateDynamic("AdaptiveQuantization")(AdaptiveQuantization.asInstanceOf[js.Any])
    if (Bitrate != null) __obj.updateDynamic("Bitrate")(Bitrate.asInstanceOf[js.Any])
    if (CodecLevel != null) __obj.updateDynamic("CodecLevel")(CodecLevel.asInstanceOf[js.Any])
    if (CodecProfile != null) __obj.updateDynamic("CodecProfile")(CodecProfile.asInstanceOf[js.Any])
    if (DynamicSubGop != null) __obj.updateDynamic("DynamicSubGop")(DynamicSubGop.asInstanceOf[js.Any])
    if (EntropyEncoding != null) __obj.updateDynamic("EntropyEncoding")(EntropyEncoding.asInstanceOf[js.Any])
    if (FieldEncoding != null) __obj.updateDynamic("FieldEncoding")(FieldEncoding.asInstanceOf[js.Any])
    if (FlickerAdaptiveQuantization != null) __obj.updateDynamic("FlickerAdaptiveQuantization")(FlickerAdaptiveQuantization.asInstanceOf[js.Any])
    if (FramerateControl != null) __obj.updateDynamic("FramerateControl")(FramerateControl.asInstanceOf[js.Any])
    if (FramerateConversionAlgorithm != null) __obj.updateDynamic("FramerateConversionAlgorithm")(FramerateConversionAlgorithm.asInstanceOf[js.Any])
    if (FramerateDenominator != null) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator.asInstanceOf[js.Any])
    if (FramerateNumerator != null) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator.asInstanceOf[js.Any])
    if (GopBReference != null) __obj.updateDynamic("GopBReference")(GopBReference.asInstanceOf[js.Any])
    if (GopClosedCadence != null) __obj.updateDynamic("GopClosedCadence")(GopClosedCadence.asInstanceOf[js.Any])
    if (GopSize != null) __obj.updateDynamic("GopSize")(GopSize.asInstanceOf[js.Any])
    if (GopSizeUnits != null) __obj.updateDynamic("GopSizeUnits")(GopSizeUnits.asInstanceOf[js.Any])
    if (HrdBufferInitialFillPercentage != null) __obj.updateDynamic("HrdBufferInitialFillPercentage")(HrdBufferInitialFillPercentage.asInstanceOf[js.Any])
    if (HrdBufferSize != null) __obj.updateDynamic("HrdBufferSize")(HrdBufferSize.asInstanceOf[js.Any])
    if (InterlaceMode != null) __obj.updateDynamic("InterlaceMode")(InterlaceMode.asInstanceOf[js.Any])
    if (MaxBitrate != null) __obj.updateDynamic("MaxBitrate")(MaxBitrate.asInstanceOf[js.Any])
    if (MinIInterval != null) __obj.updateDynamic("MinIInterval")(MinIInterval.asInstanceOf[js.Any])
    if (NumberBFramesBetweenReferenceFrames != null) __obj.updateDynamic("NumberBFramesBetweenReferenceFrames")(NumberBFramesBetweenReferenceFrames.asInstanceOf[js.Any])
    if (NumberReferenceFrames != null) __obj.updateDynamic("NumberReferenceFrames")(NumberReferenceFrames.asInstanceOf[js.Any])
    if (ParControl != null) __obj.updateDynamic("ParControl")(ParControl.asInstanceOf[js.Any])
    if (ParDenominator != null) __obj.updateDynamic("ParDenominator")(ParDenominator.asInstanceOf[js.Any])
    if (ParNumerator != null) __obj.updateDynamic("ParNumerator")(ParNumerator.asInstanceOf[js.Any])
    if (QualityTuningLevel != null) __obj.updateDynamic("QualityTuningLevel")(QualityTuningLevel.asInstanceOf[js.Any])
    if (QvbrSettings != null) __obj.updateDynamic("QvbrSettings")(QvbrSettings.asInstanceOf[js.Any])
    if (RateControlMode != null) __obj.updateDynamic("RateControlMode")(RateControlMode.asInstanceOf[js.Any])
    if (RepeatPps != null) __obj.updateDynamic("RepeatPps")(RepeatPps.asInstanceOf[js.Any])
    if (SceneChangeDetect != null) __obj.updateDynamic("SceneChangeDetect")(SceneChangeDetect.asInstanceOf[js.Any])
    if (Slices != null) __obj.updateDynamic("Slices")(Slices.asInstanceOf[js.Any])
    if (SlowPal != null) __obj.updateDynamic("SlowPal")(SlowPal.asInstanceOf[js.Any])
    if (Softness != null) __obj.updateDynamic("Softness")(Softness.asInstanceOf[js.Any])
    if (SpatialAdaptiveQuantization != null) __obj.updateDynamic("SpatialAdaptiveQuantization")(SpatialAdaptiveQuantization.asInstanceOf[js.Any])
    if (Syntax != null) __obj.updateDynamic("Syntax")(Syntax.asInstanceOf[js.Any])
    if (Telecine != null) __obj.updateDynamic("Telecine")(Telecine.asInstanceOf[js.Any])
    if (TemporalAdaptiveQuantization != null) __obj.updateDynamic("TemporalAdaptiveQuantization")(TemporalAdaptiveQuantization.asInstanceOf[js.Any])
    if (UnregisteredSeiTimecode != null) __obj.updateDynamic("UnregisteredSeiTimecode")(UnregisteredSeiTimecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[H264Settings]
  }
}

