package typingsJapgolly.awsSdkClientKinesisBrowser.typesStartingPositionMod

import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AFTER_SEQUENCE_NUMBER
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_SEQUENCE_NUMBER
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_TIMESTAMP
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LATEST
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.TRIM_HORIZON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartingPosition extends js.Object {
  /**
    * _SequenceNumber shape
    */
  var SequenceNumber: js.UndefOr[String] = js.undefined
  /**
    * _Timestamp shape
    */
  var Timestamp: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * _ShardIteratorType shape
    */
  var Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String
}

object StartingPosition {
  @scala.inline
  def apply(
    Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String,
    SequenceNumber: String = null,
    Timestamp: js.Date | String | Double = null
  ): StartingPosition = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartingPosition]
  }
}

