package typingsJapgolly.googleapis.mod.storageV1beta2

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Storage JSON API
  *
  * Lets you store and retrieve potentially-large, immutable data objects.
  *
  * @example
  * const {google} = require('googleapis');
  * const storage = google.storage('v1beta2');
  *
  * @namespace storage
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Storage
  */
@JSImport("googleapis", "storage_v1beta2.Storage")
@js.native
class Storage protected ()
  extends typingsJapgolly.googleapis.storageV1beta2Mod.storageV1beta2.Storage {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

