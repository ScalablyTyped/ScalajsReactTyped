package typingsJapgolly.googleapis.mod.languageV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Natural Language API
  *
  * Provides natural language understanding technologies, such as sentiment
  * analysis, entity recognition, entity sentiment analysis, and other text
  * annotations, to developers.
  *
  * @example
  * const {google} = require('googleapis');
  * const language = google.language('v1');
  *
  * @namespace language
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Language
  */
@JSImport("googleapis", "language_v1.Language")
@js.native
class Language protected ()
  extends typingsJapgolly.googleapis.languageV1Mod.languageV1.Language {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

