package typingsJapgolly.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.resizer")
@js.native
class resizer ()
  extends typingsJapgolly.webix.webix.ui.baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$skin")
  var $skin_Original_resizer: WebixCallback = js.native
  @JSName("config")
  var config_resizer: resizerConfig = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  var on_context: StringDictionary[js.Any] = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: WebixCallback = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: WebixCallback = js.native
  def on_click(args: js.Any*): js.Any = js.native
  def on_dblclick(args: js.Any*): js.Any = js.native
  def on_mouse_move(args: js.Any*): js.Any = js.native
}

