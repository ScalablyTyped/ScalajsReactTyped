package typingsJapgolly.reactPlacesAutocomplete.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPlacesAutocomplete.anon.Bounds
import typingsJapgolly.reactPlacesAutocomplete.anon.Readonlyloadingbooleansug
import typingsJapgolly.reactPlacesAutocomplete.mod.PropTypes
import typingsJapgolly.reactPlacesAutocomplete.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPlacesAutocomplete {
  
  inline def apply(children: Readonlyloadingbooleansug => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[PropTypes]))
  }
  
  @JSImport("react-places-autocomplete", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def debounce(value: Double): this.type = set("debounce", value.asInstanceOf[js.Any])
    
    inline def googleCallbackName(value: String): this.type = set("googleCallbackName", value.asInstanceOf[js.Any])
    
    inline def highlightFirstSuggestion(value: Boolean): this.type = set("highlightFirstSuggestion", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onError(value: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Callback): this.type = set("onError", js.Any.fromFunction2((t0: /* status */ String, t1: /* clearSuggestion */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def onSelect(value: (/* address */ String, /* placeID */ String) => Callback): this.type = set("onSelect", js.Any.fromFunction2((t0: /* address */ String, t1: /* placeID */ String) => (value(t0, t1)).runNow()))
    
    inline def searchOptions(value: Bounds): this.type = set("searchOptions", value.asInstanceOf[js.Any])
    
    inline def shouldFetchSuggestions(value: Boolean): this.type = set("shouldFetchSuggestions", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
