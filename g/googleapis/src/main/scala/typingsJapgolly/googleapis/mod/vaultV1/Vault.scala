package typingsJapgolly.googleapis.mod.vaultV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * G Suite Vault API
  *
  * Archiving and eDiscovery for G Suite.
  *
  * @example
  * const {google} = require('googleapis');
  * const vault = google.vault('v1');
  *
  * @namespace vault
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Vault
  */
@JSImport("googleapis", "vault_v1.Vault")
@js.native
class Vault protected ()
  extends typingsJapgolly.googleapis.vaultV1Mod.vaultV1.Vault {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

