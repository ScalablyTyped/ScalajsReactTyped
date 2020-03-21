package typingsJapgolly.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type NamedTensorMap = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  type NamedTensorsMap = org.scalablytyped.runtime.StringDictionary[
    js.Array[
      typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]
  type TensorArrayMap = org.scalablytyped.runtime.NumberDictionary[typingsJapgolly.tensorflowTfjsConverter.tensorArrayMod.TensorArray]
}
