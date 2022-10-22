package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outObjectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outAnyComputeMod {
  
  type Compute[A /* <: Any */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.Deep<A>[depth] */ js.Any
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn ? A : ts-toolbelt.ts-toolbelt/out/Any/If.If<ts-toolbelt.ts-toolbelt/out/Union/Has.Has<Seen, A>, A, A extends std.Array<any> ? A extends std.Array<std.Record<ts-toolbelt.ts-toolbelt/out/Any/Key.Key, any>> ? std.Array<{[ K in keyof A[number] ]: ts-toolbelt.ts-toolbelt/out/Any/Compute.ComputeDeep<A[number][K], A | Seen>} & unknown> : A : A extends std.ReadonlyArray<any> ? A extends std.ReadonlyArray<std.Record<ts-toolbelt.ts-toolbelt/out/Any/Key.Key, any>> ? std.ReadonlyArray<{[ K in keyof A[number] ]: ts-toolbelt.ts-toolbelt/out/Any/Compute.ComputeDeep<A[number][K], A | Seen>} & unknown> : A : {[ K in keyof A ]: ts-toolbelt.ts-toolbelt/out/Any/Compute.ComputeDeep<A[K], A | Seen>} & unknown>
    }}}
    */
  @js.native
  trait ComputeDeep[A /* <: Any */, Seen] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn ? A : A extends std.Array<any> ? A extends std.Array<std.Record<ts-toolbelt.ts-toolbelt/out/Any/Key.Key, any>> ? std.Array<{[ K in keyof A[number] ]: A[number][K]} & unknown> : A : A extends std.ReadonlyArray<any> ? A extends std.ReadonlyArray<std.Record<ts-toolbelt.ts-toolbelt/out/Any/Key.Key, any>> ? std.ReadonlyArray<{[ K in keyof A[number] ]: A[number][K]} & unknown> : A : {[ K in keyof A ]: A[K]} & unknown
    }}}
    */
  @js.native
  trait ComputeFlat[A /* <: Any */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends std.Function ? A : {[ K in keyof A ]: A[K]} & unknown
    }}}
    */
  @js.native
  trait ComputeRaw[A /* <: Any */] extends StObject
}
