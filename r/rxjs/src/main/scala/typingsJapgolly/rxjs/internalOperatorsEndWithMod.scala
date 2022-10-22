package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ValueFromArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsEndWithMod {
  
  @JSImport("rxjs/internal/operators/endWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endWith[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def endWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): OperatorFunction[T, T | ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(values.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ValueFromArray[A]]]
  inline def endWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param valuesAndScheduler because its type [...A, SchedulerLike] is not an array type */ valuesAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A]
  ): OperatorFunction[T, T | ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("endWith")(valuesAndScheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ValueFromArray[A]]]
}
