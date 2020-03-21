package typingsJapgolly.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentsOutput extends js.Object {
  /**
    * A list of deployment IDs.
    */
  var deployments: js.UndefOr[DeploymentsList] = js.native
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployments call to return the next set of deployments in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentsOutput {
  @scala.inline
  def apply(deployments: DeploymentsList = null, nextToken: NextToken = null): ListDeploymentsOutput = {
    val __obj = js.Dynamic.literal()
    if (deployments != null) __obj.updateDynamic("deployments")(deployments.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentsOutput]
  }
}

