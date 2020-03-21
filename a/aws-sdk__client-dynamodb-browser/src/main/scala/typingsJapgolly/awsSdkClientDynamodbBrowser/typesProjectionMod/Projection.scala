package typingsJapgolly.awsSdkClientDynamodbBrowser.typesProjectionMod

import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ALL
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.INCLUDE
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.KEYS_ONLY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  /**
    * <p>Represents the non-key attribute names which will be projected into the index.</p> <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p>
    */
  var NonKeyAttributes: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
  /**
    * <p>The set of attributes that are projected into the index:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul>
    */
  var ProjectionType: js.UndefOr[ALL | KEYS_ONLY | INCLUDE | String] = js.undefined
}

object Projection {
  @scala.inline
  def apply(
    NonKeyAttributes: js.Array[String] | js.Iterable[String] = null,
    ProjectionType: ALL | KEYS_ONLY | INCLUDE | String = null
  ): Projection = {
    val __obj = js.Dynamic.literal()
    if (NonKeyAttributes != null) __obj.updateDynamic("NonKeyAttributes")(NonKeyAttributes.asInstanceOf[js.Any])
    if (ProjectionType != null) __obj.updateDynamic("ProjectionType")(ProjectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

