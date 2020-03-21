package typingsJapgolly.aureliaDependencyInjection.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registration_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def registerResolver(
    container: Container,
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]
  ): Resolver_
}

object Registration_ {
  @scala.inline
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    registerResolver: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], DependencyCtorOrFunctor[TBase, TImpl, TArgs]) => CallbackTo[Resolver_]
  ): Registration_[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerResolver")(js.Any.fromFunction3((t0: typingsJapgolly.aureliaDependencyInjection.mod.Container, t1: typingsJapgolly.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], t2: typingsJapgolly.aureliaDependencyInjection.mod.DependencyCtorOrFunctor[TBase, TImpl, TArgs]) => registerResolver(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Registration_[TBase, TImpl, TArgs]]
  }
}

