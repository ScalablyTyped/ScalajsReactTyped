package typingsJapgolly.compassVerticalRhythm.mod

import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.Percentsign
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.ch
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.dashed
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.dotted
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.double
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.em
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.ex
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.groove
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.hidden
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.inset
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.none
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.outset
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.px
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.rem
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.ridge
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.solid
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.vh
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.vmin
import typingsJapgolly.compassVerticalRhythm.compassVerticalRhythmStrings.vw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var baseFontSize: js.UndefOr[String] = js.undefined
  var baseLineHeight: js.UndefOr[Double | String] = js.undefined
  var defaultRhythmBorderStyle: js.UndefOr[
    solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset
  ] = js.undefined
  var defaultRhythmBorderWidth: js.UndefOr[String] = js.undefined
  var minLinePadding: js.UndefOr[String] = js.undefined
  var rhythmUnit: js.UndefOr[Percentsign | em | ex | ch | px | rem | vw | vh | vmin] = js.undefined
  var roundToNearestHalfLine: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    baseFontSize: String = null,
    baseLineHeight: Double | String = null,
    defaultRhythmBorderStyle: solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset = null,
    defaultRhythmBorderWidth: String = null,
    minLinePadding: String = null,
    rhythmUnit: Percentsign | em | ex | ch | px | rem | vw | vh | vmin = null,
    roundToNearestHalfLine: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (baseLineHeight != null) __obj.updateDynamic("baseLineHeight")(baseLineHeight.asInstanceOf[js.Any])
    if (defaultRhythmBorderStyle != null) __obj.updateDynamic("defaultRhythmBorderStyle")(defaultRhythmBorderStyle.asInstanceOf[js.Any])
    if (defaultRhythmBorderWidth != null) __obj.updateDynamic("defaultRhythmBorderWidth")(defaultRhythmBorderWidth.asInstanceOf[js.Any])
    if (minLinePadding != null) __obj.updateDynamic("minLinePadding")(minLinePadding.asInstanceOf[js.Any])
    if (rhythmUnit != null) __obj.updateDynamic("rhythmUnit")(rhythmUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(roundToNearestHalfLine)) __obj.updateDynamic("roundToNearestHalfLine")(roundToNearestHalfLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

