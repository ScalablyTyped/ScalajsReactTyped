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

trait OpacitySliderProperties extends SmartMappingSliderBaseProperties {
  /**
    * The opacity stops from the [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) to link to the slider. The opacity values in these stops will be used to render the gradient on the slider. They should match the opacity rendered in the associated layer's opacity visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[OpacityStopProperties]] = js.undefined
  /**
    * Exposes various properties of the widget that can be styled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#style)
    */
  var style: js.UndefOr[OpacitySliderStyle] = js.undefined
  /**
    * The view model for the OpacitySlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [OpacitySliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html) class to access all properties and methods on the OpacitySlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#viewModel)
    */
  var viewModel: js.UndefOr[OpacitySliderViewModelProperties] = js.undefined
}

object OpacitySliderProperties {
  @scala.inline
  def apply(
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
    stops: js.Array[OpacityStopProperties] = null,
    style: OpacitySliderStyle = null,
    viewModel: OpacitySliderViewModelProperties = null,
    zoomOptions: SmartMappingSliderBaseZoomOptions = null
  ): OpacitySliderProperties = {
    val __obj = js.Dynamic.literal()
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
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacitySliderProperties]
  }
}

