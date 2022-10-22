package typingsJapgolly.materialUi

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.materialUi.MaterialUI.AutoCompleteProps
import typingsJapgolly.materialUi.MaterialUI.DividerProps
import typingsJapgolly.materialUi.MaterialUI.Menus.MenuItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoCompleteMod {
  
  @JSImport("material-ui/AutoComplete", JSImport.Default)
  @js.native
  open class default () extends AutoComplete
  /* static members */
  object default {
    
    @JSImport("material-ui/AutoComplete", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-ui/AutoComplete", "default.Divider")
    @js.native
    def Divider: Component[DividerProps & js.Object, js.Object] = js.native
    inline def Divider_=(x: Component[DividerProps & js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("material-ui/AutoComplete", "default.Item")
    @js.native
    def Item: Component[MenuItemProps & js.Object, js.Object] = js.native
    inline def Item_=(x: Component[MenuItemProps & js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    inline def caseInsensitiveFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def caseSensitiveFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("caseSensitiveFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def defaultFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fuzzyFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("levenshteinDistanceFilter")(distanceLessThan.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* searchText */ String, /* key */ String, Boolean]]
    
    inline def noFilter(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("noFilter")().asInstanceOf[Boolean]
  }
  
  @JSImport("material-ui/AutoComplete", "AutoComplete")
  @js.native
  open class AutoComplete ()
    extends typingsJapgolly.react.mod.Component[AutoCompleteProps[Any], js.Object, Any]
  /* static members */
  object AutoComplete {
    
    @JSImport("material-ui/AutoComplete", "AutoComplete")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-ui/AutoComplete", "AutoComplete.Divider")
    @js.native
    def Divider: Component[DividerProps & js.Object, js.Object] = js.native
    inline def Divider_=(x: Component[DividerProps & js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("material-ui/AutoComplete", "AutoComplete.Item")
    @js.native
    def Item: Component[MenuItemProps & js.Object, js.Object] = js.native
    inline def Item_=(x: Component[MenuItemProps & js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    inline def caseInsensitiveFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def caseSensitiveFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("caseSensitiveFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def defaultFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fuzzyFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("levenshteinDistanceFilter")(distanceLessThan.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* searchText */ String, /* key */ String, Boolean]]
    
    inline def noFilter(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("noFilter")().asInstanceOf[Boolean]
  }
}
