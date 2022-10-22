package typingsJapgolly.reactGeosuggest.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.googleMaps.google.maps.LatLng
import typingsJapgolly.googleMaps.google.maps.LatLngBounds
import typingsJapgolly.googleMaps.google.maps.places.AutocompletePrediction
import typingsJapgolly.reactGeosuggest.anon.Typeofmaps
import typingsJapgolly.reactGeosuggest.mod.Fixture
import typingsJapgolly.reactGeosuggest.mod.GeosuggestProps
import typingsJapgolly.reactGeosuggest.mod.QueryType
import typingsJapgolly.reactGeosuggest.mod.Styles
import typingsJapgolly.reactGeosuggest.mod.Suggest
import typingsJapgolly.reactGeosuggest.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGeosuggest {
  
  @JSImport("react-geosuggest", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoActivateFirstSuggest(value: Boolean): this.type = set("autoActivateFirstSuggest", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def bounds(value: LatLngBounds): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def country(value: String | js.Array[String]): this.type = set("country", value.asInstanceOf[js.Any])
    
    inline def countryVarargs(value: String*): this.type = set("country", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fixtures(value: js.Array[Fixture]): this.type = set("fixtures", value.asInstanceOf[js.Any])
    
    inline def fixturesVarargs(value: Fixture*): this.type = set("fixtures", js.Array(value*))
    
    inline def getSuggestLabel(value: /* googleSuggest */ AutocompletePrediction => String): this.type = set("getSuggestLabel", js.Any.fromFunction1(value))
    
    inline def googleMaps(value: Typeofmaps): this.type = set("googleMaps", value.asInstanceOf[js.Any])
    
    inline def highlightMatch(value: Boolean): this.type = set("highlightMatch", value.asInstanceOf[js.Any])
    
    inline def ignoreEnter(value: Boolean): this.type = set("ignoreEnter", value.asInstanceOf[js.Any])
    
    inline def ignoreTab(value: Boolean): this.type = set("ignoreTab", value.asInstanceOf[js.Any])
    
    inline def initialValue(value: String): this.type = set("initialValue", value.asInstanceOf[js.Any])
    
    inline def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def location(value: LatLng): this.type = set("location", value.asInstanceOf[js.Any])
    
    inline def maxFixtures(value: Double): this.type = set("maxFixtures", value.asInstanceOf[js.Any])
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def onActivateSuggest(value: /* suggest */ Suggest => Callback): this.type = set("onActivateSuggest", js.Any.fromFunction1((t0: /* suggest */ Suggest) => value(t0).runNow()))
    
    inline def onBlur(value: /* value */ Any => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def onChange(value: /* value */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def onFocus(value: /* value */ Any => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def onKeyDown(value: /* event */ Any => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
    
    inline def onKeyPress(value: /* event */ Any => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
    
    inline def onSuggestNoResults(value: /* userInput */ String => Callback): this.type = set("onSuggestNoResults", js.Any.fromFunction1((t0: /* userInput */ String) => value(t0).runNow()))
    
    inline def onSuggestSelect(value: /* suggest */ Suggest => Callback): this.type = set("onSuggestSelect", js.Any.fromFunction1((t0: /* suggest */ Suggest) => value(t0).runNow()))
    
    inline def onUpdateSuggests(value: (/* suggests */ Any, /* activeSuggest */ Any) => Callback): this.type = set("onUpdateSuggests", js.Any.fromFunction2((t0: /* suggests */ Any, t1: /* activeSuggest */ Any) => (value(t0, t1)).runNow()))
    
    inline def placeDetailFields(value: js.Array[String]): this.type = set("placeDetailFields", value.asInstanceOf[js.Any])
    
    inline def placeDetailFieldsVarargs(value: String*): this.type = set("placeDetailFields", js.Array(value*))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def queryDelay(value: Double): this.type = set("queryDelay", value.asInstanceOf[js.Any])
    
    inline def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    inline def renderSuggestItem(value: /* googleSuggest */ AutocompletePrediction => Any): this.type = set("renderSuggestItem", js.Any.fromFunction1(value))
    
    inline def skipSuggest(value: /* googleSuggest */ AutocompletePrediction => Boolean): this.type = set("skipSuggest", js.Any.fromFunction1(value))
    
    inline def style(value: Styles): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suggestItemActiveClassName(value: String): this.type = set("suggestItemActiveClassName", value.asInstanceOf[js.Any])
    
    inline def suggestItemClassName(value: String): this.type = set("suggestItemClassName", value.asInstanceOf[js.Any])
    
    inline def suggestsClassName(value: String): this.type = set("suggestsClassName", value.asInstanceOf[js.Any])
    
    inline def suggestsHiddenClassName(value: String): this.type = set("suggestsHiddenClassName", value.asInstanceOf[js.Any])
    
    inline def types(value: js.Array[QueryType]): this.type = set("types", value.asInstanceOf[js.Any])
    
    inline def typesVarargs(value: QueryType*): this.type = set("types", js.Array(value*))
  }
  
  implicit def make(companion: ReactGeosuggest.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GeosuggestProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
