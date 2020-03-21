package typingsJapgolly.pulumiPulumi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "iterable")
@js.native
object iterable extends js.Object {
  def groupBy[T, V](
    iter: Input[js.Array[Input[T]]],
    selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
  ): typingsJapgolly.pulumiPulumi.outputMod.Output_[StringDictionary[js.Array[V]]] = js.native
  def toObject[T, V](
    iter: Input[js.Array[Input[T]]],
    selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
  ): typingsJapgolly.pulumiPulumi.outputMod.Output_[StringDictionary[V]] = js.native
}

