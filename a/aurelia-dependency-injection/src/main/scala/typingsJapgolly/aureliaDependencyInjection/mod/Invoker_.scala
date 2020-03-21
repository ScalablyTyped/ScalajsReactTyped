package typingsJapgolly.aureliaDependencyInjection.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invoker_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def invoke(container: Container, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs], dependencies: TArgs): ImplOrAny[TImpl]
  def invokeWithDynamicDependencies(
    container: Container,
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs],
    staticDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ],
    dynamicDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ): ImplOrAny[TImpl]
}

object Invoker_ {
  @scala.inline
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    invoke: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], TArgs) => CallbackTo[ImplOrAny[TImpl]],
    invokeWithDynamicDependencies: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]) => CallbackTo[ImplOrAny[TImpl]]
  ): Invoker_[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("invoke")(js.Any.fromFunction3((t0: typingsJapgolly.aureliaDependencyInjection.mod.Container, t1: typingsJapgolly.aureliaDependencyInjection.mod.DependencyCtorOrFunctor[TBase, TImpl, TArgs], t2: TArgs) => invoke(t0, t1, t2).runNow()))
    __obj.updateDynamic("invokeWithDynamicDependencies")(js.Any.fromFunction4((t0: typingsJapgolly.aureliaDependencyInjection.mod.Container, t1: typingsJapgolly.aureliaDependencyInjection.mod.DependencyCtorOrFunctor[TBase, TImpl, TArgs], t2: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any], t3: js.Array[
  /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any]) => invokeWithDynamicDependencies(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Invoker_[TBase, TImpl, TArgs]]
  }
}

