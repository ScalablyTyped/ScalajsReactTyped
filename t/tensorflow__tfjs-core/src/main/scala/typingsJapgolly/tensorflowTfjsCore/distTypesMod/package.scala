package typingsJapgolly.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type BackendValues = scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | js.Array[scala.scalajs.js.typedarray.Uint8Array]
  type DataValues = scala.scalajs.js.typedarray.Int32Array | js.Array[java.lang.String] | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Uint8Array
  type FlatVector = (js.Array[scala.Boolean | scala.Double]) | typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
  type RegularArray[T] = js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]
  type ScalarLike = scala.Double | scala.Boolean | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  type TensorLike = typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray | scala.Double | scala.Boolean | java.lang.String | (typingsJapgolly.tensorflowTfjsCore.distTypesMod.RecursiveArray[
    js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
  ]) | js.Array[scala.scalajs.js.typedarray.Uint8Array]
  type TensorLike1D = typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike2D = typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
    ]) | scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike3D = typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike4D = typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[
          scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
        ]
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike5D = typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[
          js.Array[
            scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
          ]
        ]
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike6D = typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[
          js.Array[
            (js.Array[scala.Boolean | scala.Double | java.lang.String]) | scala.scalajs.js.typedarray.Uint8Array
          ]
        ]
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TypedArray = scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array
}
