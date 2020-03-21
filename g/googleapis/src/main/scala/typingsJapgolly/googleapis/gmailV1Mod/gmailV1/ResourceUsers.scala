package typingsJapgolly.googleapis.gmailV1Mod.gmailV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users")
@js.native
class ResourceUsers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var drafts: ResourceUsersDrafts = js.native
  var history: ResourceUsersHistory = js.native
  var labels: ResourceUsersLabels = js.native
  var messages: ResourceUsersMessages = js.native
  var settings: ResourceUsersSettings = js.native
  var threads: ResourceUsersThreads = js.native
  /**
    * gmail.users.getProfile
    * @desc Gets the current user's Gmail profile.
    * @alias gmail.users.getProfile
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getProfile(): GaxiosPromise[SchemaProfile] = js.native
  def getProfile(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def getProfile(params: ParamsResourceUsersGetprofile): GaxiosPromise[SchemaProfile] = js.native
  def getProfile(params: ParamsResourceUsersGetprofile, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def getProfile(
    params: ParamsResourceUsersGetprofile,
    options: BodyResponseCallback[SchemaProfile],
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  def getProfile(params: ParamsResourceUsersGetprofile, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def getProfile(
    params: ParamsResourceUsersGetprofile,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  /**
    * gmail.users.stop
    * @desc Stop receiving push notifications for the given user mailbox.
    * @alias gmail.users.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[Unit] = js.native
  def stop(callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(params: ParamsResourceUsersStop): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceUsersStop, callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(
    params: ParamsResourceUsersStop,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def stop(params: ParamsResourceUsersStop, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceUsersStop, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * gmail.users.watch
    * @desc Set up or update a push notification watch on the given user
    * mailbox.
    * @alias gmail.users.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().WatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[SchemaWatchResponse] = js.native
  def watch(callback: BodyResponseCallback[SchemaWatchResponse]): Unit = js.native
  def watch(params: ParamsResourceUsersWatch): GaxiosPromise[SchemaWatchResponse] = js.native
  def watch(params: ParamsResourceUsersWatch, callback: BodyResponseCallback[SchemaWatchResponse]): Unit = js.native
  def watch(
    params: ParamsResourceUsersWatch,
    options: BodyResponseCallback[SchemaWatchResponse],
    callback: BodyResponseCallback[SchemaWatchResponse]
  ): Unit = js.native
  def watch(params: ParamsResourceUsersWatch, options: MethodOptions): GaxiosPromise[SchemaWatchResponse] = js.native
  def watch(
    params: ParamsResourceUsersWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWatchResponse]
  ): Unit = js.native
}

