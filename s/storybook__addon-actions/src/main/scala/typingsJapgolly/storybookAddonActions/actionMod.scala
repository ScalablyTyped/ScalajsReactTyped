package typingsJapgolly.storybookAddonActions

import typingsJapgolly.storybookAddonActions.actionOptionsMod.ActionOptions
import typingsJapgolly.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions/dist/preview/action", JSImport.Namespace)
@js.native
object actionMod extends js.Object {
  def action(name: String): HandlerFunction = js.native
  def action(name: String, options: ActionOptions): HandlerFunction = js.native
}

