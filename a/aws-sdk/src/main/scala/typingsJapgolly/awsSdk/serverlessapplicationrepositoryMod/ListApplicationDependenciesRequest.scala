package typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationDependenciesRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  /**
    * The total number of items to return.
    */
  var MaxItems: js.UndefOr[typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.MaxItems] = js.native
  /**
    * A token to specify where to start paginating.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The semantic version of the application to get.
    */
  var SemanticVersion: js.UndefOr[string] = js.native
}

object ListApplicationDependenciesRequest {
  @scala.inline
  def apply(
    ApplicationId: string,
    MaxItems: Int | Double = null,
    NextToken: string = null,
    SemanticVersion: string = null
  ): ListApplicationDependenciesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SemanticVersion != null) __obj.updateDynamic("SemanticVersion")(SemanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationDependenciesRequest]
  }
}

