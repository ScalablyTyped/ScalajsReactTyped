package typingsJapgolly.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IMAP settings for an account.
  */
@js.native
trait SchemaImapSettings extends js.Object {
  /**
    * If this value is true, Gmail will immediately expunge a message when it
    * is marked as deleted in IMAP. Otherwise, Gmail will wait for an update
    * from the client before expunging messages marked as deleted.
    */
  var autoExpunge: js.UndefOr[Boolean] = js.native
  /**
    * Whether IMAP is enabled for the account.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The action that will be executed on a message when it is marked as
    * deleted and expunged from the last visible IMAP folder.
    */
  var expungeBehavior: js.UndefOr[String] = js.native
  /**
    * An optional limit on the number of messages that an IMAP folder may
    * contain. Legal values are 0, 1000, 2000, 5000 or 10000. A value of zero
    * is interpreted to mean that there is no limit.
    */
  var maxFolderSize: js.UndefOr[Double] = js.native
}

object SchemaImapSettings {
  @scala.inline
  def apply(
    autoExpunge: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expungeBehavior: String = null,
    maxFolderSize: Int | Double = null
  ): SchemaImapSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpunge)) __obj.updateDynamic("autoExpunge")(autoExpunge.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (expungeBehavior != null) __obj.updateDynamic("expungeBehavior")(expungeBehavior.asInstanceOf[js.Any])
    if (maxFolderSize != null) __obj.updateDynamic("maxFolderSize")(maxFolderSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImapSettings]
  }
}

