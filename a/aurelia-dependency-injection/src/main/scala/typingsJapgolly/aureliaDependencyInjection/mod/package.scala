package typingsJapgolly.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.aureliaDependencyInjection.anon.Decorates
import typingsJapgolly.aureliaDependencyInjection.anon.`0`
import typingsJapgolly.aureliaDependencyInjection.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def all[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](keyValue: Any): js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(keyValue.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit]]

inline def autoinject[TPotential](): /* import warning: importer.ImportType#apply Failed type conversion: TPotential extends aurelia-dependency-injection.aurelia-dependency-injection.Injectable ? void : (target : aurelia-dependency-injection.aurelia-dependency-injection.Injectable): void */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("autoinject")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TPotential extends aurelia-dependency-injection.aurelia-dependency-injection.Injectable ? void : (target : aurelia-dependency-injection.aurelia-dependency-injection.Injectable): void */ js.Any]
inline def autoinject[TPotential](potentialTarget: TPotential): /* import warning: importer.ImportType#apply Failed type conversion: TPotential extends aurelia-dependency-injection.aurelia-dependency-injection.Injectable ? void : (target : aurelia-dependency-injection.aurelia-dependency-injection.Injectable): void */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("autoinject")(potentialTarget.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TPotential extends aurelia-dependency-injection.aurelia-dependency-injection.Injectable ? void : (target : aurelia-dependency-injection.aurelia-dependency-injection.Injectable): void */ js.Any]

inline def emptyParameters: js.Array[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("_emptyParameters").asInstanceOf[js.Array[Any]]

inline def factory[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](keyValue: Any): js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")(keyValue.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit]]

inline def getDecoratorDependencies[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](target: (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase])): js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecoratorDependencies")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any]]

inline def inject[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
  rest: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(rest.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]

inline def invokeAsFactory[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): Unit | (js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("invokeAsFactory")().asInstanceOf[Unit | (js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit])]
inline def invokeAsFactory[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](potentialTarget: DependencyCtor[TBase, TImpl, TArgs]): Unit | (js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("invokeAsFactory")(potentialTarget.asInstanceOf[js.Any]).asInstanceOf[Unit | (js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit])]

inline def invoker[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](value: Invoker_[TBase, TImpl, TArgs]): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("invoker")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit]]

inline def `lazy`[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](keyValue: Any): js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(keyValue.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit]]

inline def newInstance[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
  asKeyOrTarget: (PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]),
  dynamicDependencies: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
): js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("newInstance")(scala.List(asKeyOrTarget.asInstanceOf[js.Any]).`++`(dynamicDependencies.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit]]
inline def newInstance[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
  asKeyOrTarget: Unit,
  dynamicDependencies: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
): js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("newInstance")(scala.List(asKeyOrTarget.asInstanceOf[js.Any]).`++`(dynamicDependencies.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit]]

inline def optional[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")().asInstanceOf[js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit]]
inline def optional[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](checkParentOrTarget: Boolean): js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(checkParentOrTarget.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* target */ (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), 
/* _key */ Any, 
/* index */ Double, 
Unit]]

inline def parent[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](target: (DependencyCtor[TBase, TImpl, TArgs]) & (`0`[TArgs, TBase]), _key: Any, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parent")(target.asInstanceOf[js.Any], _key.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registration[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](value: Registration_[TBase, TImpl, TArgs]): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("registration")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit]]

inline def resolver: Decorates & js.Function0[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("resolver").asInstanceOf[Decorates & js.Function0[Any]]

inline def singleton(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[Any]
inline def singleton(registerInChild: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(registerInChild.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def singleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: Unit, registerInChild: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(key.asInstanceOf[js.Any], registerInChild.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def singleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def singleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], registerInChild: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(key.asInstanceOf[js.Any], registerInChild.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def singleton_TBaseTImplTArgs[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[Any]

inline def transient[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("transient")().asInstanceOf[js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit]]
inline def transient[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("transient")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit]]

type DependencyCtor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = Instantiable1[/* args */ TArgs, TImpl | TBase]

type DependencyCtorOrFunctor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = (DependencyCtor[TBase, TImpl, TArgs]) | (DependencyFunctor[TBase, TImpl, TArgs])

type DependencyFunctor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = js.Function1[/* args */ TArgs, TImpl | TBase]

type Primitive = Boolean | String | Double | js.Symbol | js.Object | (js.Function1[/* repeated */ Any, Any]) | js.Array[Any]

type PrimitiveOrDependencyCtor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = (DependencyCtor[TBase, TImpl, TArgs]) | Primitive

type PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = (DependencyCtor[TBase, TImpl, TArgs]) | (DependencyFunctor[TBase, TImpl, TArgs]) | Primitive

type StrategyFunctor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = js.Function3[
/* container */ js.UndefOr[Container], 
/* ctor */ js.UndefOr[PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]], 
/* strategyResolver */ js.UndefOr[Any], 
TImpl]
