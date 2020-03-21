package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfiguration extends js.Object {
  /**
    * The time at which this security configuration was created.
    */
  var CreatedTimeStamp: js.UndefOr[js.Date] = js.native
  /**
    * The encryption configuration associated with this security configuration.
    */
  var EncryptionConfiguration: js.UndefOr[typingsJapgolly.awsSdk.glueMod.EncryptionConfiguration] = js.native
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object SecurityConfiguration {
  @scala.inline
  def apply(
    CreatedTimeStamp: js.Date = null,
    EncryptionConfiguration: EncryptionConfiguration = null,
    Name: NameString = null
  ): SecurityConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimeStamp != null) __obj.updateDynamic("CreatedTimeStamp")(CreatedTimeStamp.asInstanceOf[js.Any])
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfiguration]
  }
}

