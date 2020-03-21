package typingsJapgolly.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tensorTypesMod {
  type GradSaveFunc = js.Function1[
    /* save */ js.Array[
      typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
    ], 
    scala.Unit
  ]
  type NamedTensorMap = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  type NamedVariableMap = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.tensorflowTfjsCore.tensorMod.Variable[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.TensorContainerObject
    - typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.TensorContainerArray
    - typingsJapgolly.std.Float32Array
    - typingsJapgolly.std.Int32Array
    - typingsJapgolly.std.Uint8Array
  */
  type TensorContainer = typingsJapgolly.tensorflowTfjsCore.tensorTypesMod._TensorContainer | typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | scala.Unit | java.lang.String | scala.Double | scala.Boolean | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array
}
