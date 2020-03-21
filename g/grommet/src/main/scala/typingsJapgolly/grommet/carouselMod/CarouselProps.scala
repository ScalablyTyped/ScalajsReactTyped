package typingsJapgolly.grommet.carouselMod

import typingsJapgolly.grommet.grommetStrings.arrows
import typingsJapgolly.grommet.grommetStrings.selectors
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var controls: js.UndefOr[Boolean | arrows | selectors] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var initialChild: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var play: js.UndefOr[Double] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    controls: Boolean | arrows | selectors = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    gridArea: GridAreaType = null,
    initialChild: Int | Double = null,
    margin: MarginType = null,
    play: Int | Double = null
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (initialChild != null) __obj.updateDynamic("initialChild")(initialChild.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (play != null) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
}

