package typingsJapgolly.elasticsearch.mod

import typingsJapgolly.elasticsearch.elasticsearchStrings.nodes
import typingsJapgolly.elasticsearch.elasticsearchStrings.parents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksListParams extends GenericParams {
  var actions: js.UndefOr[NameList] = js.undefined
  var detailed: js.UndefOr[Boolean] = js.undefined
  var groupBy: js.UndefOr[nodes | parents] = js.undefined
  var nodeId: js.UndefOr[NameList] = js.undefined
  var parentNode: js.UndefOr[String] = js.undefined
  var parentTask: js.UndefOr[String] = js.undefined
  var waitForCompletion: js.UndefOr[Boolean] = js.undefined
}

object TasksListParams {
  @scala.inline
  def apply(
    actions: NameList = null,
    body: js.Any = null,
    detailed: js.UndefOr[Boolean] = js.undefined,
    filterPath: String | js.Array[String] = null,
    groupBy: nodes | parents = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: Int | Double = null,
    method: String = null,
    nodeId: NameList = null,
    parentNode: String = null,
    parentTask: String = null,
    requestTimeout: Int | Double = null,
    waitForCompletion: js.UndefOr[Boolean] = js.undefined
  ): TasksListParams = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (parentTask != null) __obj.updateDynamic("parentTask")(parentTask.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForCompletion)) __obj.updateDynamic("waitForCompletion")(waitForCompletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[TasksListParams]
  }
}

