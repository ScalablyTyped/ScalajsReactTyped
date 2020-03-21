package typingsJapgolly.googleapis.storageV1Mod.storageV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Storage JSON API
  *
  * Stores and retrieves potentially large, immutable data objects.
  *
  * @example
  * const {google} = require('googleapis');
  * const storage = google.storage('v1');
  *
  * @namespace storage
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Storage
  */
@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Storage")
@js.native
class Storage protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var bucketAccessControls: ResourceBucketaccesscontrols = js.native
  var buckets: ResourceBuckets = js.native
  var channels: ResourceChannels = js.native
  var context: APIRequestContext = js.native
  var defaultObjectAccessControls: ResourceDefaultobjectaccesscontrols = js.native
  var notifications: ResourceNotifications = js.native
  var objectAccessControls: ResourceObjectaccesscontrols = js.native
  var objects: ResourceObjects = js.native
  var projects: ResourceProjects = js.native
}

