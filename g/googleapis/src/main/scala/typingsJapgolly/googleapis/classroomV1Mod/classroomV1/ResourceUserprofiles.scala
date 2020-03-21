package typingsJapgolly.googleapis.classroomV1Mod.classroomV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Userprofiles")
@js.native
class ResourceUserprofiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var guardianInvitations: ResourceUserprofilesGuardianinvitations = js.native
  var guardians: ResourceUserprofilesGuardians = js.native
  /**
    * classroom.userProfiles.get
    * @desc Returns a user profile.  This method returns the following error
    * codes:  * `PERMISSION_DENIED` if the requesting user is not permitted to
    * access this user profile, if no profile exists with the requested ID, or
    * for access errors.
    * @alias classroom.userProfiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId Identifier of the profile to return. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
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
}

