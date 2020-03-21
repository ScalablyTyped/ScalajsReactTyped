package typingsJapgolly.blueprintjsCore.propsMod

import typingsJapgolly.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIntentProps extends js.Object {
  /** Visual intent color to apply to element. */
  var intent: js.UndefOr[Intent] = js.undefined
}

object IIntentProps {
  @scala.inline
  def apply(intent: Intent = null): IIntentProps = {
    val __obj = js.Dynamic.literal()
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIntentProps]
  }
}

