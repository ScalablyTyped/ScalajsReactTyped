package typingsJapgolly.googleapis.v31Mod.dfareportingV31

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Userprofiles")
@js.native
class ResourceUserprofiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.userProfiles.get
    * @desc Gets one user profile by ID.
    * @alias dfareporting.userProfiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The user profile ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUserProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaUserProfile]): Unit = js.native
  def get(params: ParamsResourceUserprofilesGet): GaxiosPromise[SchemaUserProfile] = js.native
  def get(params: ParamsResourceUserprofilesGet, callback: BodyResponseCallback[SchemaUserProfile]): Unit = js.native
  def get(
    params: ParamsResourceUserprofilesGet,
    options: BodyResponseCallback[SchemaUserProfile],
    callback: BodyResponseCallback[SchemaUserProfile]
  ): Unit = js.native
  def get(params: ParamsResourceUserprofilesGet, options: MethodOptions): GaxiosPromise[SchemaUserProfile] = js.native
  def get(
    params: ParamsResourceUserprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserProfile]
  ): Unit = js.native
  /**
    * dfareporting.userProfiles.list
    * @desc Retrieves list of user profiles for a user.
    * @alias dfareporting.userProfiles.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUserProfileList] = js.native
  def list(callback: BodyResponseCallback[SchemaUserProfileList]): Unit = js.native
  def list(params: ParamsResourceUserprofilesList): GaxiosPromise[SchemaUserProfileList] = js.native
  def list(params: ParamsResourceUserprofilesList, callback: BodyResponseCallback[SchemaUserProfileList]): Unit = js.native
  def list(
    params: ParamsResourceUserprofilesList,
    options: BodyResponseCallback[SchemaUserProfileList],
    callback: BodyResponseCallback[SchemaUserProfileList]
  ): Unit = js.native
  def list(params: ParamsResourceUserprofilesList, options: MethodOptions): GaxiosPromise[SchemaUserProfileList] = js.native
  def list(
    params: ParamsResourceUserprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserProfileList]
  ): Unit = js.native
}

