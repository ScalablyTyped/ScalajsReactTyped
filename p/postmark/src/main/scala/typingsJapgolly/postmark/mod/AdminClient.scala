package typingsJapgolly.postmark.mod

import typingsJapgolly.postmark.distClientAccountClientMod.default
import typingsJapgolly.postmark.distClientModelsMod.ClientOptions.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "AdminClient")
@js.native
open class AdminClient protected () extends default {
  /**
    * Create a new AccountClient
    * @param accountToken The account token that should be used with requests.
    * @param configOptions Various options to customize client behavior.
    */
  def this(accountToken: String) = this()
  def this(accountToken: String, configOptions: Configuration) = this()
}
