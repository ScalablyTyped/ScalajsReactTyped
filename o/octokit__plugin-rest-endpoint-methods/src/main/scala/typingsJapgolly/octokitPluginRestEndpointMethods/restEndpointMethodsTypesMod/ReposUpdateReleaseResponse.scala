package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateReleaseResponse extends js.Object {
  var assets: js.Array[ReposUpdateReleaseResponseAssetsItem]
  var assets_url: String
  var author: ReposUpdateReleaseResponseAuthor
  var body: String
  var created_at: String
  var draft: Boolean
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var prerelease: Boolean
  var published_at: String
  var tag_name: String
  var tarball_url: String
  var target_commitish: String
  var upload_url: String
  var url: String
  var zipball_url: String
}

object ReposUpdateReleaseResponse {
  @scala.inline
  def apply(
    assets: js.Array[ReposUpdateReleaseResponseAssetsItem],
    assets_url: String,
    author: ReposUpdateReleaseResponseAuthor,
    body: String,
    created_at: String,
    draft: Boolean,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    prerelease: Boolean,
    published_at: String,
    tag_name: String,
    tarball_url: String,
    target_commitish: String,
    upload_url: String,
    url: String,
    zipball_url: String
  ): ReposUpdateReleaseResponse = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], assets_url = assets_url.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], zipball_url = zipball_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateReleaseResponse]
  }
}

