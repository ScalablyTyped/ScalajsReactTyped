package typingsJapgolly.antdMobileRn.listPropsTypeMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antdMobileRn.antdMobileRnBooleans.`false`
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPropsType extends js.Object {
  var children: js.UndefOr[`false` | Element | js.Array[Element]] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[ReactType[_]] | String | Element] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[ReactType[_]] | String | Element] = js.undefined
}

object ListPropsType {
  @scala.inline
  def apply(
    children: `false` | Element | js.Array[Element] = null,
    renderFooter: js.Function0[ReactType[_]] | String | Element = null,
    renderHeader: js.Function0[ReactType[_]] | String | Element = null
  ): ListPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPropsType]
  }
}

