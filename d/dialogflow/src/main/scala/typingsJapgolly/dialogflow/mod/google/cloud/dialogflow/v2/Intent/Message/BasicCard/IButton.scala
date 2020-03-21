package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard

import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.IOpenUriAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Button. */
trait IButton extends js.Object {
  /** Button openUriAction */
  var openUriAction: js.UndefOr[IOpenUriAction | Null] = js.undefined
  /** Button title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object IButton {
  @scala.inline
  def apply(openUriAction: IOpenUriAction = null, title: String = null): IButton = {
    val __obj = js.Dynamic.literal()
    if (openUriAction != null) __obj.updateDynamic("openUriAction")(openUriAction.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButton]
  }
}

