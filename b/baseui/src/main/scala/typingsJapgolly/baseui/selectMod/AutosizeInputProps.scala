package typingsJapgolly.baseui.selectMod

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosizeInputProps extends js.Object {
  @JSName("$size")
  var $size: js.UndefOr[default_ | compact | large_] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var inputRef: js.UndefOr[Ref] = js.native
  var overrides: js.UndefOr[AutosizeInputOverrides] = js.native
  var value: js.UndefOr[String] = js.native
}

