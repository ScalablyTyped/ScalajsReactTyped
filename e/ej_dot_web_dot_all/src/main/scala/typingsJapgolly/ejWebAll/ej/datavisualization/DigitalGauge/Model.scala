package typingsJapgolly.ejWebAll.ej.datavisualization.DigitalGauge

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the gauge.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Fires, on double clicking the digital gauge.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
  /** Specifies the responsiveness of the Digital gauge
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.undefined
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.undefined
  /** Specifies the frame of the Digital gauge.
    * @Default {{backgroundImageUrl: null, innerWidth: 6, outerWidth: 10}}
    */
  var frame: js.UndefOr[Frame] = js.undefined
  /** Specifies the height of the DigitalGauge.
    * @Default {150}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Triggers when the gauge is initialized.
    */
  var init: js.UndefOr[js.Function1[/* e */ InitEventArgs, Unit]] = js.undefined
  /** Specifies the resize option of the DigitalGauge.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Triggers when the gauge item rendering.
    */
  var itemRendering: js.UndefOr[js.Function1[/* e */ ItemRenderingEventArgs, Unit]] = js.undefined
  /** Specifies the items for the DigitalGauge.
    * @Default {null}
    */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  /** Triggers when the gauge is start to load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Specifies the matrixSegmentData for the DigitalGauge.
    */
  var matrixSegmentData: js.UndefOr[js.Any] = js.undefined
  /** Triggers when the gauge render is completed.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
  /** Fires, on right clicking the digital gauge.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
  /** Specifies the segmentData for the DigitalGauge.
    */
  var segmentData: js.UndefOr[js.Any] = js.undefined
  /** Specifies the themes for the Digital gauge. See Themes
    * @Default {flatlight}
    */
  var themes: js.UndefOr[String] = js.undefined
  /** Specifies the value to the DigitalGauge.
    * @Default {text}
    */
  var value: js.UndefOr[String] = js.undefined
  /** Specifies the width for the Digital gauge.
    * @Default {400}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Click: /* e */ ClickEventArgs => Callback = null,
    doubleClick: /* e */ DoubleClickEventArgs => Callback = null,
    enableResize: js.UndefOr[Boolean] = js.undefined,
    exportSettings: ExportSettings = null,
    frame: Frame = null,
    height: Int | Double = null,
    init: /* e */ InitEventArgs => Callback = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    itemRendering: /* e */ ItemRenderingEventArgs => Callback = null,
    items: js.Array[Item] = null,
    load: /* e */ LoadEventArgs => Callback = null,
    matrixSegmentData: js.Any = null,
    renderComplete: /* e */ RenderCompleteEventArgs => Callback = null,
    rightClick: /* e */ RightClickEventArgs => Callback = null,
    segmentData: js.Any = null,
    themes: String = null,
    value: String = null,
    width: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.DigitalGauge.ClickEventArgs) => Click(t0).runNow()))
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.DigitalGauge.DoubleClickEventArgs) => doubleClick(t0).runNow()))
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize.asInstanceOf[js.Any])
    if (exportSettings != null) __obj.updateDynamic("exportSettings")(exportSettings.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.DigitalGauge.InitEventArgs) => init(t0).runNow()))
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (itemRendering != null) __obj.updateDynamic("itemRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.DigitalGauge.ItemRenderingEventArgs) => itemRendering(t0).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.DigitalGauge.LoadEventArgs) => load(t0).runNow()))
    if (matrixSegmentData != null) __obj.updateDynamic("matrixSegmentData")(matrixSegmentData.asInstanceOf[js.Any])
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.DigitalGauge.RenderCompleteEventArgs) => renderComplete(t0).runNow()))
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.DigitalGauge.RightClickEventArgs) => rightClick(t0).runNow()))
    if (segmentData != null) __obj.updateDynamic("segmentData")(segmentData.asInstanceOf[js.Any])
    if (themes != null) __obj.updateDynamic("themes")(themes.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

