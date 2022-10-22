package typingsJapgolly.arrayFlatten

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("array-flatten", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatten[T /* <: ArrayLike[Any] */](array: T): FlatArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[FlatArray[T]]
  
  type FlatArray[T /* <: ArrayLike[Any] */] = js.Array[
    PickValue[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.ReadonlyArray<any> ? {[ K in std.Extract<keyof T, number> ]: array-flatten.array-flatten.PickValue<T[K]>}[number] : T
    }}}
    */
  @js.native
  trait PickValue[T] extends StObject
}
