package typingsJapgolly.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod

import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.KEYS_ONLY
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NEW_AND_OLD_IMAGES
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NEW_IMAGE
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.OLD_IMAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamSpecification extends js.Object {
  /**
    * <p>Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.</p>
    */
  var StreamEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * <p> When an item in the table is modified, <code>StreamViewType</code> determines what information is written to the stream for this table. Valid values for <code>StreamViewType</code> are:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the key attributes of the modified item are written to the stream.</p> </li> <li> <p> <code>NEW_IMAGE</code> - The entire item, as it appears after it was modified, is written to the stream.</p> </li> <li> <p> <code>OLD_IMAGE</code> - The entire item, as it appeared before it was modified, is written to the stream.</p> </li> <li> <p> <code>NEW_AND_OLD_IMAGES</code> - Both the new and the old item images of the item are written to the stream.</p> </li> </ul>
    */
  var StreamViewType: js.UndefOr[NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES | KEYS_ONLY | String] = js.undefined
}

object StreamSpecification {
  @scala.inline
  def apply(
    StreamEnabled: js.UndefOr[Boolean] = js.undefined,
    StreamViewType: NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES | KEYS_ONLY | String = null
  ): StreamSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(StreamEnabled)) __obj.updateDynamic("StreamEnabled")(StreamEnabled.asInstanceOf[js.Any])
    if (StreamViewType != null) __obj.updateDynamic("StreamViewType")(StreamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSpecification]
  }
}

