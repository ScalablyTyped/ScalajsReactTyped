package typingsJapgolly.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesInput extends js.Object {
  /**
    * An identifier that was returned from the previous list pipelines call. It can be used to return the next set of pipelines in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListPipelinesInput {
  @scala.inline
  def apply(nextToken: NextToken = null): ListPipelinesInput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelinesInput]
  }
}

