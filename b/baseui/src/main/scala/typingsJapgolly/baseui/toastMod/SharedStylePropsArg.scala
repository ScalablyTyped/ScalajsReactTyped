package typingsJapgolly.baseui.toastMod

import typingsJapgolly.baseui.baseuiStrings.`inline`
import typingsJapgolly.baseui.baseuiStrings.info
import typingsJapgolly.baseui.baseuiStrings.negative
import typingsJapgolly.baseui.baseuiStrings.positive
import typingsJapgolly.baseui.baseuiStrings.toast
import typingsJapgolly.baseui.baseuiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsArg extends js.Object {
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.native
  @JSName("$isRendered")
  var $isRendered: js.UndefOr[Boolean] = js.native
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.native
  @JSName("$kind")
  var $kind: js.UndefOr[info | positive | warning | negative] = js.native
  @JSName("$type")
  var $type: js.UndefOr[`inline` | toast] = js.native
}

