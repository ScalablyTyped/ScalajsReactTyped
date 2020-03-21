package typingsJapgolly.storybookReadme.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.storybookReadme.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureReadmeConfig extends js.Object {
  var DocPreview: js.UndefOr[js.Function1[/* props */ AnonChildren, Node]] = js.undefined
  var FooterPreview: js.UndefOr[js.Function1[/* props */ AnonChildren, Node]] = js.undefined
  var HeaderPreview: js.UndefOr[js.Function1[/* props */ AnonChildren, Node]] = js.undefined
  var StoryPreview: js.UndefOr[js.Function1[/* props */ AnonChildren, Node]] = js.undefined
  var footer: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
}

object ConfigureReadmeConfig {
  @scala.inline
  def apply(
    DocPreview: /* props */ AnonChildren => CallbackTo[Node] = null,
    FooterPreview: /* props */ AnonChildren => CallbackTo[Node] = null,
    HeaderPreview: /* props */ AnonChildren => CallbackTo[Node] = null,
    StoryPreview: /* props */ AnonChildren => CallbackTo[Node] = null,
    footer: String = null,
    header: String = null
  ): ConfigureReadmeConfig = {
    val __obj = js.Dynamic.literal()
    if (DocPreview != null) __obj.updateDynamic("DocPreview")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.storybookReadme.AnonChildren) => DocPreview(t0).runNow()))
    if (FooterPreview != null) __obj.updateDynamic("FooterPreview")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.storybookReadme.AnonChildren) => FooterPreview(t0).runNow()))
    if (HeaderPreview != null) __obj.updateDynamic("HeaderPreview")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.storybookReadme.AnonChildren) => HeaderPreview(t0).runNow()))
    if (StoryPreview != null) __obj.updateDynamic("StoryPreview")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.storybookReadme.AnonChildren) => StoryPreview(t0).runNow()))
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureReadmeConfig]
  }
}

