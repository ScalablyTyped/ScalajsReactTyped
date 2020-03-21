package typingsJapgolly.recompose

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.recompose.mod.ObservableConfig
import typingsJapgolly.recompose.mod.Subscribable
import typingsJapgolly.recompose.mod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromstream
@JSImport("recompose/componentFromStream", JSImport.Namespace)
@js.native
object componentFromStreamMod extends js.Object {
  def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[Node]], 
    ComponentType[_]
  ] = js.native
  def default[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[Node]]): ComponentType[TProps] = js.native
}

