package typingsJapgolly.reactGooglePlacesSuggest

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.googleMaps.google.maps.GeocoderResult
import typingsJapgolly.googleMaps.google.maps.places.AutocompletePrediction
import typingsJapgolly.googleMaps.google.maps.places.AutocompletionRequest
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactGooglePlacesSuggest.anon.Typeofmaps
import typingsJapgolly.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-google-places-suggest", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  object ReactGooglePlacesSuggest {
    
    type GeocodedPrediction = GeocoderResult
    
    type Prediction = AutocompletePrediction
    
    trait Props extends StObject {
      
      var autocompletionRequest: AutocompletionRequest
      
      var children: js.UndefOr[Node] = js.undefined
      
      var customContainerRender: js.UndefOr[js.Function1[/* predictions */ js.Array[Prediction], Element | String]] = js.undefined
      
      var customRender: js.UndefOr[js.Function1[/* prediction */ js.UndefOr[Prediction], Element | String]] = js.undefined
      
      var googleMaps: Typeofmaps
      
      var onSelectSuggest: js.UndefOr[
            js.Function2[
              /* geocodedPrediction */ GeocodedPrediction, 
              /* originalPrediction */ Prediction, 
              Any
            ]
          ] = js.undefined
      
      var textNoResults: js.UndefOr[String | Null] = js.undefined
    }
    object Props {
      
      inline def apply(autocompletionRequest: AutocompletionRequest, googleMaps: Typeofmaps): Props = {
        val __obj = js.Dynamic.literal(autocompletionRequest = autocompletionRequest.asInstanceOf[js.Any], googleMaps = googleMaps.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setAutocompletionRequest(value: AutocompletionRequest): Self = StObject.set(x, "autocompletionRequest", value.asInstanceOf[js.Any])
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setCustomContainerRender(value: /* predictions */ js.Array[Prediction] => Element | String): Self = StObject.set(x, "customContainerRender", js.Any.fromFunction1(value))
        
        inline def setCustomContainerRenderUndefined: Self = StObject.set(x, "customContainerRender", js.undefined)
        
        inline def setCustomRender(value: /* prediction */ js.UndefOr[Prediction] => Element | String): Self = StObject.set(x, "customRender", js.Any.fromFunction1(value))
        
        inline def setCustomRenderUndefined: Self = StObject.set(x, "customRender", js.undefined)
        
        inline def setGoogleMaps(value: Typeofmaps): Self = StObject.set(x, "googleMaps", value.asInstanceOf[js.Any])
        
        inline def setOnSelectSuggest(value: (/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction) => Any): Self = StObject.set(x, "onSelectSuggest", js.Any.fromFunction2(value))
        
        inline def setOnSelectSuggestUndefined: Self = StObject.set(x, "onSelectSuggest", js.undefined)
        
        inline def setTextNoResults(value: String): Self = StObject.set(x, "textNoResults", value.asInstanceOf[js.Any])
        
        inline def setTextNoResultsNull: Self = StObject.set(x, "textNoResults", null)
        
        inline def setTextNoResultsUndefined: Self = StObject.set(x, "textNoResults", js.undefined)
      }
    }
  }
  type ReactGooglePlacesSuggest = japgolly.scalajs.react.facade.React.Component[Props & js.Object, js.Object]
}
