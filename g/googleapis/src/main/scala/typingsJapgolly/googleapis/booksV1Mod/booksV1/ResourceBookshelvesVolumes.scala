package typingsJapgolly.googleapis.booksV1Mod.booksV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Bookshelves$Volumes")
@js.native
class ResourceBookshelvesVolumes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.bookshelves.volumes.list
    * @desc Retrieves volumes in a specific bookshelf for the specified user.
    * @alias books.bookshelves.volumes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of results to return
    * @param {string} params.shelf ID of bookshelf to retrieve volumes.
    * @param {boolean=} params.showPreorders Set to true to show pre-ordered books. Defaults to false.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {integer=} params.startIndex Index of the first element to return (starts at 0)
    * @param {string} params.userId ID of user for whom to retrieve bookshelf volumes.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaVolumes] = js.native
  def list(callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(params: ParamsResourceBookshelvesVolumesList): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceBookshelvesVolumesList, callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(
    params: ParamsResourceBookshelvesVolumesList,
    options: BodyResponseCallback[SchemaVolumes],
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  def list(params: ParamsResourceBookshelvesVolumesList, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(
    params: ParamsResourceBookshelvesVolumesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
}

