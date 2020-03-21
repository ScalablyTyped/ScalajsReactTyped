package typingsJapgolly.googleapis.mod.translateV2

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Translation API
  *
  * The Google Cloud Translation API lets websites and programs integrate with
  * Google Translate programmatically.
  *
  * @example
  * const {google} = require('googleapis');
  * const translate = google.translate('v2');
  *
  * @namespace translate
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Translate
  */
@JSImport("googleapis", "translate_v2.Translate")
@js.native
class Translate protected ()
  extends typingsJapgolly.googleapis.translateV2Mod.translateV2.Translate {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

