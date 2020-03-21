package typingsJapgolly.grommet.boxMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.grommet.AnonCorner
import typingsJapgolly.grommet.AnonDelay
import typingsJapgolly.grommet.AnonGrow
import typingsJapgolly.grommet.AnonHorizontal
import typingsJapgolly.grommet.AnonMax
import typingsJapgolly.grommet.grommetStrings.`column-reverse`
import typingsJapgolly.grommet.grommetStrings.`row-responsive`
import typingsJapgolly.grommet.grommetStrings.`row-reverse`
import typingsJapgolly.grommet.grommetStrings.around
import typingsJapgolly.grommet.grommetStrings.auto
import typingsJapgolly.grommet.grommetStrings.baseline
import typingsJapgolly.grommet.grommetStrings.between
import typingsJapgolly.grommet.grommetStrings.center
import typingsJapgolly.grommet.grommetStrings.column
import typingsJapgolly.grommet.grommetStrings.end
import typingsJapgolly.grommet.grommetStrings.evenly
import typingsJapgolly.grommet.grommetStrings.fadeIn
import typingsJapgolly.grommet.grommetStrings.fadeOut
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.grow
import typingsJapgolly.grommet.grommetStrings.hidden
import typingsJapgolly.grommet.grommetStrings.jiggle
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.pulse
import typingsJapgolly.grommet.grommetStrings.reverse
import typingsJapgolly.grommet.grommetStrings.row
import typingsJapgolly.grommet.grommetStrings.scroll
import typingsJapgolly.grommet.grommetStrings.shrink
import typingsJapgolly.grommet.grommetStrings.slideDown
import typingsJapgolly.grommet.grommetStrings.slideLeft
import typingsJapgolly.grommet.grommetStrings.slideRight
import typingsJapgolly.grommet.grommetStrings.slideUp
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.start
import typingsJapgolly.grommet.grommetStrings.stretch
import typingsJapgolly.grommet.grommetStrings.visible
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxlarge
import typingsJapgolly.grommet.grommetStrings.xxsmall
import typingsJapgolly.grommet.grommetStrings.zoomIn
import typingsJapgolly.grommet.grommetStrings.zoomOut
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignContentType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.BackgroundType
import typingsJapgolly.grommet.utilsMod.BasisType
import typingsJapgolly.grommet.utilsMod.BorderType
import typingsJapgolly.grommet.utilsMod.ElevationType
import typingsJapgolly.grommet.utilsMod.FillType
import typingsJapgolly.grommet.utilsMod.GapType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import typingsJapgolly.grommet.utilsMod.PadType
import typingsJapgolly.grommet.utilsMod.PolymorphicType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var alignContent: js.UndefOr[AlignContentType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var animation: js.UndefOr[
    fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | AnonDelay | (js.Array[
      fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | AnonDelay
    ])
  ] = js.undefined
  var as: js.UndefOr[PolymorphicType] = js.undefined
  var background: js.UndefOr[BackgroundType] = js.undefined
  var basis: js.UndefOr[BasisType] = js.undefined
  var border: js.UndefOr[BorderType] = js.undefined
  var direction: js.UndefOr[row | column | `row-responsive` | `row-reverse` | `column-reverse`] = js.undefined
  var elevation: js.UndefOr[ElevationType] = js.undefined
  var fill: js.UndefOr[FillType] = js.undefined
  var flex: js.UndefOr[grow | shrink | Boolean | AnonGrow] = js.undefined
  var focusIndicator: js.UndefOr[Boolean] = js.undefined
  var gap: js.UndefOr[GapType] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var height: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | AnonMax] = js.undefined
  var hoverIndicator: js.UndefOr[BackgroundType | Boolean] = js.undefined
  var justify: js.UndefOr[around | between | center | end | evenly | start | stretch] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var overflow: js.UndefOr[auto | hidden | scroll | visible | AnonHorizontal | String] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var round: js.UndefOr[Boolean | xsmall | small | medium | large | xlarge | full | String | AnonCorner] = js.undefined
  var tag: js.UndefOr[PolymorphicType] = js.undefined
  var width: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | AnonMax] = js.undefined
  var wrap: js.UndefOr[Boolean | reverse] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    align: start | center | end | baseline | stretch = null,
    alignContent: AlignContentType = null,
    alignSelf: AlignSelfType = null,
    animation: fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | AnonDelay | (js.Array[
      fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | AnonDelay
    ]) = null,
    as: PolymorphicType = null,
    background: BackgroundType = null,
    basis: BasisType = null,
    border: BorderType = null,
    direction: row | column | `row-responsive` | `row-reverse` | `column-reverse` = null,
    elevation: ElevationType = null,
    fill: FillType = null,
    flex: grow | shrink | Boolean | AnonGrow = null,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    gap: GapType = null,
    gridArea: GridAreaType = null,
    height: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | AnonMax = null,
    hoverIndicator: BackgroundType | Boolean = null,
    justify: around | between | center | end | evenly | start | stretch = null,
    margin: MarginType = null,
    onClick: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    overflow: auto | hidden | scroll | visible | AnonHorizontal | String = null,
    pad: PadType = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    round: Boolean | xsmall | small | medium | large | xlarge | full | String | AnonCorner = null,
    tag: PolymorphicType = null,
    width: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | AnonMax = null,
    wrap: Boolean | reverse = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (basis != null) __obj.updateDynamic("basis")(basis.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverIndicator != null) __obj.updateDynamic("hoverIndicator")(hoverIndicator.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

