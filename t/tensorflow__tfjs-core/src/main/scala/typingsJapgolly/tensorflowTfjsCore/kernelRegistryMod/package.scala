package typingsJapgolly.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kernelRegistryMod {
  type Attribute = typingsJapgolly.tensorflowTfjsCore.kernelRegistryMod.AttributeValue | typingsJapgolly.tensorflowTfjsCore.distTypesMod.RecursiveArray[typingsJapgolly.tensorflowTfjsCore.kernelRegistryMod.AttributeValue]
  type AttributeValue = scala.Double | (js.Array[scala.Boolean | scala.Double | java.lang.String]) | scala.Boolean | java.lang.String | typingsJapgolly.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
  type DataId = js.Object
  type GradFunc = js.Function2[
    /* dy */ typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
    ]), 
    /* saved */ js.Array[
      typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
    ], 
    org.scalablytyped.runtime.StringDictionary[
      js.Function0[
        typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
  ]
  type KernelDisposeFunc = typingsJapgolly.tensorflowTfjsCore.kernelRegistryMod.KernelSetupFunc
  type KernelFunc = js.Function1[
    /* params */ typingsJapgolly.tensorflowTfjsCore.AnonAttrs, 
    typingsJapgolly.tensorflowTfjsCore.kernelRegistryMod.TensorInfo | js.Array[typingsJapgolly.tensorflowTfjsCore.kernelRegistryMod.TensorInfo]
  ]
  type KernelSetupFunc = js.Function1[/* backend */ js.Object, scala.Unit]
  type NamedTensorInfoMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.tensorflowTfjsCore.kernelRegistryMod.TensorInfo]
}
