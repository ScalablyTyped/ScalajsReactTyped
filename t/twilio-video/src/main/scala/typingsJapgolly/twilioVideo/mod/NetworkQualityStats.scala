package typingsJapgolly.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "NetworkQualityStats")
@js.native
class NetworkQualityStats () extends js.Object {
  var audio: NetworkQualityAudioStats | Null = js.native
  var level: NetworkQualityLevel = js.native
   // nullable depending on verbosity config
  var video: NetworkQualityVideoStats | Null = js.native
}

