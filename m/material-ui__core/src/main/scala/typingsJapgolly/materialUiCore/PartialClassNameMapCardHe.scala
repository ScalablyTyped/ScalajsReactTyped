package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardHeader/CardHeader.CardHeaderClassKey>> */
@js.native
trait PartialClassNameMapCardHe extends js.Object {
  var action: js.UndefOr[String] = js.native
  var avatar: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var subheader: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object PartialClassNameMapCardHe {
  @scala.inline
  def apply(
    action: String = null,
    avatar: String = null,
    content: String = null,
    root: String = null,
    subheader: String = null,
    title: String = null
  ): PartialClassNameMapCardHe = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (subheader != null) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapCardHe]
  }
}

