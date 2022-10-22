package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outListUpdateMod.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFunctionValidPathMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? Path extends unknown ? ts-toolbelt.ts-toolbelt/out/Function/ValidPath._ValidPath<O, Path> : never : never
    }}}
    */
  @js.native
  trait ValidPath[O /* <: js.Object */, Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */] extends StObject
  
  /**
    * @hidden
    */
  type ValidatePath[O, Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */] = Update[
    Path, 
    typingsJapgolly.tsToolbelt.outIterationKeyMod.Key[I], 
    /* import warning: importer.ImportType#apply Failed type conversion: [ts-toolbelt.ts-toolbelt/out/Any/At.At<O & {}, Path[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>]>] extends [never] ? keyof O : Path[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Function/ValidPath.__ValidPath<O, Path, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<ts-toolbelt.ts-toolbelt/out/Any/Key.Key>> : never
    }}}
    */
  @js.native
  trait _ValidPath[O /* <: js.Object */, Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */] extends StObject
  
  /**
    * @hidden
    */
  type __ValidPath[O, Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0ValidPath<O, Path, I>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, ts-toolbelt.ts-toolbelt/out/List/Length.Length<Path>>] */ js.Any
}
