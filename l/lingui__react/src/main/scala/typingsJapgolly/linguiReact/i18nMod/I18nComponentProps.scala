package typingsJapgolly.linguiReact.i18nMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.linguiReact.AnonI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nComponentProps extends js.Object {
  var update: js.UndefOr[Boolean] = js.undefined
  var withHash: js.UndefOr[Boolean] = js.undefined
  def children(hasI18nI18nHash: AnonI18n): Node
}

object I18nComponentProps {
  @scala.inline
  def apply(
    children: AnonI18n => CallbackTo[Node],
    update: js.UndefOr[Boolean] = js.undefined,
    withHash: js.UndefOr[Boolean] = js.undefined
  ): I18nComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.linguiReact.AnonI18n) => children(t0).runNow()))
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (!js.isUndefined(withHash)) __obj.updateDynamic("withHash")(withHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nComponentProps]
  }
}

