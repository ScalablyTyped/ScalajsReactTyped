package typingsJapgolly.baseui.popoverMod

import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.bottomLeft
import typingsJapgolly.baseui.baseuiStrings.bottomRight
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.leftBottom
import typingsJapgolly.baseui.baseuiStrings.leftTop
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.rightBottom
import typingsJapgolly.baseui.baseuiStrings.rightTop
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.topLeft
import typingsJapgolly.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsArg extends js.Object {
  @JSName("$arrowOffset")
  var $arrowOffset: js.UndefOr[Offset] = js.native
  @JSName("$isAnimating")
  var $isAnimating: js.UndefOr[Boolean] = js.native
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  @JSName("$placement")
  var $placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  @JSName("$popoverOffset")
  var $popoverOffset: js.UndefOr[Offset] = js.native
  @JSName("$showArrow")
  var $showArrow: js.UndefOr[Boolean] = js.native
}

