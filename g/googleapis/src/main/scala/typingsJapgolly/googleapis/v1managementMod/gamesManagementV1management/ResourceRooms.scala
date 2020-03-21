package typingsJapgolly.googleapis.v1managementMod.gamesManagementV1management

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Rooms")
@js.native
class ResourceRooms protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.rooms.reset
    * @desc Reset all rooms for the currently authenticated player for your
    * application. This method is only accessible to whitelisted tester
    * accounts for your application.
    * @alias gamesManagement.rooms.reset
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[Unit] = js.native
  def reset(callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(params: ParamsResourceRoomsReset): GaxiosPromise[Unit] = js.native
  def reset(params: ParamsResourceRoomsReset, callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(
    params: ParamsResourceRoomsReset,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def reset(params: ParamsResourceRoomsReset, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reset(params: ParamsResourceRoomsReset, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * gamesManagement.rooms.resetForAllPlayers
    * @desc Deletes rooms where the only room participants are from whitelisted
    * tester accounts for your application. This method is only available to
    * user accounts for your developer console.
    * @alias gamesManagement.rooms.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: ParamsResourceRoomsResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceRoomsResetforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(
    params: ParamsResourceRoomsResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsResourceRoomsResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsResourceRoomsResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

