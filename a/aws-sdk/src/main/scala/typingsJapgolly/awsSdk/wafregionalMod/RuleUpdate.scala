package typingsJapgolly.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleUpdate extends js.Object {
  /**
    * Specify INSERT to add a Predicate to a Rule. Use DELETE to remove a Predicate from a Rule.
    */
  var Action: ChangeAction = js.native
  /**
    * The ID of the Predicate (such as an IPSet) that you want to add to a Rule.
    */
  var Predicate: typingsJapgolly.awsSdk.wafregionalMod.Predicate = js.native
}

object RuleUpdate {
  @scala.inline
  def apply(Action: ChangeAction, Predicate: Predicate): RuleUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuleUpdate]
  }
}

