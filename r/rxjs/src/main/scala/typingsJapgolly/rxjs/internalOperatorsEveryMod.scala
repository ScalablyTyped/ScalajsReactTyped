package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import typingsJapgolly.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsEveryMod {
  
  @JSImport("rxjs/internal/operators/every", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def every[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Boolean]]
  inline def every[T](predicate: BooleanConstructor): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? false : boolean */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? false : boolean */ js.Any
  ]]
  inline def every[T](predicate: BooleanConstructor, thisArg: Any): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? false : boolean */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? false : boolean */ js.Any
  ]]
  inline def every[T, A](
    predicate: js.ThisFunction3[/* this */ A, /* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: A
  ): OperatorFunction[T, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Boolean]]
}
