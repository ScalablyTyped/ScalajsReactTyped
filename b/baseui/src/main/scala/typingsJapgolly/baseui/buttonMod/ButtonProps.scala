package typingsJapgolly.baseui.buttonMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import typingsJapgolly.baseui.baseuiStrings.minimal
import typingsJapgolly.baseui.baseuiStrings.pill
import typingsJapgolly.baseui.baseuiStrings.primary
import typingsJapgolly.baseui.baseuiStrings.reset
import typingsJapgolly.baseui.baseuiStrings.round
import typingsJapgolly.baseui.baseuiStrings.secondary
import typingsJapgolly.baseui.baseuiStrings.square
import typingsJapgolly.baseui.baseuiStrings.submit
import typingsJapgolly.baseui.baseuiStrings.tertiary
import typingsJapgolly.styletronReact.mod.StyletronComponentInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProps extends StyletronComponentInjectedProps[ButtonProps] {
  var children: js.UndefOr[Node] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var endEnhancer: js.UndefOr[Node] = js.native
  var href: js.UndefOr[String] = js.native
  var isLoading: js.UndefOr[Boolean] = js.native
  var isSelected: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], _]] = js.native
  var overrides: js.UndefOr[ButtonOverrides] = js.native
  var shape: js.UndefOr[default_ | pill | round | square] = js.native
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.native
  var startEnhancer: js.UndefOr[Node] = js.native
  var target: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[submit | reset | button] = js.native
}

