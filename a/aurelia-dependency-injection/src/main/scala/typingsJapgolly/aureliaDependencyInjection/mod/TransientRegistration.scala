package typingsJapgolly.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "TransientRegistration")
@js.native
class TransientRegistration[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] () extends Registration_[TBase, TImpl, TArgs] {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  /* CompleteClass */
  override def registerResolver(
    container: Container,
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]
  ): Resolver_ = js.native
}

