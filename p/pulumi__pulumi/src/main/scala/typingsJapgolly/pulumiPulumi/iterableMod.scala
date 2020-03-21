package typingsJapgolly.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/iterable", JSImport.Namespace)
@js.native
object iterableMod extends js.Object {
  def groupBy[T, V](
    iter: Input[js.Array[Input[T]]],
    selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
  ): Output_[StringDictionary[js.Array[V]]] = js.native
  def toObject[T, V](
    iter: Input[js.Array[Input[T]]],
    selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
  ): Output_[StringDictionary[V]] = js.native
}

