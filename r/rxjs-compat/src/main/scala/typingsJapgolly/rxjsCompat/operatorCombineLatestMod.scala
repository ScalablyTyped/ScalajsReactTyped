package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorCombineLatestMod {
  
  @JSImport("rxjs-compat/operator/combineLatest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineLatest[T, R](array: js.Array[ObservableInput[T]]): Observable_[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(array.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.Array[T]]]
  inline def combineLatest[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[R]]
  inline def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(project.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
  inline def combineLatest[T, T2](v2: ObservableInput[T2]): Observable_[js.Tuple2[T, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.Tuple2[T, T2]]]
  inline def combineLatest[T, TOther, R](
    array: js.Array[ObservableInput[TOther]],
    project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
  ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(array.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def combineLatest[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def combineLatest[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[js.Tuple3[T, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Tuple3[T, T2, T3]]]
  inline def combineLatest[T, T2, T3, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def combineLatest[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[js.Tuple4[T, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Tuple4[T, T2, T3, T4]]]
  inline def combineLatest[T, T2, T3, T4, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def combineLatest[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[js.Tuple5[T, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Tuple5[T, T2, T3, T4, T5]]]
  inline def combineLatest[T, T2, T3, T4, T5, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def combineLatest[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable_[js.Tuple6[T, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Tuple6[T, T2, T3, T4, T5, T6]]]
  inline def combineLatest[T, T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
}
