package typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.googlemaps.google.maps.places.AutocompletionRequest
import typingsJapgolly.reactGooglePlacesSuggest.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autocompletionRequest: AutocompletionRequest
  var children: js.UndefOr[Node] = js.undefined
  var customContainerRender: js.UndefOr[js.Function1[/* predictions */ js.Array[Prediction], Element | String]] = js.undefined
  var customRender: js.UndefOr[js.Function1[/* prediction */ js.UndefOr[Prediction], Element | String]] = js.undefined
  var googleMaps: Typeofmaps
  var onSelectSuggest: js.UndefOr[
    js.Function2[/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction, _]
  ] = js.undefined
  var textNoResults: js.UndefOr[String | Null] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autocompletionRequest: AutocompletionRequest,
    googleMaps: Typeofmaps,
    children: VdomNode = null,
    customContainerRender: /* predictions */ js.Array[Prediction] => CallbackTo[Element | String] = null,
    customRender: /* prediction */ js.UndefOr[Prediction] => CallbackTo[Element | String] = null,
    onSelectSuggest: (/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction) => CallbackTo[js.Any] = null,
    textNoResults: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(autocompletionRequest = autocompletionRequest.asInstanceOf[js.Any], googleMaps = googleMaps.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (customContainerRender != null) __obj.updateDynamic("customContainerRender")(js.Any.fromFunction1((t0: /* predictions */ js.Array[typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Prediction]) => customContainerRender(t0).runNow()))
    if (customRender != null) __obj.updateDynamic("customRender")(js.Any.fromFunction1((t0: /* prediction */ js.UndefOr[typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Prediction]) => customRender(t0).runNow()))
    if (onSelectSuggest != null) __obj.updateDynamic("onSelectSuggest")(js.Any.fromFunction2((t0: /* geocodedPrediction */ typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.GeocodedPrediction, t1: /* originalPrediction */ typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Prediction) => onSelectSuggest(t0, t1).runNow()))
    if (textNoResults != null) __obj.updateDynamic("textNoResults")(textNoResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

