package typingsJapgolly.grommet.videoMod

import typingsJapgolly.grommet.grommetStrings.`false`
import typingsJapgolly.grommet.grommetStrings.below
import typingsJapgolly.grommet.grommetStrings.contain
import typingsJapgolly.grommet.grommetStrings.cover
import typingsJapgolly.grommet.grommetStrings.over
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var controls: js.UndefOr[`false` | over | below] = js.undefined
  var fit: js.UndefOr[cover | contain] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var mute: js.UndefOr[Boolean] = js.undefined
}

object VideoProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    controls: `false` | over | below = null,
    fit: cover | contain = null,
    gridArea: GridAreaType = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    margin: MarginType = null,
    mute: js.UndefOr[Boolean] = js.undefined
  ): VideoProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProps]
  }
}

