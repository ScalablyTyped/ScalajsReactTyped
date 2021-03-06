package typingsJapgolly.googleapis.peopleV1Mod.peopleV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$Contactgroups$Members")
@js.native
class ResourceContactgroupsMembers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * people.contactGroups.members.modify
    * @desc Modify the members of a contact group owned by the authenticated
    * user. <br> The only system contact groups that can have members added are
    * `contactGroups/myContacts` and `contactGroups/starred`. Other system
    * contact groups are deprecated and can only have contacts removed.
    * @alias people.contactGroups.members.modify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName The resource name of the contact group to modify.
    * @param {().ModifyContactGroupMembersRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modify(): GaxiosPromise[SchemaModifyContactGroupMembersResponse] = js.native
  def modify(callback: BodyResponseCallback[SchemaModifyContactGroupMembersResponse]): Unit = js.native
  def modify(params: ParamsResourceContactgroupsMembersModify): GaxiosPromise[SchemaModifyContactGroupMembersResponse] = js.native
  def modify(
    params: ParamsResourceContactgroupsMembersModify,
    callback: BodyResponseCallback[SchemaModifyContactGroupMembersResponse]
  ): Unit = js.native
  def modify(
    params: ParamsResourceContactgroupsMembersModify,
    options: BodyResponseCallback[SchemaModifyContactGroupMembersResponse],
    callback: BodyResponseCallback[SchemaModifyContactGroupMembersResponse]
  ): Unit = js.native
  def modify(params: ParamsResourceContactgroupsMembersModify, options: MethodOptions): GaxiosPromise[SchemaModifyContactGroupMembersResponse] = js.native
  def modify(
    params: ParamsResourceContactgroupsMembersModify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaModifyContactGroupMembersResponse]
  ): Unit = js.native
}

