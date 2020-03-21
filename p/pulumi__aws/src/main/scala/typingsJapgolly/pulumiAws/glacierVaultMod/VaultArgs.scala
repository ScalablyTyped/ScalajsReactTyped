package typingsJapgolly.pulumiAws.glacierVaultMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.glacier.VaultNotification
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultArgs extends js.Object {
  /**
    * The policy document. This is a JSON formatted string.
    * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
    */
  val accessPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The notifications for the Vault. Fields documented below.
    */
  val notifications: js.UndefOr[Input[js.Array[Input[VaultNotification]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object VaultArgs {
  @scala.inline
  def apply(
    accessPolicy: Input[String] = null,
    name: Input[String] = null,
    notifications: Input[js.Array[Input[VaultNotification]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): VaultArgs = {
    val __obj = js.Dynamic.literal()
    if (accessPolicy != null) __obj.updateDynamic("accessPolicy")(accessPolicy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultArgs]
  }
}

