package typingsJapgolly.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outputMod {
  type Input[T] = T | js.Promise[T] | typingsJapgolly.pulumiPulumi.outputMod.OutputInstance[T]
  type Inputs = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.pulumiPulumi.outputMod.Input[js.Any]]
  type Lifted[T] = js.Object | (typingsJapgolly.pulumiPulumi.outputMod.LiftedObject[
    java.lang.String | T, 
    typingsJapgolly.pulumiPulumi.outputMod.NonFunctionPropertyNames[java.lang.String | T]
  ]) | typingsJapgolly.pulumiPulumi.outputMod.LiftedArray[js.Any]
  type LiftedObject[T, K /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P] extends @pulumi/pulumi.@pulumi/pulumi/output.OutputInstance<infer T1>? @pulumi/pulumi.@pulumi/pulumi/output.Output<any> : T[P] extends std.Promise<infer T2>? @pulumi/pulumi.@pulumi/pulumi/output.Output<any> : @pulumi/pulumi.@pulumi/pulumi/output.Output<T[P]>}
    */ typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.LiftedObject with js.Any
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Output_[T] = typingsJapgolly.pulumiPulumi.outputMod.OutputInstance[T] with typingsJapgolly.pulumiPulumi.outputMod.Lifted[T]
  type Unwrap[T] = typingsJapgolly.pulumiPulumi.outputMod.UnwrapSimple[js.Any | T]
  type UnwrapSimple[T] = typingsJapgolly.pulumiPulumi.outputMod.UnwrappedObject[T] | typingsJapgolly.pulumiPulumi.outputMod.UnwrappedArray[js.Any] | T
  type UnwrappedObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/output.Unwrap<T[P]>}
    */ typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.UnwrappedObject with T
  type primitive = js.UndefOr[js.Function | java.lang.String | scala.Double | scala.Boolean | scala.Null]
}
