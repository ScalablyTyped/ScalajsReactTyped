package typingsJapgolly.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputTemplate extends StObject {
  
  /**
    * Use audio selector groups to combine multiple sidecar audio inputs so that you can assign them to a single output audio tab (AudioDescription). Note that, if you're working with embedded audio, it's simpler to assign multiple input tracks into a single audio selector rather than use an audio selector group.
    */
  var AudioSelectorGroups: js.UndefOr[mapOfAudioSelectorGroup] = js.undefined
  
  /**
    * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your outputs. You can use multiple Audio selectors per input.
    */
  var AudioSelectors: js.UndefOr[mapOfAudioSelector] = js.undefined
  
  /**
    * Use captions selectors to specify the captions data from your input that you use in your outputs. You can use up to 20 captions selectors per input.
    */
  var CaptionSelectors: js.UndefOr[mapOfCaptionSelector] = js.undefined
  
  /**
    * Use Cropping selection (crop) to specify the video area that the service will include in the output video frame. If you specify a value here, it will override any value that you specify in the output setting Cropping selection (crop).
    */
  var Crop: js.UndefOr[Rectangle] = js.undefined
  
  /**
    * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manually controllable for MPEG2 and uncompressed video inputs.
    */
  var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined
  
  /**
    * Enable Denoise (InputDenoiseFilter) to filter noise from the input.  Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
    */
  var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined
  
  /**
    * Use this setting only when your video source has Dolby Vision studio mastering metadata that is carried in a separate XML file. Specify the Amazon S3 location for the metadata XML file. MediaConvert uses this file to provide global and frame-level metadata for Dolby Vision preprocessing. When you specify a file here and your input also has interleaved global and frame level metadata, MediaConvert ignores the interleaved metadata and uses only the the metadata from this external XML file. Note that your IAM service role must grant MediaConvert read permissions to this file. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
    */
  var DolbyVisionMetadataXml: js.UndefOr[stringMin14PatternS3XmlXMLHttpsXmlXML] = js.undefined
  
  /**
    * Specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The input is filtered regardless of input type.
    */
  var FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined
  
  /**
    * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The range is -5 to 5. Default is 0.
    */
  var FilterStrength: js.UndefOr[integerMinNegative5Max5] = js.undefined
  
  /**
    * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for each input individually. This setting is disabled by default.
    */
  var ImageInserter: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconvertMod.ImageInserter] = js.undefined
  
  /**
    * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If you provide only an end time, it will be the entire input up to that point. When you specify more than one input clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify them.
    */
  var InputClippings: js.UndefOr[listOfInputClipping] = js.undefined
  
  /**
    * When you have a progressive segmented frame (PsF) input, use this setting to flag the input as PsF. MediaConvert doesn't automatically detect PsF. Therefore, flagging your input as PsF results in better preservation of video quality when you do deinterlacing and frame rate conversion. If you don't specify, the default value is Auto (AUTO). Auto is the correct setting for all inputs that are not PsF. Don't set this value to PsF when your input is interlaced. Doing so creates horizontal interlacing artifacts.
    */
  var InputScanType: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconvertMod.InputScanType] = js.undefined
  
  /**
    * Use Selection placement (position) to define the video area in your output frame. The area outside of the rectangle that you specify here is black. If you specify a value here, it will override any value that you specify in the output setting Selection placement (position). If you specify a value here, this will override any AFD values in your input, even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If you specify a value here, this will ignore anything that you specify for the setting Scaling Behavior (scalingBehavior).
    */
  var Position: js.UndefOr[Rectangle] = js.undefined
  
  /**
    * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you specify doesn't exist, the transcoding service will use this default.
    */
  var ProgramNumber: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
    */
  var PsiControl: js.UndefOr[InputPsiControl] = js.undefined
  
  /**
    * Use this Timecode source setting, located under the input settings (InputTimecodeSource), to specify how the service counts input video frames. This input frame count affects only the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Choose Embedded (EMBEDDED) to use the timecodes in your input video. Choose Start at zero (ZEROBASED) to start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to start the first frame at the timecode that you specify in the setting Start timecode (timecodeStart). If you don't specify a value for Timecode source, the service will use Embedded by default. For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
    */
  var TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined
  
  /**
    * Specify the timecode that you want the service to use for this input's initial frame. To use this setting, you must set the Timecode source setting, located under the input settings (InputTimecodeSource), to Specified start (SPECIFIEDSTART). For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
    */
  var TimecodeStart: js.UndefOr[stringMin11Max11Pattern01D20305D205D] = js.undefined
  
  /**
    * Input video selectors contain the video settings for the input. Each of your inputs can have up to one video selector.
    */
  var VideoSelector: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconvertMod.VideoSelector] = js.undefined
}
object InputTemplate {
  
