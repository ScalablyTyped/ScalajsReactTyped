package typingsJapgolly.reactGooglePlacesSuggest.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googlemaps.google.maps.places.AutocompletionRequest
import typingsJapgolly.reactGooglePlacesSuggest.Typeofmaps
import typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.GeocodedPrediction
import typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Prediction
import typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Props
import typingsJapgolly.reactGooglePlacesSuggest.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGooglePlacesSuggest {
  def apply(
    autocompletionRequest: AutocompletionRequest,
    googleMaps: Typeofmaps,
    customContainerRender: /* predictions */ js.Array[Prediction] => CallbackTo[Element | String] = null,
    customRender: /* prediction */ js.UndefOr[Prediction] => CallbackTo[Element | String] = null,
    onSelectSuggest: (/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction) => CallbackTo[js.Any] = null,
    textNoResults: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(autocompletionRequest = autocompletionRequest.asInstanceOf[js.Any], googleMaps = googleMaps.asInstanceOf[js.Any])
  
      if (customContainerRender != null) __obj.updateDynamic("customContainerRender")(js.Any.fromFunction1((t0: /* predictions */ js.Array[typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Prediction]) => customContainerRender(t0).runNow()))
    if (customRender != null) __obj.updateDynamic("customRender")(js.Any.fromFunction1((t0: /* prediction */ js.UndefOr[typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Prediction]) => customRender(t0).runNow()))
    if (onSelectSuggest != null) __obj.updateDynamic("onSelectSuggest")(js.Any.fromFunction2((t0: /* geocodedPrediction */ typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.GeocodedPrediction, t1: /* originalPrediction */ typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Prediction) => onSelectSuggest(t0, t1).runNow()))
    if (textNoResults != null) __obj.updateDynamic("textNoResults")(textNoResults.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactGooglePlacesSuggest.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Props])(children: _*)
  }
  @JSImport("react-google-places-suggest", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

