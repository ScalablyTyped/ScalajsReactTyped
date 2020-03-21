package typingsJapgolly.pulumiAws.presetMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.elastictranscoder.PresetAudio
import typingsJapgolly.pulumiAws.inputMod.elastictranscoder.PresetAudioCodecOptions
import typingsJapgolly.pulumiAws.inputMod.elastictranscoder.PresetThumbnails
import typingsJapgolly.pulumiAws.inputMod.elastictranscoder.PresetVideo
import typingsJapgolly.pulumiAws.inputMod.elastictranscoder.PresetVideoWatermark
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetArgs extends js.Object {
  /**
    * Audio parameters object (documented below).
    */
  val audio: js.UndefOr[Input[PresetAudio]] = js.native
  /**
    * Codec options for the audio parameters (documented below)
    */
  val audioCodecOptions: js.UndefOr[Input[PresetAudioCodecOptions]] = js.native
  /**
    * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
    */
  val container: Input[String] = js.native
  /**
    * A description of the preset (maximum 255 characters)
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the preset. (maximum 40 characters)
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Thumbnail parameters object (documented below)
    */
  val thumbnails: js.UndefOr[Input[PresetThumbnails]] = js.native
  val `type`: js.UndefOr[Input[String]] = js.native
  /**
    * Video parameters object (documented below)
    */
  val video: js.UndefOr[Input[PresetVideo]] = js.native
  val videoCodecOptions: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Watermark parameters for the video parameters (documented below)
    * * `videoCodecOptions` (Optional, Forces new resource) Codec options for the video parameters
    */
  val videoWatermarks: js.UndefOr[Input[js.Array[Input[PresetVideoWatermark]]]] = js.native
}

object PresetArgs {
  @scala.inline
  def apply(
    container: Input[String],
    audio: Input[PresetAudio] = null,
    audioCodecOptions: Input[PresetAudioCodecOptions] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    thumbnails: Input[PresetThumbnails] = null,
    `type`: Input[String] = null,
    video: Input[PresetVideo] = null,
    videoCodecOptions: Input[StringDictionary[_]] = null,
    videoWatermarks: Input[js.Array[Input[PresetVideoWatermark]]] = null
  ): PresetArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (audioCodecOptions != null) __obj.updateDynamic("audioCodecOptions")(audioCodecOptions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoCodecOptions != null) __obj.updateDynamic("videoCodecOptions")(videoCodecOptions.asInstanceOf[js.Any])
    if (videoWatermarks != null) __obj.updateDynamic("videoWatermarks")(videoWatermarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetArgs]
  }
}

