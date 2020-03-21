package typingsJapgolly.graphqlBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FlattenInterpolation[P] = typingsJapgolly.graphqlBinding.typesMod.InterpolationValue | typingsJapgolly.graphqlBinding.typesMod.InterpolationFunction[P]
  type Interpolation[P] = typingsJapgolly.graphqlBinding.typesMod.FlattenInterpolation[P] | (js.Array[
    typingsJapgolly.graphqlBinding.typesMod.FlattenInterpolation[P] | js.Array[typingsJapgolly.graphqlBinding.typesMod.FlattenInterpolation[P]]
  ])
  type InterpolationValue = java.lang.String | scala.Double | scala.Boolean
  type Maybe[T] = js.UndefOr[scala.Null | T]
  type SimpleInterpolation = typingsJapgolly.graphqlBinding.typesMod.InterpolationValue | (js.Array[
    typingsJapgolly.graphqlBinding.typesMod.InterpolationValue | js.Array[typingsJapgolly.graphqlBinding.typesMod.InterpolationValue]
  ])
}
