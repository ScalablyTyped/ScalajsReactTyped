package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListDownloadsForSelfHostedRunnerApplicationParams extends js.Object {
  var owner: String
  var repo: String
}

object ActionsListDownloadsForSelfHostedRunnerApplicationParams {
  @scala.inline
  def apply(owner: String, repo: String): ActionsListDownloadsForSelfHostedRunnerApplicationParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListDownloadsForSelfHostedRunnerApplicationParams]
  }
}

