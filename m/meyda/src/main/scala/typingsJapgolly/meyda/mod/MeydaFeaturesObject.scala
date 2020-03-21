package typingsJapgolly.meyda.mod

import typingsJapgolly.meyda.AnonImag
import typingsJapgolly.meyda.AnonSpecific
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeydaFeaturesObject extends js.Object {
  var amplitudeSpectrum: scala.scalajs.js.typedarray.Float32Array
  var buffer: js.Array[Double]
  var chroma: js.Array[Double]
  var complexSpectrum: AnonImag
  var energy: Double
  var loudness: AnonSpecific
  var mfcc: js.Array[Double]
  var perceptualSharpness: Double
  var perceptualSpread: Double
  var powerSpectrum: scala.scalajs.js.typedarray.Float32Array
  var rms: Double
  var spectralCentroid: Double
  var spectralFlatness: Double
  var spectralKurtosis: Double
  var spectralRolloff: Double
  var spectralSkewness: Double
  var spectralSlope: Double
  var spectralSpread: Double
  var zcr: Double
}

object MeydaFeaturesObject {
  @scala.inline
  def apply(
    amplitudeSpectrum: scala.scalajs.js.typedarray.Float32Array,
    buffer: js.Array[Double],
    chroma: js.Array[Double],
    complexSpectrum: AnonImag,
    energy: Double,
    loudness: AnonSpecific,
    mfcc: js.Array[Double],
    perceptualSharpness: Double,
    perceptualSpread: Double,
    powerSpectrum: scala.scalajs.js.typedarray.Float32Array,
    rms: Double,
    spectralCentroid: Double,
    spectralFlatness: Double,
    spectralKurtosis: Double,
    spectralRolloff: Double,
    spectralSkewness: Double,
    spectralSlope: Double,
    spectralSpread: Double,
    zcr: Double
  ): MeydaFeaturesObject = {
    val __obj = js.Dynamic.literal(amplitudeSpectrum = amplitudeSpectrum.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], chroma = chroma.asInstanceOf[js.Any], complexSpectrum = complexSpectrum.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], mfcc = mfcc.asInstanceOf[js.Any], perceptualSharpness = perceptualSharpness.asInstanceOf[js.Any], perceptualSpread = perceptualSpread.asInstanceOf[js.Any], powerSpectrum = powerSpectrum.asInstanceOf[js.Any], rms = rms.asInstanceOf[js.Any], spectralCentroid = spectralCentroid.asInstanceOf[js.Any], spectralFlatness = spectralFlatness.asInstanceOf[js.Any], spectralKurtosis = spectralKurtosis.asInstanceOf[js.Any], spectralRolloff = spectralRolloff.asInstanceOf[js.Any], spectralSkewness = spectralSkewness.asInstanceOf[js.Any], spectralSlope = spectralSlope.asInstanceOf[js.Any], spectralSpread = spectralSpread.asInstanceOf[js.Any], zcr = zcr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MeydaFeaturesObject]
  }
}

