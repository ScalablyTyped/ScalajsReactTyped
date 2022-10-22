package typingsJapgolly.reactNativeAutocompleteInput.components

import typingsJapgolly.reactNativeAutocompleteInput.mod.AutocompleteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutocompleteInput {
  
  inline def apply(data: js.Array[Any]): SharedBuilder_AutocompleteProps_685489640 = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_AutocompleteProps_685489640(js.Array(this.component, __props.asInstanceOf[AutocompleteProps[Any]]))
  }
  
  @JSImport("react-native-autocomplete-input", "AutocompleteInput")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AutocompleteProps[Any]): SharedBuilder_AutocompleteProps_685489640 = new SharedBuilder_AutocompleteProps_685489640(js.Array(this.component, p.asInstanceOf[js.Any]))
}