  inline def apply(): InputTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputTemplate]
  }
  
  extension [Self <: InputTemplate](x: Self) {
    
    inline def setAudioSelectorGroups(value: mapOfAudioSelectorGroup): Self = StObject.set(x, "AudioSelectorGroups", value.asInstanceOf[js.Any])
    
    inline def setAudioSelectorGroupsUndefined: Self = StObject.set(x, "AudioSelectorGroups", js.undefined)
    
    inline def setAudioSelectors(value: mapOfAudioSelector): Self = StObject.set(x, "AudioSelectors", value.asInstanceOf[js.Any])
    
    inline def setAudioSelectorsUndefined: Self = StObject.set(x, "AudioSelectors", js.undefined)
    
    inline def setCaptionSelectors(value: mapOfCaptionSelector): Self = StObject.set(x, "CaptionSelectors", value.asInstanceOf[js.Any])
    
    inline def setCaptionSelectorsUndefined: Self = StObject.set(x, "CaptionSelectors", js.undefined)
    
    inline def setCrop(value: Rectangle): Self = StObject.set(x, "Crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "Crop", js.undefined)
    
    inline def setDeblockFilter(value: InputDeblockFilter): Self = StObject.set(x, "DeblockFilter", value.asInstanceOf[js.Any])
    
    inline def setDeblockFilterUndefined: Self = StObject.set(x, "DeblockFilter", js.undefined)
    
    inline def setDenoiseFilter(value: InputDenoiseFilter): Self = StObject.set(x, "DenoiseFilter", value.asInstanceOf[js.Any])
    
    inline def setDenoiseFilterUndefined: Self = StObject.set(x, "DenoiseFilter", js.undefined)
    
    inline def setDolbyVisionMetadataXml(value: stringMin14PatternS3XmlXMLHttpsXmlXML): Self = StObject.set(x, "DolbyVisionMetadataXml", value.asInstanceOf[js.Any])
    
    inline def setDolbyVisionMetadataXmlUndefined: Self = StObject.set(x, "DolbyVisionMetadataXml", js.undefined)
    
    inline def setFilterEnable(value: InputFilterEnable): Self = StObject.set(x, "FilterEnable", value.asInstanceOf[js.Any])
    
    inline def setFilterEnableUndefined: Self = StObject.set(x, "FilterEnable", js.undefined)
    
    inline def setFilterStrength(value: integerMinNegative5Max5): Self = StObject.set(x, "FilterStrength", value.asInstanceOf[js.Any])
    
    inline def setFilterStrengthUndefined: Self = StObject.set(x, "FilterStrength", js.undefined)
    
    inline def setImageInserter(value: ImageInserter): Self = StObject.set(x, "ImageInserter", value.asInstanceOf[js.Any])
    
    inline def setImageInserterUndefined: Self = StObject.set(x, "ImageInserter", js.undefined)
    
    inline def setInputClippings(value: listOfInputClipping): Self = StObject.set(x, "InputClippings", value.asInstanceOf[js.Any])
    
    inline def setInputClippingsUndefined: Self = StObject.set(x, "InputClippings", js.undefined)
    
    inline def setInputClippingsVarargs(value: InputClipping*): Self = StObject.set(x, "InputClippings", js.Array(value*))
    
    inline def setInputScanType(value: InputScanType): Self = StObject.set(x, "InputScanType", value.asInstanceOf[js.Any])
    
    inline def setInputScanTypeUndefined: Self = StObject.set(x, "InputScanType", js.undefined)
    
    inline def setPosition(value: Rectangle): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
    
    inline def setProgramNumber(value: integerMin1Max2147483647): Self = StObject.set(x, "ProgramNumber", value.asInstanceOf[js.Any])
    
    inline def setProgramNumberUndefined: Self = StObject.set(x, "ProgramNumber", js.undefined)
    
    inline def setPsiControl(value: InputPsiControl): Self = StObject.set(x, "PsiControl", value.asInstanceOf[js.Any])
    
    inline def setPsiControlUndefined: Self = StObject.set(x, "PsiControl", js.undefined)
    
    inline def setTimecodeSource(value: InputTimecodeSource): Self = StObject.set(x, "TimecodeSource", value.asInstanceOf[js.Any])
    
    inline def setTimecodeSourceUndefined: Self = StObject.set(x, "TimecodeSource", js.undefined)
    
    inline def setTimecodeStart(value: stringMin11Max11Pattern01D20305D205D): Self = StObject.set(x, "TimecodeStart", value.asInstanceOf[js.Any])
    
    inline def setTimecodeStartUndefined: Self = StObject.set(x, "TimecodeStart", js.undefined)
    
    inline def setVideoSelector(value: VideoSelector): Self = StObject.set(x, "VideoSelector", value.asInstanceOf[js.Any])
    
    inline def setVideoSelectorUndefined: Self = StObject.set(x, "VideoSelector", js.undefined)
  }
}
