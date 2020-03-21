package typingsJapgolly.storybookComponents.docsPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocsPageProps extends js.Object {
  var subtitle: js.UndefOr[String] = js.native
  var title: String = js.native
}

object DocsPageProps {
  @scala.inline
  def apply(title: String, subtitle: String = null): DocsPageProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocsPageProps]
  }
}

