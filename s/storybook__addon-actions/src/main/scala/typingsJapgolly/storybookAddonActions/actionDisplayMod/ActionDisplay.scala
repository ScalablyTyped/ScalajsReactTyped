package typingsJapgolly.storybookAddonActions.actionDisplayMod

import typingsJapgolly.storybookAddonActions.AnonArgs
import typingsJapgolly.storybookAddonActions.actionOptionsMod.ActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionDisplay extends js.Object {
  var count: Double
  var data: AnonArgs
  var id: String
  var options: ActionOptions
}

object ActionDisplay {
  @scala.inline
  def apply(count: Double, data: AnonArgs, id: String, options: ActionOptions): ActionDisplay = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionDisplay]
  }
}

