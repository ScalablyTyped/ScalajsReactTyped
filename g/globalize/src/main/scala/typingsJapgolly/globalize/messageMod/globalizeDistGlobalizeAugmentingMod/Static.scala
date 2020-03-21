package typingsJapgolly.globalize.messageMod.globalizeDistGlobalizeAugmentingMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  /**
  		 * Load messages data.
  		 * @param {Object} json JSON object of messages data. Keys can use any character, except /, { and }. Values (i.e., the message content itself) can contain any character.
  		 * @returns {void}
  		 */
  def loadMessages(json: js.Object): Unit
}

object Static {
  @scala.inline
  def apply(loadMessages: js.Object => Callback): Static = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadMessages")(js.Any.fromFunction1((t0: js.Object) => loadMessages(t0).runNow()))
    __obj.asInstanceOf[Static]
  }
}

