package typingsJapgolly.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicEnvironmentFlags extends js.Object {
  val confirm: Boolean
  val interactive: Boolean
}

object IonicEnvironmentFlags {
  @scala.inline
  def apply(confirm: Boolean, interactive: Boolean): IonicEnvironmentFlags = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IonicEnvironmentFlags]
  }
}

