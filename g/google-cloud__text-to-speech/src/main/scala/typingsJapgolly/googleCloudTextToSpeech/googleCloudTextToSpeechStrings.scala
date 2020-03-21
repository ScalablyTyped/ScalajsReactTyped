package typingsJapgolly.googleCloudTextToSpeech

import typingsJapgolly.googleCloudTextToSpeech.mod.AudioEncoding
import typingsJapgolly.googleCloudTextToSpeech.mod.SsmlVoiceGender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object googleCloudTextToSpeechStrings {
  @js.native
  sealed trait AUDIO_ENCODING_UNSPECIFIED extends AudioEncoding
  
  @js.native
  sealed trait FEMALE extends SsmlVoiceGender
  
  @js.native
  sealed trait LINEAR16 extends AudioEncoding
  
  @js.native
  sealed trait MALE extends SsmlVoiceGender
  
  @js.native
  sealed trait MP3 extends AudioEncoding
  
  @js.native
  sealed trait NEUTRAL extends SsmlVoiceGender
  
  @js.native
  sealed trait OGG_OPUS extends AudioEncoding
  
  @js.native
  sealed trait SSML_VOICE_GENDER_UNSPECIFIED extends SsmlVoiceGender
  
  @scala.inline
  def AUDIO_ENCODING_UNSPECIFIED: AUDIO_ENCODING_UNSPECIFIED = "AUDIO_ENCODING_UNSPECIFIED".asInstanceOf[AUDIO_ENCODING_UNSPECIFIED]
  @scala.inline
  def FEMALE: FEMALE = "FEMALE".asInstanceOf[FEMALE]
  @scala.inline
  def LINEAR16: LINEAR16 = "LINEAR16".asInstanceOf[LINEAR16]
  @scala.inline
  def MALE: MALE = "MALE".asInstanceOf[MALE]
  @scala.inline
  def MP3: MP3 = "MP3".asInstanceOf[MP3]
  @scala.inline
  def NEUTRAL: NEUTRAL = "NEUTRAL".asInstanceOf[NEUTRAL]
  @scala.inline
  def OGG_OPUS: OGG_OPUS = "OGG_OPUS".asInstanceOf[OGG_OPUS]
  @scala.inline
  def SSML_VOICE_GENDER_UNSPECIFIED: SSML_VOICE_GENDER_UNSPECIFIED = "SSML_VOICE_GENDER_UNSPECIFIED".asInstanceOf[SSML_VOICE_GENDER_UNSPECIFIED]
}

