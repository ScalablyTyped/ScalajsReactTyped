package typingsJapgolly.materialUi.global.MaterialUI

import typingsJapgolly.materialUi.MaterialUI.AutoCompleteProps
import typingsJapgolly.materialUi.MaterialUI.DividerProps
import typingsJapgolly.materialUi.MaterialUI.Menus.MenuItemProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__MaterialUI.AutoComplete")
@js.native
open class AutoComplete ()
  extends Component[AutoCompleteProps[Any], js.Object, Any]
/* static members */
object AutoComplete {
  
  @JSGlobal("__MaterialUI.AutoComplete")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("__MaterialUI.AutoComplete.Divider")
  @js.native
  def Divider: japgolly.scalajs.react.facade.React.Component[DividerProps & js.Object, js.Object] = js.native
  inline def Divider_=(x: japgolly.scalajs.react.facade.React.Component[DividerProps & js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__MaterialUI.AutoComplete.Item")
  @js.native
  def Item: japgolly.scalajs.react.facade.React.Component[MenuItemProps & js.Object, js.Object] = js.native
  inline def Item_=(x: japgolly.scalajs.react.facade.React.Component[MenuItemProps & js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  inline def caseInsensitiveFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def caseSensitiveFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("caseSensitiveFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def defaultFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fuzzyFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("levenshteinDistanceFilter")(distanceLessThan.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* searchText */ String, /* key */ String, Boolean]]
  
  inline def noFilter(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("noFilter")().asInstanceOf[Boolean]
}
