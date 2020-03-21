package typingsJapgolly.aureliaDependencyInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Args[TBase] = typingsJapgolly.aureliaDependencyInjection.mod.CtorArgs[TBase] | typingsJapgolly.aureliaDependencyInjection.mod.FuncArgs[TBase]
  type CtorArgs[TBase] = js.Array[js.Any]
  type CtorImpl[TBase] = js.Any
  type DependencyCtor[TBase, TImpl /* <: typingsJapgolly.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsJapgolly.aureliaDependencyInjection.mod.Args[TBase] */] = org.scalablytyped.runtime.Instantiable1[/* args */ TArgs, TImpl | TBase]
  type DependencyCtorOrFunctor[TBase, TImpl /* <: typingsJapgolly.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsJapgolly.aureliaDependencyInjection.mod.Args[TBase] */] = (typingsJapgolly.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) | (typingsJapgolly.aureliaDependencyInjection.mod.DependencyFunctor[TBase, TImpl, TArgs])
  type DependencyFunctor[TBase, TImpl /* <: typingsJapgolly.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsJapgolly.aureliaDependencyInjection.mod.Args[TBase] */] = js.Function1[/* args */ TArgs, TImpl | TBase]
  type FuncArgs[TBase] = js.Array[js.Any]
  type FuncReturns[TBase] = js.Any
  type Impl[TBase] = typingsJapgolly.aureliaDependencyInjection.mod.CtorImpl[TBase] | typingsJapgolly.aureliaDependencyInjection.mod.FuncReturns[TBase]
  type ImplOrAny[TImpl] = TImpl
  type Primitive = scala.Boolean | java.lang.String | scala.Double | js.Symbol | js.Object | (js.Function1[/* repeated */ js.Any, js.Any]) | js.Array[js.Any]
  type PrimitiveOrDependencyCtor[TBase, TImpl /* <: typingsJapgolly.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsJapgolly.aureliaDependencyInjection.mod.Args[TBase] */] = (typingsJapgolly.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) | typingsJapgolly.aureliaDependencyInjection.mod.Primitive
  type PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl /* <: typingsJapgolly.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsJapgolly.aureliaDependencyInjection.mod.Args[TBase] */] = (typingsJapgolly.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) | (typingsJapgolly.aureliaDependencyInjection.mod.DependencyFunctor[TBase, TImpl, TArgs]) | typingsJapgolly.aureliaDependencyInjection.mod.Primitive
  type StrategyFunctor[TBase, TImpl /* <: typingsJapgolly.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typingsJapgolly.aureliaDependencyInjection.mod.Args[TBase] */] = js.Function3[
    /* container */ js.UndefOr[typingsJapgolly.aureliaDependencyInjection.mod.Container], 
    /* ctor */ js.UndefOr[
      typingsJapgolly.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]
    ], 
    /* strategyResolver */ js.UndefOr[js.Any], 
    TImpl
  ]
}
