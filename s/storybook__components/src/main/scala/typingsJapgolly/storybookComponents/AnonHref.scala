package typingsJapgolly.storybookComponents

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHref extends js.Object {
  var href: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var title: String = js.native
}

object AnonHref {
  @scala.inline
  def apply(title: String, href: String = null, onClick: js.UndefOr[Callback] = js.undefined): AnonHref = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    __obj.asInstanceOf[AnonHref]
  }
}

