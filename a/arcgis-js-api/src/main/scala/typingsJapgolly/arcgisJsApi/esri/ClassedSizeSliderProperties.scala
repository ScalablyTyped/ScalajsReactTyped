package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedSizeSliderProperties extends SmartMappingSliderBaseProperties {
  /**
    * An array of class breaks with associated sizes. The size mapped to each break should be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedSizeSliderBreaks]] = js.undefined
  /**
    * Exposes various properties of the widget that can be styled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    */
  var style: js.UndefOr[ClassedSizeSliderStyle] = js.undefined
  /**
    * The view model for the ClassedSizeSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [ClassedSizeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html) class to access all properties and methods on the ClassedSizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[ClassedSizeSliderViewModelProperties] = js.undefined
}

object ClassedSizeSliderProperties {
  @scala.inline
  def apply(
    breaks: js.Array[ClassedSizeSliderBreaks] = null,
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    histogramConfig: HistogramConfig = null,
    id: String = null,
    inputFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | value], /* index */ js.UndefOr[Double]) => CallbackTo[String] = null,
    inputParseFunction: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    label: String = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | value], /* index */ js.UndefOr[Double]) => CallbackTo[String] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    style: ClassedSizeSliderStyle = null,
    viewModel: ClassedSizeSliderViewModelProperties = null,
    zoomOptions: SmartMappingSliderBaseZoomOptions = null
  ): ClassedSizeSliderProperties = {
    val __obj = js.Dynamic.literal()
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.asInstanceOf[js.Any])
    if (histogramConfig != null) __obj.updateDynamic("histogramConfig")(histogramConfig.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputFormatFunction != null) __obj.updateDynamic("inputFormatFunction")(js.Any.fromFunction3((t0: /* value */ scala.Double, t1: /* type */ js.UndefOr[
  typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value], t2: /* index */ js.UndefOr[scala.Double]) => inputFormatFunction(t0, t1, t2).runNow()))
    if (inputParseFunction != null) __obj.updateDynamic("inputParseFunction")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* type */ js.UndefOr[
  typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value], t2: /* index */ js.UndefOr[scala.Double]) => inputParseFunction(t0, t1, t2).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3((t0: /* value */ scala.Double, t1: /* type */ js.UndefOr[
  typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value], t2: /* index */ js.UndefOr[scala.Double]) => labelFormatFunction(t0, t1, t2).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassedSizeSliderProperties]
  }
}

