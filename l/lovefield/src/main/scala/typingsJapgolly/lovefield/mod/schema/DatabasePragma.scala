package typingsJapgolly.lovefield.mod.schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasePragma extends js.Object {
  var enableBundledMode: Boolean
}

object DatabasePragma {
  @scala.inline
  def apply(enableBundledMode: Boolean): DatabasePragma = {
    val __obj = js.Dynamic.literal(enableBundledMode = enableBundledMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatabasePragma]
  }
}

