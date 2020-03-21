package typingsJapgolly.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGraphResponse extends js.Object {
  /**
    * The ARN of the new behavior graph.
    */
  var GraphArn: js.UndefOr[typingsJapgolly.awsSdk.detectiveMod.GraphArn] = js.native
}

object CreateGraphResponse {
  @scala.inline
  def apply(GraphArn: GraphArn = null): CreateGraphResponse = {
    val __obj = js.Dynamic.literal()
    if (GraphArn != null) __obj.updateDynamic("GraphArn")(GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGraphResponse]
  }
}

