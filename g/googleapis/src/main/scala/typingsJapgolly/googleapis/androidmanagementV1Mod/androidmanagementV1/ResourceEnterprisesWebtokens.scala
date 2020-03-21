package typingsJapgolly.googleapis.androidmanagementV1Mod.androidmanagementV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Webtokens")
@js.native
class ResourceEnterprisesWebtokens protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidmanagement.enterprises.webTokens.create
    * @desc Creates a web token to access an embeddable managed Google Play web
    * UI for a given enterprise.
    * @alias androidmanagement.enterprises.webTokens.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the enterprise in the form enterprises/{enterpriseId}.
    * @param {().WebToken} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaWebToken] = js.native
  def create(callback: BodyResponseCallback[SchemaWebToken]): Unit = js.native
  def create(params: ParamsResourceEnterprisesWebtokensCreate): GaxiosPromise[SchemaWebToken] = js.native
  def create(params: ParamsResourceEnterprisesWebtokensCreate, callback: BodyResponseCallback[SchemaWebToken]): Unit = js.native
  def create(
    params: ParamsResourceEnterprisesWebtokensCreate,
    options: BodyResponseCallback[SchemaWebToken],
    callback: BodyResponseCallback[SchemaWebToken]
  ): Unit = js.native
  def create(params: ParamsResourceEnterprisesWebtokensCreate, options: MethodOptions): GaxiosPromise[SchemaWebToken] = js.native
  def create(
    params: ParamsResourceEnterprisesWebtokensCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebToken]
  ): Unit = js.native
}

