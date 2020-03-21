package typingsJapgolly.googleCloudTextToSpeech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type APICallback[T] = js.Function2[
    /* err */ typingsJapgolly.googleCloudTextToSpeech.mod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[T], 
    scala.Unit
  ]
  type GoogleError = js.Any
  type ListVoicesOptions = typingsJapgolly.googleCloudTextToSpeech.mod.CallOptions
  type ListVoicesResponse = js.Array[typingsJapgolly.googleCloudTextToSpeech.mod.Voice]
  type SynthesizeSpeechOptions = typingsJapgolly.googleCloudTextToSpeech.mod.CallOptions
}
