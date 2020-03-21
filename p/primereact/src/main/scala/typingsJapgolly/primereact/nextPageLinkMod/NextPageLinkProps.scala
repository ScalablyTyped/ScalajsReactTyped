package typingsJapgolly.primereact.nextPageLinkMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextPageLinkProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object NextPageLinkProps {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined, onClick: js.UndefOr[Callback] = js.undefined): NextPageLinkProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    __obj.asInstanceOf[NextPageLinkProps]
  }
}

