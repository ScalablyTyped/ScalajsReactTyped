package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLoggerDefinitionVersionsResponse extends js.Object {
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Information about a version.
    */
  var Versions: js.UndefOr[listOfVersionInformation] = js.native
}

object ListLoggerDefinitionVersionsResponse {
  @scala.inline
  def apply(NextToken: string = null, Versions: listOfVersionInformation = null): ListLoggerDefinitionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Versions != null) __obj.updateDynamic("Versions")(Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLoggerDefinitionVersionsResponse]
  }
}

