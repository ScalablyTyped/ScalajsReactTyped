package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import typingsJapgolly.tsToolbelt.outMiscBuiltInMod.BuiltIn
import typingsJapgolly.tsToolbelt.outObjectInternalMod.Depth
import typingsJapgolly.tsToolbelt.outObjectPatchMod.PatchFlat
import typingsJapgolly.tsToolbelt.outObjectPickMod._Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectRequiredMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Required._Required<O, K, depth> : never
    }}}
    */
  @js.native
  trait Required[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O ]: -? O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/Object/Required.RequiredDeep<O[K]>}
    }}}
    */
  @js.native
  trait RequiredDeep[O] extends StObject
  
  type RequiredFlat[O] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: -? O[K]} */ js.Any) & js.Object
  
  type RequiredPart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepRequiredDeep<O>[depth] */ js.Any
  
  type _Required[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = PatchFlat[RequiredPart[_Pick[O, K], depth], O, BuiltIn, scala.Nothing]
}
