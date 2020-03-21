package typingsJapgolly.baseui.tabsMod

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.react.mod.Key
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabProps extends js.Object {
  @JSName("$orientation")
  var $orientation: js.UndefOr[horizontal | vertical] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[Node] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.native
  var onSelect: js.UndefOr[js.Function0[_]] = js.native
  var overrides: js.UndefOr[TabOverrides[SharedProps]] = js.native
  var title: js.UndefOr[Node] = js.native
}

