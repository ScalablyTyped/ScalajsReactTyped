package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.AmountOfHiddenTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTagListToggleMoreButtonMod {
  
  object default {
    
    inline def apply(hasToggleMoreButtonOnClickAmountOfHiddenTagsIsExpandedDataHook: AmountOfHiddenTags): Element = ^.asInstanceOf[js.Dynamic].apply(hasToggleMoreButtonOnClickAmountOfHiddenTagsIsExpandedDataHook.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/TagList/ToggleMoreButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/TagList/ToggleMoreButton", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/TagList/ToggleMoreButton", "default.propTypes.amountOfHiddenTags")
      @js.native
      val amountOfHiddenTags: Validator[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/ToggleMoreButton", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/ToggleMoreButton", "default.propTypes.isExpanded")
      @js.native
      val isExpanded: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/ToggleMoreButton", "default.propTypes.onClick")
      @js.native
      val onClick: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/ToggleMoreButton", "default.propTypes.toggleMoreButton")
      @js.native
      val toggleMoreButton: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
}
