package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyComputeMod.ComputeRaw
import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import typingsJapgolly.tsToolbelt.outBooleanInternalMod.Boolean
import typingsJapgolly.tsToolbelt.outObjectOmitMod._Omit
import typingsJapgolly.tsToolbelt.outUnionStrictMod.Strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectEitherMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Either._Either<O, K, strict> : never
    }}}
    */
  @js.native
  trait Either[O /* <: js.Object */, K /* <: Key */, strict /* <: Boolean */] extends StObject
  
  /**
    * @hidden
    */
  type EitherLoose[O /* <: js.Object */, K /* <: Key */] = ComputeRaw[__Either[O, K]]
  
  /**
    * @hidden
    */
  type EitherStrict[O /* <: js.Object */, K /* <: Key */] = Strict[__Either[O, K]]
  
  type _Either[O /* <: js.Object */, K /* <: Key */, strict /* <: Boolean */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0EitherLoose<O, K>[strict] */ js.Any
  
  /**
    * @hidden
    */
  type __Either[O /* <: js.Object */, K /* <: Key */] = (_Omit[O, K]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, P>}[K] */ js.Any)
}
