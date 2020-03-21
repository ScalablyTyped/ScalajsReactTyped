package typingsJapgolly.baseui.menuMod

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.baseui.AnonListItem
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionListProps extends BaseMenuPropsT {
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, Node]] = js.native
  var item: js.Any = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.native
  var overrides: js.UndefOr[AnonListItem] = js.native
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.native
  var size: js.UndefOr[default_ | compact] = js.native
  def getItemLabel(item: js.Any): Node = js.native
}

