package typingsJapgolly.reactLoadableVisibility

import typingsJapgolly.loadableComponent.FnCall
import typingsJapgolly.loadableComponent.mod.DefaultComponent
import typingsJapgolly.loadableComponent.mod.LoadableComponent
import typingsJapgolly.loadableComponent.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-loadable-visibility/loadable-components", JSImport.Namespace)
@js.native
object loadableComponentsMod extends js.Object {
  @js.native
  object default extends js.Object {
    var lib: FnCall = js.native
    def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]]): LoadableComponent[T] = js.native
    def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]], options: Options[T]): LoadableComponent[T] = js.native
  }
  
}

