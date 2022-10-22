package typingsJapgolly.reactGooglePlacesSuggest.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.googleMaps.google.maps.places.AutocompletionRequest
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactGooglePlacesSuggest.anon.Typeofmaps
import typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.GeocodedPrediction
import typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Prediction
import typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Props
import typingsJapgolly.reactGooglePlacesSuggest.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGooglePlacesSuggest {
  
  inline def apply(autocompletionRequest: AutocompletionRequest, googleMaps: Typeofmaps): Builder = {
    val __props = js.Dynamic.literal(autocompletionRequest = autocompletionRequest.asInstanceOf[js.Any], googleMaps = googleMaps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-google-places-suggest", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def customContainerRender(value: /* predictions */ js.Array[Prediction] => Element | String): this.type = set("customContainerRender", js.Any.fromFunction1(value))
    
    inline def customRender(value: /* prediction */ js.UndefOr[Prediction] => Element | String): this.type = set("customRender", js.Any.fromFunction1(value))
    
    inline def onSelectSuggest(value: (/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction) => Any): this.type = set("onSelectSuggest", js.Any.fromFunction2(value))
    
    inline def textNoResults(value: String): this.type = set("textNoResults", value.asInstanceOf[js.Any])
    
    inline def textNoResultsNull: this.type = set("textNoResults", null)
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
