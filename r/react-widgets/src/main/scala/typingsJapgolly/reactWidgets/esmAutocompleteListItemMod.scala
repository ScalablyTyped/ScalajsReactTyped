package typingsJapgolly.reactWidgets

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactWidgets.anon.SearchTerm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAutocompleteListItemMod {
  
  object default {
    
    inline def apply(hasTextSearchTerm: SearchTerm): String | Element = ^.asInstanceOf[js.Dynamic].apply(hasTextSearchTerm.asInstanceOf[js.Any]).asInstanceOf[String | Element]
    
    @JSImport("react-widgets/esm/AutocompleteListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-widgets/esm/AutocompleteListItem", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/esm/AutocompleteListItem", "default.propTypes.searchTerm")
      @js.native
      def searchTerm: Requireable[String] = js.native
      inline def searchTerm_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("searchTerm")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/AutocompleteListItem", "default.propTypes.text")
      @js.native
      def text: Requireable[String] = js.native
      inline def text_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    }
  }
}
