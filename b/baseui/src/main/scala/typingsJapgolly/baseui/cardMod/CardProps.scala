package typingsJapgolly.baseui.cardMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.AnonThumbnail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  val action: js.UndefOr[Node] = js.undefined
  val children: js.UndefOr[Node] = js.undefined
  val hasThumbnail: js.UndefOr[js.Function1[/* props */ AnonThumbnail, Boolean]] = js.undefined
  val headerImage: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImagePropsT */ js.Any)
  ] = js.undefined
  val overrides: js.UndefOr[CardOverrides] = js.undefined
  val thumbnail: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[Node] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    action: VdomNode = null,
    children: VdomNode = null,
    hasThumbnail: /* props */ AnonThumbnail => CallbackTo[Boolean] = null,
    headerImage: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImagePropsT */ js.Any) = null,
    overrides: CardOverrides = null,
    thumbnail: String = null,
    title: VdomNode = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.rawNode.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (hasThumbnail != null) __obj.updateDynamic("hasThumbnail")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.baseui.AnonThumbnail) => hasThumbnail(t0).runNow()))
    if (headerImage != null) __obj.updateDynamic("headerImage")(headerImage.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardProps]
  }
}

