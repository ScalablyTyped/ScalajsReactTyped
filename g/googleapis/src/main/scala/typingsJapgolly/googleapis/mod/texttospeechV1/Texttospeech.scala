package typingsJapgolly.googleapis.mod.texttospeechV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Text-to-Speech API
  *
  * Synthesizes natural-sounding speech by applying powerful neural network
  * models.
  *
  * @example
  * const {google} = require('googleapis');
  * const texttospeech = google.texttospeech('v1');
  *
  * @namespace texttospeech
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Texttospeech
  */
@JSImport("googleapis", "texttospeech_v1.Texttospeech")
@js.native
class Texttospeech protected ()
  extends typingsJapgolly.googleapis.texttospeechV1Mod.texttospeechV1.Texttospeech {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

