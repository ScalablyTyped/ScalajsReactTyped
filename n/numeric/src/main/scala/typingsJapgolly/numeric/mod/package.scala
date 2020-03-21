package typingsJapgolly.numeric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CCSComparisonResult = js.Tuple3[
    typingsJapgolly.numeric.mod.Vector, 
    typingsJapgolly.numeric.mod.Vector, 
    typingsJapgolly.numeric.mod.VectorBoolean
  ]
  type DeprecatedSparseMatrix = js.Array[js.Array[js.UndefOr[scala.Double]]]
  type DeprecatedSparseVector = js.Array[js.UndefOr[scala.Double]]
  type Matrix = js.Array[js.Array[scala.Double]]
  type MultidimensionalArray[T] = js.Array[
    js.Array[
      (js.Array[
        (js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    js.Array[
                      (js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]) | T
                    ]
                  ]) | T
                ]) | T
              ]) | T
            ]) | T
          ]) | T
        ]) | T
      ]) | T
    ]
  ]
  type MultidimensionalMatrix = typingsJapgolly.numeric.mod.MultidimensionalArray[scala.Double]
  type NonNullPrimitive = js.UndefOr[scala.Double | java.lang.String | scala.Boolean]
  type NonScalar = typingsJapgolly.numeric.mod.Vector | typingsJapgolly.numeric.mod.MultidimensionalMatrix
  type Scalar = scala.Double
  type ShapeFunction = js.Function2[/* i */ scala.Double, /* j */ scala.Double, scala.Boolean]
  type SparseMatrix = js.Tuple3[
    typingsJapgolly.numeric.mod.Vector, 
    typingsJapgolly.numeric.mod.Vector, 
    typingsJapgolly.numeric.mod.Vector
  ]
  type TensorValue = typingsJapgolly.numeric.mod.Scalar | typingsJapgolly.numeric.mod.Vector | typingsJapgolly.numeric.mod.MultidimensionalMatrix
  type Vector = js.Array[scala.Double]
  type VectorBoolean = js.Array[scala.Boolean]
}
