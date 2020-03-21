package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.getProvider
import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.urn
import typingsJapgolly.pulumiPulumi.resourceMod.Resource
import typingsJapgolly.std.Array
import typingsJapgolly.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/queryable", JSImport.Namespace)
@js.native
object queryableMod extends js.Object {
  @js.native
  trait ModifyOptionalProperties[T] extends js.Object
  
  @js.native
  trait ResolvedArray[T] extends Array[Resolved[T]]
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? P : never}[keyof T] */ js.Any
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? never : P}[keyof T] */ js.Any
  type Resolved[T] = ResolvedSimple[js.Any | T]
  type ResolvedObject[T] = ModifyOptionalProperties[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/queryable.Resolved<T[P]>}
    */ typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.ResolvedObject with T
  ]
  type ResolvedResource[T /* <: Resource */] = Omit[Resolved[T], urn | getProvider]
  type ResolvedSimple[T] = ResolvedObject[T] | ResolvedArray[js.Any] | T
  type primitive = js.UndefOr[String | Double | Boolean | Null]
}

