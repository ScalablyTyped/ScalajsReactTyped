package typingsJapgolly.googleapis.safebrowsingV4Mod.safebrowsingV4

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Fullhashes")
@js.native
class ResourceFullhashes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * safebrowsing.fullHashes.find
    * @desc Finds the full hashes that match the requested hash prefixes.
    * @alias safebrowsing.fullHashes.find
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().FindFullHashesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def find(): GaxiosPromise[SchemaFindFullHashesResponse] = js.native
  def find(callback: BodyResponseCallback[SchemaFindFullHashesResponse]): Unit = js.native
  def find(params: ParamsResourceFullhashesFind): GaxiosPromise[SchemaFindFullHashesResponse] = js.native
  def find(params: ParamsResourceFullhashesFind, callback: BodyResponseCallback[SchemaFindFullHashesResponse]): Unit = js.native
  def find(
    params: ParamsResourceFullhashesFind,
    options: BodyResponseCallback[SchemaFindFullHashesResponse],
    callback: BodyResponseCallback[SchemaFindFullHashesResponse]
  ): Unit = js.native
  def find(params: ParamsResourceFullhashesFind, options: MethodOptions): GaxiosPromise[SchemaFindFullHashesResponse] = js.native
  def find(
    params: ParamsResourceFullhashesFind,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFindFullHashesResponse]
  ): Unit = js.native
}

