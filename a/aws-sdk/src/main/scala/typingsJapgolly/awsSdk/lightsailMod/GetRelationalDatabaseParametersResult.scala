package typingsJapgolly.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseParametersResult extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get static IPs request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An object describing the result of your get relational database parameters request.
    */
  var parameters: js.UndefOr[RelationalDatabaseParameterList] = js.native
}

object GetRelationalDatabaseParametersResult {
  @scala.inline
  def apply(nextPageToken: String = null, parameters: RelationalDatabaseParameterList = null): GetRelationalDatabaseParametersResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseParametersResult]
  }
}

