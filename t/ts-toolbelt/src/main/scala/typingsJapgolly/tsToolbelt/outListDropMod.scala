package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outIterationInternalMod.Way
import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListDropMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends unknown ? N extends unknown ? ts-toolbelt.ts-toolbelt/out/List/Drop._Drop<L, N, way> : never : never
    }}}
    */
  @js.native
  trait Drop[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Double */, way /* <: Way */] extends StObject
  
  /**
    * @hidden
    */
  type DropBack[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */, I /* <: Iteration */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0DropBack<L, N, I, LN>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<-1, ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>>] */ js.Any
  
  /**
    * @hidden
    */
  type DropForth[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0DropForth<L, N>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<0, ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N>>] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/List/Drop.__Drop<ts-toolbelt.ts-toolbelt/out/List/_Internal.Naked<L>, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<N>, way> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  @js.native
  trait _Drop[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Double */, way /* <: Way */] extends StObject
  
  /**
    * @hidden
    */
  type __Drop[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */, way /* <: Way */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.<L, N>[way] */ js.Any
}
