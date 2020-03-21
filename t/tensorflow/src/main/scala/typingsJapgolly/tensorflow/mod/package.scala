package typingsJapgolly.tensorflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SessionRunInputs = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.tensorflow.mod.Tensor_ | typingsJapgolly.tensorflow.mod.TensorValue
  ]
  type SessionRunOutputs = java.lang.String | js.Array[java.lang.String]
  type SessionRunResult = typingsJapgolly.tensorflow.mod.Tensor_ | typingsJapgolly.tensorflow.mod.TensorMap
  type SessionRunTargets = java.lang.String | js.Array[java.lang.String]
  type TensorData = typingsJapgolly.std.Number
  type TensorMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.tensorflow.mod.Tensor_]
  type TensorValue = typingsJapgolly.tensorflow.mod.TensorData | (js.Array[
    (js.Array[
      (js.Array[
        js.Array[typingsJapgolly.tensorflow.mod.TensorData] | typingsJapgolly.tensorflow.mod.TensorData
      ]) | typingsJapgolly.tensorflow.mod.TensorData
    ]) | typingsJapgolly.tensorflow.mod.TensorData
  ])
}
