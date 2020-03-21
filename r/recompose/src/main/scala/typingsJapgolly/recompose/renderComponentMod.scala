package typingsJapgolly.recompose

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.recompose.mod.ComponentEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#rendercomponent
@JSImport("recompose/renderComponent", JSImport.Namespace)
@js.native
object renderComponentMod extends js.Object {
  def default[TProps](component: String): ComponentEnhancer[_, _] = js.native
  def default[TProps](component: ComponentType[TProps]): ComponentEnhancer[_, _] = js.native
}

