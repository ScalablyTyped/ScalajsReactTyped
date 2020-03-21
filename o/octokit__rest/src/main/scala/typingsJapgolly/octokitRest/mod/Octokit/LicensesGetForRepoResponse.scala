package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesGetForRepoResponse extends js.Object {
  var _links: LicensesGetForRepoResponseLinks
  var content: String
  var download_url: String
  var encoding: String
  var git_url: String
  var html_url: String
  var license: LicensesGetForRepoResponseLicense
  var name: String
  var path: String
  var sha: String
  var size: Double
  var `type`: String
  var url: String
}

object LicensesGetForRepoResponse {
  @scala.inline
  def apply(
    _links: LicensesGetForRepoResponseLinks,
    content: String,
    download_url: String,
    encoding: String,
    git_url: String,
    html_url: String,
    license: LicensesGetForRepoResponseLicense,
    name: String,
    path: String,
    sha: String,
    size: Double,
    `type`: String,
    url: String
  ): LicensesGetForRepoResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], git_url = git_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensesGetForRepoResponse]
  }
}

