package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUploadReleaseAssetParams extends js.Object {
  var data: String | js.Object
  var headers: ReposUploadReleaseAssetParamsHeaders
  /**
    * An alternate short description of the asset. Used in place of the filename. This should be set in a URI query parameter.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The file name of the asset. This should be set in a URI query parameter.
    */
  var name: String
  /**
    * The `upload_url` key returned from creating or getting a release
    */
  var url: String
}

object ReposUploadReleaseAssetParams {
  @scala.inline
  def apply(
    data: String | js.Object,
    headers: ReposUploadReleaseAssetParamsHeaders,
    name: String,
    url: String,
    label: String = null
  ): ReposUploadReleaseAssetParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUploadReleaseAssetParams]
  }
}

