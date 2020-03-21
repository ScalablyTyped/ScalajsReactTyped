package typingsJapgolly.jpm

import typingsJapgolly.jpm.jpmStrings.downgrade
import typingsJapgolly.jpm.jpmStrings.enable
import typingsJapgolly.jpm.jpmStrings.install
import typingsJapgolly.jpm.jpmStrings.startup
import typingsJapgolly.jpm.jpmStrings.upgrade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access data that is bundled with the add-on, and add-on metadata
  */
@JSImport("sdk/self", JSImport.Namespace)
@js.native
object selfMod extends js.Object {
  val id: String = js.native
  val isPrivateBrowsingSupported: Boolean = js.native
  val loadReason: install | enable | startup | upgrade | downgrade = js.native
  val name: String = js.native
  val uri: String = js.native
  val version: String = js.native
  @js.native
  object data extends js.Object {
    def load(name: String): String = js.native
    def url(name: String): String = js.native
  }
  
}

