package typingsJapgolly.pulumiPulumi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iterable {
  
  @JSImport("@pulumi/pulumi", "iterable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def groupBy[T, V](
    iter: Input[js.Array[Input[T]]],
    selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
  ): typingsJapgolly.pulumiPulumi.outputMod.Output_[StringDictionary[js.Array[V]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(iter.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiPulumi.outputMod.Output_[StringDictionary[js.Array[V]]]]
  
  inline def toObject[T, V](
    iter: Input[js.Array[Input[T]]],
    selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
  ): typingsJapgolly.pulumiPulumi.outputMod.Output_[StringDictionary[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(iter.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiPulumi.outputMod.Output_[StringDictionary[V]]]
}
