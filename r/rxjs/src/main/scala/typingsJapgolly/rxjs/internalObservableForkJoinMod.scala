package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalAnyCatcherMod.AnyCatcher
import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableForkJoinMod {
  
  @JSImport("rxjs/internal/observable/forkJoin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forkJoin(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")().asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin(
    sourcesObject: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any ]: never} */ js.Any
  ): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin(sources: js.Array[Any]): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin[T /* <: AnyCatcher */](arg: T): Observable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[Any]]
  inline def forkJoin[A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    resultSelector: js.Function1[/* values */ A, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def forkJoin_A[A /* <: js.Array[Any] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  
  inline def forkJoin_AR[A /* <: js.Array[Any] */, R](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndResultSelector because its type [...ObservableInputTuple<A>, (values : A): R] is not an array type */ sourcesAndResultSelector: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesAndResultSelector.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
}
