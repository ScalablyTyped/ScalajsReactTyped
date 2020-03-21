package typingsJapgolly.baseui.menuMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.baseui.AnonBody
import typingsJapgolly.baseui.AnonListItemProfile
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionProfileProps extends BaseMenuPropsT {
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, Node]] = js.native
  var item: js.Any = js.native
  var overrides: js.UndefOr[AnonListItemProfile] = js.native
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.native
  def getProfileItemImg(item: js.Any): String | ComponentType[_] = js.native
  def getProfileItemImgText(item: js.Any): String = js.native
  def getProfileItemLabels(item: js.Any): AnonBody = js.native
}

