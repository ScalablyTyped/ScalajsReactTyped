package typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the bullet graph.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Toggles the visibility of the range stroke color of the labels.
    * @Default {false}
    */
  var applyRangeStrokeToLabels: js.UndefOr[Boolean] = js.undefined
  /** Toggles the visibility of the range stroke color of the ticks.
    * @Default {false}
    */
  var applyRangeStrokeToTicks: js.UndefOr[Boolean] = js.undefined
  /** Contains property to customize the caption in bullet graph.
    */
  var captionSettings: js.UndefOr[CaptionSettings] = js.undefined
  /** Comparative measure bar in bullet graph render till the specified value.
    * @Default {0}
    */
  var comparativeMeasureValue: js.UndefOr[Double] = js.undefined
  /** Fires, on double clicking the bullet graph.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
  /** Fires on rendering the caption of bullet graph.
    */
  var drawCaption: js.UndefOr[js.Function1[/* e */ DrawCaptionEventArgs, Unit]] = js.undefined
  /** Fires on rendering the category.
    */
  var drawCategory: js.UndefOr[js.Function1[/* e */ DrawCategoryEventArgs, Unit]] = js.undefined
  /** Fires on rendering the comparative measure symbol.
    */
  var drawComparativeMeasureSymbol: js.UndefOr[js.Function1[/* e */ DrawComparativeMeasureSymbolEventArgs, Unit]] = js.undefined
  /** Fires on rendering the feature measure bar.
    */
  var drawFeatureMeasureBar: js.UndefOr[js.Function1[/* e */ DrawFeatureMeasureBarEventArgs, Unit]] = js.undefined
  /** Fires on rendering the indicator of bullet graph.
    */
  var drawIndicator: js.UndefOr[js.Function1[/* e */ DrawIndicatorEventArgs, Unit]] = js.undefined
  /** Fires on rendering the labels.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.undefined
  /** Fires on rendering the qualitative ranges.
    */
  var drawQualitativeRanges: js.UndefOr[js.Function1[/* e */ DrawQualitativeRangesEventArgs, Unit]] = js.undefined
  /** Fires on rendering the ticks.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.undefined
  /** Toggles the animation of bullet graph.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Specifies to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.undefined
  /** Controls whether bullet graph has to be responsive while resizing.
    * @Default {true}
    */
  var enableResizing: js.UndefOr[Boolean] = js.undefined
  /** Specifies the direction of flow in bullet graph. Neither it may be backward nor forward.
    * @Default {forward}
    */
  var flowDirection: js.UndefOr[FlowDirection | String] = js.undefined
  /** Specifies the height of the bullet graph.
    * @Default {90}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Sets a value whether to make the bullet graph responsive on resize.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Fires on loading bullet graph.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Name of the culture based on which bulletgraph should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Bullet graph will render in the specified orientation.
    * @Default {horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.undefined
  /** Size of the qualitative range depends up on the specified value.
    * @Default {32}
    */
  var qualitativeRangeSize: js.UndefOr[Double] = js.undefined
  /** Contains property to customize the qualitative ranges.
    */
  var qualitativeRanges: js.UndefOr[js.Array[QualitativeRange]] = js.undefined
  /** Length of the quantitative range depends up on the specified value.
    * @Default {475}
    */
  var quantitativeScaleLength: js.UndefOr[Double] = js.undefined
  /** Contains all the properties to customize quantitative scale.
    */
  var quantitativeScaleSettings: js.UndefOr[QuantitativeScaleSettings] = js.undefined
  /** Fires, on right clicking the bullet graph.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
  /** By specifying this property the user can change the theme of the bullet graph.
    * @Default {flatlight}
    */
  var theme: js.UndefOr[String] = js.undefined
  /** Contains all the properties to customize tooltip.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
  /** Feature measure bar in bullet graph render till the specified value.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.undefined
  /** Specifies the width of the bullet graph.
    * @Default {595}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Click: /* e */ ClickEventArgs => Callback = null,
    applyRangeStrokeToLabels: js.UndefOr[Boolean] = js.undefined,
    applyRangeStrokeToTicks: js.UndefOr[Boolean] = js.undefined,
    captionSettings: CaptionSettings = null,
    comparativeMeasureValue: Int | Double = null,
    doubleClick: /* e */ DoubleClickEventArgs => Callback = null,
    drawCaption: /* e */ DrawCaptionEventArgs => Callback = null,
    drawCategory: /* e */ DrawCategoryEventArgs => Callback = null,
    drawComparativeMeasureSymbol: /* e */ DrawComparativeMeasureSymbolEventArgs => Callback = null,
    drawFeatureMeasureBar: /* e */ DrawFeatureMeasureBarEventArgs => Callback = null,
    drawIndicator: /* e */ DrawIndicatorEventArgs => Callback = null,
    drawLabels: /* e */ DrawLabelsEventArgs => Callback = null,
    drawQualitativeRanges: /* e */ DrawQualitativeRangesEventArgs => Callback = null,
    drawTicks: /* e */ DrawTicksEventArgs => Callback = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enableGroupSeparator: js.UndefOr[Boolean] = js.undefined,
    enableResizing: js.UndefOr[Boolean] = js.undefined,
    flowDirection: FlowDirection | String = null,
    height: Int | Double = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    load: /* e */ LoadEventArgs => Callback = null,
    locale: String = null,
    orientation: Orientation | String = null,
    qualitativeRangeSize: Int | Double = null,
    qualitativeRanges: js.Array[QualitativeRange] = null,
    quantitativeScaleLength: Int | Double = null,
    quantitativeScaleSettings: QuantitativeScaleSettings = null,
    rightClick: /* e */ RightClickEventArgs => Callback = null,
    theme: String = null,
    tooltipSettings: TooltipSettings = null,
    value: Int | Double = null,
    width: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.ClickEventArgs) => Click(t0).runNow()))
    if (!js.isUndefined(applyRangeStrokeToLabels)) __obj.updateDynamic("applyRangeStrokeToLabels")(applyRangeStrokeToLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(applyRangeStrokeToTicks)) __obj.updateDynamic("applyRangeStrokeToTicks")(applyRangeStrokeToTicks.asInstanceOf[js.Any])
    if (captionSettings != null) __obj.updateDynamic("captionSettings")(captionSettings.asInstanceOf[js.Any])
    if (comparativeMeasureValue != null) __obj.updateDynamic("comparativeMeasureValue")(comparativeMeasureValue.asInstanceOf[js.Any])
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.DoubleClickEventArgs) => doubleClick(t0).runNow()))
    if (drawCaption != null) __obj.updateDynamic("drawCaption")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.DrawCaptionEventArgs) => drawCaption(t0).runNow()))
    if (drawCategory != null) __obj.updateDynamic("drawCategory")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.DrawCategoryEventArgs) => drawCategory(t0).runNow()))
    if (drawComparativeMeasureSymbol != null) __obj.updateDynamic("drawComparativeMeasureSymbol")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.DrawComparativeMeasureSymbolEventArgs) => drawComparativeMeasureSymbol(t0).runNow()))
    if (drawFeatureMeasureBar != null) __obj.updateDynamic("drawFeatureMeasureBar")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.DrawFeatureMeasureBarEventArgs) => drawFeatureMeasureBar(t0).runNow()))
    if (drawIndicator != null) __obj.updateDynamic("drawIndicator")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.DrawIndicatorEventArgs) => drawIndicator(t0).runNow()))
    if (drawLabels != null) __obj.updateDynamic("drawLabels")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.DrawLabelsEventArgs) => drawLabels(t0).runNow()))
    if (drawQualitativeRanges != null) __obj.updateDynamic("drawQualitativeRanges")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.DrawQualitativeRangesEventArgs) => drawQualitativeRanges(t0).runNow()))
    if (drawTicks != null) __obj.updateDynamic("drawTicks")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.DrawTicksEventArgs) => drawTicks(t0).runNow()))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroupSeparator)) __obj.updateDynamic("enableGroupSeparator")(enableGroupSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(enableResizing)) __obj.updateDynamic("enableResizing")(enableResizing.asInstanceOf[js.Any])
    if (flowDirection != null) __obj.updateDynamic("flowDirection")(flowDirection.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.LoadEventArgs) => load(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (qualitativeRangeSize != null) __obj.updateDynamic("qualitativeRangeSize")(qualitativeRangeSize.asInstanceOf[js.Any])
    if (qualitativeRanges != null) __obj.updateDynamic("qualitativeRanges")(qualitativeRanges.asInstanceOf[js.Any])
    if (quantitativeScaleLength != null) __obj.updateDynamic("quantitativeScaleLength")(quantitativeScaleLength.asInstanceOf[js.Any])
    if (quantitativeScaleSettings != null) __obj.updateDynamic("quantitativeScaleSettings")(quantitativeScaleSettings.asInstanceOf[js.Any])
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.BulletGraph.RightClickEventArgs) => rightClick(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipSettings != null) __obj.updateDynamic("tooltipSettings")(tooltipSettings.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

