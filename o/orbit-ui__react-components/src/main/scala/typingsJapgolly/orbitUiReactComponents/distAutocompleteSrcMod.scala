package typingsJapgolly.orbitUiReactComponents

import typingsJapgolly.orbitUiReactComponents.distAutocompleteSrcAutocompleteMod.InnerAutocompleteProps
import typingsJapgolly.orbitUiReactComponents.distAutocompleteSrcHiddenAutocompleteMod.HiddenAutocompleteProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAutocompleteSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/autocomplete/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/autocomplete/src", "Autocomplete")
  @js.native
  val Autocomplete: OrbitComponent[input, InnerAutocompleteProps] = js.native
  
  object HiddenAutocomplete {
    
    inline def apply(hasNameValueRequiredValidationStateRest: HiddenAutocompleteProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasNameValueRequiredValidationStateRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components/dist/autocomplete/src", "HiddenAutocomplete")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components/dist/autocomplete/src", "HiddenAutocomplete.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def InnerAutocomplete(props: InnerAutocompleteProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAutocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
