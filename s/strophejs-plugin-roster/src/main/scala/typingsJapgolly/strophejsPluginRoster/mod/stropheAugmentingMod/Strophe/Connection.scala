package typingsJapgolly.strophejsPluginRoster.mod.stropheAugmentingMod.Strophe

import typingsJapgolly.strophejsPluginRoster.mod.StropheRosterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var roster: StropheRosterPlugin
}

object Connection {
  @scala.inline
  def apply(roster: StropheRosterPlugin): Connection = {
    val __obj = js.Dynamic.literal(roster = roster.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Connection]
  }
}

