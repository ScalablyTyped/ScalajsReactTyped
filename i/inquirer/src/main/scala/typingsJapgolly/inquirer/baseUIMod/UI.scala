package typingsJapgolly.inquirer.baseUIMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.inquirer.mod.prompts.PromptBase
import typingsJapgolly.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a ui.
  */
trait UI extends js.Object {
  /**
    * Gets or sets the currently active prompt.
    */
  var activePrompt: PromptBase
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  var rl: Interface
  /**
    * Releases all unmanaged resources.
    */
  /* protected */ def close(): Unit
  /**
    * Handles a forced exit of the application.
    */
  /* protected */ def onForceClose(): Unit
}

object UI {
  @scala.inline
  def apply(activePrompt: PromptBase, close: Callback, onForceClose: Callback, rl: Interface): UI = {
    val __obj = js.Dynamic.literal(activePrompt = activePrompt.asInstanceOf[js.Any], rl = rl.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("onForceClose")(onForceClose.toJsFn)
    __obj.asInstanceOf[UI]
  }
}

