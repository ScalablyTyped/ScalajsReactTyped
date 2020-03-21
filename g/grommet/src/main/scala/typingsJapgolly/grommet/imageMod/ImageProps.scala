package typingsJapgolly.grommet.imageMod

import typingsJapgolly.grommet.grommetStrings.contain
import typingsJapgolly.grommet.grommetStrings.cover
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.strong
import typingsJapgolly.grommet.grommetStrings.weak
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var fallback: js.UndefOr[String] = js.undefined
  var fillProp: js.UndefOr[Boolean] = js.undefined
  var fit: js.UndefOr[cover | contain] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var opacity: js.UndefOr[weak | medium | strong | String | Boolean] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    fallback: String = null,
    fillProp: js.UndefOr[Boolean] = js.undefined,
    fit: cover | contain = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    opacity: weak | medium | strong | String | Boolean = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (!js.isUndefined(fillProp)) __obj.updateDynamic("fillProp")(fillProp.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

