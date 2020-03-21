package typingsJapgolly.ractive.mod

import typingsJapgolly.ractive.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginArgsBase extends js.Object {
  var Ractive: AnonInstantiable
}

object PluginArgsBase {
  @scala.inline
  def apply(Ractive: AnonInstantiable): PluginArgsBase = {
    val __obj = js.Dynamic.literal(Ractive = Ractive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginArgsBase]
  }
}

