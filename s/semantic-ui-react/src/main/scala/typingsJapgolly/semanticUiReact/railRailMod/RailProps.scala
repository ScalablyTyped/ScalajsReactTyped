package typingsJapgolly.semanticUiReact.railRailMod

import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.genericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RailProps
  extends StrictRailProps
     with /* key */ StringDictionary[js.Any]

object RailProps {
  @scala.inline
  def apply(
    position: SemanticFLOATS,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    close: Boolean | very = null,
    content: SemanticShorthandContent = null,
    dividing: js.UndefOr[Boolean] = js.undefined,
    internal: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null
  ): RailProps = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(attached)) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dividing)) __obj.updateDynamic("dividing")(dividing.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailProps]
  }
}

