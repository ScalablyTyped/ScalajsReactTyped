package typingsJapgolly.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRobotsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListRobots request. When the results of a ListRobot request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of robots that meet the criteria of the request.
    */
  var robots: js.UndefOr[Robots] = js.native
}

object ListRobotsResponse {
  @scala.inline
  def apply(nextToken: PaginationToken = null, robots: Robots = null): ListRobotsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (robots != null) __obj.updateDynamic("robots")(robots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRobotsResponse]
  }
}

