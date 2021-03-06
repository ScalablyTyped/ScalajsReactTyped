package typingsJapgolly.nextServer.libUtilsMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.nextServer.nextServerBooleans.`true`
import typingsJapgolly.react.mod.ReactFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/utils.RenderPageResult & {  styles ? :std.Array<react.react.ReactElement> | react.react.ReactFragment} */
trait DocumentInitialProps extends js.Object {
  var dataOnly: js.UndefOr[`true`] = js.undefined
  var head: js.UndefOr[js.Array[Element | Null]] = js.undefined
  var html: String
  var styles: js.UndefOr[js.Array[Element] | ReactFragment] = js.undefined
}

object DocumentInitialProps {
  @scala.inline
  def apply(
    html: String,
    dataOnly: `true` = null,
    head: js.Array[Element | Null] = null,
    styles: js.Array[Element] | ReactFragment = null
  ): DocumentInitialProps = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    if (dataOnly != null) __obj.updateDynamic("dataOnly")(dataOnly.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInitialProps]
  }
}

