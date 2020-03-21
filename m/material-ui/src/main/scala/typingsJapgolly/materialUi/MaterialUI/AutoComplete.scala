package typingsJapgolly.materialUi.MaterialUI

import typingsJapgolly.materialUi.MaterialUI.Menus.MenuItem
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__MaterialUI.AutoComplete")
@js.native
class AutoComplete ()
  extends Component[AutoCompleteProps[js.Any], js.Object, js.Any]

/* static members */
@JSGlobal("__MaterialUI.AutoComplete")
@js.native
object AutoComplete extends js.Object {
  var Divider: typingsJapgolly.materialUi.MaterialUI.Divider = js.native
  var Item: MenuItem = js.native
  def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
  def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
  def defaultFilter(searchText: String, key: String): Boolean = js.native
  def fuzzyFilter(searchText: String, key: String): Boolean = js.native
  def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
  def noFilter(): Boolean = js.native
}

