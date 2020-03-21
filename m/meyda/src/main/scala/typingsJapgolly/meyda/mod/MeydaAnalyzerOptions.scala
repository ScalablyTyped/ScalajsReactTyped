package typingsJapgolly.meyda.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.AudioNode
import typingsJapgolly.meyda.PartialMeydaFeaturesObjec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeydaAnalyzerOptions extends js.Object {
  var audioContext: AudioContext
  var bufferSize: Double
  var callback: js.UndefOr[js.Function1[/* features */ PartialMeydaFeaturesObjec, Unit]] = js.undefined
  var featureExtractors: js.UndefOr[MeydaAudioFeature | js.Array[MeydaAudioFeature]] = js.undefined
  var hopSize: js.UndefOr[Double] = js.undefined
  var numberOfMFCCCoefficients: js.UndefOr[Double] = js.undefined
  var source: AudioNode
  var windowingFunction: js.UndefOr[MeydaWindowingFunction] = js.undefined
}

object MeydaAnalyzerOptions {
  @scala.inline
  def apply(
    audioContext: AudioContext,
    bufferSize: Double,
    source: AudioNode,
    callback: /* features */ PartialMeydaFeaturesObjec => Callback = null,
    featureExtractors: MeydaAudioFeature | js.Array[MeydaAudioFeature] = null,
    hopSize: Int | Double = null,
    numberOfMFCCCoefficients: Int | Double = null,
    windowingFunction: MeydaWindowingFunction = null
  ): MeydaAnalyzerOptions = {
    val __obj = js.Dynamic.literal(audioContext = audioContext.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* features */ typingsJapgolly.meyda.PartialMeydaFeaturesObjec) => callback(t0).runNow()))
    if (featureExtractors != null) __obj.updateDynamic("featureExtractors")(featureExtractors.asInstanceOf[js.Any])
    if (hopSize != null) __obj.updateDynamic("hopSize")(hopSize.asInstanceOf[js.Any])
    if (numberOfMFCCCoefficients != null) __obj.updateDynamic("numberOfMFCCCoefficients")(numberOfMFCCCoefficients.asInstanceOf[js.Any])
    if (windowingFunction != null) __obj.updateDynamic("windowingFunction")(windowingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeydaAnalyzerOptions]
  }
}

