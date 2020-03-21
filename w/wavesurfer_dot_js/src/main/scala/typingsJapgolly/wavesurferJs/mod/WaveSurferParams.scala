package typingsJapgolly.wavesurferJs.mod

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.ScriptProcessorNode
import typingsJapgolly.wavesurferJs.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveSurferParams extends js.Object {
  var audioContext: js.UndefOr[AudioContext] = js.undefined
  var audioRate: js.UndefOr[Double] = js.undefined
  var audioScriptProcessor: js.UndefOr[ScriptProcessorNode] = js.undefined
  var autoCenter: js.UndefOr[Boolean] = js.undefined
  var backend: js.UndefOr[String] = js.undefined
  var barGap: js.UndefOr[Double] = js.undefined
  var barHeight: js.UndefOr[Double] = js.undefined
  var barRadius: js.UndefOr[Double] = js.undefined
  var barWidth: js.UndefOr[Double] = js.undefined
  var closeAudioContext: js.UndefOr[Boolean] = js.undefined
  var container: String | HTMLElement
  var cursorColor: js.UndefOr[String] = js.undefined
  var cursorWidth: js.UndefOr[Double] = js.undefined
  var fillParent: js.UndefOr[Boolean] = js.undefined
  var forceDecode: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hideScrollbar: js.UndefOr[Boolean] = js.undefined
  var interact: js.UndefOr[Boolean] = js.undefined
  var loopSelection: js.UndefOr[Boolean] = js.undefined
  var maxCanvasWidth: js.UndefOr[Double] = js.undefined
  var mediaControls: js.UndefOr[Boolean] = js.undefined
  var mediaType: js.UndefOr[String] = js.undefined
  var minPxPerSec: js.UndefOr[Double] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var partialRender: js.UndefOr[Boolean] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.undefined
  var progressColor: js.UndefOr[String] = js.undefined
  var removeMediaElementOnDestroy: js.UndefOr[Boolean] = js.undefined
  var renderer: js.UndefOr[AnonInstantiable] = js.undefined
  var responsive: js.UndefOr[Boolean | Double] = js.undefined
  var scrollParent: js.UndefOr[Boolean] = js.undefined
  var skipLength: js.UndefOr[Double] = js.undefined
  var splitChannels: js.UndefOr[Boolean] = js.undefined
  var waveColor: js.UndefOr[String] = js.undefined
  var xhr: js.UndefOr[XHROptions] = js.undefined
}

object WaveSurferParams {
  @scala.inline
  def apply(
    container: String | HTMLElement,
    audioContext: AudioContext = null,
    audioRate: Int | Double = null,
    audioScriptProcessor: ScriptProcessorNode = null,
    autoCenter: js.UndefOr[Boolean] = js.undefined,
    backend: String = null,
    barGap: Int | Double = null,
    barHeight: Int | Double = null,
    barRadius: Int | Double = null,
    barWidth: Int | Double = null,
    closeAudioContext: js.UndefOr[Boolean] = js.undefined,
    cursorColor: String = null,
    cursorWidth: Int | Double = null,
    fillParent: js.UndefOr[Boolean] = js.undefined,
    forceDecode: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    hideScrollbar: js.UndefOr[Boolean] = js.undefined,
    interact: js.UndefOr[Boolean] = js.undefined,
    loopSelection: js.UndefOr[Boolean] = js.undefined,
    maxCanvasWidth: Int | Double = null,
    mediaControls: js.UndefOr[Boolean] = js.undefined,
    mediaType: String = null,
    minPxPerSec: Int | Double = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    partialRender: js.UndefOr[Boolean] = js.undefined,
    pixelRatio: Int | Double = null,
    plugins: js.Array[PluginDefinition] = null,
    progressColor: String = null,
    removeMediaElementOnDestroy: js.UndefOr[Boolean] = js.undefined,
    renderer: AnonInstantiable = null,
    responsive: Boolean | Double = null,
    scrollParent: js.UndefOr[Boolean] = js.undefined,
    skipLength: Int | Double = null,
    splitChannels: js.UndefOr[Boolean] = js.undefined,
    waveColor: String = null,
    xhr: XHROptions = null
  ): WaveSurferParams = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (audioContext != null) __obj.updateDynamic("audioContext")(audioContext.asInstanceOf[js.Any])
    if (audioRate != null) __obj.updateDynamic("audioRate")(audioRate.asInstanceOf[js.Any])
    if (audioScriptProcessor != null) __obj.updateDynamic("audioScriptProcessor")(audioScriptProcessor.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCenter)) __obj.updateDynamic("autoCenter")(autoCenter.asInstanceOf[js.Any])
    if (backend != null) __obj.updateDynamic("backend")(backend.asInstanceOf[js.Any])
    if (barGap != null) __obj.updateDynamic("barGap")(barGap.asInstanceOf[js.Any])
    if (barHeight != null) __obj.updateDynamic("barHeight")(barHeight.asInstanceOf[js.Any])
    if (barRadius != null) __obj.updateDynamic("barRadius")(barRadius.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(closeAudioContext)) __obj.updateDynamic("closeAudioContext")(closeAudioContext.asInstanceOf[js.Any])
    if (cursorColor != null) __obj.updateDynamic("cursorColor")(cursorColor.asInstanceOf[js.Any])
    if (cursorWidth != null) __obj.updateDynamic("cursorWidth")(cursorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fillParent)) __obj.updateDynamic("fillParent")(fillParent.asInstanceOf[js.Any])
    if (!js.isUndefined(forceDecode)) __obj.updateDynamic("forceDecode")(forceDecode.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideScrollbar)) __obj.updateDynamic("hideScrollbar")(hideScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(interact)) __obj.updateDynamic("interact")(interact.asInstanceOf[js.Any])
    if (!js.isUndefined(loopSelection)) __obj.updateDynamic("loopSelection")(loopSelection.asInstanceOf[js.Any])
    if (maxCanvasWidth != null) __obj.updateDynamic("maxCanvasWidth")(maxCanvasWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(mediaControls)) __obj.updateDynamic("mediaControls")(mediaControls.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (minPxPerSec != null) __obj.updateDynamic("minPxPerSec")(minPxPerSec.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (!js.isUndefined(partialRender)) __obj.updateDynamic("partialRender")(partialRender.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor.asInstanceOf[js.Any])
    if (!js.isUndefined(removeMediaElementOnDestroy)) __obj.updateDynamic("removeMediaElementOnDestroy")(removeMediaElementOnDestroy.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollParent)) __obj.updateDynamic("scrollParent")(scrollParent.asInstanceOf[js.Any])
    if (skipLength != null) __obj.updateDynamic("skipLength")(skipLength.asInstanceOf[js.Any])
    if (!js.isUndefined(splitChannels)) __obj.updateDynamic("splitChannels")(splitChannels.asInstanceOf[js.Any])
    if (waveColor != null) __obj.updateDynamic("waveColor")(waveColor.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaveSurferParams]
  }
}

