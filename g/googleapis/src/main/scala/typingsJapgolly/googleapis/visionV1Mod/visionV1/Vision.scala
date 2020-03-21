package typingsJapgolly.googleapis.visionV1Mod.visionV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
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
  * const vision = google.vision('v1');
  *
  * @namespace vision
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Vision
  */
@JSImport("googleapis/build/src/apis/vision/v1", "vision_v1.Vision")
@js.native
class Vision protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var files: ResourceFiles = js.native
  var images: ResourceImages = js.native
  var locations: ResourceLocations = js.native
  var operations: ResourceOperations = js.native
  var projects: ResourceProjects = js.native
}

