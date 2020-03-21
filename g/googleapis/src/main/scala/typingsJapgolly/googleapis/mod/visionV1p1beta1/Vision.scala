package typingsJapgolly.googleapis.mod.visionV1p1beta1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Vision API
  *
  * Integrates Google Vision features, including image labeling, face, logo,
  * and landmark detection, optical character recognition (OCR), and detection
  * of explicit content, into applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const vision = google.vision('v1p1beta1');
  *
  * @namespace vision
  * @type {Function}
  * @version v1p1beta1
  * @variation v1p1beta1
  * @param {object=} options Options for Vision
  */
@JSImport("googleapis", "vision_v1p1beta1.Vision")
@js.native
class Vision protected ()
  extends typingsJapgolly.googleapis.visionV1p1beta1Mod.visionV1p1beta1.Vision {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

