package typingsJapgolly.awsSdkClientS3Node.typesFilterRuleMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.prefix
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.suffix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterRule extends js.Object {
  /**
    * <p>Object key name prefix or suffix identifying one or more objects to which the filtering rule applies. Maximum prefix length can be up to 1,024 characters. Overlapping prefixes and suffixes are not supported. For more information, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  var Name: js.UndefOr[prefix | suffix | String] = js.undefined
  /**
    * _FilterRuleValue shape
    */
  var Value: js.UndefOr[String] = js.undefined
}

object FilterRule {
  @scala.inline
  def apply(Name: prefix | suffix | String = null, Value: String = null): FilterRule = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterRule]
  }
}

