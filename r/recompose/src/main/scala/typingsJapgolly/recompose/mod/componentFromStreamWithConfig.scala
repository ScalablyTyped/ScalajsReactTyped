package typingsJapgolly.recompose.mod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "componentFromStreamWithConfig")
@js.native
object componentFromStreamWithConfig extends js.Object {
  def apply(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[Node]], 
    ComponentType[_]
  ] = js.native
}

