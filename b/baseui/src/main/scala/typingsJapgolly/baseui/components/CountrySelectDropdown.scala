package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.CountrySelectContainer
import typingsJapgolly.baseui.anon.CountrySelectDropdownProp
import typingsJapgolly.baseui.phoneInputTypesMod.Country
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CountrySelectDropdown {
  
  inline def apply(
    $country: Country,
    $maxDropdownHeight: String,
    $noResultsMsg: String,
    $overrides: CountrySelectContainer,
    children: js.Array[Element]
  ): Builder = {
    val __props = js.Dynamic.literal($country = $country.asInstanceOf[js.Any], $maxDropdownHeight = $maxDropdownHeight.asInstanceOf[js.Any], $noResultsMsg = $noResultsMsg.asInstanceOf[js.Any], $overrides = $overrides.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CountrySelectDropdownProp]))
  }
  
  @JSImport("baseui/phone-input/country-select-dropdown", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLElement] {
    
    inline def $forwardedRef(value: Ref[HTMLElement] | (js.Function1[/* a */ Null | HTMLElement, Any])): this.type = set("$forwardedRef", value.asInstanceOf[js.Any])
    
    inline def $forwardedRefFunction1(value: HTMLElement | Null => Any | Unit): this.type = set("$forwardedRef", js.Any.fromFunction1(value))
    
    inline def $forwardedRefNull: this.type = set("$forwardedRef", null)
    
    inline def $mapIsoToLabel(value: /* iso */ String => String): this.type = set("$mapIsoToLabel", js.Any.fromFunction1(value))
  }
  
  def withProps(p: CountrySelectDropdownProp): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
