package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableConcatMod {
  
  @JSImport("rxjs/dist/types/internal/observable/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat[T /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param inputs because its type [...ObservableInputTuple<T>] is not an array type */ inputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Any
    ]
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(inputs.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ]]
}
