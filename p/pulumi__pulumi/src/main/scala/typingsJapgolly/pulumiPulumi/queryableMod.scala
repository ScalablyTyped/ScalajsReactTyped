package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.getProvider
import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.urn
import typingsJapgolly.pulumiPulumi.resourceMod.Resource
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryableMod {
  
  @js.native
  trait ModifyOptionalProperties[T] extends StObject
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? P : never}[keyof T] */ js.Any
  
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? never : P}[keyof T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Promise<infer U1> ? @pulumi/pulumi.@pulumi/pulumi/queryable.ResolvedSimple<U1> : T extends @pulumi/pulumi.@pulumi/pulumi/output.OutputInstance<infer U2> ? @pulumi/pulumi.@pulumi/pulumi/queryable.ResolvedSimple<U2> : @pulumi/pulumi.@pulumi/pulumi/queryable.ResolvedSimple<T>
    }}}
    */
  @js.native
  trait Resolved[T] extends StObject
  
  type ResolvedArray[T] = js.Array[Resolved[T]]
  
  type ResolvedObject[T] = ModifyOptionalProperties[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/queryable.Resolved<T[P]>} */ js.Any
  ]
  
  type ResolvedResource[T /* <: Resource */] = Omit[Resolved[T], urn | getProvider]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends @pulumi/pulumi.@pulumi/pulumi/queryable.primitive ? T : T extends std.Array<infer U> ? @pulumi/pulumi.@pulumi/pulumi/queryable.ResolvedArray<U> : T extends std.Function ? never : T extends object ? @pulumi/pulumi.@pulumi/pulumi/queryable.ResolvedObject<T> : never
    }}}
    */
  @js.native
  trait ResolvedSimple[T] extends StObject
  
  type primitive = js.UndefOr[String | Double | Boolean | Null]
}
