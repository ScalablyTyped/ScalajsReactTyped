package typingsJapgolly.phaser.Phaser.Types.Sound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Audio Data object.
  * 
  * You can pass an array of these objects to the WebAudioSoundManager `decodeAudio` method to have it decode
  * them all at once.
  */
trait DecodeAudioConfig extends js.Object {
  /**
    * The audio data, either a base64 encoded string, an audio media-type data uri, or an ArrayBuffer instance.
    */
  var data: scala.scalajs.js.typedarray.ArrayBuffer | String
  /**
    * The string-based key to be used to reference the decoded audio in the audio cache.
    */
  var key: String
}

object DecodeAudioConfig {
  @scala.inline
  def apply(data: scala.scalajs.js.typedarray.ArrayBuffer | String, key: String): DecodeAudioConfig = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecodeAudioConfig]
  }
}

