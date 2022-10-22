package typingsJapgolly.tsToolbelt

import typingsJapgolly.std.Exclude
import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import typingsJapgolly.tsToolbelt.outObjectPathMod.Path
import typingsJapgolly.tsToolbelt.outObjectUnionOfMod.UnionOf
import typingsJapgolly.tsToolbelt.outStringSplitMod.Split
import typingsJapgolly.tsToolbelt.outUnionSelectMod.Select
import typingsJapgolly.tsToolbelt.tsToolbeltStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFunctionAutoPathMod {
  
  type AutoPath[O /* <: Any */, P /* <: String */, D /* <: String */] = _AutoPath[O, P, D, Split[P, D]]
  
  /**
    * @ignore
    */
  type ExecPath[A, SP /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Index] */, Delimiter /* <: String */] = NextPath[Path[MetaPath[A, Delimiter, SP, js.Array[Any]], SP]]
  
  /**
    * @ignore
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [Exec] extends [never] ? ts-toolbelt.ts-toolbelt/out/Function/AutoPath.ExecPath<A, ts-toolbelt.ts-toolbelt/out/List/Pop.Pop<SP>, D> : Exec | P
    }}}
    */
  @js.native
  trait HintPath[A, P /* <: String */, SP /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Index] */, Exec /* <: String */, D /* <: String */] extends StObject
  
  /**
    * @ignore
    */
  type Index = Double | String
  
  /**
    * @ignore
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    number extends K ? ts-toolbelt.ts-toolbelt/out/List/Head.Head<SP> : K & ts-toolbelt.ts-toolbelt/out/Function/AutoPath.Index
    }}}
    */
  @js.native
  trait KeyToIndex[K /* <: Key */, SP /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Index] */] extends StObject
  
  /**
    * @ignore
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Function/AutoPath.MetaPath<O[K], D, ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<SP>, [...P, ts-toolbelt.ts-toolbelt/out/Function/AutoPath.KeyToIndex<K, SP>]> | ts-toolbelt.ts-toolbelt/out/String/Join.Join<[...P, ts-toolbelt.ts-toolbelt/out/Function/AutoPath.KeyToIndex<K, SP>], D>}
    }}}
    */
  @js.native
  trait MetaPath[O, D /* <: String */, SP /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Index] */, P /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Index] */] extends StObject
  
  /**
    * @ignore
    */
  type NextPath[OP] = Select[UnionOf[(Exclude[OP, String]) & js.Object], String, default]
  
  /**
    * @ignore
    */
  type _AutoPath[A, P /* <: String */, D /* <: String */, SP /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Index] */] = HintPath[A, P, SP, ExecPath[A, SP, D], D]
}
