package typingsJapgolly.recompose.mod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "componentFromStream")
@js.native
object componentFromStream extends js.Object {
  def apply[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[Node]]): ComponentType[TProps] = js.native
}

