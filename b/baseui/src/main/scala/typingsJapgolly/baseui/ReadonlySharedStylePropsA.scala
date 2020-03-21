package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.`inline`
import typingsJapgolly.baseui.baseuiStrings.info
import typingsJapgolly.baseui.baseuiStrings.negative
import typingsJapgolly.baseui.baseuiStrings.positive
import typingsJapgolly.baseui.baseuiStrings.toast
import typingsJapgolly.baseui.baseuiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/toast.SharedStylePropsArg> */
@js.native
trait ReadonlySharedStylePropsA extends js.Object {
  @JSName("$closeable")
  val $closeable: js.UndefOr[Boolean] = js.native
  @JSName("$isRendered")
  val $isRendered: js.UndefOr[Boolean] = js.native
  @JSName("$isVisible")
  val $isVisible: js.UndefOr[Boolean] = js.native
  @JSName("$kind")
  val $kind: js.UndefOr[info | positive | warning | negative] = js.native
  @JSName("$type")
  val $type: js.UndefOr[`inline` | toast] = js.native
}

