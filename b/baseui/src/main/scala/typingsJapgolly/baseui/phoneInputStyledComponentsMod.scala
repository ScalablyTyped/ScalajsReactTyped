package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Disabled
import typingsJapgolly.baseui.anon.HeightStylePropsdisabledb
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.li_
import typingsJapgolly.baseui.baseuiStrings.span
import typingsJapgolly.baseui.baseuiStrings.ul
import typingsJapgolly.baseui.phoneInputTypesMod.Size
import typingsJapgolly.baseui.selectTypesMod.SharedStylePropsArg
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneInputStyledComponentsMod {
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectContainer")
  @js.native
  val StyledCountrySelectContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownContainer")
  @js.native
  val StyledCountrySelectDropdownContainer: StyletronComponent[ul, HeightStylePropsdisabledb] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownDialcodeColumn")
  @js.native
  val StyledCountrySelectDropdownDialcodeColumn: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownFlagColumn")
  @js.native
  val StyledCountrySelectDropdownFlagColumn: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownListItem")
  @js.native
  val StyledCountrySelectDropdownListItem: StyletronComponent[li_, Disabled] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownListItemElement")
  @js.native
  val StyledCountrySelectDropdownListItemElement: StyletronComponent[li_, Disabled] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownNameColumn")
  @js.native
  val StyledCountrySelectDropdownNameColumn: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledDialCode")
  @js.native
  val StyledDialCode: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledFlagContainer")
  @js.native
  val StyledFlagContainer: StyletronComponent[span, SizeStyleProps] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledPhoneInputRoot")
  @js.native
  val StyledPhoneInputRoot: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, SizeStyleProps & SharedStylePropsArg] = js.native
  
  trait HeightStyleProps extends StObject {
    
    @JSName("$height")
    var $height: String
  }
  object HeightStyleProps {
    
    inline def apply($height: String): HeightStyleProps = {
      val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeightStyleProps]
    }
    
    extension [Self <: HeightStyleProps](x: Self) {
      
      inline def set$height(value: String): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
    }
  }
  
  trait SizeStyleProps extends StObject {
    
    @JSName("$size")
    var $size: js.UndefOr[Size] = js.undefined
  }
  object SizeStyleProps {
    
    inline def apply(): SizeStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeStyleProps]
    }
    
    extension [Self <: SizeStyleProps](x: Self) {
      
      inline def set$size(value: Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
}
