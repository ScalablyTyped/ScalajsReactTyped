package typingsJapgolly.aureliaDependencyInjection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.aureliaDependencyInjection.mod.Args
import typingsJapgolly.aureliaDependencyInjection.mod.Container
import typingsJapgolly.aureliaDependencyInjection.mod.Impl
import typingsJapgolly.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def get(container: Container, key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): TImpl
}

object Anon0 {
  @scala.inline
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](get: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => CallbackTo[TImpl]): Anon0[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: typingsJapgolly.aureliaDependencyInjection.mod.Container, t1: typingsJapgolly.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => get(t0, t1).runNow()))
    __obj.asInstanceOf[Anon0[TBase, TImpl, TArgs]]
  }
}

