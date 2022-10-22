package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libReadonlyRecordMod.ReadonlyRecord_
import typingsJapgolly.fpTs.libShowMod.Show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object showMod {
  
  @JSImport("fp-ts/Show", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStructShow[O /* <: ReadonlyRecord_[String, Any] */](
    shows: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: fp-ts.fp-ts/lib/Show.Show<O[K]>} */ js.Any
  ): Show[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStructShow")(shows.asInstanceOf[js.Any]).asInstanceOf[Show[O]]
  
  inline def getTupleShow[T /* <: js.Array[Show[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param shows because its type T is not an array type */ shows: T
  ): Show[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Show.Show<infer A>? A : never} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleShow")(shows.asInstanceOf[js.Any]).asInstanceOf[Show[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Show.Show<infer A>? A : never} */ js.Any
  ]]
  
  @JSImport("fp-ts/Show", "showBoolean")
  @js.native
  val showBoolean: Show[Boolean] = js.native
  
  @JSImport("fp-ts/Show", "showNumber")
  @js.native
  val showNumber: Show[Double] = js.native
  
  @JSImport("fp-ts/Show", "showString")
  @js.native
  val showString: Show[String] = js.native
  
  inline def struct[A](
    shows: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: fp-ts.fp-ts/lib/Show.Show<A[K]>} */ js.Any
  ): Show[
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K_1 in keyof A ]: A[K_1]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(shows.asInstanceOf[js.Any]).asInstanceOf[Show[
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K_1 in keyof A ]: A[K_1]} */ js.Any
  ]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param shows because its type {[ K in keyof A ]: Show<A[K]>} is not an array type */ shows: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: fp-ts.fp-ts/lib/Show.Show<A[K]>} */ js.Any
  ): Show[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(shows.asInstanceOf[js.Any]).asInstanceOf[Show[A]]
}
