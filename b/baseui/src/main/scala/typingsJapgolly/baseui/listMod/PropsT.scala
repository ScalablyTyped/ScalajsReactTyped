package typingsJapgolly.baseui.listMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsT extends js.Object {
  var artwork: js.UndefOr[Node] = js.undefined
  var artworkSize: js.UndefOr[ArtworkSizesT] = js.undefined
  var children: Node
  var endEnhancer: js.UndefOr[Node] = js.undefined
  var overrides: js.UndefOr[OverridesT] = js.undefined
  var sublist: js.UndefOr[Boolean] = js.undefined
}

object PropsT {
  @scala.inline
  def apply(
    artwork: VdomNode = null,
    artworkSize: ArtworkSizesT = null,
    children: VdomNode = null,
    endEnhancer: VdomNode = null,
    overrides: OverridesT = null,
    sublist: js.UndefOr[Boolean] = js.undefined
  ): PropsT = {
    val __obj = js.Dynamic.literal()
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.rawNode.asInstanceOf[js.Any])
    if (artworkSize != null) __obj.updateDynamic("artworkSize")(artworkSize.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.rawNode.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsT]
  }
}

