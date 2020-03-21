package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.enzyme.mod.MountRendererProps
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.materialUiCore.materialUiCoreStrings.mount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallNodeOptions extends js.Object {
  def apply[P](node: Element): ReactWrapper[mount, _, Component[js.Object, js.Object]] = js.native
  def apply[P](node: Element, options: MountRendererProps): ReactWrapper[mount, _, Component[js.Object, js.Object]] = js.native
}

