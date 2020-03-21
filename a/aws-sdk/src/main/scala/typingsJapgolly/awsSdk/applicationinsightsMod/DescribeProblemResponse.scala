package typingsJapgolly.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProblemResponse extends js.Object {
  /**
    * Information about the problem. 
    */
  var Problem: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.Problem] = js.native
}

object DescribeProblemResponse {
  @scala.inline
  def apply(Problem: Problem = null): DescribeProblemResponse = {
    val __obj = js.Dynamic.literal()
    if (Problem != null) __obj.updateDynamic("Problem")(Problem.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProblemResponse]
  }
}

