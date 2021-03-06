package typingsJapgolly.googleapis.speechV1Mod.speechV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Speech-to-Text API
  *
  * Converts audio to text by applying powerful neural network models.
  *
  * @example
  * const {google} = require('googleapis');
  * const speech = google.speech('v1');
  *
  * @namespace speech
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Speech
  */
@JSImport("googleapis/build/src/apis/speech/v1", "speech_v1.Speech")
@js.native
class Speech protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceOperations = js.native
  var projects: ResourceProjects = js.native
  var speech: ResourceSpeech = js.native
}

