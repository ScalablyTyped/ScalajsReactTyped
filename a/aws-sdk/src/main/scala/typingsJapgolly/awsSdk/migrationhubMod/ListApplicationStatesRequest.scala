package typingsJapgolly.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationStatesRequest extends js.Object {
  /**
    * The configurationIds from the Application Discovery Service that uniquely identifies your applications.
    */
  var ApplicationIds: js.UndefOr[typingsJapgolly.awsSdk.migrationhubMod.ApplicationIds] = js.native
  /**
    * Maximum number of results to be returned per page.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.migrationhubMod.MaxResults] = js.native
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListApplicationStatesRequest {
  @scala.inline
  def apply(ApplicationIds: ApplicationIds = null, MaxResults: Int | Double = null, NextToken: Token = null): ListApplicationStatesRequest = {
    val __obj = js.Dynamic.literal()
    if (ApplicationIds != null) __obj.updateDynamic("ApplicationIds")(ApplicationIds.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationStatesRequest]
  }
}

