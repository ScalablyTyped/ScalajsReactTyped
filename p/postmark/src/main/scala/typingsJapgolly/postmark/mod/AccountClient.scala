package typingsJapgolly.postmark.mod

import typingsJapgolly.postmark.accountClientMod.default
import typingsJapgolly.postmark.modelsMod.ClientOptions.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "AccountClient")
@js.native
class AccountClient protected () extends default {
  /**
    * Create a new AccountClient
    * @param accountToken The account token that should be used with requests.
    * @param configOptions Various options to customize client behavior.
    */
  def this(accountToken: String) = this()
  def this(accountToken: String, configOptions: Configuration) = this()
}

