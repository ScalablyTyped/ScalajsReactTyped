package typingsJapgolly.materialDashUi.materialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui", "AutoComplete")
@js.native
class AutoComplete ()
  extends typingsJapgolly.materialDashUi.__MaterialUI.AutoComplete

/* static members */
@JSImport("material-ui", "AutoComplete")
@js.native
object AutoComplete extends js.Object {
  var Divider: typingsJapgolly.materialDashUi.__MaterialUI.Divider = js.native
  var Item: typingsJapgolly.materialDashUi.__MaterialUI.Menus.MenuItem = js.native
  def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
  def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
  def defaultFilter(searchText: String, key: String): Boolean = js.native
  def fuzzyFilter(searchText: String, key: String): Boolean = js.native
  def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
  def noFilter(): Boolean = js.native
}

