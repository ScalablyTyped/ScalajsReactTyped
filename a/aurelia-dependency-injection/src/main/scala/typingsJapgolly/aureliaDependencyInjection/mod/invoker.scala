package typingsJapgolly.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "invoker")
@js.native
object invoker extends js.Object {
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](value: Invoker_[TBase, TImpl, TArgs]): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = js.native
}

