package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedSizeSliderViewModelProperties extends SmartMappingSliderViewModelProperties {
  /**
    * An array of class breaks with associated sizes. The size mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedSizeSliderViewModelBreaks]] = js.undefined
}

object ClassedSizeSliderViewModelProperties {
  @scala.inline
  def apply(
    breaks: js.Array[ClassedSizeSliderViewModelBreaks] = null,
    inputFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => CallbackTo[String] = null,
    inputParseFunction: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => CallbackTo[String] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    thumbsConstrained: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null,
    zoomOptions: SmartMappingSliderViewModelZoomOptions = null,
    zoomingEnabled: js.UndefOr[Boolean] = js.undefined
  ): ClassedSizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (inputFormatFunction != null) __obj.updateDynamic("inputFormatFunction")(js.Any.fromFunction3((t0: /* value */ scala.Double, t1: /* type */ js.UndefOr[
  typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value], t2: /* index */ js.UndefOr[scala.Double]) => inputFormatFunction(t0, t1, t2).runNow()))
    if (inputParseFunction != null) __obj.updateDynamic("inputParseFunction")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* type */ js.UndefOr[
  typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value], t2: /* index */ js.UndefOr[scala.Double]) => inputParseFunction(t0, t1, t2).runNow()))
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3((t0: /* value */ scala.Double, t1: /* type */ js.UndefOr[
  typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tick | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value], t2: /* index */ js.UndefOr[scala.Double]) => labelFormatFunction(t0, t1, t2).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbsConstrained)) __obj.updateDynamic("thumbsConstrained")(thumbsConstrained.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomingEnabled)) __obj.updateDynamic("zoomingEnabled")(zoomingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassedSizeSliderViewModelProperties]
  }
}

